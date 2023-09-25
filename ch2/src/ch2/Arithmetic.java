package ch2;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("식을 입력하세요>>");
		double op1=a.nextDouble();
		String operator=a.next();
		double op2=a.nextDouble();
		double result=0;
		switch(operator) {
			case "+": result=op1 + op2; break;
			case "-": result=op1 - op2; break;
			case "*": result=op1 * op2; break;
			case "/": 
				if(op2==0) System.out.println("0으로 나눌 수 없습니다.");
				else result=op1 / op2; break;
			default: System.out.println("연산 기호가 잘못되었습니다.");
		}
		System.out.print("연산 결과"+result);
	}
}
