package days18;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject 내부클래스에서 외부클래스의 멤버들에 접근하는 방법 (외부클래스에서 내부클래스 선언한 상태)
 * @content	계산기 연습해보기 (days17.Ex06_02.java의 Calc, Button 클래스를 인스턴스 클래스로 선언해서 구현)
 */
public class Ex03_04 {
	
	// 외부 클래스 필드 선언
	private int outerIv = 0;
	static int outerCv = 0;
	
	// 1.
	class InstanceInner{
		// 외부클래스의 멤버를 마치 자기 자신의 멤버처럼 사용 가능
		int a = outerIv;
		int b = outerCv;
	}
	
	// 2.
	static class StaticInner{
		// static 클래스에서 외부클래스의 인스턴스 멤버에 접근할 수 없다.
		// int a = outerIv;
		
		// static 클래스에서 외부클래스의 정적 멤버는 접근 가능
		int b = outerCv;
	}
	
	void method01() {
		int lv = 0;
		final int LV = 0;
		
		// 3.
		class LocalInner{
			int c = outerIv; // 외부클래스의 모든 멤버 접근 가능
			int d = outerCv; // 외부클래스의 모든 멤버 접근 가능
			
			int y = lv; // 메소드 안의 지역변수 접근 가능
			int x = LV; // 메소드 안의 지역변수 (상수) 도 접근 가능
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
	} // main
	
}
