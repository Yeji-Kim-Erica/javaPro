package days25;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject 메모리 스트림 - StringReader/StringWriter**
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		String source = "package days25;\r\n"
				+ "\r\n"
				+ "import java.io.File;\r\n"
				+ "import java.io.FileNotFoundException;\r\n"
				+ "import java.io.FileReader;\r\n"
				+ "import java.io.FileWriter;\r\n"
				+ "import java.io.OutputStreamWriter;\r\n"
				+ "import java.io.Writer;\r\n"
				+ "import java.time.LocalDate;\r\n"
				+ "import java.time.LocalDateTime;\r\n"
				+ "import java.time.LocalTime;\r\n"
				+ "import java.time.format.DateTimeFormatter;\r\n"
				+ "import java.util.Date;\r\n"
				+ "\r\n"
				+ "/**\r\n"
				+ " * @author 김예지\r\n"
				+ " * @date 2025. 3. 10.\r\n"
				+ " * @subject\r\n"
				+ " * @content\r\n"
				+ " */\r\n"
				+ "public class Ex01_02 {\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		\r\n"
				+ "		String fileName = \".\\\\src\\\\days24\\\\Ex01.java\"; // 복사할 원본 파일명, 경로\r\n"
				+ "		String copyFileName = \".\\\\src\\\\days24\\\\CopyEx01.java\"; // 복사본 파일명, 경로\r\n"
				+ "		\r\n"
				+ "		// 파일 복사 메서드\r\n"
				+ "		// fileCopy_textStream(fileName, copyFileName);\r\n"
				+ "		// 처리 시간: 9587600 ns\r\n"
				+ "		\r\n"
				+ "		fileCopy2_textStream(fileName, copyFileName);\r\n"
				+ "		\r\n"
				+ "		// 선생님 버전도 확인해보기\r\n"
				+ "		// 클래스명변경 메서드\r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "		System.out.println(\"end\");\r\n"
				+ "		\r\n"
				+ "	} // main\r\n"
				+ "\r\n"
				+ "	private static void fileCopy2_textStream(String source, String target) { // 3762100 ns\r\n"
				+ "		StringBuilder context = new StringBuilder();\r\n"
				+ "		\r\n"
				+ "		int code;\r\n"
				+ "		try (FileReader reader = new FileReader(source);\r\n"
				+ "			FileWriter writer = new FileWriter(target)) {\r\n"
				+ "			\r\n"
				+ "			while ((code = reader.read()) != -1) {\r\n"
				+ "				context.append((char) code);\r\n"
				+ "			} // while\r\n"
				+ "			\r\n"
				+ "			String className = \"public class Ex01\";\r\n"
				+ "			context.replace(context.indexOf(className), context.indexOf(className)+className.length(), \"public class CopyEx01\");\r\n"
				+ "			String context2 = context.toString();\r\n"
				+ "			\r\n"
				+ "			writer.write(context2);\r\n"
				+ "			writer.flush();\r\n"
				+ "			\r\n"
				+ "		} catch (Exception e) {\r\n"
				+ "			System.out.println(e.toString());\r\n"
				+ "		}\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "	private static void fileCopy_textStream(String source, String target) {\r\n"
				+ "		long start = System.nanoTime();\r\n"
				+ "		\r\n"
				+ "		int code;\r\n"
				+ "		try (FileReader reader = new FileReader(source);\r\n"
				+ "			 FileWriter writer = new FileWriter(target)) {\r\n"
				+ "			\r\n"
				+ "			while ((code = reader.read()) != -1) {\r\n"
				+ "				System.out.print((char) code); // 화면 출력\r\n"
				+ "				writer.write(code); // 파일 저장 메서드 -> 스트림에 쓰기 작업이 일어남\r\n"
				+ "			} // while\r\n"
				+ "			writer.flush(); // **flush 메서드: 스트림에 작성된 내용 모두가 최종적으로 파일에 저장됨\r\n"
				+ "			\r\n"
				+ "		} catch (Exception e) {\r\n"
				+ "			System.out.println(e.toString());\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		long end = System.nanoTime();\r\n"
				+ "		\r\n"
				+ "		System.out.printf(\"> 처리 시간 : %d ns\\n\", (end - start));\r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "	\r\n"
				+ "} // class\r\n"
				+ "";
		
		// [문제] 문자열 속에서 20번째 라인의 문자열을 찾아서 출력
		
		// [1]
		// System.out.println(source.split("\r\n")[19]);
		
		// [2] 메모리스트림 사용: String
		// 문자열 -> [[문자스트림] -> BufferedReader 보조스트림]
		try (StringReader sr = new StringReader(source);
			 BufferedReader br = new BufferedReader(sr)) {
			
			int i = 1;
			while (i++ <= 19) br.readLine();
			
			String line20 = br.readLine();
			System.out.println(line20);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		} // try~catch
		
		
	} // main
	
} // class
