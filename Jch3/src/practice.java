import java.util.*;

public class practice {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		/*
		//1.
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���>>");
		char m=a.next().charAt(0);
		
		for(int i=97;i<=m;i++) {
			for(int j=i;j<=m;j++) {
				System.out.print((char)j);
			}System.out.println();
		}
		*/
		/*
		//2.
		int m[]=new int[10];
		System.out.print("���� 10�� �Է�>>");
		for(int i=0;i<10;i++) {
			m[i]=a.nextInt();
			if(m[i]%3==0) System.out.print(m[i]+" ");
		}
		*/
		/*
		//3.
		try {
			System.out.print("������ �Է��ϼ���>>");
			int m=a.nextInt();
			if(m%2==0) System.out.print("¦��");
			else System.out.print("Ȧ��");}
		catch(InputMismatchException e) {
			System.out.print("���� �Է����� �ʾ� ���α׷� �����մϴ�.");
		}
		*/
		/*
		//4.
		String m[]= {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		try {
			while(true) {
				System.out.print("������ �Է��ϼ���>>");
				int k=a.nextInt();
				if(k<0) {System.out.print("���α׷��� �����մϴ�...");break;}
				for(int i=0;i<7;i++) {
						if(k%7==i) System.out.print(m[i]);
				}
			}
		}catch(InputMismatchException e) {
			System.out.print("���! ���� �Է����� �ʾҽ��ϴ�.");
		}
		*/
		/*
		//5.
		int m[]=new int[10];
		System.out.print("���� 10�� �Է�>>");
		for(int i=0;i<10;i++) {
			m[i]=a.nextInt();	
		}
		for(int i=0;i<10;i++) {
			int temp=0;
			for(int j=0;j<i;j++) {
				if(m[j]>m[i]) {
					temp=m[j];
					m[j]=m[i];
					m[i]=temp;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(m[i]+" ");
		}
		*/
		/*
		//6.
		String eng[]= {"student","love","java","happy","future"};
		String kor[]= {"�л�","���","�ڹ�","�ູ��","�̷�"};
		
		while(true) {
			System.out.print("���� �ܾ �Է��ϼ���>>");
			String m=a.next();
			if(m.equals("exit")) {System.out.print("�����մϴ�...");break;}
			for(int i=0;i<5;i++) {
				if(m.equals(eng[i])) System.out.println(kor[i]);
				else System.out.print("�׷� ���� �ܾ �����ϴ�.");
			}
		}
		*/
		/*
		//7.
		for(int i=0;i<100;i++) {
			if((i%10==3 || i%10==6 || i%10==9)&&(i/10==3 || i/10==6 || i/10==9))
				System.out.println(i+" �ڼ� �ι�");
			else if((i%10==3 || i%10==6 || i%10==9) || (i/10==3 || i/10==6 || i/10==9))
				System.out.println(i+" �ڼ� �ѹ�");
		}
		*/
		/*
		//8.
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		String str[]= {"����","����","��"};
		int p=0;
		while(true) {
			System.out.print("���� ���� ��!>> ");
			String m=a.next();
			if(m.equals("�׸�")) {System.out.print("������ �����մϴ�...");break;}
			int c=(int)(Math.random()*3);
			if(m.equals("����")) p=0;
			if(m.equals("����")) p=1;
			if(m.equals("��")) p=2;
			System.out.println(c);
			if((p-c+2)%3==0) System.out.println("����� : "+m+", ��ǻ�� : "+str[c]+", ����ڰ� �̰���ϴ�.");
			if((p-c+2)%3==1) System.out.println("����� : "+m+", ��ǻ�� : "+str[c]+", ��ǻ�Ͱ� �̰���ϴ�.");
			if((p-c+2)%3==2) System.out.println("����� : "+m+", ��ǻ�� : "+str[c]+", �����ϴ�.");
		}
		*/
	}
}
