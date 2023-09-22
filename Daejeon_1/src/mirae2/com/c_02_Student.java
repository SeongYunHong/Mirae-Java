package mirae2.com;

public class c_02_Student {

	public static void main(String[] args) {
		//클레스에서는 초기화하지 않으면 자동으로 0으로 초기화
		Student st1=new Student("대한이",100,100,90);
		Student st2=new Student("민국이",90,90); //88
		Student st3=new Student("만세"); //99,88,77
		
		st2.setEnglish(88); //st2.eng=88;
		st3.setKorean(99); st3.setEnglish(88); st3.setMath(77);
		st1.setKorean(80); System.out.println(st1.getMath());
		st1.print();
		st2.print();
		st3.print();
	}
}