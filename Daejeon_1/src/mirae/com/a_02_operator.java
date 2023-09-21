package mirae.com;
public class a_02_operator {
	public static void main(String[] args) {
//-----------------------------------------------------------
		/*
		int i=5; //데이터 타입, 변수, 초기화 값
		i++; //후위 연산자
		System.out.println(i);
		i=5;
		++i; //전위 연산자
		System.out.println(i);
		System.out.println(i++);
		System.out.println(++i);
		*/
//-----------------------------------------------------------
		/*
		System.out.println("십의 3승 : "+Math.pow(10, 3)); //Math는 static class이다
		int j=0;
		System.out.println(10>1);
		System.out.println(j++ + 10);
		System.out.println(j);
		*/
//-----------------------------------------------------------
		/*
		//데이터 변환
		//byte (1byte), short (2byte), int (4byte), long (8byte)
		//사이즈, 입력되는 데이터의 한계
		//wrapper class Byte, Short, Integer, Long
		//float(4byte), double (8byte)  
		int number_1=300;
		String s=String.valueOf(number_1); //valueOf : 형변환 하는 함수
		System.out.println(i+100);
		System.out.println(s+100); //문자열 덧셈 연산
		
		String si="200";
		int number=Integer.parseInt(si);
		System.out.println(number);
		*/
//-----------------------------------------------------------
		/*
		byte iByte=10; //1B
		short iShort=10; //2B
		int iInt=10; //4B
		long iLong=10; //8B
		int tmp=iByte;
		byte tmp2=(byte)iInt; //(byte) : 캐스팅
		float num1=10.1f; //4B
		double num2=10.1d;//8B
		double num3=10.1;
		char ch1='a'; //single quatation
		String st="대한민국";
		System.out.println(st);
		*/
//-----------------------------------------------------------
		/*
		char c1='a'; //소문자 a의 코드값은 97
		int j1=c1+3; //97+3
		System.out.println(j1);
		char c3 = (char) (c1+1); //97+1 
		System.out.println(c3);
		*/
//-----------------------------------------------------------
		/*
		System.out.println(Integer.toBinaryString(8));
		int temp= 8 >>2; 
		//  8   = 0 0 0 0 1 0 0 0(2)
		//8>>2= 0 0 0 0 0 0 1 0(2)
		System.out.println(temp);
		System.out.println(Integer.toBinaryString(temp));
		
		int x=123; // 0 1 1 1 1 0 1 1
		int y=205; // 1 1 0 0 1 1 0 1
		//				 0 1 0 0 1 0 0 1
		//				 1 1 1 1 1 1 1 1
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		int z = x&y; // && 논리연산자, & 비트연산자
		int k = x|y;
		System.out.println(Integer.toBinaryString(z));
		System.out.println(Integer.toBinaryString(k));
		System.out.println(z);
		System.out.println(k);
		*/
//-----------------------------------------------------------
		//3항 연산자
		int x= 10;
		int y= -10;
		int absX = (x>=0)? x: -x;
		int absY = (y>=0)? y: -y;
		System.out.println("x= "+absX);
		System.out.println("Y= "+absY);
	}
}