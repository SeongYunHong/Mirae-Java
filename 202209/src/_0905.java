import java.util.Random;
import java.util.Scanner;

public class _0905 {
//  for ���� ���� ��� : Ƚ���� ���������� ��, ���۰� ������ ���������� ��
//while ���� ���� ��� : ������ Ƚ���� ���������� ���� ��
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		//Random  r = new Random();
		
		/*-----------------------------------
		//Q.1~100 ������ ���� �߻�, ¦���� ������ ���� 10���� �Ǹ� ����,¦���� ���
		int m,n=0;
		while(true) {
			m=(int)(Math.random()*(100)+1);
			if(m%2==0) {System.out.print(m+"  ");n++;}
			if(n==10) break;
		}
		/*-----------------------------------
		//Q.������ �Է� �޾� ��� ���ϱ�, ������ ������ ����
		int m=0,sum=0,avg=0,cnt=0;
		while(true) {
			System.out.print("���� �Է� : ");
			m=a.nextInt();
			if(m<0) continue;
			cnt++;sum+=m;
			if(cnt==10) break;
		}
		avg=sum/cnt;
		System.out.print("�հ� = "+sum);
		System.out.print("Ƚ�� = "+cnt);
		System.out.print("��� = "+avg);
		/*-----------------------------------
		//Q.������ 60~80 ������ ���� ���, ���� ������ 50��
		int sum=0,i=0;
		
		while(i<50) {
			int su=(int)(Math.random()*(100)+1);
			if(su>=60 && su<=80) {
				System.out.print(su+"+");
				sum+=su;
			}
			i++;
		}
		System.out.print("0="+sum);
		/*-----------------------------------
		System.out.print("���� ���� �Է� : ");
		int m=a.nextInt();
		
		System.out.print("���� �Է� (����, ��): ");
		int n=a.nextInt();
		int k=a.nextInt();
		
		int sum=0,i=0;
		do{
			int su=(int)(Math.random()*(k-n+1)+n);
			sum+=su; 
			if(i==m-1) System.out.print(su+"=");
			else System.out.print(su+"+");
			i++;
		}while(i<m);
		System.out.print(sum);
		/*-----------------------------------
		System.out.print("���� ���� �Է� : ");
		int m=a.nextInt();
		
		System.out.print("���� �Է� (����, ��): ");
		int n=a.nextInt();
		int k=a.nextInt();
		
		int sum=0,i=0;
		while(i<m){
			int su=(int)(Math.random()*(k-n+1)+n);
			sum+=su; 
			if(i==m-1) System.out.print(su+"=");
			else System.out.print(su+"+");
			i++;
		}
		System.out.print(sum);
		/*-----------------------------------
		System.out.print("���� ���� �Է� : ");
		int m=a.nextInt();
		
		System.out.print("���� �Է� (����, ��): ");
		int n=a.nextInt();
		int k=a.nextInt();
		
		int sum=0;
		
		for(int i=0;i<m;i++) {
			//int su=(int)(Math.random()*(k-n+1)+n);
			int su=r.nextInt(k+1);//��ȣ �ȿ� �ִ� ���� ���ϴ� ������ 1Ŀ�ߵ�
			sum+=su; 
			if(i==m-1) System.out.print(su+"=");
			else System.out.print(su+"+");
		}
		System.out.print(sum);
		/*-----------------------------------
		//Q.������ ���� �Է¹ް� ������ �Է¹޾� �հ踦 ���Ͽ���.
		System.out.print("���� ���� �Է� : ");
		int m=a.nextInt();
		
		System.out.print("���� �Է� (����, ��): ");
		int n=a.nextInt();
		int k=a.nextInt();
		
		int sum=0;
		
		for(int i=0;i<m;i++) {
			int su=(int)(Math.random()*(k-n+1)+n);
			sum+=su; 
			if(i==m-1) System.out.print(su+"=");
			else System.out.print(su+"+");
		}
		System.out.print(sum);
		/*-----------------------------------
		//Q.20ȸ �ݺ�, ����ã��, ���亸�� ������ ��/ũ�� �ٿ� ���
		int su=(int)(Math.random()*100+1);
		
		System.out.print("���� �Է� : "+su);
		int m=0,i=0;
		
		for(i=0;i<=20;i++) {
			m=a.nextInt();
			if(m==su) {System.out.println("����");break;}
			else if(m>su) System.out.println("Down");
			else System.out.println("Up");
			if(i==19 && m!=su) System.out.print("��~ ������ "+su+"�Դϴ�.");
		}
		if(i+1<=5) System.out.print((i+1)+"ȸ�� �����ϼ����Ƿ� 80�� ȹ��!");
		if(i+1>5 && i+1<=10) System.out.print((i+1)+"ȸ�� �����ϼ����Ƿ� 50�� ȹ��!");
		if(i+1>10 && i+1<=15) System.out.print((i+1)+"ȸ�� �����ϼ����Ƿ� 15�� ȹ��!");
		
		/*-----------------------------------
		//Q.�ݺ����� ���۰��� ���� �Է�,�׸�ŭ ������ �Է� �޴� ���� ����, 60�� �̻��ΰ͸� ���
		System.out.print("�ݺ� ���۰� �Է� : ");
		int st=a.nextInt();
		
		System.out.print("�ݺ� ���� �Է� : ");
		int ed=a.nextInt();
		
		int su=0,sum=0,m=0;
		for(int i=st;i<ed;i++) {
			su=a.nextInt();
			if(su>=60) {
				System.out.print(su+" ");
				sum +=su;
				m++;
			}
			if(m>=5) break;
		}System.out.print("sum = "+sum);
		/*-----------------------------------
		//Q.���� 100���� �� (50~150)
		int sum=0,x=0;
		for(int i=0;i<=100;i++) {
			x = (int)(Math.random()*100+50);
			if(x%3==0) {
				sum+=x;
				System.out.print(x+"+");
			}
			if(i==100 && x%3==0) System.out.print(x+"="+sum);
			else if(i==100 && x%3==1) {x+=2;System.out.print(x+"="+sum);}
			else if(i==100 && x%3==2) {x+=1;System.out.print(x+"="+sum);}
		}
		/*-----------------------------------
		System.out.print("���� �Է� : ");
		int m=a.nextInt();
		int n=1;
		
		for(int i=1;i<=m;i++) {
			n*=i;
			if(i<m) System.out.print(i+"X");
			else System.out.print(i+"=");
		}
		System.out.print(n);
		/*-----------------------------------
		//Q.������ 10�� �߻����� ������ �հ踦 ���غ���|���� : 1~100
		int sum=0;
		int x=0;
		for(int i=0;i<=10;i++) {
			int m=(int)(Math.random()*100+1);
			
			//if(x%3==0 ||x%6==0 ||x%9==0) //3,6,9 ���
			//if(x%10==3 ||x%10==6 ||x%10==9) //3,6,9 ������ ��
			//if(x/10==3 ||x/10==6 ||x/10==9) //3,6,9 �����ϴ� ��
			sum+=m;
			}System.out.print(sum+" ");
		/*-----------------------------------
		//Q.�ζ�
		for(int i=0;i<=6;i++) {
			int m=(int)(Math.random()*45+1);
			System.out.print(m+" ");}
		/*-----------------------------------
		//���� �Է� ���� �� ���ã��
		System.out.print("���� �ΰ��Է� : ");
		int m=a.nextInt();
		int n=a.nextInt();
		
		if(m>n) {
			for(int i=1;i<=m;i++) {
				if(m%i==0 && n%i==0) System.out.print(i+"  ");	
			}
		}
		else {
			for(int i=1;i<=n;i++) {
				if(m%i==0 && n%i==0) System.out.print(i+"  ");	
			}
		}
		/*-----------------------------------
		//Q.���� �Է� ���� �� ¦���� ���ϱ�
		System.out.print("���� �Է� : ");
		int m=a.nextInt();
		int n=1;
		
		for(int i=2;i<=m;i++) {
			if(i%2==0) n*=i;
		}
		System.out.print(n);
		/*-----------------------------------
		//Q.���� �Է� �޾Ƽ� sum ���ϱ�
		int sum=0;
		System.out.print("���� �Է� : ");
		int m=a.nextInt();
		for(int i=0;i<=m;i++) {
			sum+=i;
		}
		System.out.print("sum="+sum);
		*/
	}

}
