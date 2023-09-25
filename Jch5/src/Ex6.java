import java.util.Scanner;

abstract class Shape0612{
	private Shape0612 next;
	public Shape0612() { next = null;}
	public void setNext(Shape0612 obj) {next = obj;} // ��ũ ����
	public Shape0612 getNext() {return next;}
	public abstract void draw();

}
class Circle0612 extends Shape0612{public void draw(){System.out.println("Circle");}}
class Rect0612 extends Shape0612{public void draw(){System.out.println("Rect");}}
class Line0612 extends Shape0612{public void draw(){System.out.println("Line");}}

public class Ex6 {
	static Shape0612 start=null, end=null;

	public static void main(String [] args) {
		Scanner sin = new Scanner(System.in);

		int choice = 0;
		while (choice != 4) {
			int type, index;
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			choice = sin.nextInt();

			switch (choice) {
				case 1:	// ����
					System.out.print("���� ���� Line(1), Rect(2), Circle(3)>>");
					type = sin.nextInt();
					if (type < 1 || type > 3) {
						System.out.println("�߸� �����ϼ̽��ϴ�.");
						break;
					}
					insert(type);
					break;
				case 2:	// ����
					System.out.print("������ ������ ��ġ>>");
					index = sin.nextInt();
					if (!delete(index)) {
						System.out.println("������ �� �����ϴ�.");
					}
					break;
				case 3:	// ��� ����
					Shape0612 p = start;
					while(p != null) {
						p.draw();
						p = p.getNext();
					}
					break;
				case 4:	// ������
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	private static boolean delete(int index) {
		Shape0612 current = start, previous = start;
		if (start == null) // ����Ʈ�� �� ���
			return false;
		
		for (int i=0; i<index; i++) {
			previous = current;
			current = current.getNext(); // ���� ���ҷ� �̵�
			if (current == null) // �ε����� ����Ʈ ���� �������� ū ���
				return false;
		}
		
		if (start == end) { // ����Ʈ�� ���Ұ� �Ѱ��ۿ� ���� ���
			start = end = null;
			return true;
		}
		if (current == start) {// ù��° ���Ҹ� �����ϴ� ���
			start = start.getNext(); // ���� ���Ұ� ù��° ���Ұ� ��
		}
		else if (current == end) {// ������ ���Ҹ� �����ϴ� ���
			end = previous; // ���� ���Ұ� ������ ���Ұ� ��
			end.setNext(null);
		} 
		else {
			previous.setNext(current.getNext()); // ���� ���Ҹ� ����Ʈ���� ����
		}
		return true;
	}
	private static void insert(int choice) {

		Shape0612 obj=null;

		switch (choice) {
			case 1: // Line0612
				 obj = new Line0612();
				 break;
			case 2: // Rect0612
				obj = new Rect0612();
				break;
			case 3: // Circle0612
				obj = new Circle0612();
		}
		
		if (start == null) { // ����Ʈ�� ����� ��
			start = end = obj;
		} 
		else {
			end.setNext(obj); // ������ ���� �ڿ� ����
			end = obj;
		}
	}
}