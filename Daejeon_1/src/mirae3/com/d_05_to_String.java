package mirae3.com;
class Student extends Object{ //암묵적 상속-Object
	//모든 클래스는 Object를 상속(공통 기능(clone(복사), toString(출력), equals(비교), hashcode)때문)
	//주소를 전달하면 같은 데이터를 다른 변수가 같이 가리키고 있음
	//clone : 데이터는 하나고 가리키는 것이 2개이상
	//toString : 문자열을 요구하는 함수에서 자동으로 실행
	//클래스가 참조에 의해서 구동되기 때문에 복사가 안되기 때문에 Object
	//비교에서 문제(참조에 읳나 경우, 주소 비교 ==,값에 의한 비교(equals))
	//포인터를 가리고 참조라는 말을 사용하기 위해서 만들어진 문법
	//hash 함수 : 주소를 이용해서 중복되지 않는 수로 구분되게 만드는 것 ex) 김종호(10 + 20 +15 +16 +22) -> 주소의 개수로 나누어서 저장 주소 
	private int rno;
	private String name;
	public Student(int r,String n) {this.rno=r;this.name=n;}
	public String toString() {
		return rno + " "+ name;
	}
}
public class d_05_to_String {
	
	public static void main(String[] args) {
		Student s = new Student(101, "대한민국만세");
		System.out.println("학생 정보 : ");
		System.out.println(s);

	}

}

