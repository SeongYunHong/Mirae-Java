import java.util.Scanner;

public class OX {
	int o=0;
	int w=0;
	public double getG() {return (o*1+w*0.2);}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		OX z=new OX();
		while(true) {
			System.out.print("문제 수 입력 : ");
			int m=a.nextInt();
			
			System.out.println("--------------------");
			System.out.print("정답 입력 : ");
			String x[]=new String[m];
			for(int i=0;i<x.length;i++) {
				x[i]=a.next();
			}
			System.out.print("답 입력 : ");
			String y[]=new String[m];
			for(int i=0;i<y.length;i++) {
				y[i]=a.next();
			}
			for(int i=0;i<x.length;i++) {
				if(x[i].equals(y[i])) z.o++;
				else z.w++;
			}
			System.out.println("--------------------");
			System.out.println("맞은 답수 : "+z.o);
			System.out.println("점수 : "+z.getG());
			System.out.println();
			
			System.out.print("채점할 퀴즈가 더 있는가?(y or n) : ");
			String p=a.next();
			
			if(p.equals("n")) {System.out.print("종료합니다.");break;};
		}
	}
}
