package days02;

public class Ex03 {
	public static void main(String[] args) {
		// 문자열 자료형 String
		String name = "김예지";
		// 실수 자료형 double
		double avg = 98.87;
		// 정수 자료형 int
		int age = 26 + 1;
		// + : 덧셈연산자
		// = : 대입연산자/할당연산자
		System.out.println(age);
		// 출력 결과가 27이므로, 덧셈연산자가 대입연산자보다 우선순위가 높음.
		
		// 덧셈연산자 +
		System.out.println(3 + 5); // 출력결과: 8
		
		// 문자열 연결 연산자 +
		System.out.println("3" + 5); // 출력결과: 35
		System.out.println("3" + true); // 출력결과: 3true
		
		// 출력형식을 '나이는 27살입니다.' 라고 지정하고싶을 때
		System.out.println("나이는 " + age + "살입니다.");
		// 연산자의 처리 방향 : 왼쪽에서 오른쪽
	}
}
