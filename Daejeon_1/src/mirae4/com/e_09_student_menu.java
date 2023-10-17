package mirae4.com;
import java.util.*;
//등수 내는 함수 생성(총점 기준) 등수 변수 생성
//국영수 점수 수정 추가
class Student{
	public int no,kor,mat,eng,total,ranking;
	public String name;
	public double average;
	
	public Student() {}
	public Student(int no,String name,int kor,int mat,int eng){this.no=no;this.name=name;this.kor=kor;this.mat=mat;this.eng=eng;calcTotal();calcAverage();}
	
	public Integer getNo() {return Integer.valueOf(no);}
	public void setNo(int no) {this.no=no;}
		
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
		
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;calcTotal();calcAverage();}
	
	public int getMat() {return mat;	}
	public void setMat(int mat) {this.mat = mat;calcTotal();calcAverage();}
	
	public int getEng() {return eng;}
	public void setEng(int eng) {	this.eng = eng;calcTotal();calcAverage();}
	
	public Integer getTotal() {return Integer.valueOf(total);}
	public void setTotal(int total) {this.total = total;	}
	
	public double getAverage() {return average;	}
	public void setAverage(double average) {this.average = average;}
	
	public int getRanking() {return ranking;}
	
	public void calcTotal() {
		total=kor+mat+eng;
	}
	public void calcAverage() {
		average = Math.round(total/3.0*100)*0.01;
	}
	public String toString() { //object(최상위 부모) : 자동 출력
		return no+"\t"+name+"\t"+kor+"\t "+mat+"\t "+eng+"\t "+total+"\t "+average;
	}
	public Comparator<Student> stdcompare(){
		Comparator<Student>comp = new Comparator<Student>() {
			public int compare(Student stu1, Student stu2){
				return stu1.getNo().compareTo(stu2.getNo());
			} 
		};
		return comp;
	}
	public Comparator<Student> stdTcompare(){
		Comparator<Student>comp = new Comparator<Student>() {
			public int compare(Student stu1, Student stu2){
				return stu2.getTotal().compareTo(stu1.getTotal());
			} 
		};
		return comp;
	}
}
public class e_09_student_menu {
	public static void main(String[] args) {
		ArrayList<Student> stud= new ArrayList<Student>();
		Menu menu = new Menu();
		menu.windowfor(stud);
	}
}