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
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int k=a.nextInt();
		Player_ p[]=new Player_[k];
		for(int i=0;i<p.length;i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			p[i]=new Player_(a.next());
		}
		int n=0;
		String word="�ƹ���";
		
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�");
		while(true) {
			int lastIndex=word.length()-1;
			char lastChar=word.charAt(lastIndex);
			
			char m=lastChar;
			System.out.print(p[n].getName()+">>");
			word=a.next();
			char firstChar=word.charAt(0);
			if(m!=firstChar) {System.out.print(p[n].getName()+"�� �����ϴ�.");break;} 

			n++;
			n=n%k;
		}
	}
}