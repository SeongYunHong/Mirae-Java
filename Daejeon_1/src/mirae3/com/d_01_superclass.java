package mirae3.com;
//inheritance(상속)
//부모 클래스(superclass)+자식 클래스(subclass)
//공통부분을 정의한 부모 - 자식이 공용
//부모는 자식을 가리킬 수 있다.(제약 사항 : 부모에 있는 것만 가리킬 수 있음)
//자식이 추가한 내용을 가리킬 때는 downcasting 필요(자식으로 환원한다)
//overriding 재정의
//함수이름도 같고 매개변수 타입이나 개수가 같은데 재정의를 통해 다른 일을 함

class Super_class{
	int num=20; //멤버 변수
	public void display() { //멤버 함수
		System.out.println("슈퍼클래스에서 출력 ");
	}
}
//부모의 함수를 재정의해도 부모의 함수가 사라지는 것은 아님, 그러나 자식의 입장에서 자식의 재정의 함수가 우선
//부모의 멤버 변수는 재정의하지 않는 것으로 함(복잡해짐)
public class d_01_superclass extends Super_class{
	int num=10; //멤버 변수 재정의(재정의 : 부모하고 똑같은 이름일때)
	public void display() { //함수 재정의
		System.out.println("서브클래스에서 출력 ");
	}
	public void my_method() {
		d_01_superclass sub = new d_01_superclass(); //자식 클래스 인스턴스
		sub.display(); //자식 호출
		super.display(); //부모의 함수 호출
		display(); //자식 호출, 자식 클래스 입장에선 부모 함수보다 자식의 함수가 우선
		System.out.println("자식의 변수 : "+sub.num); //10
		System.out.println("부모의 변수 : "+super.num); //20
		System.out.println("자식의 변수 : "+num); //10
	}
	public static void main(String[] args) {
		d_01_superclass obj = new d_01_superclass(); //자식 클래스를 인스턴스
		obj.display(); //자식 클래스의 함수가 실행
		obj.my_method();
	}
}