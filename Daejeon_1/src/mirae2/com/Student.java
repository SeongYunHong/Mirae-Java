package mirae2.com;

public class Student {
	String name;
	int korean,english,math,total,avg;
	
	Student(String name,int korean,int english,int math){this.name=name;this.korean=korean;this.english=english;this.math=math;totCalc();avrCalc();}
	
	Student(String name){this.name=name;totCalc();avrCalc();}
	Student(String name, int korean, int math){this.name=name;this.korean=korean;this.math=math;totCalc();avrCalc();}	
	
	public void setName(String name) {	
		this.name=name;
		totCalc();avrCalc();}  
	public String getName() {return name;}
	
	public void setKorean(int korean) {						
		this.korean=korean;
		totCalc();avrCalc();}  
	public int getKorean() {return korean;} 					
	
	public void setEnglish(int english) {						
		this.english=english;
		totCalc();avrCalc();}  
	public int getEnglish() {return english;} 					
	
	public void setMath(int math) {						
		this.math=math;
		totCalc();avrCalc();}  
	public int getMath() {return math;}	
	
	public void totCalc(){
		total=korean+english+math;
	}
	public void avrCalc() {
		avg=total/3;
	}
	
	public void print() {System.out.println("이름은 "+this.name+" 국어 점수는 "+this.korean+" 점/ 영어 점수는 "+this.english+"점/ 수학 점수는 "+this.math+" 점입니다. 총점 : "+total+"/ 평균 : "+avg);}
}
