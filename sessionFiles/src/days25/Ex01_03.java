package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kenik
 * @date 2025. 3. 10. - 오전 6:59:41
 * @subject   BufferedReader/ BufferedWriter 보조 스트림을 사용해서 복사.
 * @content
 */
public class Ex01_03 {
	
	public static void main(String[] args) {
		 
		String fileName = ".\\src\\days24\\Ex01.java"; // 복사할 원본 파일
		String copyFileName = ".\\src\\days24\\CopyEx01.java";
		
		// > 처리 시간 : 7183100 ns
		// > 처리 시간 : 1050500 ns
		fileCopy_textStream(fileName, copyFileName); 
		
		System.out.println(" end ");
		
		
	} // main 

	private static void fileCopy_textStream(
			String source, String target) {
		long start = System.nanoTime();
		
	    final int BUFFER_SIZE = 1024; 
		
		int code;
		try (FileReader reader  = new FileReader(source);
			 FileWriter writer  = new FileWriter(target);
			 BufferedReader br = new BufferedReader(reader, BUFFER_SIZE); 
			 BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE);	
			){
			
			/* [1]
			String line = null;
			while ( (line = br.readLine()) != null  ) {
				bw.write(line +"\r\n");
			} // while
			*/
			
			// [2] 1024 버퍼 크기 (이해)
			//     1030
			char [] cbuf = new char[BUFFER_SIZE];
			int n = -1; // 실제 읽어온 문자수 반환
			while (   ( n = br.read(cbuf) ) != -1 ) {
				bw.write(cbuf, 0, n);
			} // while
			bw.flush();
			
			
		} catch (Exception e) {
			System.out.println( e.toString() );
		} // 
		
		long end = System.nanoTime();
		
		System.out.printf("> 처리 시간 : %d ns\n", (end-start));
		
	}

} // class











  