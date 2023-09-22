package mirae2.com;

public class Judge {
	Com co=new Com();
	User uu;

	Judge(){}
	Judge(Com co, User uu){this.co=co;this.uu=uu;}

	public int do2(Com co,User uu) {
		int result=0;
		int c=co.comp();
		int u=uu.getUser();
		if(((u-c)+3)%3==1)
			result=0;//유저 승
		else if(((u-c)+3)%3==2)
			result=1;//컴퓨터 승
		else if(((u-c)+3)%3==0)
			result=2;//비김
		return result;
	}
}