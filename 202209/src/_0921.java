import java.util.Scanner;
import java.util.Arrays;
import java.util.*;// *=all
public class _0921 {

	public static void main(String[] args) {
		//�迭
		/*
		boolean 1byte (true/false)
		char    2byte (�����ڵ� ����)
		
		����
		byte    1byte
		short   2byte
		int     4byte
		long    8byte
		
		�Ǽ�
		float   4byte
		double  8byte
		*/
		Scanner a = new Scanner(System.in);
		//Random  r = new Random();
		
		//�л� �� �Է� : 2
		//���� �� �Է� : 3
		//	�̸� 		 �հ� ��� 
		//------------------------
		//A�л�  98 21 99 xxx xx.xx
		System.out.print("�л� �� �Է� : ");
		int x=a.nextInt();
		System.out.print("���� �� �Է� : ");
		int y=a.nextInt();
		int m[][]=new int[x][y];
		String na[]=new String[x];
		
		for(int i=0;i<x;i++) {
			System.out.print("�л� �̸� �Է� : ");
			na[i]=a.next();
			for(int j=0;j<y;j++) {
				m[i][j]=(int)(Math.random()*101);
			}
		}
		System.out.println("�̸�\t\t�հ�  ���");
		for(int i=0;i<x;i++) {
			int sum=0;
			System.out.print(na[i]+"     ");
			for(int j=0;j<y;j++) {
				sum+=m[i][j];
				System.out.print(" "+m[i][j]);
			}	
			System.out.println("\t"+sum+"  "+(double)sum/y);
		}
		/*--------------------------------
		char m[]= {'+','-','*','/','%'};
		int s=0;
		while(true) {
			System.out.print("��� �Է� (1 : +,2 : -,3 : *,4 : /,5 : %,-1 : ����)");
			int n=a.nextInt();
			if(n==-1) {System.out.print("�����մϴ�.");break;}
			System.out.print("ù��° ���� �Է� :");
			int x=a.nextInt();
			System.out.print("�ι�° ���� �Է� :");
			int y=a.nextInt();
			
			if((n-1)==0) s=x+y;
			if((n-1)==1) s=x-y;
			if((n-1)==2) s=x*y;
			if((n-1)==3) s=x/y;
			if((n-1)==4) s=x%y;
			System.out.println("�� :"+x+m[n-1]+y+"="+s);
		}
		/*----------------------------------
		//���� ���� �ý���
		int m[]= new int[10];
		int cnt=0;
		while(true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�? (y or n)");
			char p=a.next().charAt(0);
			
			if(p=='n') {
				System.out.print("�ȳ��� ������");break;
				}
			
			if(p=='y') {
				//�¼� ���
				System.out.println("---------------------------------------");
				for(int i=0;i<10;i++) System.out.printf(" %2d ",i+1);
				System.out.println("\n---------------------------------------");
				for(int i=0;i<10;i++) System.out.printf(" %2d ",m[i]);
				System.out.println("\n---------------------------------------");
				//������ �¼� �Է�
				System.out.print("������ �¼� ��ȣ�� �Է��Ͻÿ�");
				int no=a.nextInt();
				
				if(m[no-1]==0) {System.out.println("����Ǿ����ϴ�.");m[no-1]=1;cnt++;}
				else			System.out.println("�̹� ����� �¼��Դϴ�.");

				if(cnt==10) {System.out.println("�����Ǿ����ϴ�."); break;}
			}
		}
		/*----------------------------------
		String n="Java,C,C#,Python";
		String str[]=n.split(" ");
		
		System.out.print(n.substring(5,10)); //(m~n)=m���� n-1����
		/*----------------------------------
		String n="Java,C,C#,Python";
		String str[]=n.split(",");
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]+" ");
		}
		
		System.out.print("���ڿ� �Է� :");
		String m=a.next();
		for(int i=0;i<4;i++)
			if(m.equals(str[i])) System.out.println(i+"�� �ִ�.");
		/*----------------------------------
		String n="        JAva            prog.            ";
		char c[]=new char[11];
		int cnt=0;
		System.out.println(n.replace("a            p","a p"));//��ü�ؼ� ��� ���� ����
		System.out.println(n.trim());//trim : ���ڿ��� ���۰� ���� �ִ� ���� ����
		/*-----------------------------------
		String n="JAva prog.";
		char c[]=new char[11];
		int cnt=0;
		
		System.out.print("�ҹ��� �Է� : ");
		char user = a.next().charAt(0);
		if(user >= 'A'&&user<='Z') user+=32;
		n=n.toLowerCase();
		System.out.println(n);
		
		for(int i=0;i<n.length();i++)
			if(n.charAt(i)==user) cnt++;
		System.out.println(user+"�� ���� = "+cnt);
		/*-----------------------------------
		int sum=0;
		int m[][]=new int[3][4];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				m[i][j]=(int)(Math.random()*9);
				sum+=m[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(m[i][j]+" ");
			}System.out.println();
		}System.out.println("���� : "+sum);
		/*-----------------------------------
		int n=0,u=0;
		String str[]= {"����","����","��"};
		String m="";
		System.out.print("��ǻ�Ϳ� ���������� ������ �մϴ�\n");
		while(true) {
			System.out.print("���� ���� ��!>>");
			m=a.next();
			n=(int)(Math.random()*3);
			for(int i=0;i<str.length;i++) {
				if(m.equals(str[i])) u=i;
			}
			if(m.equals("�׸�")) {System.out.print("������ �����մϴ�.");break;}
			if((n-u+2)%3==0) System.out.println("���� : "+str[u]+"/��ǻ�� : "+str[n]+"/��ǻ�� ��");
			if((n-u+2)%3==1) System.out.println("���� : "+str[u]+"/��ǻ�� : "+str[n]+"/���� ��");
			if(n==u) System.out.println("���� : "+str[u]+"/��ǻ�� : "+str[n]+"/���");
			/*
			if(m.equals("����")&&str[n].equals("����")) System.out.println("����� = ����/��ǻ�� = ����/�����ϴ�.");
			if(m.equals("����")&&str[n].equals("����")) System.out.println("����� = ����/��ǻ�� = ����/�����ϴ�.");
			if(m.equals("����")&&str[n].equals("��")) System.out.println("����� = ����/��ǻ�� = ��/�̰���ϴ�.");
			
			if(m.equals("����")&&str[n].equals("����")) System.out.println("����� = ����/��ǻ�� = ����/�̰���ϴ�.");
			if(m.equals("����")&&str[n].equals("����")) System.out.println("����� = ����/��ǻ�� = ����/�����ϴ�.");
			if(m.equals("����")&&str[n].equals("��")) System.out.println("����� = ����/��ǻ�� = ��/�����ϴ�.");
			
			if(m.equals("��")&&str[n].equals("����")) System.out.println("����� = ��/��ǻ�� = ����/�����ϴ�.");
			if(m.equals("��")&&str[n].equals("����")) System.out.println("����� = ��/��ǻ�� = ����/�̰���ϴ�.");
			if(m.equals("��")&&str[n].equals("��")) System.out.println("����� = ��/��ǻ�� = ��/�����ϴ�.");
		}
		*/
		/*-----------------------------------
		//���� �Է� �޾Ƽ� ���� �ԷµǸ� ����ó��
		int m=0;
		System.out.print("���� �Է� : ");
		try {m=a.nextInt();
			}
		catch(InputMismatchException e) {System.out.print("���ڸ� �Է��ϼ��� ! ");}
		System.out.print(m);
		/*-----------------------------------
		//��~����� ���� �迭 day�� ���� �ʱ�ȭ
		String m[]= {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		int n=0;
		System.out.print("���� �Է� : ");
		try {
			n=a.nextInt();
			switch(n%7) {
				case 0:System.out.print(m[6]);break;
				case 1:System.out.print(m[0]);break;
				case 2:System.out.print(m[1]);break;
				case 3:System.out.print(m[2]);break;
				case 4:System.out.print(m[3]);break;
				case 5:System.out.print(m[4]);break;
				case 6:System.out.print(m[5]);
			}
		}
		catch(InputMismatchException e) {System.out.print("���ڸ� �Է��ϼ��� ! ");
			
		}
		/*-----------------------------------
		//�̸�, �й� �Է� -> ��� try,catch
		int n[]=new int[2];
		System.out.print("�й��� ���� �Է� : ");
		try {
			for(int i=0;i<2;i++)
				n[i]=a.nextInt();
			}catch(InputMismatchException e){
				System.out.print("���ڸ� �Է��ϼ��� ! ");
			}
		for(int i=0;i<2;i++)
			System.out.print(n[i]+"/");
		/*-----------------------------------
		int x=0;
		
		System.out.print("�л� �� �Է� : ");
		x=a.nextInt();
		
		int m[][]=new int[x][4];
		String n[]=new String[x];
		
		for(int i=0;i<x;i++) {
			System.out.println("�̸��Է� : ");
			n[i]=a.next();
			System.out.println(n[i]+"���� ������ �����Է� : ");
			for(int j=0;j<3;j++) {
				m[i][j]=a.nextInt();
				
			}
		}
		for(int i=0;i<x;i++) {
			m[i][3]=0;
			for(int j=0;j<3;j++)
				m[i][3]+=m[i][j];
			
			try {
				System.out.println(n[i]+"���� ���: "+((double)(m[i][3]))/0);
			}catch(ArithmeticException e) {
				System.out.println("by zero");
			}finally {
				System.out.println("end");
			}
		}
		/*-----------------------------------
		int m[][]=new int[5][5];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				m[i][j]=(int)(Math.random()*100+1);
			}
		}
		
		for(int i=0;i<4;i++) {
			m[4][0]+=m[i][0];
			m[4][1]+=m[i][1];
			m[4][2]+=m[i][2];
			m[4][3]+=m[i][3];
		}
		for(int i=0;i<4;i++) {
			m[0][4]+=m[0][i];
			m[1][4]+=m[1][i];
			m[2][4]+=m[2][i];
			m[3][4]+=m[3][i];
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		/*-----------------------------------
		int [][]m=new int[7][10];
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				m[i][j]=(int)(Math.random()*100+1);
			}
		}
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) 
					if(m[i][j]%10==k) m[6][k]++;
			}
		}
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(m[i][j]+" ");	
			}System.out.println();
		}
		/*-----------------------------------
		int [][]m=new int[7][10];
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				m[i][j]=(int)(Math.random()*100+1);
				if(m[i][j]%10==0) m[6][0]++;
				if(m[i][j]%10==1) m[6][1]++;
				if(m[i][j]%10==2) m[6][2]++;
				if(m[i][j]%10==3) m[6][3]++;
				if(m[i][j]%10==4) m[6][4]++;
				if(m[i][j]%10==5) m[6][5]++;
				if(m[i][j]%10==6) m[6][6]++;
				if(m[i][j]%10==7) m[6][7]++;
				if(m[i][j]%10==8) m[6][8]++;
				if(m[i][j]%10==9) m[6][9]++;
			}
		}
		for(int i=0;i<7;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(m[i][j]+" ");	
			}System.out.println();
		}
		/*-----------------------------------
		String m="";
		System.out.print("���ڿ� �Է� : ");
		m=a.next();
		for(int j=0;j<m.length();j++) {
			for(int i=0;i<m.length();i++) {
				if(i==j) System.out.print((char)(m.charAt(i)-32));
				else System.out.print((m.charAt(i)));
			}
			System.out.println();			
		}
		/*-----------------------------------
		 System.out.print("���� ���ĺ� �Է� : ");
		 char m=a.next().charAt(0);

		 System.out.print("�� ���ĺ� �Է� : ");
		 char n=a.next().charAt(0);
		 
		 for(int j=m;j<=n;j++) {
			 for(int i=j;i<=n;i++)
				 System.out.print((char)i);
		 	System.out.println();
		}
		/*-----------------------------------
		String []m=new String[20];
		char [][]c=new char[20][20];
		
		//for(int j=0;j<10;j++) m[j]=a.nextLine();
		//for(int j=0;j<10;j++) System.out.println(m[j]);
	
		for(int j=0;j<3;j++) 
			for(int i=0;i<3;i++) c[j][i]=a.next().charAt(0);
		for(int j=0;j<3;j++) { 
			for(int i=0;i<3;i++) System.out.print(c[j][i]);
			System.out.println();
		}
		/*-----------------------------------
		int [][]m=new int [10][10];
		for(int j=0;j<10;j++) {//��
			for(int i=0;i<20-j;i++){//��
				if(i<=j) System.out.print("  ");
				else System.out.print("* ");
			}
			System.out.println();
		}
		/*-----------------------------------
		//�迭�� ������ �̿��ؼ� �� �׸���
		final int Size=10;
		int [][] n=new int[Size][Size];
		for(int j=0;j<Size;j++) {
			for(int i=0;i<Size;i++) {
				n[i][j]=(int)(Math.random()*2);
			}
			for(int i=0;i<Size;i++) {
				if (n[i][j]==1) System.out.print("$");
				else System.out.print("* ");
			}System.out.println();
		}
		/*-----------------------------------
		final int Size=10;
		int [] numbers=new int[Size];
		
		for(int i=0;i<Size;i++) {
			numbers[i]=(int)(Math.random()*100);
		}
		System.out.print("���� �迭 �� : ");
		for(int x:numbers) System.out.print(x+" ");
		System.out.println();
		Arrays.sort(numbers); //Arrays.sort() ���������� ū������ ����
		System.out.print("���� �� �迭 : ");
		for(int x:numbers)  System.out.print(x+" ");
		/*-----------------------------------
		final int Size=10; //final ���(������ �ʴ� ��)�� ���
		int [] numbers=new int[Size];
		
		for(int i=0;i<Size;i++) {
			numbers[i]=(int)(Math.random()*100);
		}
		System.out.print("���� �迭 �� : ");
		for(int x:numbers) System.out.print(x+" ");
		System.out.println();
		for(int i=0;i<Size;i++) {
			for(int j=i+1;j<Size;j++) {
				if(numbers[i]>numbers[j]) {
					int tmp=0;
					tmp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=tmp;
				}
			}	
		}System.out.print("���� �� �迭 : ");
		for(int x:numbers)  System.out.print(x+" ");
		/*-----------------------------------
		String eng[]= {"student","love","java","happy","future"};
		String kor[]= {"�л�","���","�ڹ�","�ູ��","�̷�"};
		int i=0,n=0;
		while(true) {
			System.out.print("���� �ܾ �Է��ϼ���>>");
			String m=a.next();
			if(m.equals("exit")) {
				System.out.print("�����մϴ�. . .");
				break;}
			for(String k:eng){
				if(m.equals(k)) {
					System.out.println(kor[i]);
					n=1;
				}
				i++;
			}
			if(n==0) System.out.println("�׷� ���� �ܾ �����ϴ�.");
		}
		/*-----------------------------------
		//���� �Է� : ��
		//��� -> ���� �ε��� 2�� �ֽ��ϴ�.
		String f[]= {"���","��","��","����","����"};
		for(String k:f) System.out.print(k+" ");
		System.out.println();
		System.out.print("���� �Է� : ");
		String m=a.next();
		int n=0;
		int i=0;
		for(String k:f) {
			if(m.equals(k)) {
				n=1;System.out.print(m+"�� �ε���"+i+"��°�� �ֽ��ϴ�.");
			}
		}i++;
		if(n==0) System.out.print(m+"�� �����ϴ�.");
		/*-----------------------------------
		String f[]= {"���","��","��","����","����"};
		for(String k:f) System.out.print(k+" ");
		System.out.println();
		System.out.print("���� �Է� : ");
		String m=a.next();
		int n=0;
		for(int i=0;i<f.length;i++) {
			if(m.equals(f[i])) {
				n=1;System.out.print(m+"�� �ε���"+i+"��°�� �ֽ��ϴ�.");
			}
		}
		if(n==0) System.out.print(m+"�� �����ϴ�.");
		/*-----------------------------------
		int x[]=new int[10];
		int y[]= {1,2,3,4,5};
		
		for(int i=0;i<x.length;i++)
			x[i]=10*(i+1);
		for(int i=0;i<x.length;i++)
			System.out.print(x[i]+" ");
		System.out.println();
		//for each
		for(int k:x) System.out.print(k+" ");//x�� ���� k�� �ϳ��� ����
		/*-----------------------------------
		//Q.���� 100���� �� (50~150)
			int sum=0,j=0;
			int x[] = new int[100];
				
			for(int i=0;i<100;i++) {
				x[i] = (int)(Math.random()*100+50);
				if(x[i]%3==0) j++;
			}
			int x3[]=new int[j];
			int z=0;
			for(int i=0;i<100;i++) {
				if(x[i]%3==0) {
					x3[z]=x[i];
					sum+=x3[z];
						
					if(z==j-1) System.out.print(x3[z]+"="+sum);
					else	System.out.print(x3[z]+"+");
					z++;
				}
			}
		/*-----------------------------------
		//Q.10�� ���� �迭�� ������ ���� ������ �� Max ���ϱ�
		int m[]=new int[10];
		int max=0,min=0;
		for(int i=0;i<10;i++) {
			m[i]=(int)(Math.random()*100+1);
			if(i==0) max=min=m[i];
			max=(max>m[i])?max:m[i];
			min=(min<m[i])?min:m[i];
		}
		for(int i=0;i<10;i++)
			System.out.print(m[i]+" ");
		System.out.print("\nMax : "+max+"/min : "+min);
		/*-----------------------------------
		//Q. �л� ���� �Է� �޾� �� �л����� ������ �հ�� ����� ���Ͽ���
		int m[];
		int sum=0;
		
		System.out.print("�л� �� �Է� : ");
		int s=a.nextInt();
		
		m=new int[s];
		for(int i=0;i<s;i++) {
			System.out.print((i+1)+"��° �л� ���� �Է� : "); 
			int j=a.nextInt();
			m[i]=j;
			sum+=m[i];
		}
	
		System.out.print("�հ� : "+sum+"\n��� : "+(((double)(sum))/s));
		
		/*-----------------------------------
		int m[];
		
		System.out.print("������ �Է� : ");
		int s=a.nextInt();
		
		m=new int[s];
		for(int i=0;i<s;i++) {
			System.out.print("���� �Է� : "); 
			int j=a.nextInt();
			m[i]=j;
		}
		
		for(int i=0;i<s;i++)
			System.out.print(m[i]+" ");
			*/
	}
}
