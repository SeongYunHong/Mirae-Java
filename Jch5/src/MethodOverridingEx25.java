class Shape25 { // 도형의 슈퍼 클래스
	public void draw() {System.out.println("Shape");}
}
class Line25 extends Shape25 {
	public void draw() {System.out.println("Line");}// 메소드 오버라이딩
}
class Rect25 extends Shape25 {
	public void draw() {System.out.println("Rect");} // 메소드 오버라이딩	
}
class Circle25 extends Shape25 {
	public void draw() {System.out.println("Circle");} // 메소드 오버라이딩
}
public class MethodOverridingEx25 {
	static void paint(Shape25 p) { // Shape을 상속받은 객체들이 매개 변수로 넘어올 수 있음
		p.draw(); // p가 가리키는 객체에 오버라이딩된 draw() 호출.(동적바인딩)
	}

	public static void main(String[] args) {
		Line25 line = new Line25();
		paint(line); // Line의 draw() 실행. "Line" 출력

		paint(new Shape25()); // Shape의 draw() 실행. "Shape" 출력
		paint(new Line25()); // 오버라이딩된 메소드 Line의 draw() 실행 
		paint(new Rect25()); // 오버라이딩된 메소드 Rect의 draw() 실행 	
		paint(new Circle25()); // 오버라이딩된 메소드 Circle의 draw() 실행 
	}
}

