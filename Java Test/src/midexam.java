import java.util.Scanner;

public class midexam {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		/*-----------------------------------
		//1.
		System.out.println("������ �Է��Ͽ���.");
		int m=a.nextInt();
		String n="";
		while(true) {
			if(m/10000 != 0) {
				n+=m/10000+"��";
				m=m%10000;
				if(m%1000 >=0) {
					n+=m/1000+"õ";
					m=m%1000;
					if(m%100 >= 0) {
						n+=m/100+"��";
						m=m%100;
						if(m%10 >= 0) {
							n+=m/10+"��"+m%10+"��";
							break;
						}
					}
				}
			}else break;
		}
		System.out.print(n+"�Դϴ�.");
		*/
		/*
		//2.
		System.out.print("���� ������ �Է��Ͻðڽ��ϱ�?");
		int m=a.nextInt();
		String book[]=new String[m];
		String author[]=new String[m];
		for(int i=0;i<m;i++) {
			System.out.print("������ : ");
			book[i]=a.next();
			System.out.print("���ڸ� : ");
			author[i]=a.next();
		}
		System.out.println("�� "+m+"���� ���� ����� ����ϰڽ��ϴ�.");
		System.out.println("************<���� ��Ŷ����Ʈ>************");
		System.out.println("         ������             ���ڸ�");
		System.out.println("--------------------------------------");
		for(int i=0;i<m;i++) {
			//System.out.println((i+1)+". "+book[i]+"\t|"+author[i]);
			System.out.printf("%d. %3s\t|%3s",(i+1),book[i],author[i]);
			System.out.println();
		}
		System.out.println("--------------------------------------");
		*/
		/*
		//3.
		System.out.print("������ �Է� : ");
		int x=a.nextInt();
		System.out.print("���� �Է� : ");
		int y=a.nextInt();
		System.out.print("���� �Է� : ");
		int z=a.nextInt();
		
		int k[]=new int[y+1];
		for(int i=x;i<=y;i++) {
			k[i]=i;
			for(int j=1;j<=(int)(y/z);j++)
				if(i==z*j) k[i]=(char)65;
			if(k[i]==65) System.out.print('*'+" ");
			else System.out.print(k[i]+" ");
		}
		*/
		//4.
		System.out.print("���� ������ �ݾ� �Է� : ");
		int x=a.nextInt();
		int sum=0;
		int k=10;
		String p[]=new String[k];
		int c[]=new int[k];
		int j=0;
		while(true) {
			System.out.print("��ǰ�� �Է� : ");
			p[j] =a.next();
			System.out.print("��ǰ�� �Է� : ");
			c[j]=a.nextInt();
			if(c[j]>x) continue;
			if(x-sum<c[j]) break;
			else	sum+=c[j];
			j++;
		}
		System.out.println("   <������ ��ǰ>   ");
		System.out.println("=================");
		for(int i=0;i<j;i++) {
			System.out.println(p[i]+"\t"+c[i]);
		}
		System.out.println("=================");
		System.out.println("�հ�           "+sum);
		System.out.println("�ܵ�          "+(x-sum));
		System.out.println("**�ݾ� �������� "+p[j]+" ���źҰ�");
		
	}
}