import java.util.Scanner;

public class Rect_1 {
	private int width,height;
	public Rect_1(int w,int h) {this.width=w;this.height=h;}
	
	public int getArea() {return width*height;}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Rect_1 []k=new Rect_1[4];
		int sum =0;
		for(int i=0;i<4;i++) {
			System.out.println("�ʺ�� ���� >> ");
			int m=a.nextInt();
			int n=a.nextInt();
			k[i]=new Rect_1(m,n);
			sum+=k[i].getArea();
		}
		System.out.println("�����Ͽ����ϴ�...");
		System.out.println("�簢���� ��ü ���� "+sum);
	}

}
