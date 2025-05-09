package days24;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject
 * @content
 */
public class Ex08_03 {

	public static void main(String[] args) {
		/* [제네릭의 제한]
		 	1. 객체별로 다른 타입으로 지정해서 동작하도록 만든 기능(기술)
		 	-> 따라서 static 필드는 선언할 수 없다.
		 	
		 	2. static 메서드의 매개변수 타입으로도 T를 사용할 수 없다.
		 	
		 	3. T 타입의 배열은 선언할 수 있다.
		 */
		
		
	} // main
	
} // class

class Box2<T> {
	// Cannot make a static reference to the non-static type T
	// static T item;
	T item;
	T [] itemArr; // T 타입의 배열은 선언할 수 있다.
	int compare(T t1, T t2) {
		return 0;
	}
//	static int compare(T t1, T t2) {
//		return 0;
//	}
	
}