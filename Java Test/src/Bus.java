import java.util.Scanner;

public class Bus {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("버스 요금 입력 : ");
		int m=a.nextInt();
		
		double x=0,y=0;
		
		x=m-((m/1250)*100);
		if(m<50000) y=m*0.8;
		else y=m-10000;
		System.out.println("토스 : "+x+", 나라사랑 : "+y);
		if(x>y) System.out.print((int)(x-y)+"원 차이로 나라사랑카드 이득");
		else	System.out.print((int)(y-x)+"원 차이로 토스카드 이득");
	}

}
