package ch2;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���>>");
		double op1=a.nextDouble();
		String operator=a.next();
		double op2=a.nextDouble();
		double result=0;
		switch(operator) {
			case "+": result=op1 + op2; break;
			case "-": result=op1 - op2; break;
			case "*": result=op1 * op2; break;
			case "/": 
				if(op2==0) System.out.println("0���� ���� �� �����ϴ�.");
				else result=op1 / op2; break;
			default: System.out.println("���� ��ȣ�� �߸��Ǿ����ϴ�.");
		}
		System.out.print("���� ���"+result);
	}
}
