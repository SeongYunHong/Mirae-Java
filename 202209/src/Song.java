
public class Song {
	String title="";
	Song(String t){this.title=t;}
	public String getTitle() {
		return this.title;
	}
	public static void main(String[] args) {
		Song mySong=new Song("Nessun Dorma");
		Song yourSong=new Song("���ִ� �� �� �̷��");
		System.out.println("�� �뷡�� "+mySong.getTitle());
		System.out.println("�� �뷡�� "+yourSong.getTitle());

	}

}
