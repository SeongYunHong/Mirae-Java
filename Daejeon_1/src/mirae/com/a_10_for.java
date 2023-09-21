package mirae.com;
public class a_10_for {
	public static void main(String[] args) {		
//-----------------------------------------------------------
		//배열 : 자바는 행 중심 배열 
		//인덱스 사용하는 곳 : 배열, 반복 횟수, 값
		/*
		for(int i=1; i<=10; i++) {
			if(i==5) continue;
			System.out.print(i+" ");
		}
		*/
//-----------------------------------------------------------
		/*
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3;j++)
				System.out.println(i+" "+j);
		}
		*/
//-----------------------------------------------------------
		/*
		int [][]data= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==1&&j==2) continue;
				System.out.print(data[i][j]+" ");
			}			
		}
		*/
//-----------------------------------------------------------
		/*
		//while
		int i=1;
		while(i<=10) { //한계값(넘어가면 종료)
			System.out.print(i+" ");
			i++;			
		}
		*/
//-----------------------------------------------------------		
		//do-while
		int i=1;
		do { //반드시 한번은 실행됨
			System.out.print(i+" ");
			i++;			
		}while(i<=10); //한계값
	}
}