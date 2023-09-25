import java.util.Scanner;
class Player_{
	private String name;
	Player_(String n){this.name=n;}
	public String getName() {return name;}
}
class WordGameApp{
	
	
}
public class Word {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int k=a.nextInt();
		Player_ p[]=new Player_[k];
		for(int i=0;i<p.length;i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			p[i]=new Player_(a.next());
		}
		int n=0;
		String word="아버지";
		
		System.out.println("시작하는 단어는 아버지입니다");
		while(true) {
			int lastIndex=word.length()-1;
			char lastChar=word.charAt(lastIndex);
			
			char m=lastChar;
			System.out.print(p[n].getName()+">>");
			word=a.next();
			char firstChar=word.charAt(0);
			if(m!=firstChar) {System.out.print(p[n].getName()+"이 졌습니다.");break;} 

			n++;
			n=n%k;
		}
	}
}