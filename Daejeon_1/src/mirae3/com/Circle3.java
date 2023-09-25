package mirae3.com;

//Circle class
//ColorPoint class를 사용, radius, perimeter, area
//생성자로 초기화
//get/set 함수 생성
//두 원의 충돌 여부를 확인하는 함수 작성
//출력 함수 작성
public class Circle3 extends ColorPoint{
	ColorPoint po;
	public double radius;
	double perimeter;
	double area;
	public Circle3(){}
	//public Circle3(double radius){this.radius=radius;calcPerimeter();calcArea();}
	public Circle3(double radius, ColorPoint po){this.radius=radius;this.po=po;calcPerimeter();calcArea();}
	public ColorPoint getPo() {
		return po;
	}
	public void setPo(ColorPoint po) {
		this.po = po;
	}
	public void calcPerimeter() {
		perimeter=radius*2*Math.PI;
	}
	public void calcArea() {
		area = Math.pow(radius, 2)*Math.PI;
	}
	public double getRadius() {return radius;}
	public void setRadius(double radius) {this.radius = radius;calcPerimeter();calcArea();}
	public double getPerimeter() {return perimeter;}
	public void setPerimeter(double perimeter) {this.perimeter = perimeter;}
	public double getArea() {return area;}
	public void setArea(double area) {this.area = area;}
	
	public boolean collisionCheck(Circle3 cl) {
		double radius = this.radius + cl.radius;
		double dist = this.po.distanceTo(cl.po);
		return dist<radius;
	}
	public String toString() {
		return po.toString()+ " 반지름 : "+radius+" 둘레 : "+perimeter+" 면적 : "+area;
	}
}
