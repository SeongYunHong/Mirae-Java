import java.util.Scanner;

public class Student90 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student91 std= new Student91();
		Student91[]per = new Student91[3];
		
		while(true) {
			System.out.println("�Է�[1], ���[2], ��ü ����[3] �κ� ����[4] ���� Ȯ��[5] �� ���� | ����[9]");
			int sel=std.getUser();
//����(9)�� ������ ��	
			if(sel == 9) {
				System.out.println("����Ǿ����ϴ�."); 	break;
			}
			
//�Է�(1)�� ������ ��
			else if(sel==1) {
				System.out.println("�Է� �޴��� ���õǾ����ϴ�...");
				for(int i=0;i<per.length;i++) {
					String name=input.nextLine();
					int kor=Integer.parseInt(input.nextLine());
					int eng=Integer.parseInt(input.nextLine());
					int mat=Integer.parseInt(input.nextLine());
					per[i]=new Student91((i+1),name,kor,eng,mat);
				}							
			}
//���(2)�� ������ ��
			else if(sel==2) {
				System.out.println("��� �޴��� ���õǾ����ϴ�...");
				for(int i=0;i<per.length;i++)
					per[i].print();
			}			
//��ü ����(3)�� ������ ��			
			else if(sel==3) {
				System.out.println("���� �޴��� ���õǾ����ϴ�...");
				for(int i=0;i<per.length;i++) {
					per[i].print();
				}
				System.out.print("���� ���Ͻô� �̸��� �Է��Ͻÿ� : ");
				String user=input.nextLine();
//������ �̸� ��
				for(int i=0;i<per.length;i++) {
					if(per[i].getName().equals(user)) {
						System.out.println(per[i].getName()+"�� ��ü ���� ���� ����");
						String name=input.nextLine();
						int kor=Integer.parseInt(input.nextLine());
						int eng=Integer.parseInt(input.nextLine());
						int mat=Integer.parseInt(input.nextLine());		
						per[i].update(name, kor, eng, mat);
					}
				}
			}
//�κ� ����(4)�� ������ ��
			else if(sel==4) {
				System.out.println("�κ� ���� �޴��� ���õǾ����ϴ�...");
				System.out.print("�����ϰ� ���� ����� �̸��� ������ �Է��Ͻÿ� : ");
				String user=input.nextLine();
				String subject=input.nextLine();
				for(int i=0;i<per.length;i++) {
					if(per[i].getName().equals(user)) {
						System.out.print(per[i].getName()+"�� "+subject+" ���� ���� ����\n������ �Է��Ͻÿ� : ");
						int k=Integer.parseInt(input.nextLine());
//���� ����
						if(subject.equals("����")) {
							per[i].setKorean(k);
							System.out.println("���� : "+per[i].getKorean()+"��");
						}
//���� ����
						else if(subject.equals("����")) {
							per[i].setEnglish(k);
							System.out.println("���� : "+per[i].getEnglish()+"��");
						}
//���� ����
						else if(subject.equals("����")) {
							per[i].setMath(k);
							System.out.println("���� : "+per[i].getMath()+"��");
						}
					}
				}
			}
//���� Ȯ��(5)�� ������ ��
			else if(sel==5) {
				System.out.println("����Ȯ�� �޴��� ���õǾ����ϴ�...");
				int mm[]=new int [3];
				String rank1="";
				String rank2="";
				String rank3="";
//�迭�� ��� ����
				for(int i=0;i<per.length;i++) {
					mm[i]=per[i].getAvg();
				}
//�������� ����
				for(int i=0; i<per.length;i++) {
					boolean changed=false;
					for(int j=0;j<per.length-i-1;j++) {
						if(mm[j]>mm[j+1]) {
							int temp=mm[j];
							mm[j]=mm[j+1];
							mm[j+1]=temp;
							changed=true;
						}			
					}
					if(!changed) break;
				}
//���ڿ��� ����� �̸� ����
				for(int i=0; i<per.length;i++) {
					if(mm[2]==per[i].getAvg()) {
						rank1="1�� : "+per[i].getName();
					}
					else if(mm[1]==per[i].getAvg()) {
						rank2="2�� : "+per[i].getName();
					}
					else {
						rank3="3�� : "+per[i].getName();
					}
				}
				System.out.println(rank1+"/"+rank2+"/"+rank3);
			}
		}
	}
}