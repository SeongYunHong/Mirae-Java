
public class RandomArray {
	public static void main(String[] args) {
		int intArray[][]=new int[3][4];
		
		for(int i=0;i<3;i++)
			for(int j=0;j<4;j++)
				intArray[i][j]=(int)(Math.random()*10);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++)
				System.out.print(intArray[i][j]+" ");
			System.out.println();
		}
		int i=0,sum=0;
		while(i<3) {
			for(i=0;i<3;i++)
				for(int j=0;j<4;j++)
					sum+=intArray[i][j];
		}
		System.out.println("гую╨ "+sum);
	}
}