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
		System.out.println("자동차가 생성되었습니다. 현재 가스: " + this.gas);
	}
	double ward(int d) {
		gas=gas-d*0.2;
		return gas;
	}
	double fillgas() {
		System.out.print("가스를 어느정도 채울까요?");
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
		System.out.println("현재 남은 가스의 양은 : "+j.ward(100));
		System.out.println(j.fillgas());
		//j.forward(100);
		//System.out.println("현재 가스: " + j.gas);
		//System.out.println("현재 거리: " + j.distance);
	}

}
