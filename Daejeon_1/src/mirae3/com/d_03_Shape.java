package mirae3.com;
class Shape{ //superclass = 부모 클래스
	public double area; //면적
	Shape(){}
	public void display() {
		System.out.println("면적은 "+this.area+"입니다.");
	}
	public void calcArea() {}
}
class Circle extends Shape{ // subclass = 자식 클래스
	public double radius;
	public Circle(double radius) {this.radius=radius;calcArea();}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
		calcArea();
	}
	public void calcArea() {
		area=Math.PI*radius*radius;
	}
}
class Rectangle extends Shape{ // subclass = 자식 클래스
	public double width,height;
	public Rectangle(double width,double height) {this.width=width;this.height=height;calcArea();}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width=width;
		calcArea();
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
		calcArea();
	}
	public void calcArea() {
		area=width*height;
	}
}
class Triangle extends Shape{ // subclass = 자식 클래스
	public double width,height;
	public Triangle(double width,double height) {this.width=width;this.height=height;calcArea();}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width=width;
		calcArea();
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
		calcArea();
	}
	public void calcArea() {
		area=width*height/2;
	}
}
public class d_03_Shape {
	public static void sharePrint(Shape sh) {
		if(sh instanceof Circle) { // true false 리턴 
			Circle cl = (Circle)sh; //downcasting
			cl.setRadius(100); //자식에만 있는 함수
			cl.calcArea();
			cl.display();
		}
		else if(sh instanceof Rectangle) {
			Rectangle re = (Rectangle)sh;
			re.setHeight(100);
			re.setWidth(200);
			re.calcArea();
			re.display();
		}
		else if(sh instanceof Triangle) { 
			Triangle tr = (Triangle)sh;
			tr.setHeight(50);
			tr.setWidth(50);
			tr.calcArea();
			tr.display();
		}
	}
	public static void main(String[] args) {
		Circle cl = new Circle(10);
		cl.display();
		
		Rectangle re = new Rectangle(100,200);
		re.display();
		
		Triangle tr = new Triangle(50,50);
		tr.display();
		
		Shape sh = new Circle(20);
		sh.display();
		//sh 반지름 출력
		Circle ccl=(Circle)sh;
		System.out.println("원의 반지름은 "+ccl.getRadius());
		
		//부모 배열에 위 cl, re, tr을 입력하고 면적을 출력하시오
		//부모 클래스 자식을 관리하는 것
		Shape[]parent=new Shape[3];
		parent[0]=cl;
		parent[1]=re;
		parent[2]=tr;
		for(int i=0;i<3;i++) {
			parent[i].display();
		}
		//다지인 패턴의 기본 패턴
		sharePrint(cl); //부모로 매개변수를 지정, 실제 자식 클래스를 전달해서 작업
		sharePrint(re);
		sharePrint(tr);
		for(int i=0;i<3;i++) {
			sharePrint(parent[i]);
		}
	}
}