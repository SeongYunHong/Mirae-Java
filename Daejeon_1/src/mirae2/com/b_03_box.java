package mirae2.com;

import java.util.Scanner;

public class b_03_box {
	public int volume(int a, int b, int c) { //static이 안붙어서 인스턴스를 해줘야함
		return a*b*c;
	}
	public static int volume(int a, int b) {
		return (int)(a*b/2);
	}
	public static void main(String[] args) {
		//클레스가 필요한 데이터의 공간을 heap에 확보하는 일
		Scanner input = new Scanner(System.in);
		
		/*
		b_03_box mt = new b_03_box(); //주소 : stack, 데이터 : heap
		
		System.out.print("밑변, 넓이, 높이를 입력하시오 : ");
		
		int width=input.nextInt();
		int column=input.nextInt();
		int height=input.nextInt();
		
		System.out.println("부피 계산 결과는 = "+mt.volume(width,column,height)); //인스턴스해줌
*/
		System.out.print("삼각형의 밑변, 높이를 입력하시오 : ");
		
		int width=input.nextInt();
		int height=input.nextInt();
		
		System.out.println("넓이 계산 결과는 = "+volume(width,height));

		
	}

}
