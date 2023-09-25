class Circle22{
	private int radius;
	public Circle22() {this.radius=1;}
	public Circle22(int r) {this.radius=r;}
	public int getradius() {return radius;}
}
public class NamedCircle22 extends Circle22{
	String name;
	NamedCircle22(int r,String n){this.name=n;super(r);}
	void show()={System.out.println(name+",",getRadius());}
	public static void main(String[] args) {
	
		
		
	}

}
