package mirae2.com;

public class Circle {
	Point po; //Composition : 클래스 안에 클래스가 들어감
	private double radius;
	private double perimeters; // 둘레
	private double area; // 넓이
	
	public Circle(){}
	public Circle(Point po, double radius, double perimeters, double area) {this.po=po; this.radius=radius;this.perimeters=perimeters;this.area=area;}
	public void calcPerimeter() {
		perimeters = 2 * Math.PI * radius;
	}
	public void calcArea() {
		area = Math.PI * radius * radius;
	}
	public void setPoint(Point po) {
		this.po=po;
	}
	public Point getPoint() {
		return po;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadious() {
		return radius;
	}
	public void print() {
		po.print();
		System.out.println("반지름 = "+radius);
	}
	public boolean collision(Circle cl) {
		double tot_radius = this.radius + cl.radius;
		double dist = po.distanceTo(cl.po);
		if(dist<tot_radius)return true; //충돌
		else return false; //충돌하지 않음
	}
}
