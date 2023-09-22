package mirae2.com;

import java.util.Scanner;

public class RSP_User {
	String temp =""; // 변수는 초기화 하지 않고 사용하면 쓰레기 발생 // 참조형은 에러가 발생
	int input=0;
	Scanner person;
	public RSP_User() {} // 생성자 : 리턴값x
	public RSP_User(int input) {this.input=input;} // overloading : 함수 이름은 같지만 매개변수 타입이나 매개변수 개수가 다른 때 다른 함수로 인식하는 것
	public int getUser() {
		System.out.println("가위(0), 바위(1), 보(2) 중 선택 | 종료(-1)");
		person = new Scanner(System.in);
		temp = person.nextLine();
		if(temp==null || temp.equals("-1")) {
			return -1;
		}
		input = Integer.parseInt(temp);
		input = input%3;
		return input;
	}
}
