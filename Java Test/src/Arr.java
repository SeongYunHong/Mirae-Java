import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		/*
		int m[]=new int [10];
		System.out.println("���� 10�� �Է� : ");
		for(int i=0;i<10;i++) {
			m[i]=a.nextInt();
			if(m[i]%3==0) System.out.print(m[i]+"\t"); 
		}
	*/
	/*--------------------------------------------------	
		char day[]= {'��','��','ȭ','��','��','��','��'};
		while(true) {
			System.out.print("���� �Է� : ");
			int m=a.nextInt();
			switch(m%7) {
				case 0: System.out.println("��"); break;
				case 1:	System.out.println("��"); break;
				case 2:	System.out.println("ȭ"); break;
				case 3:	System.out.println("��"); break;
				case 4:	System.out.println("��"); break;
				case 5:	System.out.println("��"); break;
				case 6:	System.out.println("��");
			}
		}
		*/
		/*
		int m[]=new int [10];
		int n=0;
		System.out.println("���� 10�� �Է� : ");
		for(int i=0;i<10;i++) {
			m[i]=a.nextInt();
		}
		for(int i=0;i<10;i++) {
			for(int j=i;j<9;j++) {
				if(m[i]>m[j+1]) {
					n=m[i];
					m[i]=m[j+1];
					m[j+1]=n;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(m[i]+" ");
		}
		*/
		/*--------------------------------------------------
		String eng[]= {"student","love","java","happy","future"};
		String kor[]= {"�л�","���","�ڹ�","�ູ��","�̷�"};
		while(true) {
			System.out.println("���� �ܾ �Է��ϼ��� ");
			String m=a.next();
			if(m.equals("exit")) break;
			for(int i=0;i<5;i++) {
				if(m.equals(eng[i])) System.out.print(kor[i]);
			}System.out.println("");
		}
		*/
		/*--------------------------------------------------
		int m=0;
		
		for(int i=1;i<100;i++) {
			if((i%3==0 || i%6==0 || i%9==0 )&& (i/10==3 || i/10==6 || i/10==9))
					System.out.println(i+"�ڼ��ι�");
			else if(i%3==0 || i%6==0 || i%9==0 || i/10==3 || i/10==6 || i/10==9)
				System.out.println(i+"�ڼ��ѹ�");
		}
		*/
		////*--------------------------------------------------
		int m[][]=new int [3][4];
		int sum=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				m[i][j]=(int)(Math.random()*9);
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(m[i][j]+" ");
				sum+=m[i][j];
			}System.out.println();
		}System.out.println("���� "+sum);
	//	*/
	}
}
