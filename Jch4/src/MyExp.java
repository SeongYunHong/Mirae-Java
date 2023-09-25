

class Sample{
	public int Sm_base;
	private int Sm_exp;
	void setExp(int a) {
		this.Sm_base=a;
	}
	int getExp() {
		return this.Sm_exp;
	}
}

public class MyExp {
	int base;
	int exp;
	
	MyExp(){this.base=1;this.exp=1;}
	MyExp(int b,int e){this.base=b;this.exp=e;}
	
	int getValue() {
		int res=1;
		for(int i=0;i<exp;i++)
			res*=base;
		return res;
	}
	public static void main(String[] args) {
		
		Sample sm=new Sample();
		sm.Sm_base=12;
		sm.setExp(3);
		System.out.println(sm.Sm_base+"/"+sm.getExp());
		
		MyExp number1=new MyExp();
		System.out.println(number1.base+"ÀÇ "+number1.exp+"½Â = "+number1.getValue());
		MyExp number2=new MyExp(10,10);
		System.out.println(number2.base+"ÀÇ "+number2.exp+"½Â = "+number2.getValue());
	}

}
