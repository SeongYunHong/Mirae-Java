abstract class Person{
	private String name;
	private int age;
	public abstract void show();
	public String getName(){return this.name;}
	public int getAge(){return this.age;}
	Person(String name,int age){this.name=name;this.age=age;}
}
class Student extends Person{
	int SNum;
	Student(String name,int age,int SNum){super(name,age);this.SNum=SNum;}
	public String getName() {return super.getName();}
	public int getAge(){return super.getAge();}
	public void show() {System.out.println("학생[이름 : "+getName()+", 나이 : "+getAge()+", 학번 : "+SNum+"]");}
}
class ForeignStudent extends Student{
	String C;
	ForeignStudent(String name,int age,int SNum,String C){super(name,age,SNum);this.C=C;}
	public String getName() {return super.getName();}
	public int getAge(){return super.getAge();}
	public void show() {System.out.println("외국학생[이름 : "+getName()+", 나이 : "+getAge()+", 학번 : "+SNum+", 국적 : "+C+"]");}
}
public class PSF {

	public static void main(String[] args) {
		Student s=new Student("황진이",23,100);
		ForeignStudent f=new ForeignStudent("Amy",30,200,"U.S.A");
		s.show();
		f.show();
	}

}
