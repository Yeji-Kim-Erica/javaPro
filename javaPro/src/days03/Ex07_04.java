package days03;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오후 3:54:35
 * @subject
 * @content
 */
public class Ex07_04 {

	public static void main(String[] args) {
		
		/*
		 * 1. 일반 논리 연산자
		 * 	1) ! : 부정 연산자 / Not 연산자
		 * 	2) && : 일반 논리 AND 연산자 (논리곱 연산자)
		 * 	3) || : 일반 논리 OR 연산자 (논리합 연산자)
		 * 
		 * 2. 비트 논리 연산자
		 * 	1) ~ : 비트 부정 연산자 / 틸트 연산자
		 * 	2) & : 비트 논리 AND 연산자
		 * 	3) | : 비트 논리 OR 연산자
		 * 	4) ^ : e[X]clusive OR 연산자 / XOR 연산자 (exclusive : 베타적인)
		 */
		
		// [일반논리연산자 설명]
		
		// 부정연산자 ! 설명
		System.out.println(!true); // 출력결과: false
		System.out.println(!false); // 출력결과: true
		// System.out.println(!5 > 3); -> 오류 발생
		// The operator ! is undefined for the argument type(s) int
		// 연산자의 우선순위가 ! -> > 이기 때문
		// !가 먼저 연산되면 5라는 int를 부정할 수 없기 때문에 오류가 남
		
		// AND연산자 && 설명
		// true를 1로, false를 0이라고 생각하기 (논리곱)
		// true && true => true
		// false && true => false
		// true && false => false
		// false && false => false
		
		// OR연산자 || 설명 (논리합)
		// true || true => true
		// false || true => false
		// true || false => false
		// false || false => false 
		
		// 연산자 우선 순위 : ! > && > ||
		
		// 효율적 연산(short circuit evaluation)
		// ㄴ 예시: AND 연산자 계산을 할 때, 앞의 항에서 false가 인식되면 뒤의 항은 계산하지 않고 결과를 false로 냄.
		
		// 아파서 약먹느라 살짝 놓친 거 있는지 걱정됨. 확인해봐 나중에
		
		
		// [비트논리연산자 설명]
		
		// 비트 부정 연산자 ~ 설명
		System.out.println(10); // 출력결과: 10
		System.out.println(~10); // 출력결과: -11
		// 10의 2진수: 0000 2020
		// ~10의 2진수: ~ 0000 1010 -> 1111 0101 -> 보수처리하면 + 1111 0100 -> 0000 1011 -> -11
		
		// 비트 논리 AND 연산자 & 설명
		System.out.println(10 & 3); // 출력결과: 2
		//	 0000 1010
		// & 0000 0011
		// ------------
		// 	 0000 0010
		
		// 비트 논리 OR 연산자 | 설명
		System.out.println(10 | 3); // 출력결과: 11
		//	 0000 1010
		// | 0000 0011
		// ------------
		// 	 0000 1011
		
		// XOR 연산자 ^ 설명
		// 서로 달라야 참 (예: true^false는 true, true^true는 false)
		System.out.println(10 ^ 3); // 출력결과: 9
		//	 0000 1010
		// ^ 0000 0011
		// ------------
		// 	 0000 1001
		
		// 연산자 우선 순위 : ~, ! > & > ^ > | > && > ||
		// 논리 연산자의 우선순위는 암기해둬야 함
	}
	
}
