import java.util.Scanner;

class Player11{
	private String name;
	Player11(String n){this.name=n;}
	public String getName() {return name;}
}
public class WordGameApp {
	static String word="�ƹ���";
	static int lastindex=word.length()-1;
	static char lastchar=word.charAt(lastindex);
	static char firstchar=word.charAt(0);
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int m=a.nextInt();
		Player11 []p=new Player11[m];
		
		for(int i=0;i<p.length;i++) {
			System.out.print("���� �̸� �Է� >>");
			p[i]=new Player11(a.next());
		}
		System.out.println("�����ϴ� �ܾ�� �ƹ��� �Դϴ�.");
		int n=0;
		while(true) {
			System.out.print(p[n].getName()+">>");
			String newword=a.next();
			firstchar=newword.charAt(0);
			lastchar=word.charAt(lastindex);
			
			if(lastchar!=firstchar){
				System.out.print(p[n].getName()+"���� �����ϴ�.");
				break;
			}
			word=newword;
			n++;
			n=n%m;
		}
	}

}
