package mirae.com;
import java.util.Random;
public class a_03_random {
	public static void main(String[] args) {
//-----------------------------------------------------------
		/*
		Random rand=new Random(1);
		//new Random(1) : 1은 seed 값
		//클래스 난수 발생 ->의사난수(가짜 난수)
		//new : 동적 메모리 할당, heap에 생성
		//주소
		//클레스 -> 사용자 정의 데이터 파일(사용자가 만든 데이터 타입)
		System.out.println("= rand = ");
		rand.nextInt();
		for(int i=0;i<5;i++)
			System.out.println(i+"번째 : "+rand.nextInt());
			*/
//-----------------------------------------------------------
		/*
		for(int i=0;i<10;i++)
			System.out.println((i+1)+ " : 대한민국");
			*/
//-----------------------------------------------------------
		/*
		//1-100까지의 합
		int sum=0;
		for(int i=1;i<=100;i++)
			sum+=i;
		System.out.println(sum);
		*/
//-----------------------------------------------------------
		/*
//홀수의 합
		int sum=0;
		for(int i=1;i<=1000;i+=2)
			sum+=i;
		System.out.println(sum);
		*/
//-----------------------------------------------------------
		//( ) 소괄호 : 함수, { } 중괄호 : 블록, [ ] 대괄호 : 배열
		int [] counter = new int [10]; //heap에 10개의 int 형을 저장하는 메모리를 확보하라
		
		for(int i=0;i<10;i++)
			counter[i]=i;
	
		for(int i=0;i<10;i++)
			System.out.println(counter[i]);
	}
}