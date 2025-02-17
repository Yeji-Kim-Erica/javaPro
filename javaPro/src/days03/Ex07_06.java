package days03;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오후 4:43:45
 * @subject
 * @content
 */
public class Ex07_06 {

	public static void main(String[] args) {
		
		// ?: 삼항연산자 또는 조건연산자
		int x = 30, y;
		y = x > 10 ? 1 : 2;
		// 첫번째 항 : 조건식 (예: x > 10)
		// 두번째 항 : 조건식이 참일 때 결과값 (예: 1)
		// 세번째 항 : 조건식이 거짓일 때 결과값 (예: 2)
		System.out.println(y); // 출력결과: 1
		
		int i = 30, j;
		j = i > 5 ? (i < 10 ? 1 : 2) : 200; // 삼항연산자 안에 삼항연산자가 중첩적으로 올 수 있다.
		System.out.println( j ); // 출력결과: 2
		
	}
	
}
