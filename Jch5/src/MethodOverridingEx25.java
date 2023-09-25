class Shape25 { // ������ ���� Ŭ����
	public void draw() {System.out.println("Shape");}
}
class Line25 extends Shape25 {
	public void draw() {System.out.println("Line");}// �޼ҵ� �������̵�
}
class Rect25 extends Shape25 {
	public void draw() {System.out.println("Rect");} // �޼ҵ� �������̵�	
}
class Circle25 extends Shape25 {
	public void draw() {System.out.println("Circle");} // �޼ҵ� �������̵�
}
public class MethodOverridingEx25 {
	static void paint(Shape25 p) { // Shape�� ��ӹ��� ��ü���� �Ű� ������ �Ѿ�� �� ����
		p.draw(); // p�� ����Ű�� ��ü�� �������̵��� draw() ȣ��.(�������ε�)
	}

	public static void main(String[] args) {
		Line25 line = new Line25();
		paint(line); // Line�� draw() ����. "Line" ���

		paint(new Shape25()); // Shape�� draw() ����. "Shape" ���
		paint(new Line25()); // �������̵��� �޼ҵ� Line�� draw() ���� 
		paint(new Rect25()); // �������̵��� �޼ҵ� Rect�� draw() ���� 	
		paint(new Circle25()); // �������̵��� �޼ҵ� Circle�� draw() ���� 
	}
}

