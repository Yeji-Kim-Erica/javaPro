package days16;

import static java.lang.Math.random;
// import static 키워드를 붙이면 특정 클래스의 static 멤버를 호출할 때 클래스명을 생략할 수 있다
/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */
public class Ex10 { // 좀 졸았던 듯.. 제대로 다시 잘 봐야하는 페이지

	public static void main(String[] args) {
		/* [자바는 다중상속을 지원하지 않는다]
		 		  = 단일상속만을 지원한다.
		 	
		 	이유가 뭘까?
		 	: 서로 다른 클래스로부터 상속받은 멤버들 간 이름이 같은 경우,
		 	구별할 수 있는 방법이 없다
		 		(-> 인터페이스를 사용해서 다중상속을 대신할 수 있다)
		 */
		
		/* [패키지(package)]
		 	1. 서로 연관된 클래스, 인터페이스를 효율적으로 관리하기 위해 묶어둔 것
		 	2. full Name = 패키지 + 클래스명
		 	3. class A{} -> 물리적으로 A.class 파일 생성
		 	days01 패키지 선언 -> 물리적으로 days01 디렉토리가 생성
		 	4. java 파일의 첫 번째 라인에 package 구문을 선언
		 	5. 모든 클래스는 반드시 하나의 패키지에 속해야 한다
		 	6. 패키지는 점(.)을 구분자로 계층 구조를 구성할 수 있다
		 	7. 패키지명은 소문자 권장 (원칙) . 대문자 패키지명 허용은 한다.
		 */
		
		/* [ import문 ]
		 	1. 다른 패키지의 클래스를 사용하려면 패키지명이 포함된 클래스 이름을 사용해야 한다.
		 	 매번 패키지명을 붙여서 작성하면 불편하다.
		 	 그래서 클래스를 사용하기 전에 import 구문을 사용해서 클래스의 패키지명을 미리 명시해주는 구문이 import문이다.
		 	2. Ctrl + Shift + O : 자동으로 import문 추가
		 	3. import 구문 형식
		 		import 패키지명.클래스명;
		 		import 패키지명.*;
		 			예) import java.util.Calendar;
		 				import java.util.Date;
		 				import java.util.ArrayList;
		 				
		 				import java.util.*; // 편리.. 성능 차이 거의 없음
		 	4. import java.lang.*; : 컴파일러가 자동으로 추가
		 */
		
		// static 메소드를 호출할 떼
		// Math.random()
		random();
		
	} // main
	
} // class

class TV {
	
}

class VCR {
	
}

// 다중상속이 불가
// Syntax error on token ",", . expected
//class TVCR extends TV, VCR {
//	
//}