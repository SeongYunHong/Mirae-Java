abstract class Animal{
	abstract void move();
}
class Bird extends Animal{
	void move() {System.out.println("나는 나는 새이다.");}
}
class Fish extends Animal{
	void move() {System.out.println("나는 수영을 하는 물고기이다.");}
}
class Dog extends Animal{
	void move() {System.out.println("나는 킁킁거리며 돌아다니는 개이다.");}
}
public class Driver {
	public static void main(String[] args) {
		Animal[] animalArray= new Animal[3];
		int index;
		
		animalArray[0]= new Bird();
		animalArray[1]= new Fish();
		animalArray[2]= new Dog();
		
		for(index=0;index<animalArray.length;index++) {
			animalArray[index].move();
		}
	}
}