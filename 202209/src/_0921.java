import java.util.Scanner;
import java.util.Arrays;
import java.util.*;// *=all
public class _0921 {

	public static void main(String[] args) {
		//배열
		/*
		boolean 1byte (true/false)
		char    2byte (유니코드 포함)
		
		정수
		byte    1byte
		short   2byte
		int     4byte
		long    8byte
		
		실수
		float   4byte
		double  8byte
		*/
		Scanner a = new Scanner(System.in);
		//Random  r = new Random();
		
		//학생 수 입력 : 2
		//과목 수 입력 : 3
		//	이름 		 합계 평균 
		//------------------------
		//A학생  98 21 99 xxx xx.xx
		System.out.print("학생 수 입력 : ");
		int x=a.nextInt();
		System.out.print("과목 수 입력 : ");
		int y=a.nextInt();
		int m[][]=new int[x][y];
		String na[]=new String[x];
		
		for(int i=0;i<x;i++) {
			System.out.print("학생 이름 입력 : ");
			na[i]=a.next();
			for(int j=0;j<y;j++) {
				m[i][j]=(int)(Math.random()*101);
			}
		}
		System.out.println("이름\t\t합계  평균");
		for(int i=0;i<x;i++) {
			int sum=0;
			System.out.print(na[i]+"     ");
			for(int j=0;j<y;j++) {
				sum+=m[i][j];
				System.out.print(" "+m[i][j]);
			}	
			System.out.println("\t"+sum+"  "+(double)sum/y);
		}
		/*--------------------------------
		char m[]= {'+','-','*','/','%'};
		int s=0;
		while(true) {
			System.out.print("계산 입력 (1 : +,2 : -,3 : *,4 : /,5 : %,-1 : 종료)");
			int n=a.nextInt();
			if(n==-1) {System.out.print("종료합니다.");break;}
			System.out.print("첫번째 정수 입력 :");
			int x=a.nextInt();
			System.out.print("두번째 정수 입력 :");
			int y=a.nextInt();
			
			if((n-1)==0) s=x+y;
			if((n-1)==1) s=x-y;
			if((n-1)==2) s=x*y;
			if((n-1)==3) s=x/y;
			if((n-1)==4) s=x%y;
			System.out.println("답 :"+x+m[n-1]+y+"="+s);
		}
		/*----------------------------------
		//극장 예약 시스템
		int m[]= new int[10];
		int cnt=0;
		while(true) {
			System.out.print("좌석을 예약하시겠습니까? (y or n)");
			char p=a.next().charAt(0);
			
			if(p=='n') {
				System.out.print("안녕히 가세요");break;
				}
			
			if(p=='y') {
				//좌석 출력
				System.out.println("---------------------------------------");
				for(int i=0;i<10;i++) System.out.printf(" %2d ",i+1);
				System.out.println("\n---------------------------------------");
				for(int i=0;i<10;i++) System.out.printf(" %2d ",m[i]);
				System.out.println("\n---------------------------------------");
				//예약할 좌석 입력
				System.out.print("예약할 좌석 번호를 입력하시오");
				int no=a.nextInt();
				
				if(m[no-1]==0) {System.out.println("예약되었습니다.");m[no-1]=1;cnt++;}
				else			System.out.println("이미 예약된 좌석입니다.");

				if(cnt==10) {System.out.println("매진되었습니다."); break;}
			}
		}
		/*----------------------------------
		String n="Java,C,C#,Python";
		String str[]=n.split(" ");
		
		System.out.print(n.substring(5,10)); //(m~n)=m에서 n-1까지
		/*----------------------------------
		String n="Java,C,C#,Python";
		String str[]=n.split(",");
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]+" ");
		}
		
		System.out.print("문자열 입력 :");
		String m=a.next();
		for(int i=0;i<4;i++)
			if(m.equals(str[i])) System.out.println(i+"에 있다.");
		/*----------------------------------
		String n="        JAva            prog.            ";
		char c[]=new char[11];
		int cnt=0;
		System.out.println(n.replace("a            p","a p"));//교체해서 가운데 공백 제거
		System.out.println(n.trim());//trim : 문자열의 시작과 끝에 있는 공백 제거
		/*-----------------------------------
		String n="JAva prog.";
		char c[]=new char[11];
		int cnt=0;
		
		System.out.print("소문자 입력 : ");
		char user = a.next().charAt(0);
		if(user >= 'A'&&user<='Z') user+=32;
		n=n.toLowerCase();
		System.out.println(n);
		
		for(int i=0;i<n.length();i++)
			if(n.charAt(i)==user) cnt++;
		System.out.println(user+"의 개수 = "+cnt);
		/*-----------------------------------
		int sum=0;
		int m[][]=new int[3][4];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				m[i][j]=(int)(Math.random()*9);
				sum+=m[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(m[i][j]+" ");
			}System.out.println();
		}System.out.println("합은 : "+sum);
		/*-----------------------------------
		int n=0,u=0;
		String str[]= {"가위","바위","보"};
		String m="";
		System.out.print("컴퓨터와 가위바위보 게임을 합니다\n");
		while(true) {
			System.out.print("가위 바위 보!>>");
			m=a.next();
			n=(int)(Math.random()*3);
			for(int i=0;i<str.length;i++) {
				if(m.equals(str[i])) u=i;
			}
			if(m.equals("그만")) {System.out.print("게임을 종료합니다.");break;}
			if((n-u+2)%3==0) System.out.println("유저 : "+str[u]+"/컴퓨터 : "+str[n]+"/컴퓨터 승");
			if((n-u+2)%3==1) System.out.println("유저 : "+str[u]+"/컴퓨터 : "+str[n]+"/유저 승");
			if(n==u) System.out.println("유저 : "+str[u]+"/컴퓨터 : "+str[n]+"/비김");
			/*
			if(m.equals("가위")&&str[n].equals("가위")) System.out.println("사용자 = 가위/컴퓨터 = 가위/비겼습니다.");
			if(m.equals("가위")&&str[n].equals("바위")) System.out.println("사용자 = 가위/컴퓨터 = 바위/졌습니다.");
			if(m.equals("가위")&&str[n].equals("보")) System.out.println("사용자 = 가위/컴퓨터 = 보/이겼습니다.");
			
			if(m.equals("바위")&&str[n].equals("가위")) System.out.println("사용자 = 바위/컴퓨터 = 가위/이겼습니다.");
			if(m.equals("바위")&&str[n].equals("바위")) System.out.println("사용자 = 바위/컴퓨터 = 바위/비겼습니다.");
			if(m.equals("바위")&&str[n].equals("보")) System.out.println("사용자 = 바위/컴퓨터 = 보/졌습니다.");
			
			if(m.equals("보")&&str[n].equals("가위")) System.out.println("사용자 = 보/컴퓨터 = 가위/졌습니다.");
			if(m.equals("보")&&str[n].equals("바위")) System.out.println("사용자 = 보/컴퓨터 = 바위/이겼습니다.");
			if(m.equals("보")&&str[n].equals("보")) System.out.println("사용자 = 보/컴퓨터 = 보/비겼습니다.");
		}
		*/
		/*-----------------------------------
		//정수 입력 받아서 문자 입력되면 예외처리
		int m=0;
		System.out.print("숫자 입력 : ");
		try {m=a.nextInt();
			}
		catch(InputMismatchException e) {System.out.print("숫자를 입력하세요 ! ");}
		System.out.print(m);
		/*-----------------------------------
		//일~토까지 문자 배열 day를 만들어서 초기화
		String m[]= {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		int n=0;
		System.out.print("정수 입력 : ");
		try {
			n=a.nextInt();
			switch(n%7) {
				case 0:System.out.print(m[6]);break;
				case 1:System.out.print(m[0]);break;
				case 2:System.out.print(m[1]);break;
				case 3:System.out.print(m[2]);break;
				case 4:System.out.print(m[3]);break;
				case 5:System.out.print(m[4]);break;
				case 6:System.out.print(m[5]);
			}
		}
		catch(InputMismatchException e) {System.out.print("숫자를 입력하세요 ! ");
			
		}
		/*-----------------------------------
		//이름, 학번 입력 -> 출력 try,catch
		int n[]=new int[2];
		System.out.print("학번과 나이 입력 : ");
		try {
			for(int i=0;i<2;i++)
				n[i]=a.nextInt();
			}catch(InputMismatchException e){
				System.out.print("숫자를 입력하세요 ! ");
			}
		for(int i=0;i<2;i++)
			System.out.print(n[i]+"/");
		/*-----------------------------------
		int x=0;
		
		System.out.print("학생 수 입력 : ");
		x=a.nextInt();
		
		int m[][]=new int[x][4];
		String n[]=new String[x];
		
		for(int i=0;i<x;i++) {
			System.out.println("이름입력 : ");
			n[i]=a.next();
			System.out.println(n[i]+"님의 국영수 점수입력 : ");
			for(int j=0;j<3;j++) {
				m[i][j]=a.nextInt();
				
			}
		}
		for(int i=0;i<x;i++) {
			m[i][3]=0;
			for(int j=0;j<3;j++)
				m[i][3]+=m[i][j];
			
			try {
				System.out.println(n[i]+"님의 평균: "+((double)(m[i][3]))/0);
			}catch(ArithmeticException e) {
				System.out.println("by zero");
			}finally {
				System.out.println("end");
			}
		}
		/*-----------------------------------
		int m[][]=new int[5][5];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				m[i][j]=(int)(Math.random()*100+1);
			}
		}
		
		for(int i=0;i<4;i++) {
			m[4][0]+=m[i][0];
			m[4][1]+=m[i][1];
			m[4][2]+=m[i][2];
			m[4][3]+=m[i][3];
		}
		for(int i=0;i<4;i++) {
			m[0][4]+=m[0][i];
			m[1][4]+=m[1][i];
			m[2][4]+=m[2][i];
			m[3][4]+=m[3][i];
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		/*-----------------------------------
		int [][]m=new int[7][10];
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				m[i][j]=(int)(Math.random()*100+1);
			}
		}
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) 
					if(m[i][j]%10==k) m[6][k]++;
			}
		}
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(m[i][j]+" ");	
			}System.out.println();
		}
		/*-----------------------------------
		int [][]m=new int[7][10];
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				m[i][j]=(int)(Math.random()*100+1);
				if(m[i][j]%10==0) m[6][0]++;
				if(m[i][j]%10==1) m[6][1]++;
				if(m[i][j]%10==2) m[6][2]++;
				if(m[i][j]%10==3) m[6][3]++;
				if(m[i][j]%10==4) m[6][4]++;
				if(m[i][j]%10==5) m[6][5]++;
				if(m[i][j]%10==6) m[6][6]++;
				if(m[i][j]%10==7) m[6][7]++;
				if(m[i][j]%10==8) m[6][8]++;
				if(m[i][j]%10==9) m[6][9]++;
			}
		}
		for(int i=0;i<7;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(m[i][j]+" ");	
			}System.out.println();
		}
		/*-----------------------------------
		String m="";
		System.out.print("문자열 입력 : ");
		m=a.next();
		for(int j=0;j<m.length();j++) {
			for(int i=0;i<m.length();i++) {
				if(i==j) System.out.print((char)(m.charAt(i)-32));
				else System.out.print((m.charAt(i)));
			}
			System.out.println();			
		}
		/*-----------------------------------
		 System.out.print("시작 알파벳 입력 : ");
		 char m=a.next().charAt(0);

		 System.out.print("끝 알파벳 입력 : ");
		 char n=a.next().charAt(0);
		 
		 for(int j=m;j<=n;j++) {
			 for(int i=j;i<=n;i++)
				 System.out.print((char)i);
		 	System.out.println();
		}
		/*-----------------------------------
		String []m=new String[20];
		char [][]c=new char[20][20];
		
		//for(int j=0;j<10;j++) m[j]=a.nextLine();
		//for(int j=0;j<10;j++) System.out.println(m[j]);
	
		for(int j=0;j<3;j++) 
			for(int i=0;i<3;i++) c[j][i]=a.next().charAt(0);
		for(int j=0;j<3;j++) { 
			for(int i=0;i<3;i++) System.out.print(c[j][i]);
			System.out.println();
		}
		/*-----------------------------------
		int [][]m=new int [10][10];
		for(int j=0;j<10;j++) {//행
			for(int i=0;i<20-j;i++){//열
				if(i<=j) System.out.print("  ");
				else System.out.print("* ");
			}
			System.out.println();
		}
		/*-----------------------------------
		//배열과 랜덤을 이용해서 별 그리기
		final int Size=10;
		int [][] n=new int[Size][Size];
		for(int j=0;j<Size;j++) {
			for(int i=0;i<Size;i++) {
				n[i][j]=(int)(Math.random()*2);
			}
			for(int i=0;i<Size;i++) {
				if (n[i][j]==1) System.out.print("$");
				else System.out.print("* ");
			}System.out.println();
		}
		/*-----------------------------------
		final int Size=10;
		int [] numbers=new int[Size];
		
		for(int i=0;i<Size;i++) {
			numbers[i]=(int)(Math.random()*100);
		}
		System.out.print("최초 배열 값 : ");
		for(int x:numbers) System.out.print(x+" ");
		System.out.println();
		Arrays.sort(numbers); //Arrays.sort() 작은수부터 큰수까지 정렬
		System.out.print("정렬 후 배열 : ");
		for(int x:numbers)  System.out.print(x+" ");
		/*-----------------------------------
		final int Size=10; //final 상수(변하지 않는 수)로 취급
		int [] numbers=new int[Size];
		
		for(int i=0;i<Size;i++) {
			numbers[i]=(int)(Math.random()*100);
		}
		System.out.print("최초 배열 값 : ");
		for(int x:numbers) System.out.print(x+" ");
		System.out.println();
		for(int i=0;i<Size;i++) {
			for(int j=i+1;j<Size;j++) {
				if(numbers[i]>numbers[j]) {
					int tmp=0;
					tmp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=tmp;
				}
			}	
		}System.out.print("정렬 후 배열 : ");
		for(int x:numbers)  System.out.print(x+" ");
		/*-----------------------------------
		String eng[]= {"student","love","java","happy","future"};
		String kor[]= {"학생","사랑","자바","행복한","미래"};
		int i=0,n=0;
		while(true) {
			System.out.print("영어 단어를 입력하세요>>");
			String m=a.next();
			if(m.equals("exit")) {
				System.out.print("종료합니다. . .");
				break;}
			for(String k:eng){
				if(m.equals(k)) {
					System.out.println(kor[i]);
					n=1;
				}
				i++;
			}
			if(n==0) System.out.println("그런 영어 단어가 없습니다.");
		}
		/*-----------------------------------
		//과일 입력 : 귤
		//출력 -> 귤은 인덱스 2에 있습니다.
		String f[]= {"사과","배","귤","망고","포도"};
		for(String k:f) System.out.print(k+" ");
		System.out.println();
		System.out.print("과일 입력 : ");
		String m=a.next();
		int n=0;
		int i=0;
		for(String k:f) {
			if(m.equals(k)) {
				n=1;System.out.print(m+"은 인덱스"+i+"번째에 있습니다.");
			}
		}i++;
		if(n==0) System.out.print(m+"는 없습니다.");
		/*-----------------------------------
		String f[]= {"사과","배","귤","망고","포도"};
		for(String k:f) System.out.print(k+" ");
		System.out.println();
		System.out.print("과일 입력 : ");
		String m=a.next();
		int n=0;
		for(int i=0;i<f.length;i++) {
			if(m.equals(f[i])) {
				n=1;System.out.print(m+"은 인덱스"+i+"번째에 있습니다.");
			}
		}
		if(n==0) System.out.print(m+"는 없습니다.");
		/*-----------------------------------
		int x[]=new int[10];
		int y[]= {1,2,3,4,5};
		
		for(int i=0;i<x.length;i++)
			x[i]=10*(i+1);
		for(int i=0;i<x.length;i++)
			System.out.print(x[i]+" ");
		System.out.println();
		//for each
		for(int k:x) System.out.print(k+" ");//x의 값을 k에 하나씩 대입
		/*-----------------------------------
		//Q.난수 100개의 합 (50~150)
			int sum=0,j=0;
			int x[] = new int[100];
				
			for(int i=0;i<100;i++) {
				x[i] = (int)(Math.random()*100+50);
				if(x[i]%3==0) j++;
			}
			int x3[]=new int[j];
			int z=0;
			for(int i=0;i<100;i++) {
				if(x[i]%3==0) {
					x3[z]=x[i];
					sum+=x3[z];
						
					if(z==j-1) System.out.print(x3[z]+"="+sum);
					else	System.out.print(x3[z]+"+");
					z++;
				}
			}
		/*-----------------------------------
		//Q.10개 정수 배열에 난수로 값을 대입한 후 Max 구하기
		int m[]=new int[10];
		int max=0,min=0;
		for(int i=0;i<10;i++) {
			m[i]=(int)(Math.random()*100+1);
			if(i==0) max=min=m[i];
			max=(max>m[i])?max:m[i];
			min=(min<m[i])?min:m[i];
		}
		for(int i=0;i<10;i++)
			System.out.print(m[i]+" ");
		System.out.print("\nMax : "+max+"/min : "+min);
		/*-----------------------------------
		//Q. 학생 수를 입력 받아 그 학생들의 점수의 합계와 평균을 구하여라
		int m[];
		int sum=0;
		
		System.out.print("학생 수 입력 : ");
		int s=a.nextInt();
		
		m=new int[s];
		for(int i=0;i<s;i++) {
			System.out.print((i+1)+"번째 학생 점수 입력 : "); 
			int j=a.nextInt();
			m[i]=j;
			sum+=m[i];
		}
	
		System.out.print("합계 : "+sum+"\n평균 : "+(((double)(sum))/s));
		
		/*-----------------------------------
		int m[];
		
		System.out.print("사이즈 입력 : ");
		int s=a.nextInt();
		
		m=new int[s];
		for(int i=0;i<s;i++) {
			System.out.print("정수 입력 : "); 
			int j=a.nextInt();
			m[i]=j;
		}
		
		for(int i=0;i<s;i++)
			System.out.print(m[i]+" ");
			*/
	}
}
