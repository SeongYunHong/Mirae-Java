package ch5;

class Point{
	private int x,y;					// �� ���� �����ϴ� x,y��ǥ
	void set(int x,int y) {this.x=x;this.y=y;}
	void showPoint() {System.out.println("("+ x + ","+ y + ")");}
}
//Point�� ��ӹ��� ColorPoint ����
class ColorPoint extends Point {
	private String color;				//���� ��
	void setColor(String color) {this.color=color;}
	void showColorPoint() {				//�÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint();					//Point�� showPoint()ȣ��
	}
}
public class ColorPointEx {
	public static void main(String[] args) {
		Point p=new Point();			//Point ��ü ����
		p.set(1,2);						//Point Ŭ������ set()ȣ��
		p.showPoint();
		
		ColorPoint cp=new ColorPoint();
		cp.set(3,4);					//Point Ŭ������ set()ȣ��
		cp.setColor("red");				//ColorPoint�� setColor() ȣ��
		cp.showColorPoint();			//�÷��� ��ǥ ���
	}
}
