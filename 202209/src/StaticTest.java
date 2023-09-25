class Circle1{
	private int radius;
	public Circle1(int radius) {this.radius=radius;}
	public int getRadius() {return this.radius;}
	public void setRadius(int radius) {this.radius=radius;}
}
class CircleManager{
	static void copy(Circle1 src,Circle1 dest) {
		dest.setRadius(src.getRadius());		
	}
	static boolean equals(Circle1 a,Circle1 b) {
		 if(a.getRadius()==b.getRadius()) return true;
		 else return false;
	}
}
public class StaticTest {
	public static void main(String[] args) {
		Circle1 pizza=new Circle1(5);
		Circle1 waffle=new Circle1(1);
		
		boolean res = CircleManager.equals(pizza,waffle);
		if(res==true)
			System.out.println("pizza와 waffle 크기 같음");
		else
			System.out.println("pizza와 waffle 크기 다름");
		
		CircleManager.copy(pizza,waffle);
		res=CircleManager.equals(pizza,waffle);
		if(res==true)
			System.out.println("pizza와 waffle 크기 같음");
		else 
			System.out.println("pizza와 waffle 크기 다름");
	}
}
