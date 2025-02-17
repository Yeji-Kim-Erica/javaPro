package days03;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오후 5:06:34
 * @subject
 * @content
 */
public class Ex07_07 {

	public static void main(String[] args) {
		
		// 단항연산자 중 부호연산자 +, -
		System.out.println( +3 ); // 출력결과: 3
		System.out.println( -3 ); // 출력결과: -3
		
		// instanceof 연산자 : 클래스 수업 때 다룰 연산자
		
		// 증감연산자 ++, --
		// [시험 문제] 어떤 기억 공간의 값을 1 증가시키는 코딩을 하세요.
		int x = 10;
		// 1) x = x + 1; (대입연산자와 산술연산자를 활용)
		// 2) x += 1; (복합대입연산자를 활용)
		// 3) x++; (증감연산자를 활용) -> 여기서 x는 1씩만 증감시킬 수 있음 (증감연산자의 한계)
		
		int y = ++x; // 전위형 증감연산자
		int z = x++; // 후위형 증감연산자 (후위형은 다른 연산자가 먼저 처리됨, 양보의 개념 +가 원래는 먼저지만, =에게 양보. 니가 먼저 해~)
		
		// 단독으로 증감연산자를 사용하는 경우
		System.out.println(y); // 출력결과: 11
		System.out.println(z); // 출력결과: 11
		// y와 z의 출력값이 같음 -> 단독으로 증감연산자를 사용할 때는 전위형 == 후위형
		
		int i = 10;
		// 전위형을 썼을 때
		int j = ++i;
		System.out.printf("i=%d, j=%d \n", i, j); // 출력결과: i=11, j=11
		
		int k = 10;
		// 후위형을 썼을 때
		int q = k++;
		System.out.printf("k=%d, q=%d", k, q); // 출력결과: k=11, q=10
		
	}
	
}
