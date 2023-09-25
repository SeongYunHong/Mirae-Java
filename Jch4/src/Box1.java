
public class Box1 {
	private int width,height;
	private char fillChar;
	public Box1() {this.width=10;this.height=1;}
	public Box1(int width,int height) {this.width=width;this.height=height;}
	public void draw() {
		for(int i=0;i<this.height;i++) {
			for(int j=0;j<this.width;j++)
				System.out.print(this.fillChar);
			System.out.println();
		}
	}
	public void fill(char c) {this.fillChar=c}
	public static void main(String[] args) {
		Box1 a=new Box1();
		Box1 b=new Box1(20,3);
		a.fill('*');
		b.fill('%');
		a.draw();
		b.draw();
	}
}