package ch5;

public abstract class Shape12 {
	private Shape12 next;
	public Shape12() {next=null;}
	public void setNext(Shape12 o) {next=o;}
	public Shape12 getNext() {return next;}
	public abstract void draw();
}
