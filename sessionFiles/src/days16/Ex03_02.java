package days16;

/**
 * @author kenik
 * @date 2025. 2. 24. - 오전 10:47:11
 * @subject [가변인자]
 * @content JDK1.5 메서드의 매개변수의 갯수가 고정->동적 지정할 수 있다.
 */
public class Ex03_02 {

	public static void main(String[] args) {

		System.out.println(  sum(1, 2) );
		System.out.println(  sum(1, 2, 3) );
		System.out.println(  sum(1, 2, 3, 4) );

		int [] m = {1,2,3,4,5,6};
		System.out.println( sum(m) );
	} // main
	
	// 가변인자를 가진 sum 메서드를 선언해서 사용하면 편리.
	// int... args
	// [가변인자 사용시 주의할 점]
	// 1. 가변인자는 내부적으로 배열을 사용.
	// 2. 오버로딩을 하지 않는 게 좋다.
	// 3. 비효율적이기 때문에 꼭 필요한 곳에서만 사용.
	// 4. 제일 마지막에 가변 인자를 선언한다. 
	public static int sum(int... args) {
		int result = 0;
		for (int i : args) {
			result += i;
		}
		return result;
	}
	

} // class






