import java.util.Scanner;
import java.util.StringTokenizer;

public class MyPoint {
	int x,y;
	MyPoint(int x,int y){this.x=x;this.y=y;}
public String toString() {
	return "MyPoint("+x+","+y+")";
}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String text=a.nextLine();
		
		System.out.println("<Enter>�� �Է��ϸ� ���ڿ��� �� ���ھ� ȸ���մϴ�.");
		
		while(true) {
			String key=a.next();
			if(key.equals("")) {
				String first=
				String last=
			}
			
			
		}
		/*----------------------------------------
		while(true) {
			
			System.out.print(">>");
			String s=a.nextLine();
			if(s.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
			StringBuffer sb=new StringBuffer(s);
			
			int index=(int)(Math.random()*s.length());
			while(true) {
				int i=(int)(Math.random()*26);
				char c=(char)('a'+i);
				if(sb.charAt(index)!=c) {
					sb.replace(index,index+1,Character.toString(c));
					break;
				}
			}
			System.out.println(sb);
		}
	/*----------------------------------------
	while(true) {
		StringBuffer sb=new StringBuffer("");
		System.out.print("����(1), ����(2), ��(3), ������(4)>>");
		int m=a.nextInt();
		if(m==4) {System.out.print("�����մϴ�...");break;}
		int n=(int)(Math.random()*3)+1;
		if(m==1)
			sb.append("����� ���� : ");
		else if(m==2)
			sb.append("����� ���� : ");
		else if(m==3)
			sb.append("����� �� : ");
		
		if(n==1)
			sb.append("��ǻ�� ����");
		else if(n==2)
			sb.append("��ǻ�� ����");
		else if(n==3)
			sb.append("��ǻ�� ��");
		System.out.println(sb);
		
		switch((m-n+2)/3) {
		case 0:System.out.println("����ڰ� �̰���ϴ�."); break;
		case 1:System.out.println("����ڰ� �����ϴ�.");break;
		case 2:System.out.println("�����ϴ�.");
		}
	}
		/*----------------------------------------
		String query=a.nextLine();
		StringTokenizer st=new StringTokenizer(query,"+");
		int sum=0,i=0;
		int n=st.countTokens();
		int []m=new int [n];
		while(st.hasMoreTokens()) {
			String token=st.nextToken().trim(); // ��ū ���
			m[i++]=Integer.parseInt(token);
		}
		for(i=0;i<n;i++)
			sum+=m[i];
		System.out.print("���� "+sum);
		/*----------------------------------------
		int m=Integer.parseInt("2");
		int n=Integer.parseInt("5");
		System.out.print(m+"+"+n+"\n���� "+sum);
		int []m=new int [3];
		while(true) {
			for(int i=0;i<3;i++){
				m[i]=(int)(Math.random()*3)+1;
				System.out.println(m[i]+"\t");
			}
			if(m[0]==m[1]&&m[0]==m[2]) {System.out.print("����");break;}
		}
		/*----------------------------------------
		while(true) {
			String query=a.nextLine();
			if(query.equals("exit")) {System.out.println("�����մϴ�...");break;}
			StringTokenizer st=new StringTokenizer(query," ");
			
			int n=st.countTokens();
			System.out.println("���� ������ "+n);
		}
		/*----------------------------------------
		MyPoint b = new MyPoint(3,20);
		System.out.println(b);*/
	}
}
