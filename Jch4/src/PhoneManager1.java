import java.util.Scanner;
class phone {
		private String name,tel;
		public phone() {}
		public phone(String name, String tel) {this.name=name;this.tel=tel;}
		public String getName() {return name;}
		public String getTel() {return tel;}
	}
public class PhoneManager1 {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("�ο���>>");
		int m=a.nextInt();
		phone p[]=new phone[m];
		for(int i=0;i<m;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>>");
			String x=a.next();
			String y=a.next();
			p[i]=new phone(x,y);
		}
		System.out.println("����Ǿ����ϴ�...");
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String n=a.next();
			if(n.equals("exit")) {System.out.print("���α׷��� �����մϴ�...");break;}
			int e=0;
			for(int i=0;i<m;i++)
				if(p[i].getName().equals(n)) System.out.println(p[i].getName()+"�� ��ȣ�� "+p[i].getTel()+"�Դϴ�.");
				else e++;
			if(e==3) System.out.println(n+"�� �����ϴ�.");
		}
	}

}
