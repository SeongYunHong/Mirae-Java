
public class Song1 {
	String title;
	Song1(){}
	Song1(String t){this.title=t;}
	String getTitle() {
		return this.title;
	}
	public static void main(String[] args) {
		Song1 mySong = new Song1("Nessun Dorma");
		Song1 yourSong = new Song1("���ִ� �� �� �̷��");
		System.out.println("�� �뷡�� "+mySong.getTitle());
		System.out.println("�� �뷡�� "+yourSong.getTitle());
	}

}
