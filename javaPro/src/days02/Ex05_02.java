package days02;

public class Ex05_02 {
	public static void main(String[] args) {
		// 기본형 - 논리형(boolean)
		boolean gender;
		// 기억공간이 1바이트만큼 할당되고, 기억공간의 이름은 gender가 됨. 이 공간에는 true 또는 false 값이 저장됨.
		// 이 상태로 출력을 시도하면 에러 메시지가 뜸.
		// The local variable gender may not have been initialized. (초기화하라는 뜻)
		
		// gender = 100; 라고 입력하면 에러 메시지가 뜸.
		// Type mismatch: cannot convert from int to boolean. (자료형이 일치하지 않는다는 뜻)
		
		gender = true;
		System.out.println(gender);
		// 출력결과: true
		System.out.println("성별은 " + gender + "이다.");
		System.out.printf("성별은 %1$b(%1$B)(%1$s)이다.", gender); // 성별은 true(TRUE)(true)이다.
	}
}
