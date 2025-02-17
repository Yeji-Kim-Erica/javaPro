package days02;

/**
 * @author yejikim
 * @date 2025. 2. 4. - 오후 3:03:25
 * @subject flags, width 사용법
 * @content
 */

public class Ex05_03 {
	public static void main(String[] args) {
		
		double avg = 78.96844;
		System.out.printf("평균=%f\n", avg);
		System.out.printf("평균=%+010.2f\n", avg); // 자동으로 반올림
		// +0 : flags
		
		System.out.printf("평균=%e\n", avg);
		// 지수 표현으로 실수를 나타낼 때 %e를 사용
		
		
		System.out.printf("-".repeat(50)); // 구분선
// 		%[argument_index$][flags][width]conversion
//		%[argument_index$][flags][width][.precision]conversion
		
		String name = "admin";
		int age = 20;
		
		// [width 설명]
		System.out.printf("[%s]\n", name); // 출력결과: [admin]
		// width 값 10을 줬을 때
		System.out.printf("[%10s]\n", name); // 출력결과: [     admin]
		// width 값 -10을 줬을 때
		System.out.printf("[%-10s]\n", name); // 출력결과: [admin     ]
		
		// [flags 설명]
		System.out.printf("[%d]\n", age); // 출력결과: [20]
		// flags 값 : 0
		System.out.printf("[%04d]\n", age); // 출력결과: [0020]
		// flags 값 : ,
		int money = 12573000;
		System.out.printf("[%,d]\n", money); // 출력결과: [12,573,000]
		// flags 값 : (
		System.out.printf("[%(d]\n", 30); // 출력결과: [30]
		System.out.printf("[%(d]\n", -30); // 출력결과: [(30)]
		
		System.out.printf("-".repeat(50)); // 구분선
		// flags 값 d : 정수를 10진수로 출력
		System.out.printf("[%d]\n", 10);  // 출력결과: [10]
		// flags 값 o : 정수를 8진수로 출력
		System.out.printf("[%#o]\n", 10);  // 출력결과: [012]
		// flags 값 x : 정수를 16진수로 출력
		System.out.printf("[%1$x][%1$#X]", 10); // 출력결과: [a][0XA]
		// # : 어느 진수로 작성된 건지 알 수 있음. (예: 8진수는 0, 16진수는 0X)
		
		/*
		 * 2진법 : 0 1
		 * 8진법 : 0 1 2 3 4 5 6 7
		 * 10진법 : 0 1 2 3 4 5 6 7 8 9
		 * 16진법 : 0 1 2 3 4 5 6 7 8 9 a b c d e f
		 */
		
	} // main
} // class
