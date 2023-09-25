interface AdderInterface{
	int add(int x, int y);
	int add(int n);
}
public class MyAdder0601 implements AdderInterface{
	int sum;
	MyAdder0601(){};
	
	public int add(int x, int y) {return x+y;}
	public int add(int n) {
		for(int i=0; i<=n;i++) {
			sum += i;
		}return sum;
	}
	
	public static void main(String[] args) {
		MyAdder0601 adder = new MyAdder0601();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}

}
