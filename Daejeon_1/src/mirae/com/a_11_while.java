package mirae.com;
import java.util.Scanner;
public class a_11_while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//-----------------------------------------------------------
		/*
		int answer=(int)(Math.random()*100)+1; //Math.random() 범위 : 0~0.99, *100=0~99, +1=1~100 
		int user = 0;
		int count = 0;
		
		while(true) {
			count++;
			System.out.print("숫자를 입력하시오 (1~100) : ");
			user=input.nextInt();
			if(user==answer) {
				System.out.println("\n축하드립니다!\n"+count+"번만에 맞추셨습니다.");break;
			}
			else if(user>answer) System.out.println("DOWN");
			else System.out.println("UP");
		}
		*/
//-----------------------------------------------------------		
		int answer=(int)(Math.random()*100)+1;
		int user = 0;
		int count = 0;
		
		do{
			count++;
			System.out.print("숫자를 입력하시오 (1~100) : ");
			user=input.nextInt();
			if(user==answer) {
				System.out.println("\n축하드립니다!\n"+count+"번만에 맞추셨습니다.");break;
			}
			else if(user>answer) System.out.println("DOWN");
			else System.out.println("UP");
		}while(true);
	}
}