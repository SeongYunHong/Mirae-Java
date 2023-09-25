import java.util.Scanner;

class Player11{
	private String name;
	Player11(String n){this.name=n;}
	public String getName() {return name;}
}
public class WordGameApp {
	static String word="아버지";
	static int lastindex=word.length()-1;
	static char lastchar=word.charAt(lastindex);
	static char firstchar=word.charAt(0);
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int m=a.nextInt();
		Player11 []p=new Player11[m];
		
		for(int i=0;i<p.length;i++) {
			System.out.print("선수 이름 입력 >>");
			p[i]=new Player11(a.next());
		}
		System.out.println("시작하는 단어는 아버지 입니다.");
		int n=0;
		while(true) {
			System.out.print(p[n].getName()+">>");
			String newword=a.next();
			firstchar=newword.charAt(0);
			lastchar=word.charAt(lastindex);
			
			if(lastchar!=firstchar){
				System.out.print(p[n].getName()+"님이 졌습니다.");
				break;
			}
			word=newword;
			n++;
			n=n%m;
		}
	}

}
