package mirae4.com;

import java.util.*;

class MemberDto{ // Object : clone, equals, toString
	public static int sum; //한번만 만들어지는 변수(공용 변수) //ex)성적 프로그램에서는 학교나 학생 수를 저장(바뀌지 않는 값)
	public int num;
	public String name;
	public String addr;
	
	public MemberDto() {}
	public MemberDto(int num,String name,String addr) {super();this.num=num;this.name=name;this.addr=addr;} 
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String toString() {
		return "번호 : "+num+" 이름 : "+name+" 주소 : "+addr;
	}
}

public class e_03_ArrayList_Class {

	public static void main(String[] args) {
		//List != ArrayList
		//부모자식 관계
		//부모가 대신 가리킬 때는 부모에 있는 내용만 가능
		/*
		List<String>names = new ArrayList<String>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		for(int i=0;i<names.size();i++) {
			String tmp=names.get(i);
			System.out.println(tmp);
		}
		for(String tmp:names) {
			System.out.println(tmp);
		}
		*/
//--------------------
		MemberDto dto1 = new MemberDto(1, "김일","둔산동");
		MemberDto dto2 = new MemberDto(2, "해골","행신동");
		MemberDto dto3 = new MemberDto(3, "","상도동");
		ArrayList<MemberDto> members = new ArrayList<MemberDto>();
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		System.out.println("ArrayList 출력 ");
		System.out.println("\t"+members);
//--------------------		
		for(int i=0;i<members.size();i++) {
			System.out.println(members.get(i));
		}
//--------------------
		//listIterator : 첫번째 데이터를 가리키는 포인터를 알려줌
		ListIterator<MemberDto> listIterator2=members.listIterator();
		while(listIterator2.hasNext()) { //hasNext : 다음 데이터가 있는지 확인하는 함수
			System.out.println(listIterator2.next()); //next : 뒤에 있는 데이터를 선택하는 함수
		}
		//이미 hasNext로 마지막까지 가서 다시 출력이 안됨
//		while(listIterator2.hasNext()) {
//			System.out.println(listIterator2.next()); 
//		}
		System.out.println("이터레이터를 거꾸로 운영");
		while(listIterator2.hasPrevious()) { //hasPrevious : 이전 데이터가 있는지 확인하는 함수
			System.out.println(listIterator2.previous()); //previous : 앞에 있는 데이터를 선택하는 함수
		}
		//다시 처음을 가리키면 실행가능
		listIterator2 = members.listIterator();
		while(listIterator2.hasNext()) {
			System.out.println(listIterator2.next());
		}
//--------------------
		//구조적 프로그래밍 -> 객체 지향프로그래밍 -> 일반화 프로그래밍(Generic) -> 함수화 프로그래밍
		//함수화 프로그래밍의 매개변수로는 함수가 옴
		//자바에서는 함수 하나를 만들려고 해도 class를 만들어야함
		//예외로 람다함수(간단한 함수 : 무명함수(다시 호출할 일이 없어서 이름을 지정해주지 않음(일회용))를 사용(파이썬 문법)
		//java : 람다함수 == c# : (화살표 함수)
		//함수화 프로그래밍은 for문이 존재하지 않음
		// 원래의 모습 : void process(a1) {System.out.println(a1.num+" "+a1.name+" "+a1.addr);} 
		members.forEach(a1->{System.out.println(a1.num+" "+a1.name+" "+a1.addr);}); //a1 : 매개변수,-> 밑에 내용 : 몸통부분 
//--------------------		
		int sum=0;
		for(int i=0;i<members.size();i++) {
			sum+=members.get(i).num;
		}
		System.out.println("인덱스를 이용한 번호의 합은 : "+sum);
//--------------------				
		//for-each문을 이용해서 num의 합계를 출력하시오
		//static 변수 필요
		//클래스 내부의 변수나 static 변수를 사용해서 누적처리함
		MemberDto.sum=0;
		members.forEach(a1->{MemberDto.sum+=a1.num;});
		System.out.println("반복자를 이용한 번호의 합은 : "+MemberDto.sum);
	}
}