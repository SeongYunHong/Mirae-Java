import java.util.Scanner;

public class J0327 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		//������ �Է¹޾Ƽ� ����� �����л� �� ���ϱ�(��, ������ ������ ������ �Է�)
		//�� �л��� , ��� �л���, ���� �л��� ���
		int m=0,cnt=0;
		double x=0,y=0,z=0,n=0;
		
		for(int i=1;;i++) {
			System.out.print("������ �Է��Ͽ��� : ");
			m=a.nextInt();
			if(m<0) break;
			cnt++;
			if(m>=60) n++;
			
			if(m>=80) x++;
			else if(m>=70 && m<80) y++;
			else if(m>=60 && m<70) z++;
		}
		System.out.println("�� �л� �� : "+cnt+"��\n��� �л� �� : "+n+"��\n���� �л� �� : "+(cnt-n)+"��");
		System.out.print("A : "+(x/n)*100+"% B : "+(y/n)*100+"% C : "+(z/n)*100+"%");
		/*----------------------------------
		//�������� ���� �Է¹޾Ƽ� �ִ� �ּ� �հ� ��� ���ϱ�
		double sum=0,avg=0,max=0,min=100;
		int i=0;
		for(i=1;i<=20;i++) {
			double su=(int)(Math.random()*101);
			if(su>100) su=100;
			max=(max<su)?su:max;
			min=(min>su)?su:min;
			
			sum+=su;
		}
		sum-=(max+min);
		avg=sum/(i-3);
		
		System.out.print("Max : "+max+"\nmin : "+min+"\n���� : "+sum+"\n��� : "+avg);
		/*----------------------------------
		//����� ������ 30���� �ɶ����� ���
		System.out.print("���� �Է�>>");
		int m=a.nextInt();
		int cnt=0;
		for(int i=1;;i++) {
			if(i%m!=0)continue;
			cnt++;
			
			if(cnt==30) System.out.print(i+" ");
			else 		System.out.print(i+", ");
			
			if(cnt==30) break;
		}
		/*----------------------------------
		System.out.print("��� �Է�>>");
		int m=a.nextInt();
		for(int i=1;;i++) {
			if(m%i!=0) continue;
			System.out.print(i+" ");
			
			if(i>=m) break;
		}
		/*----------------------------------
		//��� ã��
		System.out.print("��� �Է�>>");
		int m=a.nextInt();
		int cnt=0;
		System.out.print(m+"�� ����� ");
		for(int i=1;i<=m;i++) {
			if(i==m) {System.out.print(i);cnt++;}
			else if(m%i==0) {System.out.print(i+", ");cnt++;}
		}
		System.out.print("\n����� ���� : "+cnt);
		/*----------------------------------
		//1~100���� �հ� ���
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.print("1~100������ �հ� : "+sum);
		/*----------------------------------
		//1~99 ���� 20���� ���� �߻�
		//Max�� min ���
		//3,6,9 ���
		int Max=0,min=100,cnt=0;
		for(int i=0;i<20;i++) {
			int m=(int)(Math.random()*99+1);
			Max=(Max>m)?Max:m;
			min=(min<m)?min:m;
			
			if(m%10==3 || m%10==6 || m%10==9) {System.out.print(m+", ");cnt++;}
			else if(m/10==3 || m/10==6 || m/10==9) {System.out.print(m+", ");cnt++;}
		}
		System.out.println("\n"+"Max : "+Max+" min : "+min);
		System.out.println("3,6,9 ���� : "+cnt);
		/*----------------------------------
		int m=0,sum1=0,sum2=0,sum3=0,sum4=0,cnt=0;
		
		for(int i=0;i<10;i++) {
			m=a.nextInt();
			if(m%2==1) sum1+=m;
			else if(m%2==0) sum2+=m;
			
			if(m>0) {sum3+=m;cnt++;}
			else if(m<0) sum4+=m;
		}
		System.out.println("Ȧ�� �� : "+sum1+" ¦�� �� : "+sum2);
		System.out.print("��� �� : "+sum3+" ���� �� : "+sum4);
		System.out.print("��� ��� : "+(double)sum3/cnt);
		/*----------------------------------
		int sum1=0,sum2=0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) sum1+=i;
			else sum2+=i;
			System.out.printf("%3d ",i);
			if(i%10==0) System.out.println();
		}
		System.out.print("Ȧ�� �� : "+sum1+"¦�� �� : "+sum2);
*/
	}

}
