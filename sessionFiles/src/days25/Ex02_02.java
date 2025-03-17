package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author kenik
 * @date 2025. 3. 10. - 오전 10:24:28
 * @subject   exe 파일 복사
 * @content   문자 스트림 X
 *            바이트 스트림 O ( 파일 )
 *            FileInputStream/FileOutputStream
 *            BufferedInputStream/BufferedOutputStream 보조스트림.
 */
public class Ex02_02 {

	public static void main(String[] args) {
		String fileName = "C:\\Program Files (x86)\\EditPlus 3\\editplus.exe"; 
		String copyFileName = ".\\copyEditplus.exe"; 

		// > 처리 시간 : 6542932300 ns
		// > 처리 시간 :   16252300 ns
		fileCopy_byteStream(fileName, copyFileName); 

		System.out.println(" end ");

	} // main

	// Ex01_02.java 
	private static void fileCopy_byteStream(String source, String target) {
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		
		int code;
		try (FileInputStream reader  = new FileInputStream(source);
			 FileOutputStream writer  = new FileOutputStream(target);
			 BufferedInputStream bis = new BufferedInputStream(reader, BUFFER_SIZE);
			 BufferedOutputStream bos = new BufferedOutputStream(writer, BUFFER_SIZE)	){

			byte [] b = new byte[BUFFER_SIZE];
			
			int n = - 1;  // 읽어온 바이트 수 저장할 변수
			while ( (n = bis.read(b) ) != -1 ) {
				bos.write(b, 0, n);
			} // while
			bos.flush();

		} catch (Exception e) {
			System.out.println( e.toString() );
		} // 

		long end = System.nanoTime();

		System.out.printf("> 처리 시간 : %d ns\n", (end-start));
	}

} // class
