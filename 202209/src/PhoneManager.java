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
		
		System.out.println("인원수>>");
		int m=a.nextInt();
		Phonne []k=new Phonne[m];
		for(int i=0;i<m;i++) {
			System.out.println("이름과 전화번호(번호는 연속적으로 입력)");	
			String x=a.next();
			String y=a.next();
			k[i]=new Phonne(x,y);
		}
		System.out.println("저장하였습니다...");
		while(true) {
			System.out.println("검색할 이름>>");
			String o=a.next();
			if(o.equals("exit")) break;
			for(int i=0;i<m;i++) {
				if(o.equals(k[i].getName())){
					System.out.println(k[i].getName()+"의 번호는 "+k[i].getTel()+"입니다.");}
				
				else System.out.println(o+"이 없습니다");
			}
		}
	}

}
