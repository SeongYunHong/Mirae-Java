package mirae.com;
public class a_17_average {
	public static void main(String[] args) {
//-----------------------------------------------------------			
		/*
		int [][] scr= {{90,90,90,0},{89,89,89,0},{90,99,99,0}};
		double []avr=new double[3];
//----------입력부
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				scr[i][3]+=scr[i][j];
			}
			avr[i]=Math.round(scr[i][3]/3);
		}
//----------출력부
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(scr[i][j]+" | ");
			}System.out.println(avr[i]+"점");
		}
		*/
//-----------------------------------------------------------		
		int [][] scr= {{90,90,90,0},{89,89,89,0},{90,99,99,0}};
		double []avr=new double[3];
//----------입력부
		String []name= {"대한","민국","만세"};
		System.out.println("이름   국어    영어    수학     합계      평균");
		for(int i=0;i<scr.length;i++) {
			int tot=0;
			for(int j=0;j<scr[0].length;j++) {
				tot+=scr[i][j];
			}scr[i][3]=tot;
			avr[i]=Math.round(tot/3 *100)/100;
		}
//----------출력부
		//System.out.println("국어   영어    수학     합계      평균");
		for(int i=0;i<scr.length;i++) {
			System.out.print(name[i]+"    ");
			for(int j=0;j<scr[0].length;j++) {
				System.out.print(scr[i][j]+"   |   ");
			}System.out.println(avr[i]+"점");
		}	
	
	}
}