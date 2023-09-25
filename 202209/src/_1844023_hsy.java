import java.util.Scanner;
import java.util.*;

public class _1844023_hsy {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		/*
		//1번
		int index=0;
		char m='@',n='-';
		
		for(int i=0;i<10;i++) {
			index=(int)(Math.random()*50+1);
			for(int j=0;j<index;j++) {
				System.out.print(n);
			}System.out.println(m);
		}
		--------------------------------*/
		//2번
		/*
		int x=0,y=0,ans=0,scr=0;
		System.out.print("이름 입력 : ");
		String name=a.next();
		
		System.out.print("문제 수 입력(10 or 20 or 25) : ");
		int m=a.nextInt();
		
		if(m==10) {
			
			System.out.println("** 1문제당 10점입니다.");
			System.out.println("---------------");
			for(int i=0;i<10;i++) {
				x=(int)(Math.random()*10+1);
				y=(int)(Math.random()*10+1);
				System.out.printf("%2d"+". "+"%2d"+" x "+"%2d"+" = ",(i+1),x,y);
				ans=a.nextInt();
				int score[]=new int[m];
				if(ans==(x*y)) score[i]=1;
				else		   score[i]=0;
				for(int j=0;j<score.length;j++) {
					if (score[j]==1) scr++; 
				}
			}
		System.out.println("---------------");
		System.out.println(">>>>>");
		System.out.println("이    름  |  "+name);
		System.out.println("맞은 답수  |  "+scr+"개");
		System.out.println("점    수  |  "+(scr*10)+"점");
		}
		
		if(m==20) {
			System.out.println("** 1문제당 5점입니다.");
			System.out.println("---------------");
			for(int i=0;i<20;i++) {
				x=(int)(Math.random()*10+1);
				y=(int)(Math.random()*10+1);
				System.out.printf("%2d"+". "+"%2d"+" x "+"%2d"+" = ",(i+1),x,y);
				ans=a.nextInt();
				int score[]=new int[m];
				if(ans==(x*y)) score[i]=1;
				else		   score[i]=0;
				for(int j=0;j<score.length;j++) {
					if (score[j]==1) scr++; 
				}
			}
		System.out.println("---------------");
		System.out.println(">>>>>");
		System.out.println("이    름  |  "+name);
		System.out.println("맞은 답수  |  "+scr+"개");
		System.out.println("점    수  |  "+(scr*5)+"점");
		}
		
		if(m==25) {
			System.out.println("** 1문제당 4점입니다.");
			System.out.println("---------------");
			for(int i=0;i<25;i++) {
				x=(int)(Math.random()*10+1);
				y=(int)(Math.random()*10+1);
				System.out.printf("%2d"+". "+"%2d"+" x "+"%2d"+" = ",(i+1),x,y);
				ans=a.nextInt();
				int score[]=new int[m];
				if(ans==(x*y)) score[i]=1;
				else		   score[i]=0;
				for(int j=0;j<score.length;j++) {
					if (score[j]==1) scr++; 
				}
			}
		System.out.println("---------------");
		System.out.println(">>>>>");
		System.out.println("이    름  |  "+name);
		System.out.println("맞은 답수  |  "+scr+"개");
		System.out.println("점    수  |  "+(scr*4)+"점");
		}
		--------------------------------*/
		//3번
		/*
		String m[]= {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String n[]= {"♥","♠","♣","◆"};
		
		System.out.println("카드가 랜덤으로 10장이 출력됩니다.");
		for(int i=0;i<10;i++) {
			int x=(int)(Math.random()*13);
			int y=(int)(Math.random()*4);
			System.out.println(" "+m[x]+" "+n[y]);	
		}
		--------------------------------*/
	}
}
