class Point22{
	private int x,y;
	void set(int x,int y) {this.x=x;this.y=y;}
	void showPoint() {System.out.println("("+x+","+y+")");}
}
class ColorPoint22 extends Point22{
	private String color;
	void setColor(String c) {this.color=c;}
	void showColorPoint() {System.out.print(color);showPoint();}
}
public class CColorPointEX {
	public static void main(String[] args) {
		Point22 p=new Point22();
		p.set(1,2);p.showPoint();
		ColorPoint22 cp=new ColorPoint22();
		cp.set(3,4);cp.setColor("red"); cp.showColorPoint();
	}
}