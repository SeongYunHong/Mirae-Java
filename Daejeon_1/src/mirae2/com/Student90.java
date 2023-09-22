package mirae2.com;
import java.util.Scanner;
public class Student90 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student91 std= new Student91();
		Student91[]per = new Student91[3];
		while(true) {
			System.out.println("입력(1), 출력(2), 수정(3) 중 선택 | 종료(9)");
			int sel=std.getUser();
//종료(9)을 눌렀을 시	
			if(sel == 9) {
				System.out.println("종료되었습니다."); 	break;
			}
			
//입력(1)을 눌렀을 시
			if(sel==1) {
				for(int i=0;i<per.length;i++) {
					String name=input.nextLine();
					int kor=Integer.parseInt(input.nextLine());
					int eng=Integer.parseInt(input.nextLine());
					int mat=Integer.parseInt(input.nextLine());
					per[i]=new Student91((i+1),name,kor,eng,mat);
				}							
			}
//출력(2)을 눌렀을 시
			else if(sel==2) {
				for(int i=0;i<per.length;i++) {
					per[i].getNKEM();
				}
			}			
//수정(3)을 눌렀을 시			
			else if(sel==3) {
				for(int i=0;i<per.length;i++) {
					per[i].getNKEM();
				}
				System.out.print("수정 원하시는 번호를 입력하시오 : ");
				int number = input.nextInt();
//수정 번호 비교
				for(int i=0;i<per.length;i++) {
					if(i==number-1) {
						System.out.println((i+1)+"번 수정 시작");
						input.nextLine();
						String name=input.nextLine();
						int kor=Integer.parseInt(input.nextLine());
						int eng=Integer.parseInt(input.nextLine());
						int mat=Integer.parseInt(input.nextLine());		
						per[i].update(name, kor, eng, mat);
					}	
				}
				
			}	
		}
	}
}