
public class Book {
	String title;
	String author;
	
	Book(){this.title="�������";this.author="���ڹ̻�";}
	Book(String t){
		this();
		//this.title=t;this.author="���ڹ̻�";
		}
	Book(String t,String a){this.title=t;this.author=a;}
	
	void show() {System.out.println(this.title+"/"+this.author);}
	void show2(Book a) {System.out.println(a.title+"/"+a.author);}
	
	public static void main(String[] args) {
		Book javabook = new Book("�ڹ�","��");
		Book pythonbook = new Book("python");
		Book Cbook = new Book("C���","ȫ�浿");
		
		javabook.show();
		pythonbook.show();
		Cbook.show();
		Cbook.show2(javabook);
	}

}
