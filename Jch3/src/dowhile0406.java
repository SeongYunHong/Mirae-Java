import java.util.Scanner;

public class dowhile0406 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int x=0,c=0;
		while(true) {
			c++;
			int i=(int)(Math.random()*9+1);
			int j=(int)(Math.random()*9+1);
			
			System.out.print(i+"x"+j+"=");
			int m=a.nextInt();
			
			if(m==(i*j)) {System.out.print("정답");x++;}
			else System.out.print("오답");
			
			System.out.print("계속 하시겠습니까?(y or n)");
			String y=a.next();
			if(y.equals("n")) break;
		}
		System.out.println("총 "+c+"문제 중 "+x+"개를 맞춰서 "+(x*10)+"점입니다.");
		
		/*-----------------------------------
		int num=0;
		
		while(true) {
			if(a.next()==("exit"))
				break;
			num++;
		}
		System.out.print("입력된 문자열의 개수는 "+num	);
		/*-----------------------------------
		for(int i=1; i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}		
			System.out.println();
		}
		/*-----------------------------------
		//구매 금액 입력 [0-500] : 122
		//378원의 거스름돈은 다음과 같다
		//100원짜리 동전 3개
		// 10원짜리 동전 7개
		//  1원짜리 동전 8개
		int n=0;
		int i=2;
		System.out.print("구매 금액 입력 [0-500] : ");
		int m=a.nextInt();
		System.out.println((500-m)+"의 거스름돈은 다음과 같다.");		
		n=(500-m);
		do{
			double k=Math.pow(10,i);
			double c=0;
			c=n/k;
			System.out.println((int)k+"원짜리 동전 "+(int)c+"개");
			n-=(k*(int)c);
			i--;
		}while(i!=-1);
		/*-----------------------------------
		//결과>>
		//과목 이름 : 영작문
		//출석 점수 : 94
		//과제 점수 : 88
		//수시 점수 : 82
		//중간 고사 : 75
		//기말 고사 : 97
		//과목 영작문의 총점 : 87.xxxx
		//과목 영작문의 학점 : B
		//계속하기를 원하세요?(y or n) : 
		String k="";
		do {
			System.out.print("과목 이름 : ");
			String name=a.next();
			System.out.print("출석 점수 : ");
			int m=a.nextInt();
			System.out.print("과제 점수 : ");
			int n=a.nextInt();
			System.out.print("수시 점수 : ");
			int o=a.nextInt();
			System.out.print("중간고사 : ");
			int p=a.nextInt();
			System.out.print("기말고사 : ");
			int q=a.nextInt();
			
			double avg =0;
			avg+= (m+n+o+p+q)/5;
			String grade;
			
			if(avg>=95) grade="A+";
			else if(avg>=90) grade="A";
			else if(avg>=85) grade="B+";
			else if(avg>=80) grade="B";
			else if(avg>=75) grade="C+";
			else if(avg>=70) grade="C";
			else if(avg>=65) grade="D+";
			else if(avg>=60) grade="D";
			else grade="F";
			
			System.out.println("과목 "+name+"의 총점 : "+avg);
			System.out.println("과목 "+name+"의 학점 : "+grade);
			
			System.out.print("계속하기를 원하세요? (y or n)");
			k=a.next();
		}while(k=="y");
		/*-----------------------------------
		//자판기 (1. 커피=900 2. 탄산=1200 3. 물=500 4. 종료)
		int m=0,sum=0;
		System.out.println("\t\t  <<메뉴>>");
		
		do {
			System.out.println("(1. 커피=900 2. 탄산=1200 3. 물=500 4. 종료)");
			m=a.nextInt();
			if(m==4) break;
			System.out.print("음료 개수 입력 : ");
			int c=a.nextInt();
			switch(m) {
				case 1: sum+=900*c; break;
				case 2: sum+=1200*c; break;
				case 3: sum+=500*c;
			}
		}while(m!=4);
		System.out.println("총 결제 금액은 "+sum+"원입니다.");
		System.out.print("돈을 넣어주세요 : ");
		int n=a.nextInt();
		System.out.print("잔돈 : "+(n-sum));
		/*-----------------------------------
		char m='A';
		
		do {
			System.out.print(m+""+(char)(m+32)+" ");
			m=(char)(m+1);
		}while(m<='Z');		
*/
	}
}