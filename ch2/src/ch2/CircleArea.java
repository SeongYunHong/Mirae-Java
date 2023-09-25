package ch2;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		//87p 
		/*//1.
		System.out.print("두 정수를 입력하세요>>");
		int x=a.nextInt();
		int y=a.nextInt();
		
		System.out.print(x+"+"+y+"은"+(x+y));
		*/
		/*//2.
		System.out.print("몇 층인지 입력하세요>>");
		int x=a.nextInt();
		
		System.out.print((x*5)+"m 입니다.");
		*/
		/*//3.
		System.out.print("x값을 입력하세요>>");
		double x=a.nextDouble();
		double y=Math.pow(x,2.0)+(-3*x)+7;
		System.out.print("x="+x+", y="+y);
		*/
		/*//4
		System.out.print("점(x,y)의 좌표를 입력하세요>>");
		int x=a.nextInt();
		int y=a.nextInt();
		
		if(x>=50 && x<=100 && y>=50 && y<=100)
			System.out.print("점("+x+","+y+")은 (50,50)과 (100,100)의 사각형 내에 있습니다.");
		else
			System.out.print("점("+x+","+y+")은 (50,50)과 (100,100)의 사각형 내에 없습니다.");
		*/
		/*//5.
		System.out.print("논리 연산을 입력하세요>>");
		String x=a.next();
		
		if(x.equals("true OR false"))
			System.out.print("true");

		if(x.equals("true AND false"))
			System.out.print("false");

		if(x.equals("true OR true"))
			System.out.print("true");

		if(x.equals("true AND true"))
			System.out.print("true");
		
		if(x.equals("false OR false"))
			System.out.print("false");

		if(x.equals("false AND false"))
			System.out.print("false");
		*/
		/*//6.
		System.out.print("돈의 액수를 입력하세요>>");
		int x=a.nextInt();
		int m=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;
		if(x>=50000)
			m+=x/50000;
		if(x%50000>=10000)
			b+=(x%50000)/10000;
		if(((x%50000)%10000)>=5000)
			c+=((x%50000)%10000)/5000;
		if(((x%50000)%10000)%5000>=1000)
			d+=(((x%50000)%10000)%5000)/1000;
		if((((x%50000)%10000)%5000)%1000>=500)
			e+=((((x%50000)%10000)%5000)%1000)/500;
		if(((((x%50000)%10000)%5000)%1000)%500>=100)
			f+=(((((x%50000)%10000)%5000)%1000)%500)/100;
		if((((((x%50000)%10000)%5000)%1000)%500)%100>=10)
			g+=((((((x%50000)%10000)%5000)%1000)%500)%100)/10;
		h=((((((x%50000)%10000)%5000)%1000)%500)%100)%10;
		
		System.out.print("오만원"+m+"개, 만원"+b+"개, 오천원"+c+"개, 천원"+d+"개, 500원"+e+"개, 100원"+f+"개, 10원"+g+"개, 1원"+h+"개");
		*/
		/*
		//7.
		System.out.print("학점을 입력하세요>>");
		String m=a.next();
		
		switch (m) {
			case "A":
			case "B": System.out.print("Excellent");break;
			case "C":
			case "D": System.out.print("Good");break;
			case "F": System.out.print("Bye");
		}
		*/
		/*//8.
		System.out.println("메뉴판\n에스프레소 2000원\n아메리카노 2500원\n카푸치노 3000원\n카페라떼 3500원");
		System.out.print("커피를 주문하세요>>");
		String m=a.next();
		int n=a.nextInt();
		
		if(m.equals("에스프레소"))
			System.out.print(2000*n+"원입니다.");
		if(m.equals("아메리카노"))
			System.out.print(2500*n+"원입니다.");
		if(m.equals("카푸치노"))
			System.out.print(3000*n+"원입니다.");
		if(m.equals("카페라떼"))
			System.out.print(3500*n+"원입니다.");
		*/
		/*//9.
		System.out.print("1~99 사이의 정수를 입력하세요>>");
		int m=a.nextInt();
		String n="박수";
		if(m/10==3 || m/10==6 || m/10==9) n+="짝";
		if(m%10==3 || m%10==6 || m%10==9) n+="짝";
		else n+="없음";
		System.out.print(n);
		*/
		/*//10.
		System.out.println("메뉴판\n에스프레소 2000원\n아메리카노 2500원\n카푸치노 3000원\n카페라떼 3500원");
		System.out.print("커피를 주문하세요>>");
		String m=a.next();
		int n=a.nextInt();
		
		if(m.equals("에스프레소")) {
			if(n>=10)
				System.out.print((2000*n)*0.95+"원입니다.");}
		if(m.equals("아메리카노"))
			System.out.print(2500*n+"원입니다.");
		if(m.equals("카푸치노"))
			System.out.print(3000*n+"원입니다.");
		if(m.equals("카페라떼"))
			System.out.print(3500*n+"원입니다.");
		*/
		/*------------------------------------
		//Q. 이름과 3과목 점수 입력받고 평균 60이상 합격
		//한과목이라도 40점 미만이면 불합격
		
		System.out.println("이름, 3과목 점수 입력 : ");
		String m=a.next();
		int x=a.nextInt();
		int y=a.nextInt();
		int z=a.nextInt();
		int avg=(x+y+z)/3;
		if(avg>=60 && x>40 && y>40 && z>40)
			System.out.print(m+"님은 평균 "+avg+"점으로 합격입니다.");
		else System.out.print(m+"님은 평균 "+avg+"점으로 불합격입니다.");
		/*------------------------------------
		//Q. 이름 학년 점수 입력 받아 60점이상 이면 합격
		//4학년이면 70점이상 합격
		
		System.out.println("이름, 학년, 점수 입력 : ");
		String m=a.next();
		int n=a.nextInt();
		int k=a.nextInt();
		
		if(n==4 && k>=70) 
			System.out.print(m+"님은 "+n+"학년이며 "+k+"점으로 합격입니다.");
		else if(n<4&&k>=60) System.out.print(m+"님은 "+n+"학년이며 "+k+"점으로 합격입니다.");
		
		else System.out.print(m+"님은 "+n+"학년이며 "+k+"점으로 불합격입니다.");
		/*------------------------------------
		//Q. 정수 입력하고 2-10의 배수인지 확인하고 출력
		String n="";
		System.out.print("정수 입력 : ");
		int m=a.nextInt();
		
		for(int i=2;i<=10;i++) {
			if(m%i==0)
				if(i==10) n+=i;
				else n+=i+",";
		}
		System.out.println(n+"의 배수입니다.");
		/*------------------------------------
		//Q. 점수입력하고 조건에 비교
		//0-59 F,60-69 D,70-79 C,80-89 B,90-100 A
		
		System.out.println("점수 입력 : ");
		int m=a.nextInt();
		
		if(m>=90 && m<=100)
			System.out.println("A");
		else if(m>=80)
			System.out.println("B");
		else if(m>=70)
			System.out.println("C");
		else if(m>=60)
			System.out.println("D");
		else if(m<60)
			System.out.println("F");
		else {
			System.out.println("잘못 입력하였습니다."); return;}
		System.out.println(m+"학점");
		/*------------------------------------
		System.out.println("나이 입력 : ");
		int m=a.nextInt();
		
		if(m>=8 && m<=13)
			System.out.println("어린이입니다.");
		else if(m>=14 && m<=19)
			System.out.println("청소년입니다.");	
		else
			System.out.println("성인입니다.");		
		/*------------------------------------
		System.out.println("정수 입력 : ");
		int m=a.nextInt();
		
		if(m>=80) System.out.print("축하합니다. 합격하셨습니다.");
		/*------------------------------------
		//Q. 1.정수 하나 입력
		//	 2. 정수가 음수이면 왼쪽으로 이동
		//	 3. 정수가 양수이면 오른쪽으로 이동
		//	    단 이동자리수는 입력 받을 것
		
		System.out.println("정수 입력 : ");
		int m=a.nextInt();
		
		System.out.println("이동시킬 칸 수 입력 : ");
		int n=a.nextInt();
		m=(m>0)?(m>>>n):(m<<n);
		System.out.println(m);
		/*------------------------------------
		int s=a.nextInt();
		int t=a.nextInt();
		int max=(s>t)?s:t;
		System.out.println(s+"와"+t+"중에 큰 수는 "+max+"다.");
		
		int min=(s>t)?t:s;
		System.out.println(s+"와"+t+"중에 작은 수는 "+min+"다.");
		/*------------------------------------*/
		//int s=a.nextInt();
		//int t=a.nextInt();
		
		//int res=(s>=t)?s+"가 더 크거나 같다.":t+"가 더 크다.";
		/*------------------------------------
		int s=a.nextInt();
		int t=a.nextInt();
		
		String str=(s>=t)?"s이 더 크거나 같다.":t+"이 더 크다.";
		System.out.println(str);
		/*------------------------------------
		int s=a.nextInt();
		
		System.out.println("s : "+((s>0)?s:(-1*s)));
		/*------------------------------------
		int s=a.nextInt();
		int t=a.nextInt();
		
		System.out.println("s-t ->"+((s>t)? (s-t):(t-s)));
		/*------------------------------------
		int s=10,t=30;
		
		boolean an = (s>=t)?true:false;
		System.out.println(an);
		
		String str=(s>=t)?"s가 t보다 크다.":"t가 s보다 크다.";
		System.out.println(str);
		/*------------------------------------
		int s=10;
		
		s+=	1;
		System.out.println(s);
		/*------------------------------------
		int s=a.nextInt();
		int t=a.nextInt();
		boolean an;
		
		//an=!!!!!!!!!!!!!!(s>t);
		an=(s!=t)||(s==10);
		System.out.println(an);
		
		/*------------------------------------
		int s=a.nextInt();
		
		System.out.println("s:"+s);
		System.out.println("s--:"+s--);
		System.out.println("s:"+s);
		System.out.println("--s:"+ --s);
		System.out.println("s:"+s);
		/*------------------------------------
		int s=a.nextInt();
		int t=a.nextInt();
		
		System.out.println("s>>>t : "+(short)(s>>>t));
		System.out.println("s>>t : "+(short)(s>>t));
		System.out.println("s<<t : "+(short)(s<<t));
		/*------------------------------------
		int s=a.nextInt();
		int t=a.nextInt();
		
		System.out.println("s&t : "+(s&t));
		System.out.println("s|t : "+(s|t));
		System.out.println("s^t : "+(s^t));
		System.out.println("~s : "+(~s)+"/ ~t : "+(~t));
		/*------------------------------------
		//정수를 입력 받아서 시 분 초를 구하여 출력
		System.out.print("정수 입력 : ");
		int m=a.nextInt();
		
		System.out.print((m/60)+"시"+((m%60)/60)+"분"+((m%60)%60)+"초이다.");
		/*------------------------------------
		String m=a.next();
		int	   n=a.nextInt();
		int	   k=a.nextInt();
		double x=a.nextDouble();
		double y=a.nextDouble();
		
		System.out.println("이름 : "+m);
		System.out.println("나이 : "+n);
		System.out.println("학번 : "+k);
		System.out.println("키 : "+x);
		System.out.println("몸무게 : "+y);
		/*------------------------------------
		int m=a.nextInt();
		double n=a.nextDouble();
		String c=a.next();
		
		System.out.print(m+"/"+n+"/"+c);
		/*------------------------------------
		byte b=127;
		int i=100;
		
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+i));
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);
		System.out.println();
		System.out.println();
		System.out.println();
		
		/*----------------------------
		final double PI=3.14;
		double radius=10;
		double circleArea=0;
		
		//PI=23.254;
		//radius=50;
		
		circleArea=radius*radius*PI;
		
		System.out.print("원의 면적 : ");
		System.out.println(circleArea);
		*/
	}

}
