package mirae3.com;
//인터페이스도 추상 클래스와 마찬가지로 인스턴스는 안됨, 그러나 부모로서 자식을 가리킬 수 있음
//다중 상속(implements) 가능
//구현부 없음
interface MyInterface{
	public String hello = "인터페이스 변수는 기본으로 public static final"+"접근 가능";
	public void sayHello();
}
class MyInterfaceImpl implements MyInterface{
	public void sayHello() {
		System.out.println(MyInterface.hello);
	}
}
public class d_10_interface {
	public static void main(String[] args) {
		System.out.println(MyInterface.hello);
		MyInterface myinterface = new MyInterfaceImpl();
		myinterface.sayHello();
		//인터페이스는 인스턴스 불가능, 배열로 자식을 가리킬 수 있음
		MyInterface []mydim = new MyInterface[2];
		mydim[0] = new MyInterfaceImpl();
		mydim[1] = new MyInterfaceImpl();

	}

}
