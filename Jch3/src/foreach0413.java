import java.util.Scanner;

public class foreach0413 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		String name[];
		double grd[];
		
		System.out.print("�л� �� �Է� : ");
		int m=a.nextInt();
		
		name=new String[m];
		grd=new double[m];
		double max=0;String n = "";
		for(int i=0;i<m;i++) {
			System.out.print("�̸� �Է� : ");
			name[i]=a.next();
			System.out.print("���� �Է� : ");
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
		//System.out.print("1���� "+n+", "+max+"���Դϴ�.");
		for(int i=0;i<m;i++)
			System.out.print(grd[i]+" ");
		
		/*---------------------------------------------------
		//�л��� �Է�
		//�̸��� ���� ���� �Է� ����
		//1�� ���
		
		String name[];
		double grd[];
		
		System.out.print("�л� �� �Է� : ");
		int m=a.nextInt();
		
		name=new String[m];
		grd=new double[m];
		double max=0;String n = "";
		for(int i=0;i<m;i++) {
			System.out.print("�̸� �Է� : ");
			name[i]=a.next();
			System.out.print("���� �Է� : ");
			grd[i]=a.nextDouble();
			
			if(max<grd[i]) {max=grd[i]; n=name[i];}
		}	
		System.out.print("1���� "+n+", "+max+"���Դϴ�.");
		/*---------------------------------------------------
		String names[]= {"���","��","�ٳ���","ü��","����","����"};
		int s[]= {1300,2500,1000,300,800,500};
		String n[];
		int k[];
		System.out.print("�ٲ� ������ �Է��Ͻÿ� : ");
		int m=a.nextInt();
		n=new String[m];
		k=new int[m];
		for(int i=0;i<m;i++) {
			System.out.print("�ٲ� ��ǰ�� �̸��� �Է� �Ͻÿ� : ");
			n[i]=a.next();
		
			System.out.print("�ٲ� �ܰ��� �Է��Ͻÿ� : ");
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
		String names[]= {"���","��","�ٳ���","ü��","����","����"};
		int s[]= {1300,2500,1000,300,800,500};
		
		String list[];
		System.out.print("�� �� ��ǰ ���� : ");
		int size=a.nextInt();
		list=new String [size];
		
		int cst[]=new int [size];
		int f_c=0;
		System.out.print("�Է��� ���� �̸�, ���� ������ �Է� : ");
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
		System.out.println("���� ������ ������ "+f_c+"���Դϴ�.");
		/*---------------------------------------------------
		String arr[];
		System.out.print("�迭�� ũ�� �̺� : ");
		int size=a.nextInt();
		arr=new String [size];
		
		for(int i=0;i<arr.length;i++) 
			arr[i]=a.next();
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		/*---------------------------------------------------
		String names[] = {"��Ʈ��","������� ����","�̳�","������ �߾�"};
		int z=0,sum=0;
		for(String x:names) System.out.print(x+" ");
		System.out.print("\n��ȭ ���� : ");
		String m=a.next();
		System.out.print("�Ϲ� or ���� : ");
		String n=a.next();
		
		if(n.equals("�Ϲ�")) z=1;
		else z=0;
		
		System.out.print("�� �Ÿ� ���� : ");
		int k=a.nextInt();
		
		switch(z) {
		case 0: sum+=11000*k; break;
		case 1: sum+=15000*k; break;
		}
		System.out.print(m+" /"+k+"�� �����ϼż� "+sum+"���Դϴ�.");
		*/
		/*---------------------------------------------------
		String names[]= {"���","��","�ٳ���","ü��","����","����"};
		int s[]= {1300,2500,1000,300,800,500},user_won=0,zzz=0;
		
		
		System.out.println("���� ����");
		System.out.println("----------------------------------------------");
		System.out.print("���� ��� : ");
		for(String k:names)//�ݺ��Ҷ����� s�� names[0],names[1]...names[5]�� ����
			System.out.print(k+ " ");
		System.out.println("\n----------------------------------------------");
		
		while(true) {
			System.out.println("� ������ �����Ͻðڽ��ϱ�.(������ x)");
			String user=a.next();
			if(user.equals("x")) {System.out.print("������ ����");break;}
			for(int i=0;i<names.length;i++) {
				if(user.equals(names[i])) { 
					System.out.println(names[i]+"�� ������ "+s[i]);
					System.out.print(names[i]+" ��� �����Ͻðڽ��ϱ�?");
					int c=a.nextInt();
					user_won+=(s[i]*c);
					zzz++;
					break;
				}
				if(zzz==6) {System.out.print("��Ͽ� �����ϴ�."); break;}
			}
		}
		if(user_won != 0) System.out.print("�� ����� "+user_won+"���Դϴ�.");
		System.out.print("\n�ȳ��� ������.");
		/*---------------------------------------------------
		int []num= {1,2,3,4,5};
		int sum=0;
		
		for(int k:num) {//�ݺ��Ҷ����� k�� num[0],num[1]...num[4]�� ����
			sum +=k;
			System.out.print(k+" ");
		}
		System.out.println("���� : "+sum);
*/
	}
}