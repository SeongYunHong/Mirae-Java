import java.util.Scanner;

public class foreach0413 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		String name[];
		double grd[];
		
		System.out.print("학생 수 입력 : ");
		int m=a.nextInt();
		
		name=new String[m];
		grd=new double[m];
		double max=0;String n = "";
		for(int i=0;i<m;i++) {
			System.out.print("이름 입력 : ");
			name[i]=a.next();
			System.out.print("점수 입력 : ");
			grd[i]=a.nextDouble();
			for(int j=i;j<m;j++) {
				if(grd[i]<grd[j]) {
					double l=0;
					l=grd[i];
					grd[i]=grd[j];
					grd[j]=l;
				}
			}
		}	
		//System.out.print("1등은 "+n+", "+max+"점입니다.");
		for(int i=0;i<m;i++)
			System.out.print(grd[i]+" ");
		
		/*---------------------------------------------------
		//학생수 입력
		//이름과 점수 각각 입력 받음
		//1등 출력
		
		String name[];
		double grd[];
		
		System.out.print("학생 수 입력 : ");
		int m=a.nextInt();
		
		name=new String[m];
		grd=new double[m];
		double max=0;String n = "";
		for(int i=0;i<m;i++) {
			System.out.print("이름 입력 : ");
			name[i]=a.next();
			System.out.print("점수 입력 : ");
			grd[i]=a.nextDouble();
			
			if(max<grd[i]) {max=grd[i]; n=name[i];}
		}	
		System.out.print("1등은 "+n+", "+max+"점입니다.");
		/*---------------------------------------------------
		String names[]= {"사과","배","바나나","체리","딸기","포도"};
		int s[]= {1300,2500,1000,300,800,500};
		String n[];
		int k[];
		System.out.print("바뀐 개수를 입력하시오 : ");
		int m=a.nextInt();
		n=new String[m];
		k=new int[m];
		for(int i=0;i<m;i++) {
			System.out.print("바뀐 물품의 이름을 입력 하시오 : ");
			n[i]=a.next();
		
			System.out.print("바뀐 단가를 입력하시오 : ");
			k[i]=a.nextInt();
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<names.length;j++) {
				if(n[i].equals(names[j])) {
					s[j]=k[i];
					break;
				}
			}	
		}
		for(int i=0;i<names.length;i++) {
			System.out.print(s[i]+" ");
		}
		/*---------------------------------------------------
		String names[]= {"사과","배","바나나","체리","딸기","포도"};
		int s[]= {1300,2500,1000,300,800,500};
		
		String list[];
		System.out.print("장 볼 물품 개수 : ");
		int size=a.nextInt();
		list=new String [size];
		
		int cst[]=new int [size];
		int f_c=0;
		System.out.print("입력은 물건 이름, 개수 순으로 입력 : ");
		for(int i=0;i<list.length;i++) { 
			list[i]=a.next();
			cst[i]=a.nextInt();
			for(int j=0;j<names.length;j++) {
				if(list[i].equals(names[j])) {
					f_c+=s[j]*cst[i];
				break;
				}
			}
		}
		System.out.println("최종 물건의 가격은 "+f_c+"원입니다.");
		/*---------------------------------------------------
		String arr[];
		System.out.print("배열의 크기 이벽 : ");
		int size=a.nextInt();
		arr=new String [size];
		
		for(int i=0;i<arr.length;i++) 
			arr[i]=a.next();
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		/*---------------------------------------------------
		String names[] = {"앤트맨","오베라는 남자","미끼","살인의 추억"};
		int z=0,sum=0;
		for(String x:names) System.out.print(x+" ");
		System.out.print("\n영화 선택 : ");
		String m=a.next();
		System.out.print("일반 or 조조 : ");
		String n=a.next();
		
		if(n.equals("일반")) z=1;
		else z=0;
		
		System.out.print("몇 매를 구매 : ");
		int k=a.nextInt();
		
		switch(z) {
		case 0: sum+=11000*k; break;
		case 1: sum+=15000*k; break;
		}
		System.out.print(m+" /"+k+"매 구매하셔서 "+sum+"원입니다.");
		*/
		/*---------------------------------------------------
		String names[]= {"사과","배","바나나","체리","딸기","포도"};
		int s[]= {1300,2500,1000,300,800,500},user_won=0,zzz=0;
		
		
		System.out.println("과일 가게");
		System.out.println("----------------------------------------------");
		System.out.print("과일 목록 : ");
		for(String k:names)//반복할때마다 s는 names[0],names[1]...names[5]로 설정
			System.out.print(k+ " ");
		System.out.println("\n----------------------------------------------");
		
		while(true) {
			System.out.println("어떤 과일을 구입하시겠습니까.(없으면 x)");
			String user=a.next();
			if(user.equals("x")) {System.out.print("없으면 나가");break;}
			for(int i=0;i<names.length;i++) {
				if(user.equals(names[i])) { 
					System.out.println(names[i]+"의 가격은 "+s[i]);
					System.out.print(names[i]+" 몇개를 구매하시겠습니까?");
					int c=a.nextInt();
					user_won+=(s[i]*c);
					zzz++;
					break;
				}
				if(zzz==6) {System.out.print("목록에 없습니다."); break;}
			}
		}
		if(user_won != 0) System.out.print("총 비용은 "+user_won+"원입니다.");
		System.out.print("\n안녕히 가세요.");
		/*---------------------------------------------------
		int []num= {1,2,3,4,5};
		int sum=0;
		
		for(int k:num) {//반복할때마다 k는 num[0],num[1]...num[4]로 설정
			sum +=k;
			System.out.print(k+" ");
		}
		System.out.println("합은 : "+sum);
*/
	}
}