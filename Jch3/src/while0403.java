import java.util.Scanner;

public class while0403 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		//���� �������� 100�� ������ �յڰ� ���� Ȯ��
		double m=0.0,x=0,y=0;
		int i=0;
		
		while(true) {
			if(i==100) break;
			m=(Math.random())*2;
			if(m>1) x++;
			else y++;
			i++;
		}
		//System.out.print(x+"/"+y+"/"+i);
		System.out.print("�ո� : "+x+"% ");
		for(int j=0;j<x;j++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("�޸� : "+y+"% ");
		for(int j=0;j<y;j++) {
			System.out.print("*");
		}
		/*-----------------------------------
		//���׸��� ������ 1�ð����� ���� ������ 2�辿 ����
		//ó�� ���׸��� ������ 100�谡 �Ǵ� �ð��� ��ð� ���ΰ�
		
		System.out.print("�ʱ� ���׸��� ���� �Է��Ͻÿ� : ");
		int m=a.nextInt();
		int t=0,n=0;
		t=m;
		while(true) {
			t*=2;
			if(t>m*100) break;
			n++;
		}
		System.out.print(n+"�ð� ��");
		/*-----------------------------------
		//���� ���� -> ��ǰ ������ �հ谡 10���� �ʰ� x
		//�� xx���� �����Ͽ��� ��հ��� xx�̴�.
		int m,c=0,tm=0;
		
		while(tm<100000) {
			System.out.print("��ǰ ������ �Է��ϼ��� : ");
			m=a.nextInt();
			tm+=m;
			if(tm<100000) {tm-=m;break;}
			c++;
		}
		System.out.print("�� "+c+"���� �����Ͽ��� ��հ��� "+(tm/c)+"���̴�.");
		/*-----------------------------------
		int sum=0,i=1,n=0;
		while((i=a.nextInt()) != 0) {
			sum+=i;
			n++;
		}
		System.out.println("n : "+n+"/avg : "+(double)sum/n);
		/*-----------------------------------
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("sum : "+sum);
		*/
	}
}