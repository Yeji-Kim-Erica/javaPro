package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		
		/*
		 [멤버(필드, 메소드) 앞에 붙는 접근지정자 설명]
		 1. public: 패키지 내/외부 어디서나 접근(참조) 가능
		 2. protected: default 기능 + 상속 (패키지 외부에서 자식 클래스에 접근 가능)
		 3. default(package): 패키지 내부에서만 접근(참조) 가능
		 4. private: 같은 클래스 내에서만 접근(참조) 가능
		 
		 접근가능범위
		 public > protected > default > private
		 */
		
		// days14.Time.java
		// days14.Ex10.java
		
		// 패키지 내부에서 테스트
		Time t = new Time();
		// t.을 찍고 살펴보면, public, protected, default를 접근지정자로 가지고 있는 필드들만 뜸
		//
		
	} // main
	
}
