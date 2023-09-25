package ch5;
class Circle21{
	private int radius;
	public Circle21(int r) {this.radius=r;}
	public int getRadius() {return radius;}
}
public class NamedCircle extends Circle21{
	private String name;
	public NamedCircle(int a,String n){super(a);this.name=n;}
	void show() {System.out.println(this.name+","+getRadius());}
	public static void main(String[] args) {
		NamedCircle w=new NamedCircle(5,"Waffle");
		w.show();
	}

}
