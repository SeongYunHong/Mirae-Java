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
	public void sendCall() {System.out.println("띠리리리링");}
	public void receiveCall() {System.out.println("전화가 왔습니다.");}
	public void sendSMS() {System.out.println("SMS 보내기");}
	public void receiveSMS() {System.out.println("SMS 받기");}
	
	public void play() {System.out.println("음악 재생");}
	public void stop() {System.out.println("재생 중지");}
	public void flash() {System.out.println("전화기에 불이 켜졌습니다.");}
	
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
