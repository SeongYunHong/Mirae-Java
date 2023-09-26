package mirae4.com;
//데이터 타입이 입력되는 자리에 대표 타입으로 대치
class Box<T>{ //Generic class
	private T t;
	public void add(T t) {this.t=t;}
	public T get() {return t;}
}
public class e_01_box {
	//Generic funtion (C++ : Template) : 일반화 프로그램
	public static <E> void printArray(E[] inputArray) { //<E> : 데이터 타입
		for(E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer [] intArray = {1, 2, 3, 4, 5};
		Double [] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character [] charArray = {'H', 'E', 'L', 'L', 'O'};
		printArray(intArray); //Integer //compile-time에 어떤 타입으로 변환할지 결정
		printArray(doubleArray); //Double
		printArray(charArray); //Character
		
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		integerBox.add(Integer.valueOf(10));
		stringBox.add(new String("안녕 일반화 프로그램 "));
		System.out.printf("정수형 프로그램 : %d\n\n",integerBox.get());
		System.out.printf("문자형 프로그램 : %s\n\n",stringBox.get());
	}
}