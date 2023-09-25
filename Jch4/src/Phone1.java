import java.util.Scanner;

public class Phone1 {
	private String name,tel;
	public Phone1() {}
	public Phone1(String name, String tel) {this.name=name;this.tel=tel;}
	public String getName() {return name;}
	public String getTel() {return tel;}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
			System.out.print("이름과 전화번호 입력 >>");
			String m=a.next();
			String n=a.next();
			Phone1 x1=new Phone1(m,n);
			
			System.out.print("이름과 전화번호 입력 >>");
			m=a.next();
			n=a.next();
			Phone1 x2=new Phone1(m,n);
			
			System.out.println(x1.getName()+"의 번호 "+x1.getTel());
			System.out.println(x2.getName()+"의 번호 "+x2.getTel());
	}

}
