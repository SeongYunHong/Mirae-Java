package ch2;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		//87p 
		/*//1.
		System.out.print("�� ������ �Է��ϼ���>>");
		int x=a.nextInt();
		int y=a.nextInt();
		
		System.out.print(x+"+"+y+"��"+(x+y));
		*/
		/*//2.
		System.out.print("�� ������ �Է��ϼ���>>");
		int x=a.nextInt();
		
		System.out.print((x*5)+"m �Դϴ�.");
		*/
		/*//3.
		System.out.print("x���� �Է��ϼ���>>");
		double x=a.nextDouble();
		double y=Math.pow(x,2.0)+(-3*x)+7;
		System.out.print("x="+x+", y="+y);
		*/
		/*//4
		System.out.print("��(x,y)�� ��ǥ�� �Է��ϼ���>>");
		int x=a.nextInt();
		int y=a.nextInt();
		
		if(x>=50 && x<=100 && y>=50 && y<=100)
			System.out.print("��("+x+","+y+")�� (50,50)�� (100,100)�� �簢�� ���� �ֽ��ϴ�.");
		else
			System.out.print("��("+x+","+y+")�� (50,50)�� (100,100)�� �簢�� ���� �����ϴ�.");
		*/
		/*//5.
		System.out.print("�� ������ �Է��ϼ���>>");
		String x=a.next();
		
		if(x.equals("true OR false"))
			System.out.print("true");

		if(x.equals("true AND false"))
			System.out.print("false");

		if(x.equals("true OR true"))
			System.out.print("true");

		if(x.equals("true AND true"))
			System.out.print("true");
		
		if(x.equals("false OR false"))
			System.out.print("false");

		if(x.equals("false AND false"))
			System.out.print("false");
		*/
		/*//6.
		System.out.print("���� �׼��� �Է��ϼ���>>");
		int x=a.nextInt();
		int m=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;
		if(x>=50000)
			m+=x/50000;
		if(x%50000>=10000)
			b+=(x%50000)/10000;
		if(((x%50000)%10000)>=5000)
			c+=((x%50000)%10000)/5000;
		if(((x%50000)%10000)%5000>=1000)
			d+=(((x%50000)%10000)%5000)/1000;
		if((((x%50000)%10000)%5000)%1000>=500)
			e+=((((x%50000)%10000)%5000)%1000)/500;
		if(((((x%50000)%10000)%5000)%1000)%500>=100)
			f+=(((((x%50000)%10000)%5000)%1000)%500)/100;
		if((((((x%50000)%10000)%5000)%1000)%500)%100>=10)
			g+=((((((x%50000)%10000)%5000)%1000)%500)%100)/10;
		h=((((((x%50000)%10000)%5000)%1000)%500)%100)%10;
		
		System.out.print("������"+m+"��, ����"+b+"��, ��õ��"+c+"��, õ��"+d+"��, 500��"+e+"��, 100��"+f+"��, 10��"+g+"��, 1��"+h+"��");
		*/
		/*
		//7.
		System.out.print("������ �Է��ϼ���>>");
		String m=a.next();
		
		switch (m) {
			case "A":
			case "B": System.out.print("Excellent");break;
			case "C":
			case "D": System.out.print("Good");break;
			case "F": System.out.print("Bye");
		}
		*/
		/*//8.
		System.out.println("�޴���\n���������� 2000��\n�Ƹ޸�ī�� 2500��\nīǪġ�� 3000��\nī��� 3500��");
		System.out.print("Ŀ�Ǹ� �ֹ��ϼ���>>");
		String m=a.next();
		int n=a.nextInt();
		
		if(m.equals("����������"))
			System.out.print(2000*n+"���Դϴ�.");
		if(m.equals("�Ƹ޸�ī��"))
			System.out.print(2500*n+"���Դϴ�.");
		if(m.equals("īǪġ��"))
			System.out.print(3000*n+"���Դϴ�.");
		if(m.equals("ī���"))
			System.out.print(3500*n+"���Դϴ�.");
		*/
		/*//9.
		System.out.print("1~99 ������ ������ �Է��ϼ���>>");
		int m=a.nextInt();
		String n="�ڼ�";
		if(m/10==3 || m/10==6 || m/10==9) n+="¦";
		if(m%10==3 || m%10==6 || m%10==9) n+="¦";
		else n+="����";
		System.out.print(n);
		*/
		/*//10.
		System.out.println("�޴���\n���������� 2000��\n�Ƹ޸�ī�� 2500��\nīǪġ�� 3000��\nī��� 3500��");
		System.out.print("Ŀ�Ǹ� �ֹ��ϼ���>>");
		String m=a.next();
		int n=a.nextInt();
		
		if(m.equals("����������")) {
			if(n>=10)
				System.out.print((2000*n)*0.95+"���Դϴ�.");}
		if(m.equals("�Ƹ޸�ī��"))
			System.out.print(2500*n+"���Դϴ�.");
		if(m.equals("īǪġ��"))
			System.out.print(3000*n+"���Դϴ�.");
		if(m.equals("ī���"))
			System.out.print(3500*n+"���Դϴ�.");
		*/
		/*------------------------------------
		//Q. �̸��� 3���� ���� �Է¹ް� ��� 60�̻� �հ�
		//�Ѱ����̶� 40�� �̸��̸� ���հ�
		
		System.out.println("�̸�, 3���� ���� �Է� : ");
		String m=a.next();
		int x=a.nextInt();
		int y=a.nextInt();
		int z=a.nextInt();
		int avg=(x+y+z)/3;
		if(avg>=60 && x>40 && y>40 && z>40)
			System.out.print(m+"���� ��� "+avg+"������ �հ��Դϴ�.");
		else System.out.print(m+"���� ��� "+avg+"������ ���հ��Դϴ�.");
		/*------------------------------------
		//Q. �̸� �г� ���� �Է� �޾� 60���̻� �̸� �հ�
		//4�г��̸� 70���̻� �հ�
		
		System.out.println("�̸�, �г�, ���� �Է� : ");
		String m=a.next();
		int n=a.nextInt();
		int k=a.nextInt();
		
		if(n==4 && k>=70) 
			System.out.print(m+"���� "+n+"�г��̸� "+k+"������ �հ��Դϴ�.");
		else if(n<4&&k>=60) System.out.print(m+"���� "+n+"�г��̸� "+k+"������ �հ��Դϴ�.");
		
		else System.out.print(m+"���� "+n+"�г��̸� "+k+"������ ���հ��Դϴ�.");
		/*------------------------------------
		//Q. ���� �Է��ϰ� 2-10�� ������� Ȯ���ϰ� ���
		String n="";
		System.out.print("���� �Է� : ");
		int m=a.nextInt();
		
		for(int i=2;i<=10;i++) {
			if(m%i==0)
				if(i==10) n+=i;
				else n+=i+",";
		}
		System.out.println(n+"�� ����Դϴ�.");
		/*------------------------------------
		//Q. �����Է��ϰ� ���ǿ� ��
		//0-59 F,60-69 D,70-79 C,80-89 B,90-100 A
		
		System.out.println("���� �Է� : ");
		int m=a.nextInt();
		
		if(m>=90 && m<=100)
			System.out.println("A");
		else if(m>=80)
			System.out.println("B");
		else if(m>=70)
			System.out.println("C");
		else if(m>=60)
			System.out.println("D");
		else if(m<60)
			System.out.println("F");
		else {
			System.out.println("�߸� �Է��Ͽ����ϴ�."); return;}
		System.out.println(m+"����");
		/*------------------------------------
		System.out.println("���� �Է� : ");
		int m=a.nextInt();
		
		if(m>=8 && m<=13)
			System.out.println("����Դϴ�.");
		else if(m>=14 && m<=19)
			System.out.println("û�ҳ��Դϴ�.");	
		else
			System.out.println("�����Դϴ�.");		
		/*------------------------------------
		System.out.println("���� �Է� : ");
		int m=a.nextInt();
		
		if(m>=80) System.out.print("�����մϴ�. �հ��ϼ̽��ϴ�.");
		/*------------------------------------
		//Q. 1.���� �ϳ� �Է�
		//	 2. ������ �����̸� �������� �̵�
		//	 3. ������ ����̸� ���������� �̵�
		//	    �� �̵��ڸ����� �Է� ���� ��
		
		System.out.println("���� �Է� : ");
		int m=a.nextInt();
		
		System.out.println("�̵���ų ĭ �� �Է� : ");
		int n=a.nextInt();
		m=(m>0)?(m>>>n):(m<<n);
		System.out.println(m);
		/*------------------------------------
		int s=a.nextInt();
		int t=a.nextInt();
		int max=(s>t)?s:t;
		System.out.println(s+"��"+t+"�߿� ū ���� "+max+"��.");
		
		int min=(s>t)?t:s;
		System.out.println(s+"��"+t+"�߿� ���� ���� "+min+"��.");
		/*------------------------------------*/
		//int s=a.nextInt();
		//int t=a.nextInt();
		
		//int res=(s>=t)?s+"�� �� ũ�ų� ����.":t+"�� �� ũ��.";
		/*------------------------------------
		int s=a.nextInt();
		int t=a.nextInt();
		
		String str=(s>=t)?"s�� �� ũ�ų� ����.":t+"�� �� ũ��.";
		System.out.println(str);
		/*------------------------------------
		int s=a.nextInt();
		
		System.out.println("s : "+((s>0)?s:(-1*s)));
		/*------------------------------------
		int s=a.nextInt();
		int t=a.nextInt();
		
		System.out.println("s-t ->"+((s>t)? (s-t):(t-s)));
		/*------------------------------------
		int s=10,t=30;
		
		boolean an = (s>=t)?true:false;
		System.out.println(an);
		
		String str=(s>=t)?"s�� t���� ũ��.":"t�� s���� ũ��.";
		System.out.println(str);
		/*------------------------------------
		int s=10;
		
		s+=	1;
		System.out.println(s);
		/*------------------------------------
		int s=a.nextInt();
		int t=a.nextInt();
		boolean an;
		
		//an=!!!!!!!!!!!!!!(s>t);
		an=(s!=t)||(s==10);
		System.out.println(an);
		
		/*------------------------------------
		int s=a.nextInt();
		
		System.out.println("s:"+s);
		System.out.println("s--:"+s--);
		System.out.println("s:"+s);
		System.out.println("--s:"+ --s);
		System.out.println("s:"+s);
		/*------------------------------------
		int s=a.nextInt();
		int t=a.nextInt();
		
		System.out.println("s>>>t : "+(short)(s>>>t));
		System.out.println("s>>t : "+(short)(s>>t));
		System.out.println("s<<t : "+(short)(s<<t));
		/*------------------------------------
		int s=a.nextInt();
		int t=a.nextInt();
		
		System.out.println("s&t : "+(s&t));
		System.out.println("s|t : "+(s|t));
		System.out.println("s^t : "+(s^t));
		System.out.println("~s : "+(~s)+"/ ~t : "+(~t));
		/*------------------------------------
		//������ �Է� �޾Ƽ� �� �� �ʸ� ���Ͽ� ���
		System.out.print("���� �Է� : ");
		int m=a.nextInt();
		
		System.out.print((m/60)+"��"+((m%60)/60)+"��"+((m%60)%60)+"���̴�.");
		/*------------------------------------
		String m=a.next();
		int	   n=a.nextInt();
		int	   k=a.nextInt();
		double x=a.nextDouble();
		double y=a.nextDouble();
		
		System.out.println("�̸� : "+m);
		System.out.println("���� : "+n);
		System.out.println("�й� : "+k);
		System.out.println("Ű : "+x);
		System.out.println("������ : "+y);
		/*------------------------------------
		int m=a.nextInt();
		double n=a.nextDouble();
		String c=a.next();
		
		System.out.print(m+"/"+n+"/"+c);
		/*------------------------------------
		byte b=127;
		int i=100;
		
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+i));
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);
		System.out.println();
		System.out.println();
		System.out.println();
		
		/*----------------------------
		final double PI=3.14;
		double radius=10;
		double circleArea=0;
		
		//PI=23.254;
		//radius=50;
		
		circleArea=radius*radius*PI;
		
		System.out.print("���� ���� : ");
		System.out.println(circleArea);
		*/
	}

}
