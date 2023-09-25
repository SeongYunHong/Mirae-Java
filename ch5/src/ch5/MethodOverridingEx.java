package ch5;
class Shape { // ������ ���� Ŭ����
	String a="Shape";
	public void draw() {
		System.out.println("1Shape2");
	}
}
class Line extends Shape {
	String a="Shape";
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("1Line2");
	}
}
class Rect extends Shape {
	String b="Rect";
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("1Rect2");
	}
}
class Circle extends Shape {
	String c="Circle";
	public void draw() { // �޼ҵ� �������̵�
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
	// Shape�� ��ӹ��� ��ü���� �Ű� ������ �Ѿ�� �� ����
	// p�� ����Ű�� ��ü�� �������̵��� draw() ȣ��
	// �������ε�
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); // Line�� draw() ����. "Line" ���

		paint(new Shape()); // Shape�� draw() ����. "Shape" ���
		paint(new Line()); // �������̵��� �޼ҵ� Line�� draw() ���� 
		paint(new Rect()); // �������̵��� �޼ҵ� Rect�� draw() ���� 	
		paint(new Circle()); // �������̵��� �޼ҵ� Circle�� draw() ���� 
	}
}