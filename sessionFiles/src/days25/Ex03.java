package days25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 3. 10. - 오전 10:39:39
 * @subject [메모리 스트림]
 * @content 주로 다른 곳에 입,출력하기 전에 메모리 상에 데이터를 
 *          임시로 저장해서 사용할 목적의 스트림.
 *          
 *          byte	ByteArray[IS]/ByteArray[OS] 바이트스트림
 *          char    CharArray[R]/CharArray[W]   문자 스트림
 *          String  String[R]/String[W]         문자 스트림. ***
 */
public class Ex03 {

	public static void main(String[] args) {
		// 
		byte [] buf = { 0,1,2,3,4,5,6,7,8,9 };
		
		try (ByteArrayInputStream bais = new ByteArrayInputStream(buf);		
			 ByteArrayOutputStream baos = new ByteArrayOutputStream();){
			int b;
			while ( ( b = bais.read() ) != -1  ) {  // EOF
				System.out.println(
				String.format("%08d", Integer.parseInt( Integer.toBinaryString( b ) ) )
				);			
				baos.write(b);
			} // while
			
			// 11:03 수업 시작~ 
			byte [] outBuf = baos.toByteArray();
			System.out.println( Arrays.toString( outBuf ) );
			
		} catch (Exception e) {
			System.out.println( e.toString());
		}
		
		
		

	} // main

} // class
  