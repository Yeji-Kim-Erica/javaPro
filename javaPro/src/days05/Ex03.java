package days05;

/**
 * @author yejikim
 * @date 2025. 2. 7. - 오전 10:43:36
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
//		int i;
//		for (i = 0; i <= 10; i++) {
//			System.out.println(i);
//		} // for i
//		System.out.println(">> 빠져나올 때의 i 값 = " + i);
	
		// [시험문제] 1부터 10까지의 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.printf("%d+", i);
		} // for i
		System.out.printf("=%d", sum);
	} // main
	
}
