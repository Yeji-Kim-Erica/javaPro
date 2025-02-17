package days04;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오전 11:15:29
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		// 두 문자열을 비교할 때 String.equals() 메서드를 사용안해도 되는 경우
		String n1 = "홍길동";
		String n2 = "홍길동";
		
		System.out.println(n1 == n2); // 출력결과: true
		System.out.println(n1.equals(n2)); // 출력결과: true
		
	}
	
}
