package days27;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author 김예지
 * @date 2025. 3. 12.
 * @subject java.util.function 패키지
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/* 1. java.util.function (함수) 패키지
		   		ㄴ 자주 사용되는 [함수형 인터페이스]를 미리 정의해놓은 패키지
				ㄴ 사용하는 개발자의 이름도 통일 (표준) => 유지, 보수가 용이
				
		  강사님 자료에서 필기 내용 복붙하기
		  
		  [기본형을 사용하는 함수형 인터페이스]
		  	입력타입To출력타입
		  	1) DoubleToIntFunction
		  	2)		 ToIntFunction
		  	3) Int		  Function
		  	4) ObjInt	  Consumer
		  	예) Ex03_03.java
		  	
		 */
		
		Runnable runnable = () -> {System.out.println("runnable");};
		Supplier<String> supplier = () -> "supplier";
		Consumer<String> consumer = (o) -> {System.out.println(o);};
		// 나머지도 연습해보기
		
		
	} // main
	
} // class
