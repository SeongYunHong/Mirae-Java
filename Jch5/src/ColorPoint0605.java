class Point0605{
	private int x,y;
	public Point0605(int x, int y) {this.x=x;this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x,int y) {this.x=x;this.y=y;}
	}
public class ColorPoint0605 extends Point0605{
	String c;
	ColorPoint0605(int x,int y,String c){super(x, y);this.c=c;}
	
	void setPoint(int x, int y){move(x,y);}
	void setColor(String c) { this.c=c;}
	void show() {
		System.out.print(c+"À¸·Î ("+getX()+","+getY()+")");
	}
	public static void main(String[] args) {
		ColorPoint0605 cp=new ColorPoint0605(5,5,"Yellow");
		cp.setPoint(10,20);
		cp.setColor("Green");
		cp.show();
	}
}
