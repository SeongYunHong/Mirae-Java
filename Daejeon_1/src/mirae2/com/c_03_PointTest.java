package mirae2.com;

public class c_03_PointTest {

	public static void main(String[] args) {
		Point po = new Point(1,1);
		Point po2 = new Point(2,2);
		po.printx();
		
		System.out.println(po.distance());
		System.out.println(po.distanceTo(po2));
		System.out.println(po.theta());
		System.out.println(po2.theta());
	}
}