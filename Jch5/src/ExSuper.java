class SuperCat{
	String breed="�������";
	int age=15;
	String name;
	SuperCat(String n){this.name=n;}
	void printInfo() {System.out.println("���� �θ�����, �̸��� "+name+"\nǰ���� "+this.breed+", ���̴� "+this.age+"��");}
}
class SubCat extends SuperCat{
	int age=2;
	String name;
	SubCat(String n,String m){super(n);	this.name=m;}
	void printInfo() {super.printInfo();System.out.println("���� �ڽİ����, �̸��� "+name+"\nǰ���� "+this.breed+", ���̴� "+age+"��");}
}
public class ExSuper {
	public static void main(String[] args) {
		SubCat objectCat= new SubCat("�Ƹ���","�ٸ���");
		objectCat.printInfo();
	}
}