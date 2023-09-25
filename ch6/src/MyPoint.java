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
		
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
		String text=a.nextLine();
		
		System.out.println("<Enter>를 입력하면 문자열이 한 글자씩 회전합니다.");
		
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
				System.out.println("종료합니다...");
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
		System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
		int m=a.nextInt();
		if(m==4) {System.out.print("종료합니다...");break;}
		int n=(int)(Math.random()*3)+1;
		if(m==1)
			sb.append("사용자 가위 : ");
		else if(m==2)
			sb.append("사용자 바위 : ");
		else if(m==3)
			sb.append("사용자 보 : ");
		
		if(n==1)
			sb.append("컴퓨터 가위");
		else if(n==2)
			sb.append("컴퓨터 바위");
		else if(n==3)
			sb.append("컴퓨터 보");
		System.out.println(sb);
		
		switch((m-n+2)/3) {
		case 0:System.out.println("사용자가 이겼습니다."); break;
		case 1:System.out.println("사용자가 졌습니다.");break;
		case 2:System.out.println("비겼습니다.");
		}
	}
		/*----------------------------------------
		String query=a.nextLine();
		StringTokenizer st=new StringTokenizer(query,"+");
		int sum=0,i=0;
		int n=st.countTokens();
		int []m=new int [n];
		while(st.hasMoreTokens()) {
			String token=st.nextToken().trim(); // 토큰 얻기
			m[i++]=Integer.parseInt(token);
		}
		for(i=0;i<n;i++)
			sum+=m[i];
		System.out.print("합은 "+sum);
		/*----------------------------------------
		int m=Integer.parseInt("2");
		int n=Integer.parseInt("5");
		System.out.print(m+"+"+n+"\n합은 "+sum);
		int []m=new int [3];
		while(true) {
			for(int i=0;i<3;i++){
				m[i]=(int)(Math.random()*3)+1;
				System.out.println(m[i]+"\t");
			}
			if(m[0]==m[1]&&m[0]==m[2]) {System.out.print("성공");break;}
		}
		/*----------------------------------------
		while(true) {
			String query=a.nextLine();
			if(query.equals("exit")) {System.out.println("종료합니다...");break;}
			StringTokenizer st=new StringTokenizer(query," ");
			
			int n=st.countTokens();
			System.out.println("어절 개수는 "+n);
		}
		/*----------------------------------------
		MyPoint b = new MyPoint(3,20);
		System.out.println(b);*/
	}
}
