import java.util.Scanner;

abstract class Shape0612{
	private Shape0612 next;
	public Shape0612() { next = null;}
	public void setNext(Shape0612 obj) {next = obj;} // 링크 연결
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
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			choice = sin.nextInt();

			switch (choice) {
				case 1:	// 삽입
					System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
					type = sin.nextInt();
					if (type < 1 || type > 3) {
						System.out.println("잘못 선택하셨습니다.");
						break;
					}
					insert(type);
					break;
				case 2:	// 삭제
					System.out.print("삭제할 도형의 위치>>");
					index = sin.nextInt();
					if (!delete(index)) {
						System.out.println("삭제할 수 없습니다.");
					}
					break;
				case 3:	// 모두 보기
					Shape0612 p = start;
					while(p != null) {
						p.draw();
						p = p.getNext();
					}
					break;
				case 4:	// 끝내기
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	private static boolean delete(int index) {
		Shape0612 current = start, previous = start;
		if (start == null) // 리스트가 빈 경우
			return false;
		
		for (int i=0; i<index; i++) {
			previous = current;
			current = current.getNext(); // 다음 원소로 이동
			if (current == null) // 인덱스가 리스트 원소 갯수보다 큰 경우
				return false;
		}
		
		if (start == end) { // 리스트에 원소가 한개밖에 없는 경우
			start = end = null;
			return true;
		}
		if (current == start) {// 첫번째 원소를 삭제하는 경우
			start = start.getNext(); // 다음 원소가 첫번째 원소가 됨
		}
		else if (current == end) {// 마지막 원소를 삭제하는 경우
			end = previous; // 이전 원소가 마지막 원소가 됨
			end.setNext(null);
		} 
		else {
			previous.setNext(current.getNext()); // 현재 원소를 리스트에서 삭제
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
		
		if (start == null) { // 리스트가 비었을 때
			start = end = obj;
		} 
		else {
			end.setNext(obj); // 마지막 원소 뒤에 삽입
			end = obj;
		}
	}
}