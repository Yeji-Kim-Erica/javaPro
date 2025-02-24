package days16;

import java.util.stream.IntStream;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject [가변인자]
 * @content JDK1.5에 추가된 기능: 메소드의 매개변수의 개수가 고정되지 않고 동적으로 지정할 수 있음
 */
public class Ex03 {

	public static void main(String[] args) {
		
		System.out.println(sum(1, 2)); // 출력결과: 3
		System.out.println(sum(1, 2, 3)); // 출력결과: 6
		
	} // main
	
	// 정수들의 합을 구해서 반환하는 메소드를 선언
	public static int sum(int ... args) { // 가변인자를 가진 sum 메소드를 선언해서 사용하면 편리
		int result = 0;
		for (int i : args) {
			result += i;
		}
		return result;
		// return IntStream.of(args).sum();
	}
	
	/* [가변인자 사용시 주의할 점]
		1. 가변인자는 내부적으로 배열을 사용
		2. 오버로딩을 하지 않는 게 좋다
		3. 비효율적이기 때문에 꼭 필요한 곳에만 사용하는 것을 권장
		4. 매개변수의 제일 마지막에 가변인자를 선언한다.
			ㄴ 안그러면 어디까지가 가변인자에 포함인지 알 방법이 없으므로
	
	 */
	
} // class
