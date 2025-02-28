package days19;

import days20.Parent;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject
 * @content
 */
public class Child extends Parent{

	void modifierAccessTest() {
		this.pub = 100; // 접근지정자 public: 패키지 내부/외부 어디서든지 접근 가능
		this.pro = 90; // 접근지정자 protected: default + 상속 접근 가능
		// this.def = 80; -> The field Parent.def is not visible
		// 접근지정자 default: 패키지 내부 접근 가능
		// this.pri -> The field Parent.pri is not visible
		// 접근 지정자 private: 동일 클래스 내부에서만 접근 가능
		
	}
}
