package days18;

import java.io.IOException;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) { // 1) throws IOException
		// Unhandled exception type IOException
		// 2) try~catch
		// Exception
		//	   ↑
		// IOException
		try {
			System.in.read(); // 컴파일러가 예외처리 유무를 확인하고 경고를 위해 빨간줄을 띄워줌 (checked 예외)
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 1. "unchecked 예외"
		 	: RuntimeException 및 자식 예외클래스들은
		 	컴파일러가 예외처리를 확인하지 않는 예외이다.
		 	
		 2. "checked 예외"
		 	: RuntimeException 외 모든 Exception 클래스들은
		 	컴파일러가 예외처리를 확인하는 예외이다.
		 	예) read()가 IOException을 발생시킬 수 있다.
		 */
		
	} // main
	
} // class
