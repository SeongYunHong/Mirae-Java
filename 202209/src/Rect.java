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
		System.out.print("가로 입력 : ");
		r1.w=a.nextInt();
		System.out.print("세로 입력 : ");
		r1.h=a.nextInt();
		System.out.print("가로 : "+r1.w+"/세로 : "+r1.h+"/넓이 : "+r1.getArea());
	}
}
