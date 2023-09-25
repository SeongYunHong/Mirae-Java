package ch5;

import java.util.Scanner;

public class StackManager {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		StringStack s= new StringStack(10);
		
		System.out.print(">>");
		for(int i=0;i<5;i++) {
			s.push(a.next());
		}
		int c=s.length();
		for(int i=0;i<c;i++) {
			System.out.print(s.pop()+" ");
		}
	}
}