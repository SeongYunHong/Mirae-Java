import java.util.Scanner;

public class Book_ {
	String title;
	String author;
	Book_(){}
	Book_(String t,String a){this.title=t;this.author=a;}
	
	void show() {System.out.println(this.title+"/"+this.author);}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Book_ []m = new Book_[2];
		for(int i=0;i<m.length;i++) {
			System.out.print("제목 : ");
			String title=a.next();
			
			System.out.print("저자 : ");
			String author=a.next();
			
			m[i]=new Book_(title,author);
			m[i].show();
		}
		
		
		
	}
}
