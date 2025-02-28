package days19;

import java.util.Objects;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 2. 27. - 오후 5:08:11
 * @subject 
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// java.util.Arrays 클래스
		// java.util.Random 클래스
		/*
		Random rnd = new Random();
		System.out.println( rnd.nextBoolean() );
		System.out.println( rnd.nextInt() ); // -21억 ~ 21억
		System.out.println( rnd.nextInt(10)); // 0<=  int  <10
		System.out.println( rnd.nextDouble() );
		*/
		
		// java.util.Objects 클래스
		//   ㄴ Object의 보조 클래스 
		//   ㄴ static 멤버
		Point p = null;
		if ( p != null ) {
			// 
		} // if
		
		if (  !Objects.isNull(p) ) {
			
		} // if
		
		if ( Objects.nonNull(p) ) {
			
		} // if
		
		Point p2 = null;
		if ( p != null && p.equals(p2) ) {
			
		} // if
		
		if ( Objects.equals(p, p2) ) {
			
		} // if
		
		// System.out.println( p.toString() ); 예외 발생
		System.out.println( Objects.toString(p2, "NULL" ) );
		
		

	}

}






