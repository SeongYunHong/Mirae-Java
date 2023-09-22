package mirae2.com;

public class Com {
	int r;
	Com(){}
	Com(int r){this.r=r;}
	
	public int comp() {
		return r = (int)(Math.random()*3);
	}
	
	public void printC() {
		System.out.print("컴퓨터 : "+ r);
	}
}
