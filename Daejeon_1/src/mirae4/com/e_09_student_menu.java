package mirae4.com;
//등수 내는 함수 생성(총점 기준) 등수 변수 생성
//국영수 점수 수정 추가
import java.util.*;

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
		average = Math.round(total/3.0*100)/100;
	}
	public String toString() { //object(최상위 부모) : 자동 출력
		return no+"\t"+name+" "+kor+"\t "+mat+"\t "+eng+"\t "+total+"\t "+average;
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
//	static Scanner input = new Scanner(System.in); //외부 접근 안함
//	public static void inputinfo(List<Student>list) {
//		//데이터 입력 ->Student class 작성 -> 매개변수로 넘어오는 자료구조에 전달
//		Student st = new Student();
//		System.out.print("번호를 입력하시오 : ");
//		st.no = Integer.parseInt(input.nextLine());
//		
//		System.out.print("이름을 입력하시오 : ");
//		st.name = input.nextLine();
//		boolean re=false;
//		while(!re) { //숫자가 아닌경우와 범위 내 숫자가 아닌경우 필터링
//			re=true;
//			do {
//				try {
//					System.out.println("국어 점수를 입력하시오 :");
//					st.setKor(Integer.parseInt(input.nextLine()));
//				}catch(NumberFormatException e) {
//					System.out.println("숫자로 입력해주세요.");
//				}
//			}while(st.kor < 0 || st.kor >100 );
//		}
//		System.out.println("수학 점수를 입력하시오 :");
//		st.setMat(Integer.parseInt(input.nextLine()));
//			
//		System.out.println("영어 점수를 입력하시오 :");
//		st.setEng(Integer.parseInt(input.nextLine())); 
//		
//		list.add(st);
//		System.out.println("데이터가 입력되었습니다.");
//	}
//	public static void display(List<Student>list) {
//		System.out.println("*** 입력 데이터 출력 ***");
//		System.out.println("번호	 이름	 국어	 수학	 영어	 총점	 평균");
//		Iterator<Student>itr = list.iterator();
//		while(itr.hasNext()) {
//			Student st = itr.next();
//			System.out.println(st); //toString 자동으로 출력
//		}
//		
//	}
//	public static void sort(List<Student>list) { //번호 정렬
//		Collections.sort(list, list.get(0).stdcompare());
//		display(list);
//	}
//	public static void sortTier(List<Student>list) { //총점 정렬
//		Collections.sort(list, list.get(0).stdTcompare());
//	}
//	public static void ranking(List<Student>list) {
//		sortTier(list);
//		Iterator<Student>itr = list.iterator();
//		int i=0;
//		System.out.println("번호	 이름	 국어	 수학	 영어	 총점	 평균	 석차");
//		while(itr.hasNext()) {
//			Student stu = (Student)itr.next();
//			i+=1;
//			stu.ranking = i;
//			System.out.println(stu.getNo()+"\t "+stu.getName()+"\t "+stu.getKor()+"\t "+stu.getMat()+"\t "+stu.getEng()+"\t "+stu.getTotal()+"\t "+stu.getAverage()+"\t "+stu.getRanking());
//		}
//		//System.out.println(list);
//		//display(list);
//	}
//	public static int search(List<Student>list) {
//		System.out.print("검색할 번호를 입력하시오 : ");
//		int no = Integer.parseInt(input.nextLine());
//		int index = Collections.binarySearch(list, new Student(no,null,0,0,0),list.get(0).stdcompare());
//		System.out.println("이진 검색으로 찾은 인덱스 : "+index);
//		if(index !=-1) {
//		System.out.println("검색된 데이터\n"+list.get(index));
//		//검색뿐만 아니라 수정할때도 사용
//		return index;		
//		}
//		else {
//			System.out.println("검색한 데이터가 없습니다.");
//			return -1;
//		}
//	}
//	public static void edit(List<Student>list) { //이름으로 수정
//		System.out.print("** 수정하고자하는 이름을 입력하시오 : ");
//		String inputValue = input.nextLine();
//		Iterator<Student>itr = list.iterator(); 
//		//Iterator : for문 index, 확장 for문 사이에 등장한 문법
//		//처음 이터레이터를 얻으면 데이터의 첫번째 데이터를 가리키게 됨
//		// for문은 데이터를 index로 다루는 것이고 iterator나 확장 for문은 데이터를 직접 가리켜서 저장, index 에러 없음
//		while(itr.hasNext()) {
//			Student stu = (Student)itr.next();
//			if(inputValue.equals(stu.name)) {	
//				System.out.print("수정할 항목을 입력하시오 : ");
//				String user = input.nextLine();
//				if(user.equals("이름")) {
//					System.out.print("변경할 이름을 입력하시오 : ");
//					String changenvalue = input.nextLine();
//					stu.setName(changenvalue);
//				}
//				else if(user.equals("국어")) {
//					System.out.print("변경할 국어 점수를 입력하시오 : ");
//					int changekvalue = Integer.parseInt(input.nextLine());
//					stu.setKor(changekvalue);
//				}
//				else if(user.equals("수학")) {
//					System.out.print("변경할 수학 점수를 입력하시오 : ");
//					int changemvalue = Integer.parseInt(input.nextLine());
//					stu.setMat(changemvalue);
//				}
//				else if(user.equals("영어")) {
//					System.out.print("변경할 영어 점수를 입력하시오 : ");
//					int changeevalue = Integer.parseInt(input.nextLine());
//					stu.setEng(changeevalue);
//				}
//			}
//		}
//		display(list);
//		System.out.println(" ** 수정 완료 ** ");
//	}
//	public static void delete(List<Student>list) {
//		int index = search(list);
//		if(index != -1) {
//			list.remove(index);
//			System.out.println("데이터가 삭제되었습니다.");
//		}
//		else {
//			System.out.println("검색한 데이터가 없습니다.");
//		}
//	}
//	//프로그램을 일반화
//	public static int windowfor(List<Student> list) { //메뉴는 무한루프 //ArrayList가 아닌 List로 받은 이유 : 부모로 받아서 LinkedList도 사용 가능하게 하기 위해
//		while(true) {
//			System.out.println("==================성적관리프로그램==================");
//			System.out.println("---------------------------------------------------------------------------");
//			System.out.println("1. 입력 2. 출력 3. 정렬 4. 조회 5. 편집 6. 삭제 7. 석차 9. 종료");
//			System.out.println("메뉴를 선택하시오");
//			int ch = 0;
//			try {
//				ch = Integer.parseInt(input.nextLine()); //입력할때 문자로 받으니까 -> 꼬이지 않도록 문자를 변환
//			}catch(NumberFormatException e){
//				
//			}
//			switch(ch) {
//				case 1: inputinfo(list); break;
//				case 2: display(list);   break;
//				case 3: sort(list);       break;
//				case 4: search(list);    break;
//				case 5: edit(list);       break;
//				case 6: delete(list);    break;
//				case 7: ranking(list);  break;
//				case 9: 
//					System.out.println("프로그램을 종료합니다.");
//					input.close(); //윈도우 자원을 사용하는 객체는 반드시 종료시킵니다.(네트워크, 데이터베이스, 입출력 객체, 화일 객체)
//					return 0;
//				default : 
//					System.out.println(" 잘못 선택하였습니다.");
//					break;
//			
//			}
//		}
//	}
	public static void main(String[] args) {
		ArrayList<Student> stud= new ArrayList<Student>();
		//ArrayList<Menu> menu = new ArrayList<Menu>();
		Menu menu = new Menu();
		menu.windowfor(stud);
	}
}