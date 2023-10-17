package mirae4.com;
import java.util.*;

public class Menu{
	Menu(){}
	static Scanner input = new Scanner(System.in);
//-------입력[1]
	public void inputinfo(List<Student>list) {
		String yn="y";
//-------번호 입력 부분
		while(yn.equals("y")) {
			Student st = new Student();
			System.out.print("번호를 입력하시오 : ");
			st.no = Integer.parseInt(input.nextLine());
//-------이름 입력 부분
			System.out.print("이름을 입력하시오 : ");
			st.name = input.nextLine();
//-------국어 수학 영어 점수 입력 부분(100점 초과거나 0점 미만이면 다시 입력)
		//국어
			int cnt=0; //문자열 입력되는것 방지
			do {
				cnt=0; //cnt 값 초기화
				try {
					System.out.println("국어 점수를 입력하시오 :");
					st.setKor(Integer.parseInt(input.nextLine()));
					if(st.getKor() > 100) System.out.println("100점 이하로 다시 입력해주세요.");
					if(st.getMat() < 0) System.out.println("0점 이상로 다시 입력해주세요.");
				}catch(NumberFormatException e) {
					System.out.println("숫자로 입력해주세요."); cnt++; //문자열 입력 받으면 cnt 값 증가
				}
			}while(st.kor < 0 || st.kor >100 || cnt>0);
			//수학
			do {
				cnt=0;
				try {
					System.out.println("수학 점수를 입력하시오 :");
					st.setMat(Integer.parseInt(input.nextLine()));
					if(st.getMat() > 100) System.out.println("100점 이하로 다시 입력해주세요.");
					if(st.getMat() < 0) System.out.println("0점 이상로 다시 입력해주세요.");
				}catch(NumberFormatException e) {
					System.out.println("숫자로 입력해주세요."); cnt++;
				}
			}while(st.mat < 0 || st.mat >100 || cnt>0);
		//영어
			do {
				cnt=0;
				try {
					System.out.println("영어 점수를 입력하시오 :");
					st.setEng(Integer.parseInt(input.nextLine()));
					if(st.getEng() > 100) System.out.println("100점 이하로 다시 입력해주세요.");
				}catch(NumberFormatException e) {
					System.out.println("숫자로 입력해주세요."); cnt++;
				}
			}while(st.eng < 0 || st.eng >100 || cnt>0);
//-------리스트에 값 저장
			list.add(st);
			System.out.println("데이터가 입력되었습니다.");
			System.out.print("\n더 입력하시겠습니까? (y or n)");
			yn = input.nextLine();
			if(yn.equals("n")) break;
		}
	}
//-------출력[2]
	public void display(List<Student>list) {
		System.out.println("번호	 이름	 국어	 수학	 영어	 총점	 평균");
		Iterator<Student>itr = list.iterator();
		itr = list.iterator();
		while(itr.hasNext()) {
			Student st = itr.next();
			System.out.println(st);
		}
	}
//-------정렬[3]
	//번호 기준 정렬
	public void sort(List<Student>list) {
		Collections.sort(list, list.get(0).stdcompare());
		//list.get(0).stdcompare() : list의 0번지를 비교해서 오름차순 정렬
		display(list);
	}
//-------조회[4]
	public int search(List<Student>list) {
		//정렬 먼저 실행해야 검색 가능
		Collections.sort(list, list.get(0).stdcompare());
		//번호 입력해서 list에서 이진 검색으로 번호 비교해서 인덱스 출력
		System.out.print("검색할 번호를 입력하시오 : ");
		int no = Integer.parseInt(input.nextLine());
		//list 안에서 no랑 같은 값을 차례로 비교해서 찾음
		int index = Collections.binarySearch(list, new Student(no,null,0,0,0),list.get(0).stdcompare());
		System.out.println("이진 검색으로 찾은 인덱스 : "+index);
		if(index >-1) {
		System.out.println("검색된 데이터\n"+list.get(index));
		return index;	
		}
		else {
			System.out.println("검색한 데이터가 없습니다.");
			return -1;
		}
	}
//-------편집[5]
	public void edit(List<Student>list) { //이름으로 수정
		try {
			//list에 데이터가 없으면 자동으로 입력 메뉴로 이동
			if(list.get(0)==null) {System.out.println("데이터가 없습니다."); inputinfo(list);}
			else {
				int cnt=0;
				//이름을 입력 받아서 수정할 사람을 찾기
				System.out.print("** 수정하고자하는 이름을 입력하시오 : ");
				String inputValue = input.nextLine();
				Iterator<Student>itr = list.iterator(); 
				while(itr.hasNext()) {
					Student stu = (Student)itr.next();
					//항목을 입력 받아 수정할 데이터 선택
					if(inputValue.equals(stu.name)) {	
						System.out.print("수정할 항목을 입력하시오 : ");
						String user = input.nextLine();
						//번호 수정
						if(user.equals("번호")) {
							System.out.print("변경할 번호를 입력하시오 : ");
							int changeNo=Integer.parseInt(input.nextLine());
							stu.setNo(changeNo);
						}
						//이름 수정
						else if(user.equals("이름")) {
							System.out.print("변경할 이름을 입력하시오 : ");
							String changenvalue = input.nextLine();
							stu.setName(changenvalue);
						}
						//국어 수정
						else if(user.equals("국어")) {
							  do {
								  cnt=0;
								  try {
									  System.out.println("변경할 국어 점수를 입력하시오 :");
						              stu.setKor(Integer.parseInt(input.nextLine()));
						              if(stu.getKor() > 100) System.out.println("100점 이하로 다시 입력해주세요.");
								  }catch(NumberFormatException e) {
									  System.out.println("숫자로 입력해주세요.");cnt++;
						          }
							  }while(stu.kor < 0 || stu.kor >100 || cnt>0);
						}
						//수학 수정
						else if(user.equals("수학")) {
							 do {
								 cnt=0;
					             try {
					            	 System.out.print("변경할 수학 점수를 입력하시오 : ");
					            	 stu.setMat(Integer.parseInt(input.nextLine()));
					            	 if(stu.getKor() > 100) System.out.println("100점 이하로 다시 입력해주세요.");
					             }catch(NumberFormatException e) {
					            	 System.out.println("숫자로 입력해주세요.");cnt++;
					             }
							 }while(stu.mat < 0 || stu.mat >100 || cnt>0);
						}
						//영어 수정
						else if(user.equals("영어")) {
							do {
								cnt=0;
					            try {
					            	System.out.print("변경할 영어 점수를 입력하시오 : ");
					            	stu.setEng(Integer.parseInt(input.nextLine()));
					            	if(stu.getKor() > 100) System.out.println("100점 이하로 다시 입력해주세요.");
					            }catch(NumberFormatException e) {
					               System.out.println("숫자로 입력해주세요."); cnt++;
					            }
					         }while(stu.eng < 0 || stu.eng >100 || cnt>0);
						}
					}
				}
				display(list);
				System.out.println(" ** 수정 완료 ** ");
			}
	}catch(IndexOutOfBoundsException e) {
		System.out.println("데이터가 없습니다.\n입력 메뉴로 이동합니다.."); inputinfo(list);
	}
}
//-------삭제[6]
	public void delete(List<Student>list) {
		int index = search(list);
		if(index > -1) {
			list.remove(index);
			System.out.println("데이터가 삭제되었습니다.");
			System.out.println("삭제 결과");
			display(list);
		}
		else {
			System.out.println("검색한 데이터가 없습니다.");
		}
	}
//-------총점 기준 정렬
	public void sortTier(List<Student>list) {
		Collections.sort(list, list.get(0).stdTcompare());
	}
//-------석차[7]
	public void ranking(List<Student>list) {
		System.out.println("*** 입력 데이터 출력 ***\n번호	이름	국어	수학	영어	총점	평균	석차");
		sortTier(list);
		Iterator<Student>itr = list.iterator();
		int i=0;
		while(itr.hasNext()) {
			Student stu = (Student)itr.next();
			i+=1;
			stu.ranking = i;
			System.out.println(stu.getNo()+"\t"+stu.getName()+"\t"+stu.getKor()+"\t"+stu.getMat()+"\t"+stu.getEng()+"\t"+stu.getTotal()+"\t"+stu.getAverage()+"\t"+stu.getRanking());
		}
	}
	//프로그램을 일반화
	public int windowfor(List<Student> list) { //메뉴는 무한루프 //ArrayList가 아닌 List로 받은 이유 : 부모로 받아서 LinkedList도 사용 가능하게 하기 위해
		while(true) {
			System.out.println("==================성적관리프로그램==================");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("1. 입력 2. 출력 3. 정렬 4. 조회 5. 편집 6. 삭제 7. 석차 9. 종료");
			System.out.println("메뉴를 선택하시오");
			int ch = 0;
			try {
				ch = Integer.parseInt(input.nextLine()); //입력할때 문자로 받으니까 -> 꼬이지 않도록 문자를 변환
			}catch(NumberFormatException e){
				
			}
			switch(ch) {
				case 1: inputinfo(list); break;
				case 2: System.out.println("*** 입력 데이터 출력 ***");display(list);   break;
				case 3: sort(list);       break;
				case 4: search(list);    break;
				case 5: edit(list);       break;
				case 6: delete(list);    break;
				case 7: ranking(list);  break;
				case 9: 
					System.out.println("프로그램을 종료합니다.");
					input.close(); //윈도우 자원을 사용하는 객체는 반드시 종료시킵니다.(네트워크, 데이터베이스, 입출력 객체, 화일 객체)
					return 0;
				default : 
					System.out.println(" 잘못 선택하였습니다.");
					break;
			
			}
		}
	}
}