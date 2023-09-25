import java.util.Scanner;

public class Account {
	int no;
	int balance;
	String name;
	
	Account(){this.no=1;this.name="";this.balance=0;};
	Account(int n){this.no=n;}
	Account(String name,int b){this.name=name;this.balance=b;}
	Account(int n,String name,int b){this.no=n;this.name=name;this.balance=b;}
	
	void Show() {System.out.println(this.no+"/"+this.name+"/"+this.balance);}
	void Add(int a) {this.balance+=a;}
	void Sub(int a) {
		if (a>this.balance) System.out.print("잔고가 부족합니다.");
		else this.balance-=a;
	}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Account []m=new Account[2];
		
		for(int i=0;i<m.length;i++) {
			System.out.print("이름 : ");
			String name=a.next();
			System.out.print("잔액 : ");
			int b=a.nextInt();
			
			m[i]=new Account(i+1,name,b);
			m[i].Show();
		}
		System.out.print("예금주 입력 : ");
		String name=a.next();
		
		for(int i=0;i<m.length;i++) {
			if(m[i].name.equals(name)) {
				while(true) {
					System.out.println("메뉴");
					System.out.println("[1] 입금 [2] 출금 [3] 잔고확인 [4] 종료");
					int n=a.nextInt();
					
					if(n==1) {
						System.out.print("입금하실 금액을 입력하세요 : ");
						int money=a.nextInt();
						m[i].Add(money);
					}
					else if(n==2) {
						System.out.print("출금하실 금액을 입력하세요 : ");
						int money=a.nextInt();
						m[i].Sub(money);
					}
					else if(n==3) m[i].Show();
					else		  break;
				}
			}
		}
	}
}
