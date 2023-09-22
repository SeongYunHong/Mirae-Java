package mirae2.com;
//하나의 파일에는 하나의 클레스만 존재해야함
//클레스 이름하고 파일이름이 동일해야함
//public이 붙지 않은 클레스는 이 파일 내에서만 사용가능
/*
class Person { //private
	//클레스의 구성요소 : 멤버 변수, 멤버 함수, 생성자(초기화)
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
*/
//클레스 : 사용자 정의 데이터타입
//함수는 한번만 정의되고 데이터는 인스턴스할 때마다 공간을 확보하게 됨

//호출 추상화
//기능을 검색하여 사용(이미 만들어져있음)
public class c_01_class {

	public static void main(String[] args) {
		/*
		Person pe1=new Person("대한이",21);
		Person pe2=new Person("민국이",19);
		Person pe3=new Person("만세야",18);
		
		pe1.print();
		pe2.print();
		pe3.print();
		*/
//-----------------------------------------------------------		
		/*
		Person [] pe_dim=new Person[4];
		pe_dim[0]=new Person("대한이",21);
		pe_dim[1]=new Person("민국이",19);
		pe_dim[2]=new Person("만세야",18);
		pe_dim[3]=new Person("김종호",40);
		for(Person pe : pe_dim)
			pe.print();
		*/
//-----------------------------------------------------------	
		String st_arr[]= {"대한이","민국이","만세"};
		int age_arr[]= {10,11,12};
		
		Person []pe_arr=new Person[st_arr.length];
		for(int i=0;i<st_arr.length;i++) {
			pe_arr[i]=new Person(st_arr[i], age_arr[i]);
		}
		for(Person pe:pe_arr)
			pe.print();
		
	}

}
