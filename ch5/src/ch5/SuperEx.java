package ch5;
class Point16 {
	private int x, y; // 한 점을 구성하는 x, y 좌표
	Point16() {
		this.x = this.y = 0;
	}
	Point16(int x, int y) {
		this.x = x; this.y = y;
	}
	void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint16 extends Point16 {
	private String color; // 점의 색
	ColorPoint16(int x, int y, String color) {
		super(x, y); // Point의 생성자 Point(x, y) 호출
		this.color = color;
	}
	void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint16 cp = new ColorPoint16(5, 6, "blue");
		cp.showColorPoint();
	}
}