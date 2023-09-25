package mirae3.com;
//복사하고 싶은 클래스는 Cloneable을 구현해주어야함
public class d_06_clone implements Cloneable{
	int rollno;
	String name;
	d_06_clone(int rollno, String name){this.rollno=rollno;this.name=name;}
	// 오버라이딩
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args) {
		try {
			d_06_clone s1 = new d_06_clone(101,"대한민국");
			d_06_clone s2 = (d_06_clone) s1.clone(); //데이터를 다른 곳에 복사
			System.out.println(s1==s2);
			System.out.println(s1.rollno+" "+s1.name);
			System.out.println(s1);
		}catch(CloneNotSupportedException c) {
			c.printStackTrace();
		}
	}
}