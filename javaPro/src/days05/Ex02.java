package days05;

/**
 * @author yejikim
 * @date 2025. 2. 7. - 오전 10:36:16
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// 대소문자를 구분하지 않고 문자열 비교
		String n1 = "admin", n2 = "Admin";
		n1 = n1.toUpperCase();
		n2 = n2.toUpperCase();
		
		n1 = n1.toLowerCase();
		n2 = n2.toLowerCase();
		System.out.println(n1.equals(n2)?"같다":"다르다");
		
		// 둘을 하나로 통일
		// 또는 함수를 사용
		
		System.out.println(n1.equalsIgnoreCase(n2));
		
	} // main
	
}
