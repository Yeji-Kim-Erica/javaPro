package days17;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author kenik
 * @date 2025. 2. 25. - 오전 11:34:53
 * @subject 
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		//            CharSequence   String
		//"abc".replace("xxx", "yyy");
		//            String 
				
		
		// 업캐스팅
		// Regular emp = new SalesMan();
		// E <- R <- S
		// Collection <- List <- ArrayList
		
		// 업캐스팅
		List list = new ArrayList();
		
		Vector v = new Vector(list);
		
		test(new ArrayList());

	} // main
	
	public static void test(List l) { //  매개변수 다형성( 업캐스팅 )
		
	}

} // class
