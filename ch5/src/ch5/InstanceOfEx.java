package ch5;

class Person22 { }
class Student22 extends Person22 { }
class Researcher22 extends Person22 { }
class Professor22 extends Researcher22 { }

public class InstanceOfEx {
	static void print(Person22 p) {
		if(p instanceof Person22) 
			System.out.print("Person ");
		if(p instanceof Student22) 
			System.out.print("Student ");
		if(p instanceof Researcher22) 
			System.out.print("Researcher ");
		if(p instanceof Professor22) 
			System.out.print("Professor ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student() -> "); 		print(new Student22());
		System.out.print("new Researcher() -> "); print(new Researcher22());
		System.out.print("new Professor() -> "); 	print(new Professor22());
	}
}
