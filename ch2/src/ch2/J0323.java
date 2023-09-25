package ch2;

import java.util.Scanner;

public class J0323 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("논리 연산을 입력하세요>>");
		String x=a.next();
		String y=a.next();
		String z=a.next();
		
		switch(y) {
			case "OR":
				switch(x) {
					case "TRUE":
						System.out.print("true"); break;
					case "FALSE":
						System.out.print("false"); break;
				}break;
			case "AND":
				switch(x) {
					case "TRUE":
						if(z.equals("TRUE"))
							System.out.print("true"); break;
					case "FALSE":
						System.out.print("false"); break;
				}
		}
		/*--------------------------------------
		//한 직장인의 연간 근로소득에 대한 소득세 계산하기
		//근로소득이 2000만원 이하이면 근로소득의 5%
		//2000 초과 4000 이하 15
		//4000 초과 8000 이하 25
		//8000 초과 40%
		System.out.print("근로소득 입력(만원 단위)>>");
		int m=a.nextInt();
		int x=0;
		if(m<=2000) x=0;
		else if(m>2000  && m<=4000) x=1;
		else if(m>4000  && m<=8000) x=2;
		else if(m<=8000) x=3;
		switch(x) {
			case 0: System.out.print("당신의 근로소득은 2000만원 이하로 5%이며\n소득세는"+m+"만원의 5%인 "+(int)(m*0.05)+"000원입니다."); break;
			case 1: System.out.print("당신의 근로소득은 2000만원 초과 4000만원 이하로 15%이며\n소득세는"+m+"만원의 15%인 "+(int)(m*0.15)+"000원입니다.");break;
			case 2: System.out.print("당신의 근로소득은 4000만원 초과 8000만원 이하로 25%이며\n소득세는"+m+"만원의 25%인 "+(int)(m*0.25)+"000원입니다.");break;
			case 3: System.out.print("당신의 근로소득은 8000만원초과로 40%이며\n소득세는"+m+"만원의 40%인 "+(int)(m*0.40)+"000원입니다.");
		}
		/*--------------------------------------
		System.out.println("메뉴판\n1. 사이다 900\n2. 콜라 1000\n3. 환타 5000\n4. 물 500");
		System.out.print("금액 입력>>");
		int x=a.nextInt();
		System.out.print("메뉴 선택>>");
		int y=a.nextInt();
		System.out.print("개수 입력>>");
		int z=a.nextInt();
		
		switch(y) {
			case 1:
				if(x-900*z<0) System.out.print("금액이 부족합니다.");
				else 	System.out.print("사이다"+z+"개가 나왔습니다.");
				break;
			case 2:
				if(x-1000*z<0) System.out.print("금액이 부족합니다.");
				else 	System.out.print("콜라"+z+"개가 나왔습니다.");
				break;
			case 3:	
				if(x-5000*z<0) System.out.print("금액이 부족합니다.");
				else 	System.out.print("환타"+z+"개가 나왔습니다.");
				break;
			case 4:
				if(x-500*z<0) System.out.print("금액이 부족합니다.");
				else 	System.out.print("물"+z+"개가 나왔습니다.");
		
		}
		*/
	}
}