import java.util.Scanner;

public class Rect1 {
	int h=0;
	int x=0;
	int y=0;
	String name="������";
	Rect1(){}
	Rect1(int x,int y,int h,String n){this.x=x;this.y=y;this.h=h;this.name=n;}
	
	public int getArea() {
		return ((x+y)*h)/2;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Rect1 r1=new Rect1();
		System.out.print("���� �Է� : ");
		r1.x=a.nextInt();
		System.out.print("�غ� �Է� : ");
		r1.y=a.nextInt();
		System.out.print("���� �Է� : ");
		r1.h=a.nextInt();
		System.out.print("���� : "+r1.x+"/�غ� : "+r1.y+"/���� : "+r1.h+"/���� : "+r1.getArea());
	
		Rect1 r2=new Rect1(2,3,10,"������");
	}

}
