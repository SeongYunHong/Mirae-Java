import java.util.Scanner;

public class array0410 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		double score[]=new double[10];
		
		for(int i=0;i<8; i++) {
			score[i]=(Math.random()*100);
			score[i]=(Math.round(score[i]*1000))/1000;
			System.out.println((i+1)+"�� : "+score[i]);
			score[8]+=score[i];
		}
		score[9]=score[8]/8;
		
		System.out.println("sum : "+score[8]+" / avg : "+score[9]);
		/*-----------------------------------------
		int intArray[]=new int[5];
		int max=0,min=0;
		
		for(int i=0;i<5; i++) {
			intArray[i]=(int)(Math.random()*101);
			if(i==0) min=intArray[i];
			System.out.print(intArray[i]+" ");
			if(intArray[i]>max)max=intArray[i];
			if(intArray[i]<min)min=intArray[i];
		}
		System.out.println("\n�Էµ� ������ ���� ū ���� "+max+"�Դϴ�.");
		System.out.println("�Էµ� ������ ���� ���� ���� "+min+"�Դϴ�.");
		/*-----------------------------------------
		//�ֻ��� ���� ����
		int c[]=new int[2];
		double m=0;
		int x=0,y=0;
		for(int i=0;i<100;i++) {
			m=(Math.random())*2;
			if(m>1) c[0]++;
			else c[1]++;
		}
		System.out.println("�ո� : "+c[0]);
		System.out.println("�޸� : "+c[1]);
		if(c[0]>c[1]) System.out.println("�ո��� �޸麸�� "+((double)c[0]/c[1])+"�� �� ���Դ�.");
		else		System.out.println("�޸��� �ո麸�� "+((double)c[1]/c[0])+"�� �� ���Դ�.");
		/*-----------------------------------------
		//���� ���� �߻����� ���� ����
		int m=0;
		int c[]=new int[10];
		for(int i=0;i<100;i++) {
			m=(int)(Math.random()*10+1);
			for(int j=1;j<=10;j++) {
				if(m==j) c[j-1]++;
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+":"+c[i]+"��");
		}
		/*-----------------------------------------
		int m[]=new int[10];
		int n[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<10;i++) {
			int index=(int)(Math.random()*10);
			m[i]=n[index];
			System.out.print(m[i]+" ");
		}*/
	}
}