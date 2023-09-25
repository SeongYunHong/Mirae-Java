class Employee{
	String name;
	double salary;
	
	Employee(){this.salary=2600;}
	Employee(String n,double s){this.name=n;this.salary=s;}
	void raiseSalary() {this.salary*=1.3;}
}
class Manager extends Employee{
	double bonus;
	Manager(){super();this.bonus=100;}
	Manager(String n,double s, double b){super(n,s);this.bonus=b;}
	void raiseSalary() {this.salary*=1.2;}
}
public class MngTst extends Manager{
	double stockOpt;
	MngTst(String n,double s,double b, double so){super(n,s,b);this.stockOpt=so;}
	void raiseSalary() {this.salary*=1.1;}
	public static void main(String[] args) {
		Employee emp=new Employee("홍길동",3000);
		Manager mng=new Manager("길동이",3000,200);
		MngTst mts=new MngTst("동이",3000,200,100);
		
		emp.raiseSalary();mng.raiseSalary();mts.raiseSalary();
		
		System.out.println(emp.name+"/"+emp.salary);
		System.out.println(mng.name+"/"+mng.salary+"/"+mng.bonus);
		System.out.println(mts.name+"/"+mts.salary+"/"+mts.bonus+"/"+mts.stockOpt);
	}
}