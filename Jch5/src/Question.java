import java.util.Scanner;

interface Complexity{
	void setComplexity(int complexity);
	int getComplexity();
	
}
public class Question implements Complexity{
	private String question,answer;
	int complexityLevel;
	
	Question(String q,String a){this.question=q;this.answer=a;}
	
	public void setComplexity(int level) {complexityLevel=level;}
	public int getComplexity() {return complexityLevel;}
	String getQuestion() {return question;}
	String getAnswer() {return answer;}
	boolean correct(String reply) {return reply.equals(answer);}
	
	public static void main(String[] args) {
		Question q1,q2;
		String ans;
		
		Scanner scan = new Scanner(System.in);

		q1 = new Question("�ѱ��� ��ȭ��?", "����ȭ");
		q1.setComplexity(3);
		
		q2 = new Question("�ѱ����� ���� ���� ����?", "�Ѷ��");
		q2.setComplexity(7);
		
		System.out.print(q1.getQuestion());
		System.out.print(" (���̵�: "+q1.getComplexity()+"): ");
		ans=scan.next();
		if(q1.correct(ans))
			System.out.println("�¾ҽ��ϴ�.");
		else 
			System.out.println("Ʋ�Ƚ��ϴ�. ������ "+ q1.getAnswer());
		
		System.out.print(q2.getQuestion());
		System.out.print(" (���̵�: "+q2.getComplexity()+"): ");
		ans=scan.next();
		if(q2.correct(ans))
			System.out.println("�¾ҽ��ϴ�.");
		else 
			System.out.println("Ʋ�Ƚ��ϴ�. ������ "+ q2.getAnswer());
		
	}

}
