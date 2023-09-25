import java.util.Scanner;

abstract class Calculator{
	protected int a,b;
	abstract protected int calc();
	protected void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 두개를 입력하시오 ");
		a=scanner.nextInt();
		b=scanner.nextInt();
	}
	public void run() {
		input();
		int res=calc();
		System.out.println("계산된 값은 "+res);
	}
}
class Adder0605 extends Calculator{
	public int calc() {return a+b;}
}
class Subtracter0605 extends Calculator{
	public int calc() {return a-b;}
}
public class App0605 {

	public static void main(String[] args) {
		Adder0605 adder = new Adder0605();
		Subtracter0605 sub = new Subtracter0605();
		
		adder.run();
		sub.run();
	}
}