package mirae2.com;

public class b_05_array_sum {
	public static int sumArray(int temp[]) {
		int hab=0;
		for(int i=0; i<temp.length;i++) {
			hab+=temp[i];
		}
		return hab;
	}
	public static void main(String[] args) {
		int temp[]= {10,20,30,40};
		int temp2[]= {100,200,300,400};
		
		System.out.println(sumArray(temp));
		System.out.println(sumArray(temp2));
		
	}
}