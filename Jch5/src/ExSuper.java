class SuperCat{
	String breed="샴고양이";
	int age=15;
	String name;
	SuperCat(String n){this.name=n;}
	void printInfo() {System.out.println("나는 부모고양이, 이름은 "+name+"\n품종은 "+this.breed+", 나이는 "+this.age+"살");}
}
class SubCat extends SuperCat{
	int age=2;
	String name;
	SubCat(String n,String m){super(n);	this.name=m;}
	void printInfo() {super.printInfo();System.out.println("나는 자식고양이, 이름은 "+name+"\n품종은 "+this.breed+", 나이는 "+age+"살");}
}
public class ExSuper {
	public static void main(String[] args) {
		SubCat objectCat= new SubCat("아름이","다름이");
		objectCat.printInfo();
	}
}