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
	
		System.out.print("�ɽ�ī��Ʈ �ܿ� �� �Է� : ");
		int m=a.nextInt();
		GirlScout [] gs;
		gs= new GirlScout[m];
		
		for(int i=0;i<m;i++) {
			System.out.print("�ɽ�ī��Ʈ �ܿ��� �̸��� �Է� >> ");
			gs[i].name=a.next();
		}

		for(int i=0;i<4;i++) {
			System.out.print(gs[i]+"�� 1~4�� �Ǹ� ���� �� �Է� >> ");
			gs[i].sales[i]=a.nextInt();
			gs[i].amount+=gs[i].sales[i];
		}
		
		for(int i=0;i<m;i++) {
			System.out.print(gs[i]+"�� �̴� �� �Ǹ� ���� : "+gs[i].SalCal());
			
		}
		for(int i=0;i<m-1;i++) {
			if(gs[i].amount > gs[i+1].amount) gs[i]=gs[i];
			else gs[i]=gs[i+1];
			System.out.print("*** �� ���� �Ǹ� ���� 1���� "+gs[i]+"���� 20���� �ް� �Ǿ����ϴ�. �����մϴ�!!");
		}
		

	}

}
