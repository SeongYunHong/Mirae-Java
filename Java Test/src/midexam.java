import java.util.Scanner;

public class midexam {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		/*-----------------------------------
		//1.
		System.out.println("정수를 입력하여라.");
		int m=a.nextInt();
		String n="";
		while(true) {
			if(m/10000 != 0) {
				n+=m/10000+"만";
				m=m%10000;
				if(m%1000 >=0) {
					n+=m/1000+"천";
					m=m%1000;
					if(m%100 >= 0) {
						n+=m/100+"백";
						m=m%100;
						if(m%10 >= 0) {
							n+=m/10+"십"+m%10+"일";
							break;
						}
					}
				}
			}else break;
		}
		System.out.print(n+"입니다.");
		*/
		/*
		//2.
		System.out.print("도서 개수를 입력하시겠습니까?");
		int m=a.nextInt();
		String book[]=new String[m];
		String author[]=new String[m];
		for(int i=0;i<m;i++) {
			System.out.print("도서명 : ");
			book[i]=a.next();
			System.out.print("저자명 : ");
			author[i]=a.next();
		}
		System.out.println("총 "+m+"권의 도서 목록을 출력하겠습니다.");
		System.out.println("************<독서 버킷리스트>************");
		System.out.println("         도서명             저자명");
		System.out.println("--------------------------------------");
		for(int i=0;i<m;i++) {
			//System.out.println((i+1)+". "+book[i]+"\t|"+author[i]);
			System.out.printf("%d. %3s\t|%3s",(i+1),book[i],author[i]);
			System.out.println();
		}
		System.out.println("--------------------------------------");
		*/
		/*
		//3.
		System.out.print("시작점 입력 : ");
		int x=a.nextInt();
		System.out.print("끝점 입력 : ");
		int y=a.nextInt();
		System.out.print("정수 입력 : ");
		int z=a.nextInt();
		
		int k[]=new int[y+1];
		for(int i=x;i<=y;i++) {
			k[i]=i;
			for(int j=1;j<=(int)(y/z);j++)
				if(i==z*j) k[i]=(char)65;
			if(k[i]==65) System.out.print('*'+" ");
			else System.out.print(k[i]+" ");
		}
		*/
		//4.
		System.out.print("구매 가능한 금액 입력 : ");
		int x=a.nextInt();
		int sum=0;
		int k=10;
		String p[]=new String[k];
		int c[]=new int[k];
		int j=0;
		while(true) {
			System.out.print("물품명 입력 : ");
			p[j] =a.next();
			System.out.print("물품가 입력 : ");
			c[j]=a.nextInt();
			if(c[j]>x) continue;
			if(x-sum<c[j]) break;
			else	sum+=c[j];
			j++;
		}
		System.out.println("   <구입한 물품>   ");
		System.out.println("=================");
		for(int i=0;i<j;i++) {
			System.out.println(p[i]+"\t"+c[i]);
		}
		System.out.println("=================");
		System.out.println("합계           "+sum);
		System.out.println("잔돈          "+(x-sum));
		System.out.println("**금액 부족으로 "+p[j]+" 구매불가");
		
	}
}