package days03;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오후 2:01:33
 * @subject
 * @content
 */
public class Ex06 {
	
	public static void main(String[] args) {
		// Byte.parseByte("90") -> 90
		// int로 표현할 수 있는 가장 큰 값 : 2^31 = 2,147,483,647
		// long으로 표현할 수 있는 가장 큰 값 : 900경...
		
		// 래퍼(Wrapper)클래스 : 기본형이 포장된 클래스
		// 기본형 int -> 기능이 구현된 클래스(물건,부품,객체,객체)
		// Integer -> int와 관련된 기능을 사용/구현할 수 있게 해주는 클래스
		System.out.println(Integer.MAX_VALUE); // 출력결과: 2147483647
		
		String strKor = "90";
		int kor = Integer.parseInt(strKor);
		
		// Short -> 기본형 short의 wrapper class
	}

}
