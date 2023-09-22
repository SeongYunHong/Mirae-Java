package mirae2.com;

public class RSP_Judge {
	int totalcount;
	int wincount;
	int losecount;
	int drawcount;
	
	public RSP_Judge() {totalcount=0;wincount=0;losecount=0;drawcount=0;System.out.println("게임이 초기화되었습니다.");}
	public static int doif(int com, int user) {
		int result=0;
		if(((user-com)+3)%3==1)
			result=0;//유저 승
		else if(((user-com)+3)%3==2)
			result=1;//컴퓨터 승
		else if(((user-com)+3)%3==0)
			result=2;//비김
		return result;
	}
	public void gamedicision(int com, int user) {
		int result = doif(com,user);
		totalcount+=1;
		if(result==0) {
			System.out.println("이겼습니다.");
			wincount++;
		}
		else if(result==0) {
			System.out.println("졌습니다.");
			losecount++;
		}
		else {
			System.out.println("비겼습니다.");
			drawcount++;
		}
	}
	public void print() {
		System.out.print("게임 결과 : "+totalcount+ "전/"+wincount+"승/ "+drawcount+"무/ "+losecount+"패/");
	}
}