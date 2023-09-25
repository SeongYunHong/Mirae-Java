import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random r=new Random();
		int m[]=new int[6];
		int i=0;
		System.out.println("\t  ¡ØLotto¡Ø\n");
		
		for(i=0;i<6;i++) {
			m[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i-1;j++) {
				if(m[i]==m[j]) m[i]=(int)(Math.random()*45+1);
			}
		}
			for(i=0;i<6;i++) {
			if(i<5) System.out.print(m[i]+", ");
			else System.out.print("Bonus : "+m[i]);
		}
	}
}
