package mirae4.com;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int a[]=new int[10];
        int max=0;
        for(int test_case = 1; test_case <= T; test_case++){
	        for(int i=0;i<10;i++){
	        	a[i]=sc.nextInt();
	        	max =  (max > a[i])? max: a[i];
	        }
	        System.out.println("#"+test_case+" "+max);
        }
	}
}
