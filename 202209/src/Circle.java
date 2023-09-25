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
		System.out.print("반지름 입력 : ");
		p.radius=a.nextDouble();
		System.out.print("이름 입력 : ");
		p.name=a.next();
		System.out.println("이름 : "+p.name+"/반지름 : "+p.radius+"/원의 넓이 : "+p.getArea());
		
		Circle p1 = new Circle();
		System.out.print("반지름 입력 : ");
		p1.radius=a.nextDouble();
		System.out.print("이름 입력 : ");
		p1.name=a.next();
		System.out.println("이름 : "+p1.name+"반지름 : "+p1.radius+"/원의 넓이 : "+p1.getArea());
		
	}
}