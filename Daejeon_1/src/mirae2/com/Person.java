package mirae2.com;

public class Person {
	public String name;
	public int age;

	public Person(String name,int age){this.name=name;this.age=age;} //this는 instance하고 나서의 자기 자신이다.

	public void setName(String name) {						//이름을 설정해주는 함수 //void : 리턴을 하지 않는 경우
		this.name=name;}  
	public String getName() {return name;} 					//이름을 가져가는 함수
	
	public void setAge(int age) {					//나이를 설정해주는 함수
		if(age>200) age=200;
		this.age=age;}  									
	public int getAge() {return age;} 				//나이를 가져가는 함수
	
	public void print() {System.out.println("이름은 "+this.name+" 나이는 "+this.age);}
}