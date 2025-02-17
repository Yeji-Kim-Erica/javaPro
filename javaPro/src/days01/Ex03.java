package days01;

import java.lang.System;
// 또는 import java.lang.*; 작성
// 이러면 java.lang.System.out.println("이름"); 이라고 안써도 됨. 그냥 System.out.println("이름"); 해도 됨.
// 이렇게 안해도 되는 이유: lang 패키지 안에 있는 건 다 그냥 써도 됨.

// 1. 반드시 시작개체 클래스 선언
// 	ㄴ 클래스 선언 형식
public class Ex03 {
	
	// 진입점 (기능) -> main() 메서드
	// 메서드 == 어떤 물건(부품, 객체, 개체, Object, 클래스)이 가지는 기능(일)
	// 함수
	// 메서드 3가지 파악
	// 1) 기능 (예: main 함수의 기능은 프로그램의 시작과 종료)
	// 2) 매개변수(파라미터)
	// 3) 리턴값(리턴자료형)
	
	public static void main(String [] args){
		// 1) 기능 : 프로그램의 시작, 종료
		// 2) 매개변수 : String [] args
		// 3) 리턴값 : 없다 (리턴자료형이 void이기 때문)
		
		// 이름 출력하기
		System.out.println("김예지");
		// 표준출력장치(모니터)에 이름을 출력할 때 필요한 물건(class)은? System 이라는 클래스
		// java.lang.System : System이라는 클래스는 java라는 상위 패키지 안의 lang이라는 하위 패키지에 들어있음.
		// 원래 원칙대로면 java.lang.System.out.println();라고 써야 함.
		
		// 예) 집에 액자를 달기 위해 벽에 못을 치는 상황
		// 뭐가 필요하지? 망치(물건). 망치의 기능은? -> 망치 == System이라는 클래스
		// 		1) 못을 치는 부분, A (=out) + 망치질하다(=println) "못"(=출력값) = 못을 치는 기능
		//		2) 못을 빼는 부분, B
		// 창고.망치.A부분.망치질하다("못");
		java.lang.System.out.println("이름");
	}
}
