package mirae2.com;

public class Point {
	public double x,y;
	
	public Point() {} //매개변수가 없는 생성자를 만들어야하는 이유 : 배열을 이용할 때는 디폴트 생성자가 반드시 필요
	public Point(double x,double y) {this.x=x;this.y=y;}
	
	public void setX(double x) {
		this.x=x;}
	public double getX() {
		return x;}
	
	public void setY(double y) {
		this.y=y;}
	public double getY() {
		return y;}
	
	public double distance(){ //포인트의 원점으로부터의 거리값 출력
		return Math.sqrt(x*x+y*y);
	}
	public double distanceTo(Point po) { //두 점간의 거리
		double dx=this.x-po.x;
		double dy=this.y-po.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	public double theta() {
		double radian_result=Math.atan2(x,y); //길이를 계산해주는 함수
		return Math.toDegrees(radian_result); //길이의 비를 주면 라디안으로 바꿔주는 함수
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
}
