import java.util.Scanner;
public class rspp {
	public static int doif(int user,int com) {
		int result=0;
		if(user==com){
			result=2;
		}
		else if((com+1)%3==user){
			result=1;
		}
		else{
			result=0;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int count = 0;
		int win = 0;
		int lose = 0;
		
		while(true) {
			System.out.println("���� ���� �� ������ �����ϰڽ��ϴ�.(���� : 0, ���� : 1, �� : 2, ���� : 9)");
			System.out.print("���� ���� ��!   ");
			int user=Integer.parseInt(input.nextLine());	
			if(user==9) break;
			count++;
			int com=(int)(Math.random()*3);
			String judge[]= {"�̰���ϴ�!","�����ϴ�...","�����ϴ�."};
			int result= doif(com,user);

			switch(result) {
				case 0: win+=1; break;
				case 1: lose+=1; break;
			}		
			System.out.println(judge[result]);
		}
		System.out.println("���� ��� : "+count+"��"+win+"��"+(count-win-lose)+"��"+lose+"��");
	}
}