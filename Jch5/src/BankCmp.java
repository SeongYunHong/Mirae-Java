interface Bank{
	void getInterestRate(int m);
}
class BadBank implements Bank{
	int m;
	public void getInterestRate(int m) {System.out.println("BadBank�� ������ : "+m);}
}
class NormalBank implements Bank{
	int m;
	public void getInterestRate(int m) {System.out.println("NormalBank�� ������ : "+m);}
}
class GoodBank implements Bank{
	int m;
	public void getInterestRate(int m) {System.out.println("GooddBank�� ������ : "+m);}
}
public class BankCmp {
	public static void main(String[] args) {
		BadBank a=new BadBank();
		NormalBank b=new NormalBank();
		GoodBank c=new GoodBank();
		
		a.getInterestRate(10);
		b.getInterestRate(5);
		c.getInterestRate(3);
	}

}
