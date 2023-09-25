import java.util.Scanner;

public class Student91 {
	Scanner input;
	String temp="";
	String name;
	int user=0;
	int kor,eng,mat,sum,avg;
	int num;
	Student91(){}
	Student91(int num,String name,int kor,int eng,int mat){this.num=num;this.name=name;this.kor=kor;this.eng=eng;this.mat=mat;sumCalc();avgCalc();}
	
//------�Է� �Լ�
	public int getUser() {
		input = new Scanner(System.in);
		temp = input.nextLine();
//------���� ����
		if(temp==null || temp.equals("9")) {
			return 9;
		}		
		user = Integer.parseInt(temp);
		user = user%6;
		return user;
	}
//------��� �Լ�
	public void print() {
		System.out.printf("�̸� : %s/ ���� ���� :  %3d��/ ���� ���� : %3d��/ ���� ���� : %3d��/ ���� : %3d��/ ��� : %3d\n",name,kor,eng,mat,sum,avg);
	}

//------���� �Լ�
	public void update(String name,int kor,int eng, int mat) {
		this.name=name;this.kor=kor;this.eng=eng;this.mat=mat;sumCalc();avgCalc();
	}
//------�հ� ��� �Լ�
	public void sumCalc(){
		sum=kor+eng+mat;
	}
//------��� ��� �Լ�
	public void avgCalc() {
		avg=sum/3;
	}
//------������ ������ ���� �������� ����ϴ� �Լ�
	//����
	public void setKorean(int korean) {	
		if(kor>100) kor=100;
		this.kor=korean;
		sumCalc();avgCalc();}  
	public int getKorean() {return kor;} 					
	//����
	public void setEnglish(int english) {
		if(eng>100) eng=100;
		this.eng=english;
		sumCalc();avgCalc();}  
	public int getEnglish() {return eng;} 					
	//����
	public void setMath(int math) {	
		if(mat>100) mat=100;
		this.mat=math;
		sumCalc();avgCalc();}  
	public int getMath() {return mat;}
//------�̸� �������� �Լ�	
	public String getName() {return name;}
//------��� �������� �Լ�	
	public int getAvg() {return avg;}
}