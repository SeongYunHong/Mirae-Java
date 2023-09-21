package mirae.com;
import java.util.Scanner;
public class a_08_윤년 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//-----------------------------------------------------------
				//년도와 월을 입력받아서 며칠까지 있는지 출력
				//윤년 : 4로 나눠서 떨어져야하고 100으로 나눠서 떨어지면 안되고 400으로 나눠서 떨어져야한다.
				int year,month;
				int day=0;
				System.out.print("알고싶은 연도와 월을 입력하시오(ex. 1999 4) : ");
				year=input.nextInt();
				month=input.nextInt();
				
				switch(month) {		
					case 1: case 3: case 5: case 7: case 8: case 10: case 12: day=31; break;
					case 2:
						if(((year%4==0) && (year%100 != 0)) || (year%400==0)) 
							day=29;	
						else day=28; break;
					case 4: case 6: case 9: case 11: day=30;break;
				}
				System.out.println(year+"년 "+month+"월은 "+day+"까지 있습니다.");
	}
}