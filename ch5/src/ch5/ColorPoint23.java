package ch5;

class Point23{
	private int x,y;
	public Point23(int x, int y) {this.x=x;this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x=x;this.y=y;}
}
public class ColorPoint23 extends Point23{
	private String color;
	public void setPoint(int x, int y) {
		move(x,y);}
	public void setColor(String c) {
		this.color=c;}
	public void show() {System.out.print(color+"»öÀ¸·Î"+"("+getX()+","+getY()+")");}
		ColorPoint23(int x, int y, String m) {super(x,y);this.color=m;}
	public static void main(String[] args) {
		ColorPoint23 cp=new ColorPoint23(5,5,"YELLOW");
		cp.setPoint(10,20);
		cp.setColor("GREEN");
		cp.show();
	}
}
