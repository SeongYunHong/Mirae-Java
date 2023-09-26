package mirae4.com;

import java.util.*;

//student21
//int rollno,String name, int age
//ArrayList에 3인분 입력하고 출력(출력 방식은 for, for:, iterator, for-each)

class Student21{
	int rollno;
	String name;
	int age;
	Student21(){}
	Student21(int rollno,String name,int age){super();this.rollno=rollno;this.name=name;this.age=age;}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "번호 : "+rollno+" 이름 : "+name+" 나이 : "+age;
	}
}
public class e_04_Student_ArrayList {

	public static void main(String[] args) {
		ArrayList<Student21>std=new ArrayList<Student21>();

		Student21 std1=new Student21(1,"홍성윤",25);
		std.add(std1);
		
		Student21 std2=new Student21(2,"김",40);
		std.add(std2);
		
		Student21 std3=new Student21(3,"최",23);
		std.add(std3);
//--------------------	
		for(int i=0;i<std.size();i++) {
			System.out.println(std.get(i));
		}
//--------------------		
		for(Student21 std11:std) {
			System.out.println(std);
		}
//--------------------		
		Iterator<Student21> itr=std.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//--------------------
		std.forEach(a1->{System.out.println(a1.rollno+" "+a1.name+" "+a1.age);});
//--------------------
		std.forEach(f -> System.out.print(f));
		itr = std.iterator();  
		int totalage =0;

		while (itr.hasNext()) {
			Student21 st = (Student21) itr.next();
			totalage += st.age;
		}
		System.out.println("나이의 총합계:" + totalage);
		
	}
}
