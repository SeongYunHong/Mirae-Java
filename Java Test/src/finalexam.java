
public class finalexam {
	public static void main(String[] args) {
		String m[]= {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String n[]= {"��","��","��","��"};
		
		System.out.println("ī�尡 �������� 10���� ��µ˴ϴ�.");
		for(int i=0;i<10;i++) {
			int x=(int)(Math.random()*13);
			int y=(int)(Math.random()*4);
			System.out.println(" "+m[x]+" "+n[y]);	
		}

	}

}
