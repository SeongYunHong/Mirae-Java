package mirae2.com;

public class team_rsp {

	public static void main(String[] args) {
		Com c = new Com();
		User u = new User();
		Judge j=new Judge();
		int win=0;
		int lose=0;
		int draw=0;
		int count=0;
		//System.out.print(c.r);
		String judge[]= {"이겼습니다!","졌습니다...","비겼습니다."};
		
		while(true) {
//------ 사용자 입력 부분
			int k=0;
			k=u.us();		
			if(k==9) break;
			count++;
//------ 컴퓨터 랜덤 부분
			System.out.print(c.comp());
//------ 승 무 패 판단 부분
			int result = j.do2(c,u);
			switch(result) {
			case 0: win+=1; break;
			case 1: lose+=1; break;
			case 2: draw+=1;break;
			}		
			System.out.println(judge[result]);
		}
		System.out.println("게임 결과 : "+count+"전"+win+"승"+draw+"무"+lose+"패");
		
	}
}
