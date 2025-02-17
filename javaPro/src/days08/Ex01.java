package days08;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오전 7:21:05
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
	
		// [정보처리기사 실기] 1+2+4+7+...+??=???
		
		// 내가 한 코딩
//		int sum = 0, i = 1, num = 1;
//		while (i<101) {
//			System.out.printf("%d+", i);
//			sum += i;
//			i += num++;
//		} // while
//		System.out.printf("\b=%d\n", sum);
		
		// 모범답안
		// 필요한 변수: 결과값, 항(term), 증가치
		int sum = 0;
		int term = 1;
		int inc = 1;
		
		while (term<=100) {
			sum += term;
			System.out.printf("%d+", term);
			term += inc++;
		} // while
		System.out.printf("\b=%d\n", sum);

	} // main

} // class
