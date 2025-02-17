package days05;

/**
 * @author yejikim
 * @date 2025. 2. 7. - 오전 11:08:46
 * @subject 조건반복문 while문
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// [for문] 1~10합 출력
		/*
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		} // for i
		System.out.printf("1~10=%d\n",sum);
		
		// 조건문의 결과로 실행되는 코드가 블록 안에 한줄 뿐이라면, {} 생략이 가능하다.
		// 따라서 들여쓰기가 굉장히 중요하다. (가독성을 위해)
		if (sum > 1)
			System.out.println("test1"); // 조건이 참일 때만 출력됨
		System.out.println("test2"); // 조건에 상관없이 출력됨 (for문과 별개의 코드임)
		*/
		
		// [while문]
		// ㄴ 조건반복문 : condition이 참일 동안 {} 블럭을 실행하는 반복문
		// 그냥 조건문과의 차이: 조건이 참이면 실행하는 것은 동일, 다른 점: 실행 후 다시 조건으로 돌아가서 다시 물어본다. 조건이 거짓이 되면 빠져나온다.
		/*
		while (condition) {
			
		} // while
		
		do {
			
		} while (condition);
		*/
		
		int i = 1;
		int sum = 0;
		
		while (++i <= 3) {
			System.out.printf("%d+", i);
			sum += i;
		} // while
		System.out.printf("=%d\n", sum);
		
	} // main

}
