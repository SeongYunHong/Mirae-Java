package ch2;

import java.util.Random;
import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random r=new Random();
	
		int m=0;
		System.out.println("Lotto");
		
		for(int i=0;i<6;i++) {
			m=(int)(Math.random()*45+1);
			
			if(i<5) System.out.print(m+", ");
			else System.out.print("Bonus : "+m);
		}
		/*-------------------------랜덤 가위바위보
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("나 >> ");
		String m=a.next();
		
		int cr=r.nextInt(3);
		
		String n="";
		if(cr==0) n="가위";
		else if(cr==1) n="바위";
		else if(cr==2) n="보";
		System.out.println("컴퓨터 >> "+n);
		
		switch(m) {
			case "가위": 
				if(n.equals("가위")) System.out.print("비겼습니다.");
				if(n.equals("바위")) System.out.print("컴퓨터가 이겼습니다.");
				if(n.equals("보")) System.out.print("내가 이겼습니다.");
				break;
			case "바위": 
				if(n.equals("가위")) System.out.print("내가 이겼습니다.");
				if(n.equals("바위")) System.out.print("비겼습니다.");
				if(n.equals("보")) System.out.print("컴퓨터가 이겼습니다.");
				break;
			case "보":
				if(n.equals("가위")) System.out.print("컴퓨터가 이겼습니다.");
				if(n.equals("바위")) System.out.print("내가 이겼습니다.");
				if(n.equals("보")) System.out.print("비겼습니다.");
				break;
		}
		
		/*-------------------------
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String m=a.next();
		System.out.print("영희 >> ");
		String n=a.next();
		
		switch(m) {
			case "가위": 
				if(n.equals("가위")) System.out.print("비겼습니다.");
				if(n.equals("바위")) System.out.print("영희가 이겼습니다.");
				if(n.equals("보")) System.out.print("철수가 이겼습니다.");
				break;
			case "바위": 
				if(n.equals("가위")) System.out.print("철수가 이겼습니다.");
				if(n.equals("바위")) System.out.print("비겼습니다.");
				if(n.equals("보")) System.out.print("영희가 이겼습니다.");
				break;
			case "보":
				if(n.equals("가위")) System.out.print("영희가 이겼습니다.");
				if(n.equals("바위")) System.out.print("철수가 이겼습니다.");
				if(n.equals("보")) System.out.print("비겼습니다.");
				break;
		}
		*/
	}
}