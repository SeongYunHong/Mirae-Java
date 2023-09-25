import java.util.Scanner;

public class Rect {
	int g=0;
	int s=0;
	Rect(){this.g=10;this.s=5;}
	Rect(int g,int s){this.g=g;this.s=s;}
	int getM() {return g*s;}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in); 
		Rect[] h=new Rect[4];
		for(int i=0;i<4;i++) {
			System.out.print("사각형의 가로와 세로를 입력하세요 : ");
			int m=a.nextInt();
			int n=a.nextInt();
			h[i]=new Rect(m,n);
		}int sum=0;
		for(int i=0;i<4;i++) {
			sum+=h[i].getM();
		}System.out.println(sum);
	}

}
