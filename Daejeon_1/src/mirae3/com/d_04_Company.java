package mirae3.com;

//사원 관리 Employee(이름name, 나이age, 성별sex, 주소addr, 급여salary)
//사원 클래스를 상속받은 Manger 클래스
//사원 클래스에 부서명 추가(department)
class Employee {
	public String name, sex, addr;
	public int age;
	public long salary;

	public Employee() {
	}

	public Employee(String name, int age, String sex, String addr, long salary) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.addr = addr;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println(
				"이름 : " + name + "/나이 : " + age + "/성별 : " + sex + "/주소 : " + addr + "/급여 : " + salary + "입니다.");
	}
}

class Manager extends Employee {
	public String department;
	public Employee sub[]; // 관리하는 직원

	public Manager() {
	}

	public Manager(String name, int age, String sex, String addr, long salary, String department) {
		super(name, age, sex, addr, salary);
		this.department = department;
		this.sub = new Employee[2];
	}

	// this.name=name;this.age=age;this.sex=sex;this.addr=addr;this.salary=salary;this.department=department;this.sub=new
	// Employee[2];}
	public void displayEmployee() {
		for (int i = 0; i < sub.length; i++) {
			sub[i].display();
		}
	}

	public void display() {
		System.out.println("담당 부서 : " + this.department);
		System.out.println("부하 직원의 수 : " + this.sub.length + "명");
		System.out.println("부서장");
		super.display(); // 자기 자신을 찍고
		System.out.println("부서 직원"); // 부하직원 출력
		displayEmployee();
	}
}

public class d_04_Company {

	public static void main(String[] args) {
		Employee el1 = new Employee("대한이", 23, "남", "서울시 강북구", 1500000);
		Employee el2 = new Employee("민국이", 35, "남", "대전시 쌍용동", 2500000);
		Employee el4 = new Employee("희망이", 23, "남", "서울시 강북구", 1500000);
		Employee el5 = new Employee("하면됨", 35, "남", "대전시 쌍용동", 2500000);

		Manager[] co = new Manager[2];
		Manager ma1 = new Manager("김관리", 40, "여", "서울시 강남구", 5000000, "개발부");
		ma1.sub[0] = el1;
		ma1.sub[1] = el2;
		Manager ma2 = new Manager("이소장", 40, "여", "서울시 영등포", 5000000, "연구부");
		ma2.sub[0] = el4;
		ma2.sub[1	] = el5;
		co[0] = ma1;
		co[1] = ma2;

		System.out.println("전체 직원 현황");
		for (int i = 0; i < co.length; i++) {
			co[i].display();
		}
	}

}
