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
		System.out.print("인원수>>");
		int m=a.nextInt();
		phone p[]=new phone[m];
		for(int i=0;i<m;i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>>");
			String x=a.next();
			String y=a.next();
			p[i]=new phone(x,y);
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>>");
			String n=a.next();
			if(n.equals("exit")) {System.out.print("프로그램을 종료합니다...");break;}
			int e=0;
			for(int i=0;i<m;i++)
				if(p[i].getName().equals(n)) System.out.println(p[i].getName()+"의 번호는 "+p[i].getTel()+"입니다.");
				else e++;
			if(e==3) System.out.println(n+"이 없습니다.");
		}
	}

}
