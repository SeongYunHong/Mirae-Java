package ch2;

import java.util.Scanner;

public class J0323 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("�� ������ �Է��ϼ���>>");
		String x=a.next();
		String y=a.next();
		String z=a.next();
		
		switch(y) {
			case "OR":
				switch(x) {
					case "TRUE":
						System.out.print("true"); break;
					case "FALSE":
						System.out.print("false"); break;
				}break;
			case "AND":
				switch(x) {
					case "TRUE":
						if(z.equals("TRUE"))
							System.out.print("true"); break;
					case "FALSE":
						System.out.print("false"); break;
				}
		}
		/*--------------------------------------
		//�� �������� ���� �ٷμҵ濡 ���� �ҵ漼 ����ϱ�
		//�ٷμҵ��� 2000���� �����̸� �ٷμҵ��� 5%
		//2000 �ʰ� 4000 ���� 15
		//4000 �ʰ� 8000 ���� 25
		//8000 �ʰ� 40%
		System.out.print("�ٷμҵ� �Է�(���� ����)>>");
		int m=a.nextInt();
		int x=0;
		if(m<=2000) x=0;
		else if(m>2000  && m<=4000) x=1;
		else if(m>4000  && m<=8000) x=2;
		else if(m<=8000) x=3;
		switch(x) {
			case 0: System.out.print("����� �ٷμҵ��� 2000���� ���Ϸ� 5%�̸�\n�ҵ漼��"+m+"������ 5%�� "+(int)(m*0.05)+"000���Դϴ�."); break;
			case 1: System.out.print("����� �ٷμҵ��� 2000���� �ʰ� 4000���� ���Ϸ� 15%�̸�\n�ҵ漼��"+m+"������ 15%�� "+(int)(m*0.15)+"000���Դϴ�.");break;
			case 2: System.out.print("����� �ٷμҵ��� 4000���� �ʰ� 8000���� ���Ϸ� 25%�̸�\n�ҵ漼��"+m+"������ 25%�� "+(int)(m*0.25)+"000���Դϴ�.");break;
			case 3: System.out.print("����� �ٷμҵ��� 8000�����ʰ��� 40%�̸�\n�ҵ漼��"+m+"������ 40%�� "+(int)(m*0.40)+"000���Դϴ�.");
		}
		/*--------------------------------------
		System.out.println("�޴���\n1. ���̴� 900\n2. �ݶ� 1000\n3. ȯŸ 5000\n4. �� 500");
		System.out.print("�ݾ� �Է�>>");
		int x=a.nextInt();
		System.out.print("�޴� ����>>");
		int y=a.nextInt();
		System.out.print("���� �Է�>>");
		int z=a.nextInt();
		
		switch(y) {
			case 1:
				if(x-900*z<0) System.out.print("�ݾ��� �����մϴ�.");
				else 	System.out.print("���̴�"+z+"���� ���Խ��ϴ�.");
				break;
			case 2:
				if(x-1000*z<0) System.out.print("�ݾ��� �����մϴ�.");
				else 	System.out.print("�ݶ�"+z+"���� ���Խ��ϴ�.");
				break;
			case 3:	
				if(x-5000*z<0) System.out.print("�ݾ��� �����մϴ�.");
				else 	System.out.print("ȯŸ"+z+"���� ���Խ��ϴ�.");
				break;
			case 4:
				if(x-500*z<0) System.out.print("�ݾ��� �����մϴ�.");
				else 	System.out.print("��"+z+"���� ���Խ��ϴ�.");
		
		}
		*/
	}
}