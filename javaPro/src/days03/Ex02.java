package days03;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오전 10:40:09
 * @subject
 * @content
 */

public class Ex02 {
	public static void main(String[] args) {
		
		// 012가 자릿수 채우기용인지 8진수인지 구분하기: 문맥을 보면 됨
		int i = 012; // 여기서는 8진수로 인식됨
		System.out.println(i); // 출력결과: 10
		
		String name = "이창익";
		
		name = name + "최승호";
		name += "최승호"; // += : 복합대입연산자
		// 위의 두줄은 완전히 동일한 코딩임.
		
		System.out.println(name);
		
	}
}
