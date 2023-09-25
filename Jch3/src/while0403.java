import java.util.Scanner;

public class while0403 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		//동전 랜덤으로 100번 던져서 앞뒤가 나온 확률
		double m=0.0,x=0,y=0;
		int i=0;
		
		while(true) {
			if(i==100) break;
			m=(Math.random())*2;
			if(m>1) x++;
			else y++;
			i++;
		}
		//System.out.print(x+"/"+y+"/"+i);
		System.out.print("앞면 : "+x+"% ");
		for(int j=0;j<x;j++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("뒷면 : "+y+"% ");
		for(int j=0;j<y;j++) {
			System.out.print("*");
		}
		/*-----------------------------------
		//박테리아 개수가 1시간마다 이전 개수의 2배씩 증식
		//처음 박테리아 개수의 100배가 되는 시간은 몇시간 후인가
		
		System.out.print("초기 박테리아 수를 입력하시오 : ");
		int m=a.nextInt();
		int t=0,n=0;
		t=m;
		while(true) {
			t*=2;
			if(t>m*100) break;
			n++;
		}
		System.out.print(n+"시간 후");
		/*-----------------------------------
		//물건 구입 -> 상품 가격의 합계가 10만원 초과 x
		//총 xx개를 구입하였고 평균가는 xx이다.
		int m,c=0,tm=0;
		
		while(tm<100000) {
			System.out.print("상품 가격을 입력하세요 : ");
			m=a.nextInt();
			tm+=m;
			if(tm<100000) {tm-=m;break;}
			c++;
		}
		System.out.print("총 "+c+"개를 구입하였고 평균가는 "+(tm/c)+"원이다.");
		/*-----------------------------------
		int sum=0,i=1,n=0;
		while((i=a.nextInt()) != 0) {
			sum+=i;
			n++;
		}
		System.out.println("n : "+n+"/avg : "+(double)sum/n);
		/*-----------------------------------
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("sum : "+sum);
		*/
	}
}