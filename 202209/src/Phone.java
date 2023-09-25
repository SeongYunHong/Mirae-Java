import java.util.Scanner;

public class Phone {
	private String name,tel;
	public Phone(String n,String t) {this.name=n;this.tel=t;}
	
	public String getName() {
		return this.name;
	}
	public String getTel() {
		return this.tel;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String m="";
		String n="";
		Phone []k=new Phone[2];
		for(int i=0;i<2;i++) {
			System.out.println("이름과 전화번호 입력 >> ");
			m=a.next();
			n=a.next();
			k[i]=new Phone(m,n);
		}
		for(int i=0;i<2;i++) {
			System.out.println(k[i].getName()+" "+k[i].getTel());
		}
	}

}
