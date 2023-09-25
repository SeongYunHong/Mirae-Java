import java.util.Scanner;

public class Game {
	/*
	int m=0,n=0;
	Game(int m,int n){this.m=m;this.n=n;}
	*/
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in); 
		/*
		char m[][]=new char[15][15];
		int x=0,y=0;
		Game p=new Game(x,y);
		
		System.out.println("오목 게임을 시작하겠습니다.");
		while(true) {
			System.out.println("원하시는 좌표를 입력해주세요. ex) (1,1)");
			x=a.nextInt();
			y=a.nextInt();
			m[x][y]='*';
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m.length;j++) {
					System.out.print(m[i][j]+""+m[x][y]);
					System.out.println();
				}
			}*/
		char m[][]=new char [15][15];
		int x=0,y=0,k=0,q=0,w=0;
		int l=1;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
				m[i][j]='ㅡ';
			}
		}//바둑판
		while(l<5) {
			System.out.println("원하시는 좌표를 입력해주세요. ex) (1,1)");
			x=a.nextInt();
			y=a.nextInt();
			m[x][y]='*';
			
			if(m[x-1][y]=='*') {l++;
				if(m[x-2][y]=='*') {l++;
					if(m[x-3][y]=='*') {l++;
						if(m[x-4][y]=='*') {l++;
						}
						else if(m[x+1][y]=='*') {l++;
						}
					}
					else if(m[x+1][y]=='*') {l++;
						if(m[x+2][y]=='*') {l++;
						}
					}
					
				}
				else if(m[x+1][y]=='*') {l++;
					if(m[x+2][y]=='*') {l++;
						if(m[x+3][y]=='*') {l++;
						}
					}
				}
			}
			else if(m[x+1][y]=='*') {l++;
				if(m[x+2][y]=='*') {l++;
					if(m[x+3][y]=='*') {l++;
						if(m[x+4][y]=='*') {l++;
						}
					}
					
				}
			
			}
			if(l==5) {System.out.println("승리");break;}
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m.length;j++) {
					System.out.print(m[i][j]+" ");
				}System.out.println();
			}
			
			System.out.println("원하시는 좌표를 입력해주세요. ex) (1,1)");
			q=a.nextInt();
			w=a.nextInt();
			m[q][w]='o';
			
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m.length;j++) {
					System.out.print(m[i][j]+" ");
				}System.out.println();
			}
		}	
			
		

	}
}
