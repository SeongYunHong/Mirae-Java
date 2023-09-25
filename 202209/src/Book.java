
public class Book {
	String title;
	String author;
	
	Book(){this.title="제목없음";this.author="작자미상";}
	Book(String t){
		this();
		//this.title=t;this.author="작자미상";
		}
	Book(String t,String a){this.title=t;this.author=a;}
	
	void show() {System.out.println(this.title+"/"+this.author);}
	void show2(Book a) {System.out.println(a.title+"/"+a.author);}
	
	public static void main(String[] args) {
		Book javabook = new Book("자바","길");
		Book pythonbook = new Book("python");
		Book Cbook = new Book("C언어","홍길동");
		
		javabook.show();
		pythonbook.show();
		Cbook.show();
		Cbook.show2(javabook);
	}

}
