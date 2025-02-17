package days05;

/**
 * @author yejikim
 * @date 2025. 2. 7. - 오후 12:15:21
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		
		// [for] 1+2+...+10=55 (마지막에 + 없이 예쁘게)
		int sum = 0;
/*
		for (int i = 1; i <= 10; i++) {
//			[1번째 방법 : if else문]
//			if (i < 10) {
//	             System.out.printf("%d+",i);
//	          } else {
//	             System.out.printf("%d",i);
//	          }
			
//			[2번째 방법 : 삼항연산자]
//			System.out.printf(i==10?"%d":"%d+",i);
			sum += i;   
		} // for i
		
//			[3번째 방법 : \b]
		System.out.printf("\b=%d\n", sum);
*/
		// 초기식, 조건식, 증감식은 여러 개를 한번에 쓸 수도 있음.
		for (int j = 1, k = 10; j <= 10 && k == 0; j++, k--) {
		}
		
		int i = 10;
		for ( ; ; ) {
			if(i == 0) break; // 제어문에서 빠져나오는 코드 break (메서드의 경우는 return)
			System.out.printf("%d+", i);
			sum += i;
			// 또는 이 자리에 if(i == 1) break; 넣어도 됨.
			i--;
		} // for i
		// Unreachable code : 실행될 수 없는 코드 (for문이 break 없이 무한루프가 되면 아래 코드는 수행이 불가해지기 때문에 나온다.)
		System.out.printf("\b=%d",sum);
		
	} // main

}
