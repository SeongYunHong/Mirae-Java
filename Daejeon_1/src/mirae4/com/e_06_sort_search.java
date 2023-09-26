package mirae4.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class e_06_sort_search {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		ArrayList<String> arraylist = new ArrayList<String>();
		System.out.println("데이터 한개를 입력하시오 ");
		//추가(맨 뒤에)
		arraylist.add(input.nextLine());
		arraylist.add("천안");
		arraylist.add("천안");
		arraylist.add("대전");
		//삽입(인덱스 위치에 입력)
		arraylist.add(2,"오리");
		arraylist.add("서울");
		System.out.println(arraylist.get(1));
		//정렬
		//Iterator -> Collections -> List -> ArrayList
		//Iterator, Collections, List(인터페이스 : 약속 -> sort함수 반드시 구현해야하기 때문에)
		Collections.sort(arraylist); //원본 데이터에 작업
		System.out.println(arraylist.get(1));
		//도수
		System.out.println(Collections.frequency(arraylist, "천안"));
		//검색(binarySearch : 전제조건-정렬)
		System.out.println("검색"+Collections.binarySearch(arraylist, "오리"));
		System.out.println(arraylist);
		//삭제(처음 만나는 것 한개만 삭제)
		arraylist.remove("천안");
		System.out.println(arraylist);
		//수정(set(인덱스,수정값) 인덱스에 있는 함수를 수정값으로 바꿔라)
		arraylist.set(1, "대전");
		System.out.println(arraylist);

	}

}
