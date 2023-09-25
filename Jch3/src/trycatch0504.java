import java.util.*;

public class trycatch0504 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		try {
		System.out.print("나뉨수를 입력하시오:");
		dividend = a.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = a.nextInt();
		
		System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다.");
		}catch(InputMismatchException e) {
			System.out.println("타입에 맞게 입력해라");
		}
		finally {
			System.out.println("종료합니다.");
		}
	}	
		
		
}