
public class Song {
	String title = " ";
	Song(String t){this.title=t;}
	
	//String getTitle(){return title;}
	void getTitle() {System.out.print(title);}
	public static void main(String[] args) {
		Song mySong = new Song("let it go");
		mySong.getTitle();
	}
}
