package days25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject [메모리 스트림]
 * @content 주로 다른 곳에 입/출력하기 전에 메모리 상에 데이터를 임시로 저장해서 사용할 목적의 스트림
 			
 			byte	: ByteArrayInputStream/ByteArrayOutputStream 바이트스트림
 			char	: CharArrayReader/CharArrayWriter 문자스트림
 			String	: StringReader/StringWriter 문자열스트림**
 */
public class Ex03 {

	public static void main(String[] args) {
		byte[] buf = {0,1,2,3,4,5,6,7,8,9};
		try (ByteArrayInputStream bais = new ByteArrayInputStream(buf);
			 ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			
			int b;
			while ((b = bais.read()) != -1) {
				// System.out.println(b);
				// System.out.println(String.format("%08d", Integer.parseInt(Integer.toBinaryString(b))));
				/*
					00000000
					00000001
					00000010
					00000011
					00000100
					00000101
					00000110
					00000111
					00001000
					00001001
				 */
				
				baos.write(b);
				
			} // while
			
			byte[] outBuf = baos.toByteArray();
			System.out.println(Arrays.toString(outBuf));
			
		} catch (Exception e) {
			// TODO: handle exception
		} // try~catch
		
		
	} // main
	
} // class
