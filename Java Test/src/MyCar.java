import java.util.Scanner;

public class MyCar {
	Scanner a = new Scanner(System.in); 
	double gas=0;
	int distance=0;
	
	MyCar(){
		this(100);
	}
	MyCar(int gas){
		this.gas = gas;
		System.out.println("�ڵ����� �����Ǿ����ϴ�. ���� ����: " + this.gas);
	}
	double ward(int d) {
		gas=gas-d*0.2;
		return gas;
	}
	double fillgas() {
		System.out.print("������ ������� ä����?");
		double m=a.nextDouble();
		return gas+m;
	}
	//void forward(int dist) {
	//	if (this.gas - 0.2 * dist >= 0) {
	//		this.gas -= 0.2 * dist;
	//		this.distance += dist;
	//	}
	//}
	public static void main(String[] args) {
		MyCar j=new MyCar(80);
		System.out.println("���� ���� ������ ���� : "+j.ward(100));
		System.out.println(j.fillgas());
		//j.forward(100);
		//System.out.println("���� ����: " + j.gas);
		//System.out.println("���� �Ÿ�: " + j.distance);
	}

}
