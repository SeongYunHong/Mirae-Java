import java.util.Scanner;
	public class rsp {
		public static int doif(int com, int user) {
			int result=0;
			if(((user-com)+3)%3==1)
				result=0;//���� ��
			else if(((user-com)+3)%3==2)
				result=1;//��ǻ�� ��
			else if(((user-com)+3)%3==0)
				result=2;//���
			return result;
		}
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);	
			int count = 0;
			int win = 0;
			int draw = 0;
			int lose = 0;
		
			while(true) {
				System.out.println("���� ���� �� ������ �����ϰڽ��ϴ�.(���� : 0, ���� : 1, �� : 2, ���� : 9)");
				System.out.print("���� ���� ��!   ");
				int user=Integer.parseInt(input.nextLine());	
				if(user==9) break;
				count++;
				int com=(int)(Math.random()*3);
				String judge[]= {"�̰���ϴ�!","�����ϴ�...","�����ϴ�."};
				int result=doif(com,user);
				//user 	  com
				//			0	1	2
				//		0	2	1	0
				//		1	0	2	1
				//		2	1	0	2
				
				switch(result) {
					case 0: win+=1; break;
					case 1: lose+=1; break;
					case 2: draw+=1; break;
				}		
				System.out.println(judge[result]);
			}
			System.out.println("���� ��� : "+count+"��"+win+"��"+draw+"��"+lose+"��");
		}
	}