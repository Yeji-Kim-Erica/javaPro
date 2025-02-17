package days09;

/**
 * @author yejikim
 * @date 2025. 2. 13. - 오전 10:33:52
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		// 거듭제곱(exponentiation) == 멱
		// 2^3
		// 2를 밑수(base), 3을 지수(exponent, power)라고 함.
		// 밑수를 지수만큼 반복해서 곱하는 수

		// double result = power(2, -3);
		double result = recursivePower(2, -3);
		System.out.println(result);

	} // main

	private static double recursivePower(int b, int e) {
		if (e < 0)	return 1/recursivePower(b, -e);
		else if (e == 1) return b;
		else return b * recursivePower(b, e - 1);
	}

	private static double power(int b, int e) {
		int result = b;
		int e2 = Math.abs(e);
		for (int i = 1; i < e2; i++) result *= b;

		return e >= 0 ? result : (double) 1 / result;
	}

} // class
