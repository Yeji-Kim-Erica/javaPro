package days18;

import java.io.IOException;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오후 2:40:56
 * @subject 
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {   // 1) throws IOException
		
		// Unhandled exception type IOException
		// 2)
		// Exception
		//     ↑
		// IOException
	 
		// 컴파일러가 예외처리했는 유무를 확인하고.. 
		try {
			System.in.read();
		} catch (IOException e) { 
			e.printStackTrace();
		}		 

		/*
		 * 1. "unchecked 예외"
		 *    RuntimeException 및 자식 예외클래스들은
		 *    컴파일러가 예외처리를 확인하지 않는 예외이다.
		 *    
		 * 2. "checked 예외"
		 *    그 외 모든 Exception 클래스들은 컴파일러가 
		 *    예외처리를 확인하는 예외이다. 
		 *    
		 *        예) read()   IOException 발생시킬 수 있다.
		 * */
	} // main

} // class
  