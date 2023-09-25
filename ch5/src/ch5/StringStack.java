package ch5;
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