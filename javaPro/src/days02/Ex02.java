package days02;

public class Ex02 {
	public static void main(String[] args) {
		// String name; 만 작성하면 에러가 뜸.
		// The local variable(=지역변수) name may not have been initialized(=초기화). (에러메세지)
		// 초기화: 초기값을 할당하는 작업
		// 지역변수: 해당 범위 연산자 내에서만 사용할 수 있는 변수
		// 범위(영역)를 나타내는 연산자: {}, ()
		// 자동으로 initialize를 하면 null이라는 값을 넣어줌.
		// String의 기본값은 null이라는 말.
		String name = "김예지";
		System.out.println(name);
		
	} // main
} // class
