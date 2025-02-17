package days09;

/**
 * @author yejikim
 * @date 2025. 2. 13. - 오전 10:17:23
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 팩토리얼(factorial) == 계승
		// n!
		// 0! = 1 정의
		// 자연수에서만 사용가능한 개념
		
		// int result = factorial(5);
		int result = recursiveFactorial(5);
		System.out.println(result);
		
	} // main

	private static int recursiveFactorial(int n) {
		if (n == 1 || n == 0) return 1;
		else return n * recursiveFactorial(n - 1);
	}

	private static int factorial(int n) {
		// 1*2*3*4*.....*n = n!
		int result = 1; // 곱하기 연산의 기본값은 1을 주어야 한다. (0*100=0 이기 때문)
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d*", i);
			result *= i;
		} // for i
		
		return result;
	}
	
}
