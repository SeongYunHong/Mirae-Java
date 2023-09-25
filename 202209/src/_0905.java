import java.util.Random;
import java.util.Scanner;

public class _0905 {
//  for 문을 쓰는 경우 : 횟수가 정해져있을 때, 시작과 끝값이 정해져있을 때
//while 문을 쓰는 경우 : 범위나 횟수가 정해져있지 않을 때
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		//Random  r = new Random();
		
		/*-----------------------------------
		//Q.1~100 사이의 난수 발생, 짝수의 개수를 세고 10개가 되면 종료,짝수만 출력
		int m,n=0;
		while(true) {
			m=(int)(Math.random()*(100)+1);
			if(m%2==0) {System.out.print(m+"  ");n++;}
			if(n==10) break;
		}
		/*-----------------------------------
		//Q.정수를 입력 받아 평균 구하기, 음수가 들어오면 종료
		int m=0,sum=0,avg=0,cnt=0;
		while(true) {
			System.out.print("정수 입력 : ");
			m=a.nextInt();
			if(m<0) continue;
			cnt++;sum+=m;
			if(cnt==10) break;
		}
		avg=sum/cnt;
		System.out.print("합계 = "+sum);
		System.out.print("횟수 = "+cnt);
		System.out.print("평균 = "+avg);
		/*-----------------------------------
		//Q.난수가 60~80 사이의 값만 출력, 난수 개수는 50개
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
		System.out.print("난수 개수 입력 : ");
		int m=a.nextInt();
		
		System.out.print("범위 입력 (시작, 끝): ");
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
		System.out.print("난수 개수 입력 : ");
		int m=a.nextInt();
		
		System.out.print("범위 입력 (시작, 끝): ");
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
		System.out.print("난수 개수 입력 : ");
		int m=a.nextInt();
		
		System.out.print("범위 입력 (시작, 끝): ");
		int n=a.nextInt();
		int k=a.nextInt();
		
		int sum=0;
		
		for(int i=0;i<m;i++) {
			//int su=(int)(Math.random()*(k-n+1)+n);
			int su=r.nextInt(k+1);//괄호 안에 있는 값은 원하는 값보다 1커야됨
			sum+=su; 
			if(i==m-1) System.out.print(su+"=");
			else System.out.print(su+"+");
		}
		System.out.print(sum);
		/*-----------------------------------
		//Q.난수의 개수 입력받고 범위도 입력받아 합계를 구하여라.
		System.out.print("난수 개수 입력 : ");
		int m=a.nextInt();
		
		System.out.print("범위 입력 (시작, 끝): ");
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
		//Q.20회 반복, 정답찾기, 정답보다 작으면 업/크면 다운 출력
		int su=(int)(Math.random()*100+1);
		
		System.out.print("정수 입력 : "+su);
		int m=0,i=0;
		
		for(i=0;i<=20;i++) {
			m=a.nextInt();
			if(m==su) {System.out.println("정답");break;}
			else if(m>su) System.out.println("Down");
			else System.out.println("Up");
			if(i==19 && m!=su) System.out.print("땡~ 정답은 "+su+"입니다.");
		}
		if(i+1<=5) System.out.print((i+1)+"회에 성공하셨으므로 80점 획득!");
		if(i+1>5 && i+1<=10) System.out.print((i+1)+"회에 성공하셨으므로 50점 획득!");
		if(i+1>10 && i+1<=15) System.out.print((i+1)+"회에 성공하셨으므로 15점 획득!");
		
		/*-----------------------------------
		//Q.반복문에 시작값과 끝값 입력,그만큼 정수를 입력 받는 것을 수행, 60점 이상인것만 출력
		System.out.print("반복 시작값 입력 : ");
		int st=a.nextInt();
		
		System.out.print("반복 끝값 입력 : ");
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
		//Q.난수 100개의 합 (50~150)
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
		System.out.print("정수 입력 : ");
		int m=a.nextInt();
		int n=1;
		
		for(int i=1;i<=m;i++) {
			n*=i;
			if(i<m) System.out.print(i+"X");
			else System.out.print(i+"=");
		}
		System.out.print(n);
		/*-----------------------------------
		//Q.난수를 10개 발생시켜 난수의 합계를 구해보자|범위 : 1~100
		int sum=0;
		int x=0;
		for(int i=0;i<=10;i++) {
			int m=(int)(Math.random()*100+1);
			
			//if(x%3==0 ||x%6==0 ||x%9==0) //3,6,9 배수
			//if(x%10==3 ||x%10==6 ||x%10==9) //3,6,9 끝나는 수
			//if(x/10==3 ||x/10==6 ||x/10==9) //3,6,9 시작하는 수
			sum+=m;
			}System.out.print(sum+" ");
		/*-----------------------------------
		//Q.로또
		for(int i=0;i<=6;i++) {
			int m=(int)(Math.random()*45+1);
			System.out.print(m+" ");}
		/*-----------------------------------
		//정수 입력 받은 후 약수찾기
		System.out.print("정수 두개입력 : ");
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
		//Q.정수 입력 받은 후 짝수만 곱하기
		System.out.print("정수 입력 : ");
		int m=a.nextInt();
		int n=1;
		
		for(int i=2;i<=m;i++) {
			if(i%2==0) n*=i;
		}
		System.out.print(n);
		/*-----------------------------------
		//Q.정수 입력 받아서 sum 구하기
		int sum=0;
		System.out.print("정수 입력 : ");
		int m=a.nextInt();
		for(int i=0;i<=m;i++) {
			sum+=i;
		}
		System.out.print("sum="+sum);
		*/
	}

}
