import java.util.Scanner;
import java.util.*;

public class _1844023_hsy {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		/*
		//1��
		int index=0;
		char m='@',n='-';
		
		for(int i=0;i<10;i++) {
			index=(int)(Math.random()*50+1);
			for(int j=0;j<index;j++) {
				System.out.print(n);
			}System.out.println(m);
		}
		--------------------------------*/
		//2��
		/*
		int x=0,y=0,ans=0,scr=0;
		System.out.print("�̸� �Է� : ");
		String name=a.next();
		
		System.out.print("���� �� �Է�(10 or 20 or 25) : ");
		int m=a.nextInt();
		
		if(m==10) {
			
			System.out.println("** 1������ 10���Դϴ�.");
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
		System.out.println("��    ��  |  "+name);
		System.out.println("���� ���  |  "+scr+"��");
		System.out.println("��    ��  |  "+(scr*10)+"��");
		}
		
		if(m==20) {
			System.out.println("** 1������ 5���Դϴ�.");
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
		System.out.println("��    ��  |  "+name);
		System.out.println("���� ���  |  "+scr+"��");
		System.out.println("��    ��  |  "+(scr*5)+"��");
		}
		
		if(m==25) {
			System.out.println("** 1������ 4���Դϴ�.");
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
		System.out.println("��    ��  |  "+name);
		System.out.println("���� ���  |  "+scr+"��");
		System.out.println("��    ��  |  "+(scr*4)+"��");
		}
		--------------------------------*/
		//3��
		/*
		String m[]= {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String n[]= {"��","��","��","��"};
		
		System.out.println("ī�尡 �������� 10���� ��µ˴ϴ�.");
		for(int i=0;i<10;i++) {
			int x=(int)(Math.random()*13);
			int y=(int)(Math.random()*4);
			System.out.println(" "+m[x]+" "+n[y]);	
		}
		--------------------------------*/
	}
}
