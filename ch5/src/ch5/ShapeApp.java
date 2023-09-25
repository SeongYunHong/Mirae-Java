package ch5;
interface Shape1{
	final double PI=3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("--- 다시 그립니다. ---");
		draw();
	}
}
class Circle1 implements Shape1{
	double m=0;
	Circle1(double m){this.m=m;}
	public void draw() {System.out.println("--- 그립니다. ---");}
	public double getArea() {return PI*m*m;}
}
public class ShapeApp {
	public static void main(String[] args) {
		Shape1 coin = new Circle1(10);
		coin.redraw();
		System.out.println("코인의 면적은 "+coin.getArea());
	}
}
