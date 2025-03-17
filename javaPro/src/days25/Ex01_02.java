package days25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days24\\Ex01.java"; // 복사할 원본 파일명, 경로
		String copyFileName = ".\\src\\days24\\CopyEx01.java"; // 복사본 파일명, 경로
		
		// 파일 복사 메서드
		// fileCopy_textStream(fileName, copyFileName);
		// 처리 시간: 9587600 ns
		
//		fileCopy2_textStream(fileName, copyFileName);
		클래스명변경(copyFileName);
		
		// 선생님 버전도 확인해보기
		// 클래스명변경 메서드
		
		
		System.out.println("end");
		
	} // main
	
	private static void 클래스명변경(String copyFileName) {
		StringBuilder sb = new StringBuilder();
		int code;
		try (FileReader reader  = new FileReader(copyFileName);
			 FileWriter writer = new FileWriter(copyFileName)){
			
			while ( (code = reader.read() ) != -1  ) {
				 sb.append((char)code) ;
			} // while
			
			//System.out.println( sb.toString() );
			
			Pattern pattern = Pattern.compile("Ex01");
			Matcher matcher = pattern.matcher(sb.toString());
			
			if (matcher.find()) {
				System.out.println( matcher.group() );
				System.out.printf("start:%d ~ end:%d\n", matcher.start()
						, matcher.end());
//				matcher.appendReplacement(sb, "CopyEx01");
				writer.write(matcher.replaceFirst("CopyEx01"));
			} // if
//			matcher.appendTail(sb);
			
			System.out.println(sb.toString());
			
			// 파일 덮어쓰기 추가...
		} catch (Exception e) {
			System.out.println( e.toString() );
		} // 
		
	}

	private static void fileCopy2_textStream(String source, String target) { // 3762100 ns
		StringBuilder context = new StringBuilder();
		
		int code;
		try (FileReader reader = new FileReader(source);
			FileWriter writer = new FileWriter(target)) {
			
			while ((code = reader.read()) != -1) {
				context.append((char) code);
			} // while
			
			String className = "public class Ex01";
			context.replace(context.indexOf(className), context.indexOf(className)+className.length(), "public class CopyEx01");
			String context2 = context.toString();
			
			writer.write(context2);
			writer.flush();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	private static void fileCopy_textStream(String source, String target) {
		long start = System.nanoTime();
		
		int code;
		try (FileReader reader = new FileReader(source);
			 FileWriter writer = new FileWriter(target)) {
			
			while ((code = reader.read()) != -1) {
				System.out.print((char) code); // 화면 출력
				writer.write(code); // 파일 저장 메서드 -> 스트림에 쓰기 작업이 일어남
			} // while
			writer.flush(); // **flush 메서드: 스트림에 작성된 내용 모두가 최종적으로 파일에 저장됨
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		System.out.printf("> 처리 시간 : %d ns\n", (end - start));
		
	}
	
} // class
