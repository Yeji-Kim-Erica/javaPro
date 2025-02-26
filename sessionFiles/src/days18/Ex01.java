package days18;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오전 7:03:17
 * @subject 
 * @content
 */
public class Ex01 {
	 
	public static void main(String[] args) {

		//  new AbstractSample();

	} // main

} // class

// 추상메소드 1개 X -> 추상 클래스 선언 가능
// 의도 ? 객체 생성해서 사용 X
abstract class AbstractSample{
	String name;
	int age;
	
	void disp() {
		//
	}
}

class B extends AbstractSample{
	
}









