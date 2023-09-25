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
		if (a>this.balance) System.out.print("�ܰ� �����մϴ�.");
		else this.balance-=a;
	}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Account []m=new Account[2];
		
		for(int i=0;i<m.length;i++) {
			System.out.print("�̸� : ");
			String name=a.next();
			System.out.print("�ܾ� : ");
			int b=a.nextInt();
			
			m[i]=new Account(i+1,name,b);
			m[i].Show();
		}
		System.out.print("������ �Է� : ");
		String name=a.next();
		
		for(int i=0;i<m.length;i++) {
			if(m[i].name.equals(name)) {
				while(true) {
					System.out.println("�޴�");
					System.out.println("[1] �Ա� [2] ��� [3] �ܰ�Ȯ�� [4] ����");
					int n=a.nextInt();
					
					if(n==1) {
						System.out.print("�Ա��Ͻ� �ݾ��� �Է��ϼ��� : ");
						int money=a.nextInt();
						m[i].Add(money);
					}
					else if(n==2) {
						System.out.print("����Ͻ� �ݾ��� �Է��ϼ��� : ");
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
