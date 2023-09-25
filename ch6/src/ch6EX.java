import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

class Point1{
	int x,y;
	public int width;
	public int height;
	Point1(int x, int y){this.x=x;this.y=y;}
	public String toString() {
		return "Point1("+x+","+y+")";
	}
	//public int hashCode() {return 1123;}
	public boolean equals(Point1 p) {
		if(this.x==p.x && this.y==p.y) return true;
		else return false;
	}
}
class Rect1130{
	int width,height;
	Rect1130(int w, int h){this.width=w;this.height=h;}
	public boolean equals(Point1 p) {
		//if(this.width==p.width && this.height==p.height) return true;
		//else return false;
		if(this.width*this.height==p.width*p.height) return true;
		else return false;
	}
}
public class ch6EX {
	public static void main(String[] args) {
		
		/*----------------------------------------
		System.out.println((int)(Math.random()*10)+1);//(0~9)+1
		
		Random r = new Random();
		System.out.println(r.nextInt(10)+1);//(0~9)+1
		
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.abs(-3.14));
		System.out.println(Math.PI);
		System.out.println(Math.round(Math.PI));
		System.out.println(Math.PI+0.5);
		System.out.println(Math.exp(2));
		/*----------------------------------------
		StringBuffer sb=new StringBuffer();
		
		while(true) {
			System.out.println("속성 입력 : ");
			String s=a.next();
			if(s.equals("exit"))break;
			
			sb.append(s);sb.append(" : ");
			
			System.out.println("속성값 입력 : ");
			System.out.print("st-index : "); int x = a.nextInt();
			System.out.print("ed-index : "); int y = a.nextInt();
			System.out.print("문자열 : "); String k=a.next();
			sb.replace(x,y-1,k);
			System.out.println("문자열 확인 >> \n"+sb);
			sb.append("\n");			
		}
		
		String query=sb.toString();
		StringTokenizer st=new StringTokenizer(query,"\n");
		
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			if(token.contains("나이"))
				System.out.println("나이"+token.substring(5)+" 세");
		}
		/*----------------------------------------
		String query="name=kitae$addr=seoul$age=21";
		StringTokenizer st=new StringTokenizer(query,"$");
		
		int n=st.countTokens();
		System.out.println("토큰 개수="+n);
		
		while(st.hasMoreTokens()) {
			String token=st.nextToken(); // 토큰 얻기
			System.out.println(token); //토큰 출력
		}
		/*----------------------------------------
		StringBuffer sb=new StringBuffer("This"); //Buffer-임시 기억공간
		
		sb.append(" is pencil"); //append-추가
		System.out.println(sb);
		sb.insert(7," my");//insert-n번째에 삽입
		System.out.println(sb);
		sb.replace(8,10,"your");//replace-n에서m까지를 교체
		System.out.println(sb);
		
		String s=a.next();
		sb.append(s);
		System.out.println("문자열 확인 >> "+sb);
		System.out.println("수정할 문자열이 있을 경우 index와 문자열 입력 : ");
		System.out.print("st-index : "); int x = a.nextInt();
		System.out.print("ed-index : "); int y = a.nextInt();
		System.out.print("문자열 : "); String k=a.next();
		sb.replace(x,y-1,k);
		System.out.println("문자열 확인 >> "+sb);
		/*----------------------------------------
		String str="java   ";
		char []c= {'a','b','c'};
		String zz=new String("홍길동");
		String xx=new String("  java JAVA sss   ");

		//System.out.println(zz.codePointAt(1));
		//System.out.println(xx.compareTo(str)); //숫자 간격 비교
		//System.out.println(str.concat(xx)); //이어쓰기
		//System.out.println(str.contains(xx)); //포함 여부
		//System.out.println(str.length()); //길이
		//System.out.println(str.replace(str,xx));
		
		String []s=xx.split(" ");
		System.out.println(s[0]+"/"+s[1]+"/"+s[2]);
		System.out.println(xx.substring(5)); //
		System.out.println(xx.toLowerCase()+"/"+zz.toUpperCase());
		System.out.println(xx.trim()); //앞뒤 공백 제거
		System.out.println("zzz");
		System.out.println(str.trim());
		System.out.println("zzz");
		/*----------------------------------------
		Integer i = new Integer(108);
		Character c= new Character('2');
		
		System.out.println(Integer.toBinaryString(i)); //2진수로
		System.out.println(Integer.toOctalString(i)); //8진수로
		System.out.println(Integer.toHexString(i)); //16진수로
		System.out.println(Integer.toString(i));
		
		System.out.println(Integer.parseInt("104",8)+Integer.parseInt("104",16));
		//System.out.println("104"+"14");
		System.out.println(Integer.reverse(i));//
		//System.out.println(Character.isAlphabetic(c)); //알파벳인지 아닌지
		//System.out.println(Character.isDigit(c)); //숫자인지 아닌지
		 */
		/*----------------------------------------
		Point1 p=new Point1(2,3);
		Point1 q=new Point1(20,30);
		System.out.println(p.equals(q));
		
		Rect1130 r1=new Rect1130(10,20);
		Rect1130 r2=new Rect1130(20,10);
		System.out.println(r1.equals(r2));
		//System.out.println(p.getClass().getName());
		//System.out.println(p.hashCode());
		//System.out.println(p.toString());
		
		//String s=p+"점";
		//System.out.println(s);*/
	}

}
