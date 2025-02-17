package days03;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오후 3:44:42
 * @subject 비교연산자
 * @content
 */
public class Ex07_03 {
	
	public static void main(String[] args) {
		
		// 비교연산자 : 크고 작음, 같고 다름을 비교하는 연산자
		//  ㄴ 결과값은 boolean으로 나옴 (true/false)
		
		int i = 10, j = 3;
		
		System.out.println(i > j); // 출력결과: true
		System.out.println(i < j); // 출력결과: false
		System.out.println(i >= j); // 출력결과: true
		System.out.println(i <= j); // 출력결과: false
		
		// i와 j가 같다를 표현하는 방법 : ==
		System.out.println(i = j); // 출력결과: 3
		// = 는 현재 대입연산자로 쓰이고 있음. i에 j 값인 3이 할당되어 3이 출력됨
		System.out.println(i == j); // 출력결과: false
		// 바르게 쓰인 경우. ==로 =를 두번 써야함.
		
		// i와 j가 다르다를 표현하는 방법 : !=
		System.out.println(i != j); // 출력결과: true
		// System.out.println(i =! j); 는 에러남.
		// The operator ! is undefined for the argument type(s) int
		// !(부정연산자)가 먼저 연산되는데, j는 int이기 때문에 반전될 수 없음. boolean 값만 반전이 가능함. (true는 false로, false는 true로)
		
	}

}
