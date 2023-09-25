abstract class Animal{
	abstract void move();
}
class Bird extends Animal{
	void move() {System.out.println("���� ���� ���̴�.");}
}
class Fish extends Animal{
	void move() {System.out.println("���� ������ �ϴ� ������̴�.");}
}
class Dog extends Animal{
	void move() {System.out.println("���� ůů�Ÿ��� ���ƴٴϴ� ���̴�.");}
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