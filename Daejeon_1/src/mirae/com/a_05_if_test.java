package mirae.com;
import java.util.Scanner;
public class a_05_if_test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //클레스 인스턴스
//-----------------------------------------------------------		
		/*
		System.out.print("월을 입력하시오 : ");
		int month = input.nextInt();
		String season = null; //null : 기억공간을 확보하지 않은 변수
		//null vs " ", null은 아예 메모리를 안먹고 " "은 공백도 문자로 취급해 메모리 차지  
		
		if(month ==12 || month ==1 || month ==2 )
			season = "겨울";
		else if(month ==12 || month ==1 || month ==2 )
			season = "봄";
		else if(month ==12 || month ==1 || month ==2 )
			season = "여름";
		else if(month ==12 || month ==1 || month ==2 )
			season = "가을";
		else 
			season = "없는 계절";
		
		System.out.print(month+"월은 "+season+"입니다.");
		*/
//-----------------------------------------------------------
		System.out.print("월을 입력하시오 : ");
		int month = input.nextInt();
		String season = null; 
		
		switch(month) {
		case 3: case 4: case 5: season = "봄";        break;
		case 6: case 7: case 8: season = "여름";     break;
		case 9: case 10: case 11: season = "가을";  break;
		case 12: case 1: case 2: season = "겨울";   break;
		default : season = "없는 계절"; 				  break;
		}
		System.out.printf("%d월은 %s입니다.",month,season); //f는 format의 약자
		input.close();
	}
}