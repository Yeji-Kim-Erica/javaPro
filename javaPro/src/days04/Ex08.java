package days04;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오후 5:26:01
 * @subject for문, 확장 for문(for each문)
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// for문의 구조
		// for (초기식; 조건식; 증감식) {}
		
		// 같은 이름을 10번 출력
		for (int i = 1; i <= 10; i++) {
			System.out.printf("홍길동-%d\n", i);			
		} // for i
		
		// 아래 식은 무한루프일까? 아님.
		for (int j = 1; j <= 10; j--) {
			System.out.printf("홍길동-%d\n", j);		
		} // for i
		
		int i = Integer.MIN_VALUE;
		System.out.println(i); // -2147483648
		long l = i - 1;
		System.out.println(l); // 2147483647
		// i가 표현할 수 있는 최대 음수까지 표현 후 양수가 되므로 무한루프가 아님.
		
		
	} // main
	
}
