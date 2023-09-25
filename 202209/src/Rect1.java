import java.util.Scanner;

public class Rect1 {
	int h=0;
	int x=0;
	int y=0;
	String name="아자자";
	Rect1(){}
	Rect1(int x,int y,int h,String n){this.x=x;this.y=y;this.h=h;this.name=n;}
	
	public int getArea() {
		return ((x+y)*h)/2;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Rect1 r1=new Rect1();
		System.out.print("윗변 입력 : ");
		r1.x=a.nextInt();
		System.out.print("밑변 입력 : ");
		r1.y=a.nextInt();
		System.out.print("높이 입력 : ");
		r1.h=a.nextInt();
		System.out.print("윗변 : "+r1.x+"/밑변 : "+r1.y+"/높이 : "+r1.h+"/넓이 : "+r1.getArea());
	
		Rect1 r2=new Rect1(2,3,10,"우지직");
	}

}
