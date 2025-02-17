package days02;

/**
 * @author yejikim
 * @date 2025. 2. 4. - 오전 10:21:52
 * @subject 상수 : 한번만 할당할 수 있는 기억공간 + 초기화
 * @content
 */

public class Ex01 {
	public static void main(String[] args) {
		// 상수 선언이 필요한 예시 상황: 수학 관련 코딩 중 원주율 값이 지속적으로 필요할 때
		/* <자료형 정리>
		 * 문자열 String
		 * 실수 double
		 */
		// 원주율 3.141592... 라는 실수를 저장하려면?
		// 원주율을 저장할 PI라는 변수를 선언. 기타제어자 final을 사용(값을 함부로 변경하지 못하게 하려면).
		// 자료형 변수명 [=초기값];
		final double PI = 3.141592;
		// 상수의 변수명은 전부 대문자로 작성하되, 단어와 단어 사이에는 _(언더바, 밑줄)을 사용함.
		// PI = 3.5; 이런식으로 다른 값을 할당하려고 시도하면 에러메시지가 뜸.
		// The final local variable PI cannot be assigned.
		// It must be blank and not using a compound assignment.
		// 상수이기 때문에 다른 값을 할당할 수 없다.
		System.out.println(PI);
	}
}
