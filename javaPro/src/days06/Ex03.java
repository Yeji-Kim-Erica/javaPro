package days06;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오전 11:10:13
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// for문: 1부터 10까지 홀수의 합 
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			if(i%2!=0) {
//			System.out.printf("%d+", i);
//			sum += i;
//			}
//		} // for i
//		System.out.printf("\b=%d\n", sum);
		
		// continue문 설명
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) continue;
//			System.out.printf("%d+", i);
//			sum += i;
//		} // for i
//		System.out.printf("\b=%d\n", sum);
		
		// while문
		// 1번째 방법
//		int sum = 0, i = 1;
//		while (i < 10) {
//			if (i % 2 != 0) {
//				System.out.printf("%d+", i);
//				sum += i;
//			}
//		} // while
//		System.out.printf("\b=%d\n", sum);
		
		// 2번째 방법
//		int sum = 0, i = 1;
//		while (i <= 10) {
//			if (i % 2 == 0) {
//				i++;
//				continue;
//			}
//			System.out.printf("%d+", i);
//			sum += i++;
//		} // while
//		System.out.printf("\b=%d\n", sum);
		
		int sum = 0, i = 1;
		while (i<=10) {
			if (i%2==0) {
				i++;
				continue;
			} // if
			System.out.printf("%d+", i);
			sum += i++;
		} // while
		System.out.printf("\b=%d", sum);
	} // main
	
}
