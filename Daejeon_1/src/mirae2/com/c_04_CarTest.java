package mirae2.com;

import java.util.Scanner;

public class c_04_CarTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Car[]cars=new Car[3];
		for(int i=0;i<cars.length;i++) {
			cars[i]=new Car(input.next());
		}
//		cars[0] = new Car("소나타");  
//		cars[1] = new Car("아반떼");
//		cars[2] = new Car("아우디");
		for(int i =0; i<cars.length;i++) {
			cars[i].drive();
		}
				
	}
}