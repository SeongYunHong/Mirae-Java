import java.util.Scanner;

public class array0427 {
	static int[] makeArray() {
		int temp[]=new int[4];
		for(int i=0;i<temp.length;i++)
			temp[i]=i;
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int intArray[];
		intArray=makeArray();
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i]+" ");
		/*--------------------------------------
		int arr[][]=new int[4][];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new int[(int)(Math.random()*5+1)];
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=(int)(Math.random()*50+1);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i].length+" : ");
			for(int j=0;j<arr[i].length;j++)
				if((j+1)==arr[i].length) System.out.print(arr[i][j]);
				else System.out.print(arr[i][j]+", ");
			System.out.println();
		}
		/*--------------------------------------
		System.out.print("�� �Է� : ");
		int m=a.nextInt();
		System.out.print("�� �Է� : ");
		int n=a.nextInt();
		
		int score[][]= new int[m][n];
		double sum=0;
		
		for(int year=0;year<score.length;year++)
			for(int term=0; term<score[year].length;term++) {
				score[year][term]=(int)(Math.random()*101);
				sum+=score[year][term];
			}
		int x=score.length;
		int y=score[0].length;
		System.out.println("4�� ��ü ����� "+sum/(x*y));
		/*--------------------------------------
		double score[][]= {{3,3,3,4},{3,5,3,6},{3,7,4,0},{4,1,4,2}};
		double sum=0;
		
		for(int year=0;year<score.length;year++)
			for(int term=0; term<score[year].length;term++)
				sum+=score[year][term];
		int n=score.length;
		int m=score[0].length;
		System.out.println("4�� ��ü ����� "+sum/(n*m));
		/*--------------------------------------
		int intArray2[][]=new int[3][4];
		double sum=0;
		
		for(int i=0;i<intArray2.length;i++)
			for(int j=0;j<intArray2[i].length;j++) {
				intArray2[i][j]=(int)(Math.random()*1001);
				sum+=intArray2[i][j];
			}
		/*-------------------------------------- 
		int intArray[][]= {{90, 90, 110, 110},{120,110,100,110},{120,140,130,150}};
		for(int i=0;i<intArray.length;i++)
			for(int j=0;j<intArray[i].length;j++)
				sum+=intArray[i][j];
		System.out.println("���� 3�Ⱓ ���� �Ѿ��� "+sum+"�̸� ����� ������ "+sum/intArray.length+"�Դϴ�.");
		*/
		
	}
}