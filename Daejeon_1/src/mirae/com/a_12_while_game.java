package mirae.com;
import java.util.Scanner;
public class a_12_while_game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		int answer=(int)(Math.random()*100)+1; //Math.random() 범위 : 0~0.99, *100=0~99, +1=1~100 
		int user = 0;
		int count = 1;
		int win=0;
		int lose=0;
		String ys="";
		
		while(true) {
			count++;
//-----------------숫자 입력
			System.out.print(answer+"숫자를 입력하시오 (1~100) : ");
			user=input.nextInt();
			if(user==answer) {
				System.out.println("정답입니다."); win++;count=8;
			}
			else if(count>7 && user != answer) lose++;
			else if(user>answer) System.out.println("DOWN");
			else System.out.println("UP");
//-----------------정답 맞췄을 때
			if(count==8) {
				System.out.println("다음 게임에 도전하시겠습니까?(y or n)");
				ys=input.next();
				if(ys.equals("y"))  {
					count=0;
					answer=(int)(Math.random()*100)+1;
				}
				else	{
					System.out.println("게임을 종료합니다."+n+"전"+win+"승"+lose+"패입니다.");break;
				}
			}
//-----------------횟수 초과됐을 때
			if(count>7) {
				System.out.println("정해진 횟수를 초과하였습니다. 다음 게임에 도전하시겠습니까?(y or n)");
				ys=input.next();
				if(ys.equals("y"))  {
					count=0;
					answer=(int)(Math.random()*100)+1; n++;
				}
				else	{
					System.out.println("게임을 종료합니다."+(win+lose)+"전"+win+"승"+lose+"패입니다.");break;
				}
			}
		}
		*/
//----------------------------------------------------------- 
		int user = 0;
		int battle=0;
		int win=0;
		String temp="";
		
		while(true) {
			int count = 0;	
			System.out.print("게임을 하시겠습니까.(시작은 y, 종료는 -1)");
			temp=input.nextLine();
			if(temp.isEmpty() || temp.equals("-1")) {
				
				break;
			}
			battle++;
			int answer=(int)(Math.random()*100)+1;
			
			do{
				System.out.print(answer+"숫자를 입력하시오 (1~100) : ");
				count++;
				user=Integer.parseInt(input.nextLine());
				if(user==answer) {
					System.out.println("\n축하드립니다!\n"+count+"번만에 맞추셨습니다.");win++;break;
				}
				else if(user>answer) System.out.println("DOWN");
				else System.out.println("UP");
				if(count>7) {System.out.println("정해진 횟수를 초과하였습니다."); break;}
			}while(true);
		}
		System.out.printf("%d전 %d승 %d패입니다.",battle,win,(battle-win));
	}
}