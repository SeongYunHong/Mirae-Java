import java.util.Scanner;

public class dowhile0406 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int x=0,c=0;
		while(true) {
			c++;
			int i=(int)(Math.random()*9+1);
			int j=(int)(Math.random()*9+1);
			
			System.out.print(i+"x"+j+"=");
			int m=a.nextInt();
			
			if(m==(i*j)) {System.out.print("����");x++;}
			else System.out.print("����");
			
			System.out.print("��� �Ͻðڽ��ϱ�?(y or n)");
			String y=a.next();
			if(y.equals("n")) break;
		}
		System.out.println("�� "+c+"���� �� "+x+"���� ���缭 "+(x*10)+"���Դϴ�.");
		
		/*-----------------------------------
		int num=0;
		
		while(true) {
			if(a.next()==("exit"))
				break;
			num++;
		}
		System.out.print("�Էµ� ���ڿ��� ������ "+num	);
		/*-----------------------------------
		for(int i=1; i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}		
			System.out.println();
		}
		/*-----------------------------------
		//���� �ݾ� �Է� [0-500] : 122
		//378���� �Ž������� ������ ����
		//100��¥�� ���� 3��
		// 10��¥�� ���� 7��
		//  1��¥�� ���� 8��
		int n=0;
		int i=2;
		System.out.print("���� �ݾ� �Է� [0-500] : ");
		int m=a.nextInt();
		System.out.println((500-m)+"�� �Ž������� ������ ����.");		
		n=(500-m);
		do{
			double k=Math.pow(10,i);
			double c=0;
			c=n/k;
			System.out.println((int)k+"��¥�� ���� "+(int)c+"��");
			n-=(k*(int)c);
			i--;
		}while(i!=-1);
		/*-----------------------------------
		//���>>
		//���� �̸� : ���۹�
		//�⼮ ���� : 94
		//���� ���� : 88
		//���� ���� : 82
		//�߰� ��� : 75
		//�⸻ ��� : 97
		//���� ���۹��� ���� : 87.xxxx
		//���� ���۹��� ���� : B
		//����ϱ⸦ ���ϼ���?(y or n) : 
		String k="";
		do {
			System.out.print("���� �̸� : ");
			String name=a.next();
			System.out.print("�⼮ ���� : ");
			int m=a.nextInt();
			System.out.print("���� ���� : ");
			int n=a.nextInt();
			System.out.print("���� ���� : ");
			int o=a.nextInt();
			System.out.print("�߰���� : ");
			int p=a.nextInt();
			System.out.print("�⸻��� : ");
			int q=a.nextInt();
			
			double avg =0;
			avg+= (m+n+o+p+q)/5;
			String grade;
			
			if(avg>=95) grade="A+";
			else if(avg>=90) grade="A";
			else if(avg>=85) grade="B+";
			else if(avg>=80) grade="B";
			else if(avg>=75) grade="C+";
			else if(avg>=70) grade="C";
			else if(avg>=65) grade="D+";
			else if(avg>=60) grade="D";
			else grade="F";
			
			System.out.println("���� "+name+"�� ���� : "+avg);
			System.out.println("���� "+name+"�� ���� : "+grade);
			
			System.out.print("����ϱ⸦ ���ϼ���? (y or n)");
			k=a.next();
		}while(k=="y");
		/*-----------------------------------
		//���Ǳ� (1. Ŀ��=900 2. ź��=1200 3. ��=500 4. ����)
		int m=0,sum=0;
		System.out.println("\t\t  <<�޴�>>");
		
		do {
			System.out.println("(1. Ŀ��=900 2. ź��=1200 3. ��=500 4. ����)");
			m=a.nextInt();
			if(m==4) break;
			System.out.print("���� ���� �Է� : ");
			int c=a.nextInt();
			switch(m) {
				case 1: sum+=900*c; break;
				case 2: sum+=1200*c; break;
				case 3: sum+=500*c;
			}
		}while(m!=4);
		System.out.println("�� ���� �ݾ��� "+sum+"���Դϴ�.");
		System.out.print("���� �־��ּ��� : ");
		int n=a.nextInt();
		System.out.print("�ܵ� : "+(n-sum));
		/*-----------------------------------
		char m='A';
		
		do {
			System.out.print(m+""+(char)(m+32)+" ");
			m=(char)(m+1);
		}while(m<='Z');		
*/
	}
}