package days09;

/**
 * @author yejikim
 * @date 2025. 2. 13. - 오전 9:00:29
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (isPrimeNum(i)) {
				System.out.printf("%d+", i);
				sum += i;
			}
		} // for i

		System.out.printf("\b=%d\n", sum);

	} // main

	private static boolean isPrimeNum(int n) {
		if (n == 1)
			return false;
		else if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;
		// for (int j = 3; j <= n/2; j++) {
		for (int i = 3; i <= Math.sqrt(n); i+=2) {
			if (n%i == 0) return false;
		} // for j
		return true;
	}

} // class