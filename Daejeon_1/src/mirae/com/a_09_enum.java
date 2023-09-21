package mirae.com;
public class a_09_enum { //class 스타일
	//일주일 : 7일 (경우의 수, 범주)
	public enum Day{ //enum 스타일
		Sun, Mon, Tue, Wed, Thu, Fri, Sat  //0, 1, 2, 3, 4, 5, 6으로 자동 매핑
	}
	public static void main(String[] args) {
		//enum타입은 new를 사용하지 않음
		Day day = Day.Mon; //범주데이터(Sun, Mon, Tue, Wed, Thu, Fri, Sat)만 가능
		System.out.println("enum변수에 있는 값 : "+ day);
		Day[] DayNow = Day.values(); //Day의 전체 값을 배열에 대입
		System.out.println("DayNow : "+DayNow); //배열이기 때문에 주소값을 밖에 출력을 못함
		String str="";
		for(Day Now : DayNow) { //extended for문(확장된 for문(index에러를 방지하기 위해 등장)) 
			//DayNow의 값들이 Now에 대입, 대입이 끝나면 자동 종료(순서대로 객체 리턴)
			switch(Now) {
				case Sun : str="Sunday";      break;
				case Mon: str="Monday";     break;
				case Tue : str="Tuesday";     break;
				case Wed: str="Wednesday"; break;
				case Thu : str="Thursday";    break;
				case Fri   : str="Friday";        break;
				case Sat  : str="Saturday";     break;
			}
			System.out.println(str);	
		}
	}
}