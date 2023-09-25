abstract class MessageSender{
	String title;
	String senderName;
	MessageSender(String t,String sN){this.title=t;this.senderName=sN;}
	abstract void sendMessage(String recipient);
}
class EMailSender extends MessageSender{
	String senderAddr, emailbody;
	EMailSender(String z,String x,String c,String v){super(z,x);this.senderAddr=c;this.emailbody=v;}
	public void sendMessage(String recipient) {System.out.println("--------------------");
							   System.out.println("제목 :"+super.title);
							   System.out.println("보내는 사람 :"+super.senderName+this.senderAddr);
							   System.out.println("받는 사람 :"+recipient);
							   System.out.println("내용 :"+this.emailbody);
	}
}
class SMSSender extends MessageSender{
	String returnPhoneNo,message;
	SMSSender(String s,String d,String f,String g){super(s,d);this.returnPhoneNo=f;this.message=g;}
	public void sendMessage(String recipient) {System.out.println("--------------------");
	   System.out.println("제목 :"+super.title);
	   System.out.println("보내는 사람 :"+super.senderName);
	   System.out.println("전화번호 :"+recipient);
	   System.out.println("회신 전화번호 :"+this.returnPhoneNo);
	   System.out.println("내용 :"+this.message);
}
}
public class InheritanceExample6{

	public static void main(String[] args) {
		EMailSender obj1 = new EMailSender("생일 축하합니다","고객센터",
				"admin@dukeeshop.co.kr","10% 할인쿠폰이 발행되었습니다.");
		SMSSender obj2 = new SMSSender("생일 축하합니다","고객센터",
				"02-000-0000","10% 할인쿠폰이 발행되었습니다.");
		
		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@yeyeye.com");
		obj2.sendMessage("010-000-0000");

	}

}
