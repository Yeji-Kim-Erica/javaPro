package days03;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오후 3:34:36
 * @subject 산술연산자 + - * /
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		int i = 10, j = 3;
		
		System.out.println(i + j); // 출력결과: 13
		System.out.println(i - j); // 출력결과: 7
		System.out.println(i * j); // 출력결과: 30
		System.out.println(i / j); // 출력결과: 3 (int 나누기 int이기 때문에 int로 결과가 나옴. /는 몫을 구할 때 씀)
		// System.out.println((double)i / j); // 출력결과: 3.33333
		System.out.println(i % j); // 출력결과: 1 (나머지를 구하는 연산자)
		
		// [주의할 점]
		// '/' 또는 '%' 뒤에 0이 오면 오류가 남. (예: System.out.println(10 / 0);)
		// ArithmeticException: / by zero (-> 0 때문에 산술적 예외가 발생했다는 뜻)
		
		System.out.println(10.0 / 0); // 출력결과: Infinity (무한대)
		System.out.println(10.0 % 0); // 출력결과: NaN (Not a Number)
		
		
	}
	
}
