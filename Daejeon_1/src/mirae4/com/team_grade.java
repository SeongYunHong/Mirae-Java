package mirae4.com;

import java.util.*;

//문제 : 성적 클래스 생성, 번호, 이름, 국어, 수학, 영어, 총점, 평균
//ArrayList를 자료구조로 해서 입력
//CRUD 함수를 만들어서 데이터를 관리하도록 메뉴화하시오
class Grade{
	int num,kor,mat,eng,sum,avg;
	String name;
	Grade(){}
	Grade(int num,String name,int kor,int mat,int eng){this.num=num;this.name=name;this.kor=kor;this.mat=mat;this.eng=eng;calcSum();calcAvg();}
	public void calcSum() {
		sum+=kor+mat+eng;
	}
	public void calcAvg() {
		avg = sum/3;
	}
	public String toString() {
		return "번호 : "+num+" 이름 : "+name+" 국어 : "+kor+" 수학 : "+mat+" 영어 : "+eng+" 합계 : "+sum+" 평균 : "+avg;
	}
}
public class team_grade {
	public static void Create(ArrayList<Grade> grd) {
		Scanner input = new Scanner(System.in);
		System.out.println("입력 메뉴가 선택되었습니다...");
		for(int i=0;i<3;i++) {
			int num=Integer.parseInt(input.nextLine());
			String name=input.nextLine();
			int kor=Integer.parseInt(input.nextLine());
			int mat=Integer.parseInt(input.nextLine());
			int eng=Integer.parseInt(input.nextLine());
			
			Grade gi = new Grade(num,name,kor,mat,eng);
			grd.add(gi);
		}
	}
	public static void Read(ArrayList<Grade> grd) {
		System.out.println("출력 메뉴가 선택되었습니다...");
		ListIterator<Grade> iter=grd.listIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	public static void Update(ArrayList<Grade> grd) {
		Scanner input = new Scanner(System.in);
		System.out.println("수정 메뉴가 선택되었습니다...");
		input.nextLine();
		System.out.print("수정할 인덱스 번호를 입력하시오 : ");
		int index=(Integer.parseInt(input.nextLine()));
		
		int num=Integer.parseInt(input.nextLine());
		String name=input.nextLine();
		int kor=Integer.parseInt(input.nextLine());
		int mat=Integer.parseInt(input.nextLine());
		int eng=Integer.parseInt(input.nextLine());
		
		grd.set(index+1,new Grade(num,name,kor,mat,eng));
	}
	public static void Remove(ArrayList<Grade> grd) {
		Scanner input = new Scanner(System.in);
		System.out.println("삭제 메뉴가 선택되었습니다...");
		System.out.print("삭제할 인덱스 번호를 입력하시오 : ");
		int index=Integer.parseInt(input.nextLine());
		grd.remove(index+1);
	}
	public static void Menu() {
		Scanner input = new Scanner(System.in);
		ArrayList<Grade> grd = new ArrayList<Grade>();
		while(true) {
			System.out.println("입력[1], 출력[2], 수정[3] 삭제[4] 중 선택 | 종료[9]");
			int sel=Integer.parseInt(input.nextLine());
//---------------종료[9]
			if(sel==9) {
				System.out.println("종료합니다...");break;
			}
//---------------입력[1]		
			if(sel==1) {
				team_grade.Create(grd);
			}
//---------------출력[2]
			if(sel==2) {
				team_grade.Read(grd);
			}
//---------------수정[3]
			if(sel==3) {
				team_grade.Update(grd);
			}
//---------------삭제[4]
			if(sel==4) {
				team_grade.Remove(grd);
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		team_grade.Menu();		
	}
}