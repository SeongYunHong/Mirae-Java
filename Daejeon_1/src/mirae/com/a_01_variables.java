package mirae.com;
//디렉토리 이름
public class a_01_variables {
	//반드시 파일 이름하고 클래스 이름하고 일치해야함
	public static void main(String[] args) { 
		// public : 외부 참조 가능 //자바는 클래스로 시작(함수 하나를 만들려고 해도 클래스를 만들어야함)
//-----------------------------------------------------------
		/*
		System.out.println("대한민국, 만세"); // 함수로 작업
		//패키지(ex. System).클래스(ex.out).함수(ex.println)
		 */
//-----------------------------------------------------------
		/*
		String str = "대전시";
		System.out.println(str+"에 살아요.");
		*/
//-----------------------------------------------------------
		/*
		//float형 데이터 : 4바이트
		//double형 데이터 : 8바이트(더 정밀하지만 4바이트를 더 써야해서 낭비가 발생할 수 있음)
		//float : 지수부(1바이트) + 가수부 (3바이트)로 저장
		// ex)3.14->0.314*10^2

		int korea=90; //변수 -> 메모리 주소로 변환
		korea=75;
		int english=76; //초기화
		int math=67;
		int result=korea+english+math-10;
		float average=result/3.0f; //부동소수점인 경우 float의 약자인 f를 붙임
		System.out.println("평균은 "+ average+"점");
		// round : 반올림
		System.out.println("평균은 "+ Math.round(average)+"점");
		// 포맷문자열 %.2f float 소수점 둘째자리까지 출력하라
		System.out.println(String.format("%.2f",average));
		*/
//-----------------------------------------------------------		
		//문제 Math.round를 이용해서 소수점 4째자리에서 반올림하고 3째자리까지 표현하시오
		final float pi=3.141592f; // final : 상수
		
		System.out.println(Math.round(pi*1000)*0.001);
		
	}
}