import java.util.Scanner;

public class Phone1 {
	private String name,tel;
	public Phone1() {}
	public Phone1(String name, String tel) {this.name=name;this.tel=tel;}
	public String getName() {return name;}
	public String getTel() {return tel;}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
			System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
			String m=a.next();
			String n=a.next();
			Phone1 x1=new Phone1(m,n);
			
			System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
			m=a.next();
			n=a.next();
			Phone1 x2=new Phone1(m,n);
			
			System.out.println(x1.getName()+"�� ��ȣ "+x1.getTel());
			System.out.println(x2.getName()+"�� ��ȣ "+x2.getTel());
	}

}
