package ch5;
class Shape { // 도형의 슈퍼 클래스
	String a="Shape";
	public void draw() {
		System.out.println("1Shape2");
	}
}
class Line extends Shape {
	String a="Shape";
	public void draw() { // 메소드 오버라이딩
		System.out.println("1Line2");
	}
}
class Rect extends Shape {
	String b="Rect";
	public void draw() { // 메소드 오버라이딩
		System.out.println("1Rect2");
	}
}
class Circle extends Shape {
	String c="Circle";
	public void draw() { // 메소드 오버라이딩
		System.out.println("1Circle2");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) { 
		System.out.print("\n>>");
		p.draw(); 
		if(p instanceof Shape) System.out.print("/Shape/");
		if(p instanceof Line) System.out.print("/Line/");
		if(p instanceof Rect) System.out.print("/Rect/");
		if(p instanceof Circle) System.out.print("/Circle/");
	}
	// Shape을 상속받은 객체들이 매개 변수로 넘어올 수 있음
	// p가 가리키는 객체에 오버라이딩된 draw() 호출
	// 동적바인딩
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); // Line의 draw() 실행. "Line" 출력

		paint(new Shape()); // Shape의 draw() 실행. "Shape" 출력
		paint(new Line()); // 오버라이딩된 메소드 Line의 draw() 실행 
		paint(new Rect()); // 오버라이딩된 메소드 Rect의 draw() 실행 	
		paint(new Circle()); // 오버라이딩된 메소드 Circle의 draw() 실행 
	}
}