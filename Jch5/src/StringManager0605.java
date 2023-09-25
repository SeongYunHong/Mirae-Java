import java.util.Scanner;

import ch5.StringStack;

interface StackInterface{
	int length();
	String pop();
	boolean push(String ob);
}
class StringStack implements StackInterface{
	String []sv; //데이터 저장하는 배열
	int index;
	
	StringStack(int n){sv=new String[n];this.index=0;}
	
	public int length() {return index;}
	public String pop()	{
		if(index==0) return null; //스택이 다 빠졌을 때
		index--;
		return sv[index];}
	public boolean push(String ob) {
		if(index==sv.length) //스택이 꽉 찼을 때
			return false;
		sv[index++]=ob;	return true;}
}
public class StringManager0605 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		StringStack s= new StringStack(10);
		
		System.out.print(">>");
		for(int i=0;i<5;i++) {
			String n=a.next();
			s.push(n);
		}
		int c=s.length();
		for(int i=0;i<5;i++) {
			System.out.print(s.pop()+" ");
		}
	}
}