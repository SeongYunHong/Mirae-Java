import java.util.Scanner;

class Rect1 {
	private int width,height;
	public Rect1(int width,int height) {this.width=width;this.height=height;}
	public int getArea() {return width*height;}
}
	public class RectArray {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Rect1 r[]=new Rect1[4];
		for(int i=0;i<4;i++) {
			System.out.print("�ʺ�� ���� >> ");
			int m=a.nextInt();
			int n=a.nextInt();
			r[i]=new Rect1(m,n);
		}
		System.out.println("�����Ͽ����ϴ�...");
		int sum=0;
		for(int i=0;i<4;i++)
			sum+=r[i].getArea();	
		System.out.print("�簢���� ��ü ���� "+sum);
	}
}