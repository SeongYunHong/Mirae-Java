package mirae.com;
import java.util.Scanner;
public class a_06_if_test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // 표준 입력 장치 : 키보드
		//필요한 데이터는 heap에 생성
		//Scanner(클래스, 사용자가 정의한 데이터 타입(멤버 변수, 멤버 함수)) input(주소가 들어있음) = new Scanner(System.in); 
//-----------------------------------------------------------
		/*
		System.out.print("홀짝 판정을 위한 숫자를 입력하시오 : ");
		int num = input.nextInt();
		if(num%2==0)
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
		 */
//-----------------------------------------------------------
		/*
		System.out.print("나이를 입력하시오 : ");
		int age = input.nextInt();
		
		System.out.print("체중을 입력하시오 : ");
		int weight = input.nextInt();
		
		if(age>=18 && weight>=50)
			System.out.println("헌혈 가능입니다.");
		else if(age<18 && weight>=50)
			System.out.println("현재 나이가 "+age+"세로 헌혈 불가능입니다.(기준 나이 : 18세)");
		else if(age>=18 && weight<50)
			System.out.println("현재 체중이 "+weight+"kg으로 헌혈 불가능입니다.(기준 체중 : 50kg)");
		//else if(age<18 || weight<50)
			//System.out.println("현재 나이 : "+age+"세, 체중 :  "+weight+"kg으로 헌혈 불가능입니다.(기준 나이 : 18세,기준 체중 : 50kg)");
		else
			System.out.println("나이와 체중 모두 미달입니다");
		*/
//-----------------------------------------------------------
		//주급 계산기
		//40시간은 100,000으로 계산
		//40시간 초과시 초과된 시간은 150,000으로 계산
		/*
		//case 1.
		System.out.print("이번주 근로시간을 입력하시오(단위 : 시) : ");
		int hour = input.nextInt();
		
		if(hour>40)
			System.out.println("이번주 근로시간은 총"+hour+"시간으로 급여는"+(hour*100000+(hour-40)*150000)+"원입니다.");
		else
			System.out.println("이번주 근로시간은 총 "+hour+"시간으로 급여는"+hour*100000+"원입니다.");
		*/
		//case 2.
		int hours;
		int pay;
		//상수를 변수화하여 사용
		final int basictime=40;
		final int paypertime = 100000;
		final int payovertime = 150000;
		
		System.out.print("이번주 근로시간을 입력하시오(단위 : 시) : ");
		hours = Integer.parseInt(input.nextLine());
		
		if(hours>basictime) {
			pay = basictime * paypertime;
			pay += (hours - basictime)* payovertime;
		}
		else {
			pay=hours * paypertime;
		}
		System.out.printf("당신의 주금은 %d원입니다.\n",pay);
		input.close();
	}
}