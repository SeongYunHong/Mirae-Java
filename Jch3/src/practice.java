import java.util.*;

public class practice {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		/*
		//1.
		System.out.print("알파벳 한 문자를 입력하세요>>");
		char m=a.next().charAt(0);
		
		for(int i=97;i<=m;i++) {
			for(int j=i;j<=m;j++) {
				System.out.print((char)j);
			}System.out.println();
		}
		*/
		/*
		//2.
		int m[]=new int[10];
		System.out.print("정수 10개 입력>>");
		for(int i=0;i<10;i++) {
			m[i]=a.nextInt();
			if(m[i]%3==0) System.out.print(m[i]+" ");
		}
		*/
		/*
		//3.
		try {
			System.out.print("정수를 입력하세요>>");
			int m=a.nextInt();
			if(m%2==0) System.out.print("짝수");
			else System.out.print("홀수");}
		catch(InputMismatchException e) {
			System.out.print("수를 입력하지 않아 프로그램 종료합니다.");
		}
		*/
		/*
		//4.
		String m[]= {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		try {
			while(true) {
				System.out.print("정수를 입력하세요>>");
				int k=a.nextInt();
				if(k<0) {System.out.print("프로그램을 종료합니다...");break;}
				for(int i=0;i<7;i++) {
						if(k%7==i) System.out.print(m[i]);
				}
			}
		}catch(InputMismatchException e) {
			System.out.print("경고! 수를 입력하지 않았습니다.");
		}
		*/
		/*
		//5.
		int m[]=new int[10];
		System.out.print("정수 10개 입력>>");
		for(int i=0;i<10;i++) {
			m[i]=a.nextInt();	
		}
		for(int i=0;i<10;i++) {
			int temp=0;
			for(int j=0;j<i;j++) {
				if(m[j]>m[i]) {
					temp=m[j];
					m[j]=m[i];
					m[i]=temp;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(m[i]+" ");
		}
		*/
		/*
		//6.
		String eng[]= {"student","love","java","happy","future"};
		String kor[]= {"학생","사랑","자바","행복한","미래"};
		
		while(true) {
			System.out.print("영어 단어를 입력하세요>>");
			String m=a.next();
			if(m.equals("exit")) {System.out.print("종료합니다...");break;}
			for(int i=0;i<5;i++) {
				if(m.equals(eng[i])) System.out.println(kor[i]);
				else System.out.print("그런 영어 단어가 없습니다.");
			}
		}
		*/
		/*
		//7.
		for(int i=0;i<100;i++) {
			if((i%10==3 || i%10==6 || i%10==9)&&(i/10==3 || i/10==6 || i/10==9))
				System.out.println(i+" 박수 두번");
			else if((i%10==3 || i%10==6 || i%10==9) || (i/10==3 || i/10==6 || i/10==9))
				System.out.println(i+" 박수 한번");
		}
		*/
		/*
		//8.
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String str[]= {"가위","바위","보"};
		int p=0;
		while(true) {
			System.out.print("가위 바위 보!>> ");
			String m=a.next();
			if(m.equals("그만")) {System.out.print("게임을 종료합니다...");break;}
			int c=(int)(Math.random()*3);
			if(m.equals("가위")) p=0;
			if(m.equals("바위")) p=1;
			if(m.equals("보")) p=2;
			System.out.println(c);
			if((p-c+2)%3==0) System.out.println("사용자 : "+m+", 컴퓨터 : "+str[c]+", 사용자가 이겼습니다.");
			if((p-c+2)%3==1) System.out.println("사용자 : "+m+", 컴퓨터 : "+str[c]+", 컴퓨터가 이겼습니다.");
			if((p-c+2)%3==2) System.out.println("사용자 : "+m+", 컴퓨터 : "+str[c]+", 비겼습니다.");
		}
		*/
	}
}
