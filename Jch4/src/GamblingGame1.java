import java.util.Scanner;
class Player{
	private String name;
	Player(String n){this.name=n;}
	public String getName() {return name;}
}
public class GamblingGame1 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Player p[]=new Player[2];
		for(int i=0;i<p.length;i++) {
			System.out.print("선수 이름 입력 >>");
			p[i]=new Player(a.next());
		}
		int n=0;
		while(true) {
			System.out.print(p[n].getName()+" <Enter 외 아무키나 치세요>");
			a.next();
			int val[]=new int [3];
			for(int i=0;i<val.length;i++) {
				val[i]=(int)(Math.random()*3);
				System.out.print(val[i]+"\t");
			}
			System.out.println();
			if(val[0]==val[1]&&val[1]==val[2]) {
				System.out.print(p[n].getName()+"이 승리하였습니다.");
				break;
			}
			n++;
			n=n%2;
		}
	}
}