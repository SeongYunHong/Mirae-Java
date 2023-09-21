package mirae.com;
public class a_15_sort {
	public static void main(String[] args) {
//-----------------------------------------------------------
		int number[]=new int[10];
		
		for(int i=0;i<number.length;i++) {
			number[i]=i;
			System.out.print(number[i]+" ");
		}
		System.out.println();
//-----------------------------------------------------------			
		//데이터 섞기(random와 data swapping)
		for(int i=0;i<100;i++) {
			int n =(int)(Math.random()*10);
			int temp = number[0]; //swap
			number[0]=number[n];
			number[n]=temp;
		}
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println();
		//bubble 정렬
		for(int i=0; i<number.length;i++) {
			boolean changed=false;
			for(int j=0;j<number.length-i-1;j++) { // -i하는 이유 : 진행될 때마다 자리가 하나씩 정해지니까 의미없는 반복을 줄이기 위해 
				if(number[j]>number[j+1]) {
					int temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
					changed=true;
				}			
			}
			if(!changed) break; //변경하지 않았으면 종료(정렬이 완료됐기 때문)
		}
		
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
		
	}
}