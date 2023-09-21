package mirae2.com;

public class b_01_function {
	//사용자 정의 함수
	//함수는 class 내에서 선언하고, class를 인스턴스하고 사용
	//하지만 static을 사용하면 인스턴스하지 않고 사용 가능(정적 method)
	//만약 public이 없으면 class 내에서만 사용하는 함수가됨
	//overloading : 함수 이름은 같지만 데이터 타입이 다르거나 매개변수 개수가 다르면 다른 함수로 인식
	public static int add(int n1, int n2) { //가매개변수(n1,n2)
		int result = n1+n2;
		System.out.println("덧셈 결과 : "+result);
		return result; //출력
	}
	public static float add(float n1, float n2) { 
		float result = n1+n2;
		System.out.println("덧셈 결과 : "+result);
		return result; 
	}
	public static double add(double n1, double n2) { 
		double result = n1+n2;
		System.out.println("덧셈 결과 : "+result);
		return result; 
	}
	public static int subtract(int n1, int n2) { 
		int result = n1-n2;
		return result; 
	}
	public static int multiply(int n1, int n2) { 
		int result = n1*n2;
		return result; 
	}
	public static double divide(double n1, double n2) { 
		double result = n1/n2;
		return result; 
	}
	public static void main(String[] args) {
		// 함수(method)	  : 입력과 출력을 매핑, 클레스에 정의되어야함
		// 함수 사용 목적 : 중복을 방지하고 알고리즘을 재사용하기 위해서
//		System.out.println(100 + 300);
//		int num1=100;
//		int num2=200;
//		int result = num1+num2;
		//System.out.println("덧셈 결과 : "+add(100,200)); //실매개변수
		add(100,200);
		
//		num1=200;
//		num2=400;
//		result = num1+num2;
		//System.out.println("덧셈 결과 : "+add(200,400));
		add(200,400);
		add(200.0f,400.0f);
		add(200.0,400.0);
		//
		int result=subtract(400,200);
		System.out.println(subtract(400,200));
		System.out.println(result);
		multiply(400,200);
		divide(400,200);
		
		}
}