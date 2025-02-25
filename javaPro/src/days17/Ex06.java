package days17;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// Employee emp = new SalesMan();
		List list = new ArrayList(); // 업캐스팅
		
		Vector v = new Vector(list);
		
		test(new ArrayList());
		
	} // main

	private static void test(List l) {	} // 매개변수 다형성: List가 상위클래스이므로 범용성이 높아져 더 좋은 코딩
	
} // class
