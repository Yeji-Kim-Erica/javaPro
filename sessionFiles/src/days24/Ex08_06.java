package days24;

import java.util.ArrayList;

/**
 * @author kenik
 * @date 2025. 3. 7. - 오후 3:33:45
 * @subject   와일드 카드(?)  
 * @content   <? extends T>  T의 자손만 가능
 *            <? super T>    T의 조상만 가능
 *            <?>  == <? extends Object> 제한 없음
 */
public class Ex08_06 {

	public static void main(String[] args) {
		
		// [1]
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		Juice juice = Juicer.makeJuice(fruitBox);
		System.out.println( juice ); // days24.Juice@1e643faf

		// [2]
		FruitBox<Apple> appleBox = new FruitBox<>();
		// The method makeJuice(FruitBox<Fruit>) in the type Juicer 
		// is not applicable for the arguments (FruitBox<Apple>)
		juice = Juicer.makeJuice(appleBox);
		System.out.println( juice ); // days24.Juice@1e643faf
	} // main

} // class

class Fruit{	public String toString() { return "Fruit";	}}
class Apple extends Fruit{	public String toString() {return "Apple";	}}
class Grape extends Fruit{	public String toString() {return "Grape";	}}

// 제한된 제네릭 클래스 선언
class FruitBox<T extends Fruit> extends Box05<T>{
	
}

class Box05<T>{
	ArrayList<T>  list = new ArrayList<T>();
	void add(T item) {    this.list.add(item);  }
	T get(int i) {  return  this.list.get(i); }
	int size() {  return this.list.size();  }
	public String toString(){  return this.list.toString(); }
}

// 과일 -> 쥬스
class Juice{
	// 구현~~ (가정)
}

// 과일상자 -> 쥬스를 생산하는 기기
class Juicer{
	
	/* [1]
	static Juice makeJuice( FruitBox<Fruit> box ) {
		// 
		//
		return new Juice();
	}
	
	static Juice makeJuice( FruitBox<Apple> box ) {
		// 
		//
		return new Juice();
	}
	*/
	
	// [2]
	/*
	static Juice makeJuice( FruitBox<? extends Fruit> box ) {
		// 
		//
		return new Juice();
	}
	*/
	
	// [3] 제네릭 메서드로 선언
	static <T extends Fruit> Juice makeJuice( FruitBox<T> box ) {
		// 
		//
		return new Juice();
	}
	
	// [3] 제네릭 메서드 설명. 4:03 수업 시작~ 
	//  ㄴ 메서드의 선언부에 제네릭 타입이 선언된 메서드
	//  ㄴ Collections.sort() 제네릭 메서드 
	//  ㄴ  선언부에 제네릭 타입이 선언되는 위치 ? 
	//              리턴자료형 바로 앞에 
	//  ㄴ 제네릭 클래스의 <T>와는 별개 X
	//   예) 위의 [2] 메서드 -> 제네릭 메서드로 변환
	
	// [4] 제네릭 메서드 변환 예제)
	/*
	static void printAll( ArrayList<? extends Fruit> list
			, ArrayList<? extends Fruit> list2 ) {
		// 구현 코딩
		// 구현 코딩
		// 구현 코딩
	}
	*/
	static <T extends Fruit> void printAll( ArrayList<T> list
			, ArrayList<T> list2 ) {
		// 구현 코딩
		// 구현 코딩
		// 구현 코딩
	}
}

  