import java.util.*;

public class trycatch0504 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		try {
		System.out.print("�������� �Է��Ͻÿ�:");
		dividend = a.nextInt();
		System.out.print("�������� �Է��Ͻÿ�:");
		divisor = a.nextInt();
		
		System.out.println(dividend+"�� "+divisor+"�� ������ ���� "+dividend/divisor+"�Դϴ�.");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� ����.");
		}catch(InputMismatchException e) {
			System.out.println("Ÿ�Կ� �°� �Է��ض�");
		}
		finally {
			System.out.println("�����մϴ�.");
		}
	}	
		
		
}