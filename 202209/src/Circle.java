import java.util.Scanner;

public class Circle {
	double radius=2.0;
	String name;
	
	public double getArea() {
		return (radius * radius * 3.141592);
		}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Circle p = new Circle();
		System.out.print("������ �Է� : ");
		p.radius=a.nextDouble();
		System.out.print("�̸� �Է� : ");
		p.name=a.next();
		System.out.println("�̸� : "+p.name+"/������ : "+p.radius+"/���� ���� : "+p.getArea());
		
		Circle p1 = new Circle();
		System.out.print("������ �Է� : ");
		p1.radius=a.nextDouble();
		System.out.print("�̸� �Է� : ");
		p1.name=a.next();
		System.out.println("�̸� : "+p1.name+"������ : "+p1.radius+"/���� ���� : "+p1.getArea());
		
	}
}