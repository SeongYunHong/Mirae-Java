interface Shape12{
	final double PI=3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("------다시 그립니다.------");
		draw();
	}
}
class Circle12 implements Shape12{
	int t;
	Circle12(int t){this.t=t;}
	public double getArea() {
		return this.t*t*PI;
	}
	public void draw() {System.out.print("반지름 "+this.t);}
}
public class ShapeApp12 {
	public static void main(String[] args) {
		Shape12 coin = new Circle12 (10);
		coin.redraw();
		System.out.println("코인의 면적은 "+coin.getArea());
	}
}