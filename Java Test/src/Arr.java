import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		/*
		int m[]=new int [10];
		System.out.println("정수 10개 입력 : ");
		for(int i=0;i<10;i++) {
			m[i]=a.nextInt();
			if(m[i]%3==0) System.out.print(m[i]+"\t"); 
		}
	*/
	/*--------------------------------------------------	
		char day[]= {'일','월','화','수','목','금','토'};
		while(true) {
			System.out.print("정수 입력 : ");
			int m=a.nextInt();
			switch(m%7) {
				case 0: System.out.println("일"); break;
				case 1:	System.out.println("월"); break;
				case 2:	System.out.println("화"); break;
				case 3:	System.out.println("수"); break;
				case 4:	System.out.println("목"); break;
				case 5:	System.out.println("금"); break;
				case 6:	System.out.println("토");
			}
		}
		*/
		/*
		int m[]=new int [10];
		int n=0;
		System.out.println("정수 10개 입력 : ");
		for(int i=0;i<10;i++) {
			m[i]=a.nextInt();
		}
		for(int i=0;i<10;i++) {
			for(int j=i;j<9;j++) {
				if(m[i]>m[j+1]) {
					n=m[i];
					m[i]=m[j+1];
					m[j+1]=n;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(m[i]+" ");
		}
		*/
		/*--------------------------------------------------
		String eng[]= {"student","love","java","happy","future"};
		String kor[]= {"학생","사랑","자바","행복한","미래"};
		while(true) {
			System.out.println("영어 단어를 입력하세요 ");
			String m=a.next();
			if(m.equals("exit")) break;
			for(int i=0;i<5;i++) {
				if(m.equals(eng[i])) System.out.print(kor[i]);
			}System.out.println("");
		}
		*/
		/*--------------------------------------------------
		int m=0;
		
		for(int i=1;i<100;i++) {
			if((i%3==0 || i%6==0 || i%9==0 )&& (i/10==3 || i/10==6 || i/10==9))
					System.out.println(i+"박수두번");
			else if(i%3==0 || i%6==0 || i%9==0 || i/10==3 || i/10==6 || i/10==9)
				System.out.println(i+"박수한번");
		}
		*/
		////*--------------------------------------------------
		int m[][]=new int [3][4];
		int sum=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				m[i][j]=(int)(Math.random()*9);
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(m[i][j]+" ");
				sum+=m[i][j];
			}System.out.println();
		}System.out.println("합은 "+sum);
	//	*/
	}
}
