import java.util.Scanner;

abstract class Scout{
	String name;
	int sales[];
	int amount;
	Scout() {}
	Scout(String name){this.name=name;}
	Scout(String name,int[] sales){this.name=name;this.sales=sales;}
	abstract int SalCal();
}
public class GirlScout extends Scout{
	int sales[]=new int[4];
	GirlScout(){};
	GirlScout(String name){super(name);}
	GirlScout(String name,int []sales){super(name,sales);}
	int SalCal() {return amount;}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
	
		System.out.print("걸스카우트 단원 수 입력 : ");
		int m=a.nextInt();
		GirlScout [] gs;
		gs= new GirlScout[m];
		
		for(int i=0;i<m;i++) {
			System.out.print("걸스카우트 단원의 이름을 입력 >> ");
			gs[i].name=a.next();
		}

		for(int i=0;i<4;i++) {
			System.out.print(gs[i]+"의 1~4주 판매 상자 수 입력 >> ");
			gs[i].sales[i]=a.nextInt();
			gs[i].amount+=gs[i].sales[i];
		}
		
		for(int i=0;i<m;i++) {
			System.out.print(gs[i]+"의 이달 총 판매 실적 : "+gs[i].SalCal());
			
		}
		for(int i=0;i<m-1;i++) {
			if(gs[i].amount > gs[i+1].amount) gs[i]=gs[i];
			else gs[i]=gs[i+1];
			System.out.print("*** 이 달의 판매 실적 1위는 "+gs[i]+"으로 20점을 받게 되었습니다. 축하합니다!!");
		}
		

	}

}
