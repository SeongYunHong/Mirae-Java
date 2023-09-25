import java.util.Scanner;

public class J0327 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		//점수를 입력받아서 통과와 낙제학생 수 구하기(단, 음수가 들어오기 전까지 입력)
		//총 학생수 , 통과 학생수, 낙제 학생수 출력
		int m=0,cnt=0;
		double x=0,y=0,z=0,n=0;
		
		for(int i=1;;i++) {
			System.out.print("점수를 입력하여라 : ");
			m=a.nextInt();
			if(m<0) break;
			cnt++;
			if(m>=60) n++;
			
			if(m>=80) x++;
			else if(m>=70 && m<80) y++;
			else if(m>=60 && m<70) z++;
		}
		System.out.println("총 학생 수 : "+cnt+"명\n통과 학생 수 : "+n+"명\n낙제 학생 수 : "+(cnt-n)+"명");
		System.out.print("A : "+(x/n)*100+"% B : "+(y/n)*100+"% C : "+(z/n)*100+"%");
		/*----------------------------------
		//랜덤으로 점수 입력받아서 최대 최소 합계 평균 구하기
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
		
		System.out.print("Max : "+max+"\nmin : "+min+"\n총합 : "+sum+"\n평균 : "+avg);
		/*----------------------------------
		//배수의 개수가 30개가 될때까지 출력
		System.out.print("숫자 입력>>");
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
		System.out.print("약수 입력>>");
		int m=a.nextInt();
		for(int i=1;;i++) {
			if(m%i!=0) continue;
			System.out.print(i+" ");
			
			if(i>=m) break;
		}
		/*----------------------------------
		//약수 찾기
		System.out.print("약수 입력>>");
		int m=a.nextInt();
		int cnt=0;
		System.out.print(m+"의 약수는 ");
		for(int i=1;i<=m;i++) {
			if(i==m) {System.out.print(i);cnt++;}
			else if(m%i==0) {System.out.print(i+", ");cnt++;}
		}
		System.out.print("\n약수의 개수 : "+cnt);
		/*----------------------------------
		//1~100까지 합계 출력
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.print("1~100까지의 합계 : "+sum);
		/*----------------------------------
		//1~99 사이 20개의 난수 발생
		//Max와 min 출력
		//3,6,9 출력
		int Max=0,min=100,cnt=0;
		for(int i=0;i<20;i++) {
			int m=(int)(Math.random()*99+1);
			Max=(Max>m)?Max:m;
			min=(min<m)?min:m;
			
			if(m%10==3 || m%10==6 || m%10==9) {System.out.print(m+", ");cnt++;}
			else if(m/10==3 || m/10==6 || m/10==9) {System.out.print(m+", ");cnt++;}
		}
		System.out.println("\n"+"Max : "+Max+" min : "+min);
		System.out.println("3,6,9 개수 : "+cnt);
		/*----------------------------------
		int m=0,sum1=0,sum2=0,sum3=0,sum4=0,cnt=0;
		
		for(int i=0;i<10;i++) {
			m=a.nextInt();
			if(m%2==1) sum1+=m;
			else if(m%2==0) sum2+=m;
			
			if(m>0) {sum3+=m;cnt++;}
			else if(m<0) sum4+=m;
		}
		System.out.println("홀수 합 : "+sum1+" 짝수 합 : "+sum2);
		System.out.print("양수 합 : "+sum3+" 음수 합 : "+sum4);
		System.out.print("양수 평균 : "+(double)sum3/cnt);
		/*----------------------------------
		int sum1=0,sum2=0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) sum1+=i;
			else sum2+=i;
			System.out.printf("%3d ",i);
			if(i%10==0) System.out.println();
		}
		System.out.print("홀수 합 : "+sum1+"짝수 합 : "+sum2);
*/
	}

}
