package ch5;

interface PhoneInterface21{
	int TIMEOUT=10000;
	void sendCall();
	void receiveCall();
	
	default void printLogo() {System.out.println("**Phone**");}
}
interface MobilePhoneInterface21 extends PhoneInterface21{
	void sendSMS();
	void receiveSMS();	
}
interface MP3Interface21{
	public void play();
	public void stop();
}
class SamsungPhone implements PhoneInterface21, MobilePhoneInterface21, MP3Interface21{
	public void sendCall() {System.out.println("�츮������");}
	public void receiveCall() {System.out.println("��ȭ�� �Խ��ϴ�.");}
	public void sendSMS() {System.out.println("SMS ������");}
	public void receiveSMS() {System.out.println("SMS �ޱ�");}
	
	public void play() {System.out.println("���� ���");}
	public void stop() {System.out.println("��� ����");}
	public void flash() {System.out.println("��ȭ�⿡ ���� �������ϴ�.");}
	
}
public class InterfaceEx2 extends SamsungPhone{
	
	public static void main(String[] args) {
		SamsungPhone phone=new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.sendSMS();
		phone.receiveSMS();
		phone.play();
		phone.stop();
		phone.flash();
	}
}
