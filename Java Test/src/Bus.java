import java.util.Scanner;

public class Bus {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("���� ��� �Է� : ");
		int m=a.nextInt();
		
		double x=0,y=0;
		
		x=m-((m/1250)*100);
		if(m<50000) y=m*0.8;
		else y=m-10000;
		System.out.println("�佺 : "+x+", ������ : "+y);
		if(x>y) System.out.print((int)(x-y)+"�� ���̷� ������ī�� �̵�");
		else	System.out.print((int)(y-x)+"�� ���̷� �佺ī�� �̵�");
	}

}
