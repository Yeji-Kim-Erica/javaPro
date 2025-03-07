package days24;

import java.util.ArrayList;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject [제한된 제네릭 클래스]
 			  ㄴ T라는 타입 매개변수에 지정할 수 있는 타입의 종류를 제한
 * @content
 */
public class Ex08_05 {

	public static void main(String[] args) {
		/* [모든 타입(T)을 담을 수 있는 상자]
		Box04<Fruit> fruitBox = new Box04<Fruit>();
		Box04<Apple> appleBox = new Box04<Apple>();
		Box04<Grape> grapeBox = new Box04<Grape>();
		Box04<Toy> toyBox = new Box04<Toy>();
		*/
		
		/*
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		FruitBox<Toy> toyBox = new FruitBox<Toy>();
		*/
		
		// Bound mismatch:
		// The type Toy is not a valid substitute
		// for the bounded parameter <T extends Fruit>
		// of the type FruitBox<T>
		
	} // main
	
} // class

/*
interface Eatable{}

class Fruit implements Eatable{
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
// T는 모든 타입(T)을 담을 수 있는 상자를 만드는 클래스
class Box04<T>{
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


//[제한된 제네릭 클래스 선언]

// 모든 타입이 아니라 과일들만 담을 수 있는 상자 클래스 선언
class FruitBox<T extends Fruit>{ // Fruit을 물려받은 Type들만 사용 가능
	
}

// 먹을 수 있는 타입들만 담을 수 있는 상자 클래스 선언
class EatBox<T extends Eatable> {
	
}

// Eatable 인터페이스를 구현한 Fruit 클래스의 자식 클래스만 타입으로 사용하겠다고 제한
class EatFruitBox<T extends Fruit & Eatable> {
	
}
*/