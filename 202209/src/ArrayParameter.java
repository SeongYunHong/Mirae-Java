
public class ArrayParameter {
	static char[] replaceSpace(char a[]) {
		for(int i=0;i<a.length;i++)
			if(a[i]==' ') a[i]=',';
		return a;
	}
	static void printCharArray(char a[]) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println();
	}
	static int [] SUM(int a[],int s) {
		int r[]= new int[s];
		for(int i=0;i<s;i++) {
			for(int j=0;j<=i;j++) {
				r[i]+=a[j];
			//System.out.println(s+"/"+r[i]);
			}
		}
		return r;
	}
	static void PRTSUM(int a[]) {
		a=SUM(a,a.length);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int m[]= {0,1,2,3,4,5,6,7,8,9};
		PRTSUM(m);
		/*
		char c[]= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		c=replaceSpace(c);
		printCharArray(c);
		 */
	}

}
/*String 문자를 변환
import java.util.Scanner;

public class ArrayParameter {
	static String replaceSpace(String x,char i,char j) {
		//for(int i=0;i<a.length();i++)
			//if(a.charAt(i)==' ')
				//a.charAt(i)="/";
		return x.replace(i,j);
	}
	static void printCharArray(String x) {
		for(int i=0;i<x.length();i++)
			System.out.print(x.charAt(i));
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String c=a.nextLine();
		System.out.print("어떤 문자를 어떻게 바꿀지 순서대로 입력 : ");
		char m=a.next().charAt(0);
		char n=a.next().charAt(0);
		
		printCharArray(c);
		printCharArray(replaceSpace(c,m,n));
		//printCharArray(c);
		//replaceSpace(c);
		//printCharArray(c);

	}

}

 */
