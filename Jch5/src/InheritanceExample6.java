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
							   System.out.println("���� :"+super.title);
							   System.out.println("������ ��� :"+super.senderName+this.senderAddr);
							   System.out.println("�޴� ��� :"+recipient);
							   System.out.println("���� :"+this.emailbody);
	}
}
class SMSSender extends MessageSender{
	String returnPhoneNo,message;
	SMSSender(String s,String d,String f,String g){super(s,d);this.returnPhoneNo=f;this.message=g;}
	public void sendMessage(String recipient) {System.out.println("--------------------");
	   System.out.println("���� :"+super.title);
	   System.out.println("������ ��� :"+super.senderName);
	   System.out.println("��ȭ��ȣ :"+recipient);
	   System.out.println("ȸ�� ��ȭ��ȣ :"+this.returnPhoneNo);
	   System.out.println("���� :"+this.message);
}
}
public class InheritanceExample6{

	public static void main(String[] args) {
		EMailSender obj1 = new EMailSender("���� �����մϴ�","������",
				"admin@dukeeshop.co.kr","10% ���������� ����Ǿ����ϴ�.");
		SMSSender obj2 = new SMSSender("���� �����մϴ�","������",
				"02-000-0000","10% ���������� ����Ǿ����ϴ�.");
		
		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@yeyeye.com");
		obj2.sendMessage("010-000-0000");

	}

}
