class Sample{//Ŭ���� ���δ� ���� �κ��̶� ����� �Ұ�, ����ϰ������ �Լ��� �����ߵ�
	public int a=100;
	private int b=200;
	int c=300;
	
	void test() {System.out.println(this.b);}
}
public class AccessEx {
	public int AA=10;
	public int BB=20;
	int CC=30;
	public static void main(String[] args) {
		AccessEx DD=new AccessEx();
		System.out.println(DD.BB);
		System.out.println();
		Sample zz= new Sample();
		System.out.println(zz.a);
		zz.test();
		System.out.println(zz.c);

	}

}
