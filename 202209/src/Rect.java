import java.util.Scanner;

public class Rect {
	int h=0;
	int w=0;
	String name;
	
	public int getArea() {
		return h*w;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Rect r1=new Rect();
		System.out.print("���� �Է� : ");
		r1.w=a.nextInt();
		System.out.print("���� �Է� : ");
		r1.h=a.nextInt();
		System.out.print("���� : "+r1.w+"/���� : "+r1.h+"/���� : "+r1.getArea());
	}
}
