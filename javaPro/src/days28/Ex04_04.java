package days28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author 김예지
 * @date 2025. 3. 13.
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) throws IOException {
		// [파일]
		// Stream<Path> 변수명 = Files.list(Path 변수명2)
		// Stream<String> 변수명 = Files.lines(Path 변수명2)
		// Stream<String> 변수명 = BufferedReader.lines()
		
		String uri = "src\\days28\\Ex01.java";
		String uri2 = "src\\days28\\Ex02.java";
		// 라인단위로 읽어와서 출력 (처리)
		// FileReader, BufferedReader, String line, while (line .....) 안해도 됨
		
		// Path path = Path.of(URI uri);
		// Path path = Paths.get(URI uri);
		
		Path path = Path.of(uri);
		Files.lines(path);
		Stream<String> lines = Files.lines(path);
		lines.forEach(System.out::println);
		
		
	} // main
	
} // class
