import java.util.Scanner;

class Phonne{
	String name="";
	String tel="";
	Phonne(String n,String t) {this.name=n;this.tel=t;}
	String getName() {
		return this.name;
	}
	String getTel() {
		return this.tel;
	}
}
public class PhoneManager {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("�ο���>>");
		int m=a.nextInt();
		Phonne []k=new Phonne[m];
		for(int i=0;i<m;i++) {
			System.out.println("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)");	
			String x=a.next();
			String y=a.next();
			k[i]=new Phonne(x,y);
		}
		System.out.println("�����Ͽ����ϴ�...");
		while(true) {
			System.out.println("�˻��� �̸�>>");
			String o=a.next();
			if(o.equals("exit")) break;
			for(int i=0;i<m;i++) {
				if(o.equals(k[i].getName())){
					System.out.println(k[i].getName()+"�� ��ȣ�� "+k[i].getTel()+"�Դϴ�.");}
				
				else System.out.println(o+"�� �����ϴ�");
			}
		}
	}

}
