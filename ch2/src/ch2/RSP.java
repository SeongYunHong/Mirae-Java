package ch2;

import java.util.Random;
import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random r=new Random();
	
		int m=0;
		System.out.println("Lotto");
		
		for(int i=0;i<6;i++) {
			m=(int)(Math.random()*45+1);
			
			if(i<5) System.out.print(m+", ");
			else System.out.print("Bonus : "+m);
		}
		/*-------------------------���� ����������
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("�� >> ");
		String m=a.next();
		
		int cr=r.nextInt(3);
		
		String n="";
		if(cr==0) n="����";
		else if(cr==1) n="����";
		else if(cr==2) n="��";
		System.out.println("��ǻ�� >> "+n);
		
		switch(m) {
			case "����": 
				if(n.equals("����")) System.out.print("�����ϴ�.");
				if(n.equals("����")) System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
				if(n.equals("��")) System.out.print("���� �̰���ϴ�.");
				break;
			case "����": 
				if(n.equals("����")) System.out.print("���� �̰���ϴ�.");
				if(n.equals("����")) System.out.print("�����ϴ�.");
				if(n.equals("��")) System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
				break;
			case "��":
				if(n.equals("����")) System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
				if(n.equals("����")) System.out.print("���� �̰���ϴ�.");
				if(n.equals("��")) System.out.print("�����ϴ�.");
				break;
		}
		
		/*-------------------------
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		String m=a.next();
		System.out.print("���� >> ");
		String n=a.next();
		
		switch(m) {
			case "����": 
				if(n.equals("����")) System.out.print("�����ϴ�.");
				if(n.equals("����")) System.out.print("���� �̰���ϴ�.");
				if(n.equals("��")) System.out.print("ö���� �̰���ϴ�.");
				break;
			case "����": 
				if(n.equals("����")) System.out.print("ö���� �̰���ϴ�.");
				if(n.equals("����")) System.out.print("�����ϴ�.");
				if(n.equals("��")) System.out.print("���� �̰���ϴ�.");
				break;
			case "��":
				if(n.equals("����")) System.out.print("���� �̰���ϴ�.");
				if(n.equals("����")) System.out.print("ö���� �̰���ϴ�.");
				if(n.equals("��")) System.out.print("�����ϴ�.");
				break;
		}
		*/
	}
}