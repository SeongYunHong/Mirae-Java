package mirae4.com;
import java.util.*;
public class e_02_ArrayList {

	public static void main(String[] args) {
		int n = 5;
		//ArrayList에서는 Primitive type(기본형)은 사용하지 않음
		//사이즈 자동 조절
		//랜덤으로 위치 데이터를 접근하는 것이 가능
		//ArrayList vs Vector(동기화 가능 : 동시에 접근할 때 안전)
		//multi thread : 동시에 실행되는 process
		//속도가 빠른 cpu time을 나누어서 실행
		
		//배열처럼 행동하는 리스트로 구성된 배열
		ArrayList<Integer> arr1 = new ArrayList<Integer>(n); //사이즈를 선언 안해줘도 자동으로 조절이 가능함
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		System.out.println("Array 1 : "+arr1);
		System.out.println("Array 2 : "+arr2);
		for(int i=1;i<=n;i++) {
			arr1.add(i); //자동으로 공간을 늘려서 확보
			arr2.add(i);
		}
		System.out.println("Array 1 : "+arr1);
		System.out.println("Array 2 : "+arr2);
	}

}
