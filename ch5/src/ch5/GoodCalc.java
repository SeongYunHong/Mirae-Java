package ch5;

public class GoodCalc extends Calculateor{
	public int add(int a, int b) {return a+b;}
	public int sub(int a, int b){return a-b;}
	public double avg(int a[]){
		double sum=0;
		for(int i=0;i<a.length;i++) sum+=a[i];
		return (sum/a.length);
	}
	public static void main(String[] args) {
		GoodCalc c=new GoodCalc();
		System.out.println(c.add(10,20));
		System.out.println(c.sub(20,10));
		int A[]= {10,20,30,40,50};
		System.out.println(c.avg(A));
		System.out.println(c.avg(new int[] {10,20,30,40,50}));
	}
}
