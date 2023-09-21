package mirae.com;

import java.util.Scanner;

public class a_07_switch_case {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//-----------------------------------------------------------
		/*
		int day;
		System.out.print("날짜를 입력하시오 (1-31) : ");
		day=input.nextInt();
		day = day % 7;
		String weekday="";
		switch(day) {
			case 1: weekday = "일요일"; 	break;
			case 2: weekday = "월요일"; break;
			case 3: weekday = "화요일"; break;
			case 4: weekday = "수요일"; break;
			case 5: weekday = "목요일"; break;
			case 6: weekday = "금요일"; break;
			case 0: weekday = "토요일"; break;
			
		}
		System.out.println("오늘은 "+weekday+"입니다.");
		*/
//-----------------------------------------------------------
		//학점 계산기
		int sre;
		System.out.print("점수를 입력하시오 (0-100) : ");
		sre=input.nextInt();
		char grd=' ';
		switch(sre/10) {
			case 10: case 9: grd='A'; break;
			case 8: grd='B'; break;
			case 7: grd='C'; break;
			case 6: grd='D'; break;
			default : grd='F';
		}
		System.out.println("당신의 점수는 "+sre+"점으로 당신의 학점은 '"+grd+"'입니다.");	
	}
}
