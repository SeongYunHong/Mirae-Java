package ch5;

import java.util.Scanner;

abstract class Calculator{
	protected int x,y;
	abstract protected int calc();
	protected void input() {
		Scanner a = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요>>");
		x=a.nextInt();
		y=a.nextInt();
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("계산된 값은 "+res);
	}
}
class Adder extends Calculator{
	public int calc() {return x+y;}
}
class Subtracter extends Calculator{
	public int calc() {return x-y;}
}
public class App {
	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run();
		sub.run();
	}
}