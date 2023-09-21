package mirae.com;
public class a_04_if {
	public static void main(String[] args) {
//-----------------------------------------------------------
		/*
		boolean c= true;
		//논리 연산자 &&(and), ||(or), !(not)(부정 단항 연산자)
		c = !c; // true = not true
		System.out.println(c);
		
		c = !c; //false = not false
		System.out.println(c);
		*/
//-----------------------------------------------------------
		/*
		int a = 10;
		int b = 10;
		b = 5;
		int d = 20;
		
		// a < b : false, a < d : true
		System.out.println(a < b && a < d); //f&&t -> f
		System.out.println(a < b & a < d); //bit 연산
		System.out.println(a < b || a < d); // f||t -> t
		*/
//-----------------------------------------------------------
		/*
		//경우의 수가 3가지인 경우
		int number = -13;
		if(number > 0) {
			System.out.println("긍정(POSITIVE)");
		}
		else if(number <0) {
			System.out.println("부정(NEGAITIVE)");
		}
		else if(number ==0) {
			System.out.println("부정(NEGAITIVE)");
		}
		else {
			System.out.println("ZERO");
		}
		*/
//-----------------------------------------------------------		
		//if vs switch-case :  if=관계형 데이터, switch-case : 범주형 데이터
		int day=1;
		switch(day) {
			case 1: System.out.println("Monday"); 		break;
			case 2: System.out.println("Tuesday"); 		break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday");  	break;
			case 5: System.out.println("Friday"); 	 	break;
			case 6: System.out.println("Saturday");  	break;
			case 7: System.out.println("Sunday");
		}

	}
}