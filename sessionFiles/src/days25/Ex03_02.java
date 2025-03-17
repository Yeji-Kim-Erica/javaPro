package days25;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 * @author kenik
 * @date 2025. 3. 10. - 오전 11:05:52
 * @subject  메모리 스트림 - StringReader/StringWrier ***
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		String source = "package days25;\r\n"
				+ "\r\n"
				+ "import java.io.File;\r\n"
				+ "import java.io.FileReader;\r\n"
				+ "import java.io.FileWriter;\r\n"
				+ "import java.util.Date;\r\n"
				+ "import java.util.regex.Matcher;\r\n"
				+ "import java.util.regex.Pattern;\r\n"
				+ "\r\n"
				+ "/**\r\n"
				+ " * @author kenik\r\n"
				+ " * @date 2025. 3. 10. - 오전 6:59:41\r\n"
				+ " * @subject \r\n"
				+ " * @content\r\n"
				+ " */\r\n"
				+ "public class Ex01_02 {\r\n"
				+ "	\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		 \r\n"
				+ "		String fileName = \".\\\\src\\\\days24\\\\Ex01.java\"; // 복사할 원본 파일\r\n"
				+ "		String copyFileName = \".\\\\src\\\\days24\\\\CopyEx01.java\";\r\n"
				+ "		\r\n"
				+ "		// > 처리 시간 : 7183100 ns\r\n"
				+ "		fileCopy_textStream(fileName, copyFileName);\r\n"
				+ "		\r\n"
				+ "		//클래스명변경(copyFileName);\r\n"
				+ "		\r\n"
				+ "		System.out.println(\" end \");\r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "	} // main\r\n"
				+ "\r\n"
				+ "	private static void 클래스명변경(String copyFileName) {\r\n"
				+ "		StringBuilder sb = new StringBuilder();\r\n"
				+ "		int code;\r\n"
				+ "		try (FileReader reader  = new FileReader(copyFileName)){\r\n"
				+ "			\r\n"
				+ "			while ( (code = reader.read() ) != -1  ) {\r\n"
				+ "				 sb.append((char)code) ;\r\n"
				+ "			} // while\r\n"
				+ "			\r\n"
				+ "			//System.out.println( sb.toString() );\r\n"
				+ "			\r\n"
				+ "			Pattern pattern = Pattern.compile(\"Ex01\");\r\n"
				+ "			Matcher matcher = pattern.matcher(sb.toString());\r\n"
				+ "			\r\n"
				+ "			if (matcher.find()) {\r\n"
				+ "				System.out.println( matcher.group() );\r\n"
				+ "				System.out.printf(\"start:%d ~ end:%d\\n\", matcher.start()\r\n"
				+ "						, matcher.end());\r\n"
				+ "				matcher.appendReplacement(sb, \"CopyEx01\");\r\n"
				+ "			} // if\r\n"
				+ "			matcher.appendTail(sb);\r\n"
				+ "			\r\n"
				+ "			System.out.println(sb.toString());\r\n"
				+ "			\r\n"
				+ "			// 파일 덮어쓰기 추가...\r\n"
				+ "		} catch (Exception e) {\r\n"
				+ "			System.out.println( e.toString() );\r\n"
				+ "		} // \r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "	private static void fileCopy_textStream(\r\n"
				+ "			String source, String target) {\r\n"
				+ "		long start = System.nanoTime();\r\n"
				+ "		\r\n"
				+ "		int code;\r\n"
				+ "		try (FileReader reader  = new FileReader(source);\r\n"
				+ "			 FileWriter writer  = new FileWriter(target);){\r\n"
				+ "			\r\n"
				+ "			while ( (code = reader.read() ) != -1  ) {\r\n"
				+ "				//System.out.print( (char)code );\r\n"
				+ "				writer.write(code);\r\n"
				+ "			} // while\r\n"
				+ "			writer.flush();\r\n"
				+ "			\r\n"
				+ "		} catch (Exception e) {\r\n"
				+ "			System.out.println( e.toString() );\r\n"
				+ "		} // \r\n"
				+ "		\r\n"
				+ "		long end = System.nanoTime();\r\n"
				+ "		\r\n"
				+ "		System.out.printf(\"> 처리 시간 : %d ns\\n\", (end-start));\r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "} // class\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "  ";
		
		// System.out.println( source );
		
		// [문제] source 문자열에서 
		//        20번째 라인의 문자열을 찾아서 출력.
		
		//[1]
//		String [] sArr =  source.split("\r\n");
//		System.out.println(sArr[19] );
		
		// [2] 메모리 스트림 - String
		// 문자열 -> [[문자스트림] => BufferedReader 보조스트림]
		try (
			 StringReader sr = new StringReader(source);
			 BufferedReader br = new BufferedReader(sr);
				){
			int i = 1;
			while( i++ <= 19) br.readLine();
			String line20 = br.readLine();
			System.out.println( line20 );
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		


	} // main

} // class
  