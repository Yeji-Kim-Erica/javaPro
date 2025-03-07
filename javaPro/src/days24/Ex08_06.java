package days24;

import java.util.ArrayList;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject 와일드카드 ?
 * @content
 			<? extends T> T의 자손만 가능
 			<? super T>	  T의 조상만 가능
 			<?> == <? extends Object> 제한이 없다는 의미
 */
public class Ex08_06 {

	public static void main(String[] args) {
		// [1]
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		Juice juice = Juicer.makeJuice(fruitBox);
		System.out.println(juice);
		
		// [2]
		FruitBox<Apple> appleBox = new FruitBox<>();
		
		Juice appleJuice = Juicer.makeJuice(appleBox);
		// The method makeJuice(FruitBox<Fruit>) in the type Juicer
		// is not applicable for the arguments (FruitBox<Apple>)
		
		System.out.println(appleJuice);
		
	} // main
	
} // class

class Fruit { public String toString() { return "Fruit"; } }
class Apple extends Fruit{ public String toString() { return "Apple"; } }
class Grape extends Fruit{ public String toString() { return "Grape"; } }

// 제한된 제네릭 클래스 선언
class FruitBox<T extends Fruit> extends Box05<T>{
	
}

class Box05<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { this.list.add(item); }
	T get(int i) { return this.list.get(i); }
	int size() { return this.list.size(); }
	public String toString() { return this.list.toString(); }
}

// 과일 -> 주스
class Juice{
	// 구현했다고 가정
}

// 과일상자 -> 주스를 생산하는 기기
class Juicer{
	/* [1]
	static Juice makeJuice(FruitBox<Fruit> box) {
		//
		//
		return new Juice();
	}
	
	static Juice makeJuice(FruitBox<Apple> box) {
		//
		//
		return new Juice();
	}
	
	static Juice makeJuice(FruitBox<T extends Fruit> box) {
		//
		//
		return new Juice();
	}
	*/
	
	/* [2]
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		//
		//
		return new Juice();
	}
	*/
	
	//   < 제네릭 메서드 설명 >
	//		ㄴ 메서드의 선언부에 제네릭 타입이 선언된 메서드
	//		ㄴ 예: Collections.sort()
	//		ㄴ 선언부에서 제네릭 타입이 선언되는 위치
	//			: 리턴 자료형 앞
	//		ㄴ 제네릭 클래스의 <T>와는 별개임 (같지 X)
	// 
	
	// [3] 제네릭 메서드 선언 : [2]를 제네릭 메서드로 변환해보기
	static <T extends Fruit> Juice makeJuice(FruitBox<? extends Fruit> box) {
		//
		//
		return new Juice();
	}
	
	// [4] 제네릭 메서드 변환 예제
	/*
	static void printAll(ArrayList<? extends Fruit> list, 
						 ArrayList<? extends Fruit> list2) {
		// 구현 코딩
	}
	*/
	
	static <T extends Fruit> void printAll(ArrayList<T> list, 
										   ArrayList<T> list2) {
		// 구현 코딩
	}
	
}






















