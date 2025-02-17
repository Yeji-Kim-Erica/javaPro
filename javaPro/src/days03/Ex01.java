package days03;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오전 10:04:38
 * @subject 복습 퀴즈 풀이
 * @content
 */

public class Ex01 {
	public static void main(String[] args) {
		int a, b, c, d;
		a = b = c = d = 10;
		
		double money = 1234569.7089;
		// System.out.printf("\%,.2f \n", money); 오류 발생
		// Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		System.out.printf("\\%,.2f \n", money);
		
		String result = String.format("\\%,.2f \n", money);
		System.out.println(result);
		
		// format 메서드는 특정 값을 원하는 자료형으로 변경하기 위해 사용
		//String format 메서드는 값을 string으로 변경할 때 사용
	}
}
