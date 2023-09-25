package ch5;

import java.util.Scanner;

abstract class Calculator{
	protected int x,y;
	abstract protected int calc();
	protected void input() {
		Scanner a = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���>>");
		x=a.nextInt();
		y=a.nextInt();
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("���� ���� "+res);
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