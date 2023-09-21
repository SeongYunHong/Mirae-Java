package mirae.com;
import java.util.Scanner;
public class a_18_odd_even {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int count=0;
		int win=0;
		for(; ;) {
			int com=(int)(Math.random()*2); //0,1반환
			
			System.out.println("홀 짝을 입력하시오(0:짝, 1:홀, 9:종료) : ");
			int user=Integer.parseInt(input.nextLine());
			
			if(user==9) {System.out.println("종료되었습니다...\n"+count+"전"+win+"승"+(count-win)+"패");break;}
			count++;
			if(user%2==com) {
				win++;
				System.out.println("맞췄습니다.");
			}
			else System.out.println("틀렸습니다.");
		}
		
		
	}
}