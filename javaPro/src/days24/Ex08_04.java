package days24;

import java.util.ArrayList;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject [제네릭 클래스의 객체 생성과 사용]
 * @content
 */
public class Ex08_04 {

	public static void main(String[] args) {
		/*
		Box03<Fruit> fruitBox = new Box03<Fruit>();
		Box03<Apple> appleBox = new Box03<Apple>();
		Box03<Grape> grapeBox = new Box03<Grape>();
		Box03<Toy> toyBox = new Box03<Toy>();
		
		// 타입 불일치 예외발생
		// Box03<Apple> appleBox2 = new Box03<Grape>();
		// Type mismatch: cannot convert from Box03<Grape> to Box03<Apple>
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		// fruitBox.add(new Toy());
		// The method add(Fruit) in the type Box03<Fruit> is not applicable for the arguments (Toy)
		
		Box03 box = new Box03();
		box.add(new Fruit());
		box.add(new Apple());
		box.add(new Grape());
		box.add(new Toy());
		*/
	} // main
	
} // class

// Fruit 클래스
//	ㄴ 자식클래스 Apple
//	ㄴ 자식클래스 Grape
// Toy 클래스

/*
class Fruit{
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

// 제네릭 클래스 선언
class Box03<T>{
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		this.list.add(item);
	}
	
	T get(int i) {
		return this.list.get(i);
	}
	
	int size() {
		return this.list.size();
	}
	
	public String toString() {
		return this.list.toString();
	}
}
*/