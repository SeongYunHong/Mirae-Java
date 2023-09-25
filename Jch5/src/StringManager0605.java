import java.util.Scanner;

import ch5.StringStack;

interface StackInterface{
	int length();
	String pop();
	boolean push(String ob);
}
class StringStack implements StackInterface{
	String []sv; //������ �����ϴ� �迭
	int index;
	
	StringStack(int n){sv=new String[n];this.index=0;}
	
	public int length() {return index;}
	public String pop()	{
		if(index==0) return null; //������ �� ������ ��
		index--;
		return sv[index];}
	public boolean push(String ob) {
		if(index==sv.length) //������ �� á�� ��
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