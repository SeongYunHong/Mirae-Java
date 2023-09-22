package mirae2.com;

import java.util.Scanner;

public class b_09_rsp {
	public static int rsp(int user, int com){
		int result=0;
		if(user==0) {
			if(com==0) result=2;
			else if(com==1) result=1;
			else result=0;
		}
		else if(user==1) {
			if(com==0) result=0;
			else if(com==1) result=2;
			else result=1;
		}
		else if(user==2) {
			if(com==0) result=1;
			else if(com==1) result=0;
			else result=2;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		while(true) {
			System.out.println("가위 바위 보 게임을 시작하겠습니다.(가위 : 0, 바위 : 1, 보 : 2, 종료 : 9)");
			System.out.print("가위 바위 보!   ");
			int user=Integer.parseInt(input.nextLine());	
			if(user==9) break;
			count++;
			int com=(int)(Math.random()*3);
			String judge[]= {"이겼습니다!","졌습니다...","비겼습니다."};
			int result = rsp(user,com);

			switch(result) {
				case 0: win+=1; break;
				case 1: lose+=1; break;
				case 2: draw+=1; break;
			}
			
			System.out.println(com+" "+judge[result]);
		}
		System.out.println("게임 결과 : "+count+"전"+win+"승"+draw+"무"+lose+"패");
	}
}