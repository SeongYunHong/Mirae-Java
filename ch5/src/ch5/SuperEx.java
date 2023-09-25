package ch5;
class Point16 {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	Point16() {
		this.x = this.y = 0;
	}
	Point16(int x, int y) {
		this.x = x; this.y = y;
	}
	void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint16 extends Point16 {
	private String color; // ���� ��
	ColorPoint16(int x, int y, String color) {
		super(x, y); // Point�� ������ Point(x, y) ȣ��
		this.color = color;
	}
	void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ��
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint16 cp = new ColorPoint16(5, 6, "blue");
		cp.showColorPoint();
	}
}