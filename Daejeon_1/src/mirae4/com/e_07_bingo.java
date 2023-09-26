package mirae4.com;

import java.util.*;
import java.util.Set;

//[5][5] 행렬을 만들고 순서대로 행 우선으로 숫자를 입력하시오
class bingo{
	int arr[][]=new int[5][5];
	bingo() {}
	bingo(int arr[][]) {this.arr=arr;}
	
	public void Maker() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=i*5+j;
			}	
		}
	}	
}
public class e_07_bingo {

	public static void main(String[] args) {
		Set set = new HashSet(); //키로 구성된 자료구조(중복X)
		int [][]board=new int[5][5];
		Random generator = new Random(System.currentTimeMillis());
		for(int i=0;set.size()<25;i++) {//set.size() 이유 : 횟수 조절보다 사이즈를 조절해줘야돼서(중복이 나오면 다시 돌리니까)
			set.add(Math.abs(generator.nextInt()%25)+1+""); //"" 이유 : 숫자로 된것들을 더 높은 데이터 타입인 문자열로 변환시켜주기 위해
		}
		Iterator it = set.iterator();
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]=Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10 ? "  " : " ")+ board[i][j]);
			}System.out.println();
		}
		ArrayList<Integer>list = new ArrayList<Integer>(25);
		for(int i=0;i<25;i++) {
			list.add(i);
		}
		Collections.shuffle(list); //shuffle : 뒤섞다
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		itr = list.iterator(); //이터레이터 초기화
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]=(int) itr.next();
				System.out.print((board[i][j] < 10 ? "  " : " ")+ board[i][j]);
			}System.out.println();
		}
		
	}

}
