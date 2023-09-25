package ch5;

import java.util.Scanner;

public class App12 {
	static Shape12 start=null, end=null;

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);//입력받을 때 

		int choice = 0;
		while(true) {
			System.out.println("삽입(1) 삭제(2) 모두보기(3) 종료(4) >> ");
			choice = a.nextInt();
			if(choice==4) {
				System.out.println("프로그램을 종료합니다.");break;}

			switch(choice) {
			case 1: //삽입
				System.out.println("도형종류 : Line(1) Rect(2) Circle(3) >> ");
				int t = a.nextInt();
				Shape12 o=null;
				switch(t) {
				case 1: o=new Line12();break;
				case 2: o=new Rect12();break;
				case 3: o=new Circle12();break;
				}
				if(start==null)start=end=o;
				else { end.setNext(o); end=o;}
				break;			

			case 2://삭제
				System.out.println("삭제할 도형의 위치 >> ");
				int m = a.nextInt();
				Shape12 crr=start, prv = start;
				if(start == null)
					System.out.println("XX ");
				for(int i=0; i<m; i++ ) {
					prv = crr;
					crr = crr.getNext();
					if(crr==null)System.out.println("XX ");
				}
				if(start==end)start=end=null;
				if(crr==start)start=start.getNext();
				else if(crr==end) {end=prv; end.setNext(null);}
				else prv.setNext(crr.getNext());
				break;
			case 3:
				Shape12 p=start;
				while(p != null) {p.draw();p=p.getNext();}
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");	
			}
		}
	}
}
