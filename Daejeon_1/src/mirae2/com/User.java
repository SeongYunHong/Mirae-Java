package mirae2.com;

import java.util.Scanner;

public class User {
	int u;
	User(){}
	User(int u){this.u=u;}
	
	public int us() {
		System.out.println("가위 바위 보 게임을 시작하겠습니다.(가위 : 0, 바위 : 1, 보 : 2, 종료 : 9)");
		System.out.print("가위 바위 보!   ");
		Scanner input = new Scanner(System.in);	
		u=Integer.parseInt(input.nextLine());
		return u;
	}
	public void setUser(int u) {
		this.u=u;
	}
	public int getUser() {
		return u;
	}
	
//	public int  printU(int u) {
//		return u;
//	}
}