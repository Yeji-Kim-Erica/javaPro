package days05;

/**
 * @author yejikim
 * @date 2025. 2. 7. - 오후 2:29:12
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
		// [while문 사용해서 1~10까지 합 출력]
		
		int i = 1, sum = 0;
		
		// 자바에서는 조건문에 true(참)값을 넣어 무한루프 시킬 때, 1을 넣어서는 안된다. (int를 boolean으로 변환 못한다고 함.) 그냥 true 라고 써야 함.
		// Type mismatch: cannot convert from int to boolean
		
		while (i <= 10) {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		} // while
		System.out.printf("\b=%d", sum);
		
	} // main
	
}
