package mirae.com;
public class a_13_star {
	public static void main(String[] args) {
//-----------------------------------------------------------
		/*
		int row=10;
		for(int i=0;i<row;i++) { //10x10 행렬
			for(int j=row; j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
//-----------------------------------------------------------
		/*
		int row=10;
		for(int i=0;i<row;i++) { //10x10 행렬
			for(int j=2*(row-i); j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
//-----------------------------------------------------------
		///*
		int row=10;
		for(int i=0;i<row;i++) {//10x10 행렬
			for(int j=0;j<row;j++) {
				if(10-j<=i+1) System.out.print("* ");
				else System.out.print(" ");
			}
			System.out.println();
		}
		//*/
//-----------------------------------------------------------
		//구구단(for)
		/*
		for(int i=2;i<10;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%2d x %2d = %2d |\t ",j,i,(i*j));
			}
			System.out.println();
		}
		*/
//-----------------------------------------------------------
		/*
		//구구단(while)
		int i=2;
		while(i<=9) {
			int j=1;
			while(j<=9) {
				System.out.printf("%2d x %2d = %2d |\t ",j,i,(i*j));
				j++;
			}
			i++;
			System.out.println();
		}
		*/
	}
}