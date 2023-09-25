package mirae3.com;

public class Point {
	public double x,y;
	
	public Point() {} 
	public Point(double x,double y) {this.x=x;this.y=y;}
	
	public void setX(double x) {this.x=x;}
	public double getX() {	return x;}

	public void setY(double y) {this.y=y;}
	public double getY() {return y;}
	
	public double distance(){ 
		return Math.sqrt(x*x+y*y);
	}
	public double distanceTo(Point po) { 
		double dx=this.x-po.x;
		double dy=this.y-po.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	public double theta() {
		double radian_result=Math.atan2(x,y);
		return Math.toDegrees(radian_result);
	}
	public void print() {
		System.out.println("x= "+x+" y= "+y);
	}
	public void printx() {
		System.out.println("x= "+x);	
	}
	public void printy() {
		System.out.println("y= "+y);
	}
	public String toString() {
		return "x좌표 = "+x+ " y좌표 = "+ y;
	}
}
