package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * [클래스 선언 시 앞에 붙는 접근지정자 설명]
		 * 1. public - 활성화 상태
		 * 	ㄴ 패키지 내/외부에서 사용(참조, 상속) 가능하다.
		 * 3. default(package) - 활성화 상태
		 * 	ㄴ 패키지 내부에서만 사용(참조, 상속) 가능하다.
		 * 
		 * 아래 둘은 중첩(내부/inner) 클래스를 선언할 때만 사용할 수 있는 접근 지정자이다.
		 * 	ㄴ 4가지 종류의 내부 클래스가 있다.
		 *  ** 중첩클래스: 클래스 내부에 선언된 클래스
		 * 2. protected - 비활성화 상태
		 * 	ㄴ default(package)기능(패키지 내부에서만 사용(참조, 상속) 가능)
				+ 패키지 외부에서는 상속만 가능하다.
		 * 4. private - 비활성화 상태
		 * 	ㄴ 같은 파일 내에서만 사용(참조, 상속) 가능하다.
		 * 
		 *  [클래스 선언 시 앞에 붙는 기타제어자 설명]
		 *  1. abstract 활성화: 추상클래스
		 *  2. final 활성화: 최종클래스
		 *  3. static 비활성화: 정적클래스
		 *  	ㄴ static은 중첩 클래스 선언 시에만 사용할 수 있음
		 * 
		 * [멤버(필드, 메서드) 선언 시 앞에 붙는 접근지정자 설명] 클래스 앞에 붙을 때와 의미가 좀 다르다.
		 * 1. public
		 * 2. protected
		 * 3. default(package)
		 * 4. private
		 * 
		 * 
		 */
		
		// Person 클래스와 같은 패키지(days14) 내부에 있는 클래스(Ex04)에서 사용했으므로 사용가능하다.
		// 그렇다면 다른 패키지(days01)에서는 사용 가능할까? (days01.Ex05.java 참고)
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.run();
		
		p1.age = 31;
		p1.run();
		
	} // main
	
}
