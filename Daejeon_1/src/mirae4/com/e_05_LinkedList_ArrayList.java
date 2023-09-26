package mirae4.com;
//LinkedList : 삽입 삭제가 빈번한 경우 사용
//ArrayList : 순차적으로 처리시 사용
import java.util.*;

public class e_05_LinkedList_ArrayList {
	public static long add1(List list) { //자료구조로 데이터를 받음
		//1970년 1월 1일부터 밀리세컨드로 표현된 수치 리턴
		long start = System.currentTimeMillis(); //milisecond 1/1000초
		for(int i=0;i<10000;i++) 
			list.add(i+"");
		long end = System.currentTimeMillis();
		return end - start; //경과 시간
	}
	public static long add2(List list) { 
		long start = System.currentTimeMillis();
		for(int i=0;i<1000;i++) 
			list.add(500,"X");
		long end = System.currentTimeMillis();
		return end - start;
	}
	public static long remove1(List list) { //전체 삭제
		long start = System.currentTimeMillis();
		for(int i=list.size()-1;i>0;i--)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start; 
	}
	public static long remove2(List list) { //중간 삭제
		long start = System.currentTimeMillis();
		for(int i=0;i<1000;i++) 
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start; 
	}
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		System.out.println("=순차적으로 추가하기="); //순차적으로 처리하는 것은 ArrayList가 더 빠름
		System.out.println("ArrayList : "+add1(al));  //16
		System.out.println("LinkedList : "+add1(ll)); //17
		System.out.println();
		
		System.out.println("=중간에 추가하기=");  //삽입 삭제는 LinkedList가 더 빠름
		System.out.println("ArrayList : "+add2(al));  //16
		System.out.println("LinkedList : "+add2(ll)); //1
		System.out.println();
		
		System.out.println("=중간에 삭제하기=");
		System.out.println("ArrayList : "+remove2(al));  //12
		System.out.println("LinkedList : "+remove2(ll)); //3
		System.out.println();
		
		System.out.println("=순차적으로 삭제하기=");
		System.out.println("ArrayList : "+remove1(al));  //2
		System.out.println("LinkedList : "+remove1(ll)); //2
		

		
		
		
		
	}

}
