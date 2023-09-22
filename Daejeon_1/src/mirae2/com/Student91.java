package mirae2.com;

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
	//Student91(String name,int kor,int eng,int mat,int sum,int avg){this.name=name;this.kor=kor;this.eng=eng;this.mat=mat;this.sum=sum;this.avg=avg;}
	
	public int getUser() {
		
//------입력 관리	
		input = new Scanner(System.in);
		temp = input.nextLine();
		if(temp==null || temp.equals("9")) {
			return 9;
		}		
		user = Integer.parseInt(temp);
		user = user%4;
		return user;
	}
	public void update(String name,int kor,int eng, int mat) {
		this.name=name;this.kor=kor;this.eng=eng;this.mat=mat;sumCalc();avgCalc();
	}
//	public void setNKEM(int num,String name,int kor,int eng, int mat) {	
//		this.num=num;this.name=name;this.kor=kor;this.eng=eng;this.mat=mat;sumCalc();avgCalc();}  
	
	public String getNKEM() {
		String m=this.num+this.name+" / "+this.kor+" / "+this.eng+" / "+this.mat+" / "+sum+" / "+avg+"\n";
		System.out.println(m);
		return m;}
	
	public void setKorean(int korean) {						
		this.kor=korean;
		sumCalc();avgCalc();}  
	public int getKorean() {return kor;} 					
	
	public void setEnglish(int english) {						
		this.eng=english;
		sumCalc();avgCalc();}  
	public int getEnglish() {return eng;} 					
	
	public void setMath(int math) {						
		this.mat=math;
		sumCalc();avgCalc();}  
	public int getMath() {return mat;}	
	
	public void sumCalc(){
		sum=kor+eng+mat;
	}
	public void avgCalc() {
		avg=sum/3;
	}
	public void print() {
		System.out.println("이름 : "+this.name+" 국어 점수 : "+this.kor+" 점/ 영어 점수 : "+this.eng+"점/ 수학 점수 : "+this.mat+" 점/ 총점 : "+sum+"/ 평균 : "+avg);
	}
	
}
