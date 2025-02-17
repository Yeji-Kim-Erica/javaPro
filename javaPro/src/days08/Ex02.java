package days08;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오전 10:45:46
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {

		// [정보처리기사 실기] 피보나치 수열
		// 1+1+2+3+5+8+...=???

//		int sum = 0, term1 = 1, term2 = 1, trial = 1;
//		while (trial <= 10) {
//			sum = term1 + term2;
//			System.out.printf("%d+", term1);
//			trial++;
//			System.out.printf("%d+", term2);
//			trial++;
//			term1 += term2;
//			term2 += term1;
//		} // while
//		System.out.printf("\b=%d\n", sum);
		
		// [1]
//		int [] m = new int[10];
//		m[0] = m[1] = 1;
//		int sum = 2;
//		System.out.printf("%d+%d+", m[0], m[1]);
//		
//		for (int i = 2; i < m.length; i++) {
//			m[i] = m[i-2]+m[i-1];
//			sum += m[i];
//			System.out.printf("%d+", m[i]);
//		} // for i
//		System.out.printf("\b=%d\n", sum);
		
		// [2]
		int firstTerm=1, secondTerm=1, thirdTerm=1;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		int termLength = 2;
		
		while (++termLength<=10) {
			thirdTerm = firstTerm+secondTerm;
			System.out.printf("%d+", thirdTerm);
			sum += thirdTerm;
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
		} // while
		
		System.out.printf("=%d", sum);
	} // main

}
