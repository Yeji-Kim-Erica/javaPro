package days25;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) throws IOException {
		// [File 클래스]
		String pathname = ".\\src\\days25\\Ex01.java"; // 상대경로
		
		// 절대경로
		// String pathname = "C:\\Class\\JavaClass\\javaPro.\\src\\days25\\Ex01.java";
		
		File f = new File(pathname);
		if (f.exists()) { // 파일 존재 유무 체크
			System.out.println(f.length() + "(bytes)"); // 2019(bytes) -> 파일의 크기
		} // if
		
		System.out.println(File.separator); // \ -> 파일의 경로구분자
		System.out.println(File.pathSeparator); // ; -> 경로와 경로 사이
		
		// 파일 이름
		String fileName = f.getName();
		System.out.println(fileName); // Ex01.java
		
		// 확장자
		// 순수 확장자를 제외한 파일명
		
		int pos = fileName.indexOf(".");
		String ext = fileName.substring(pos);
		System.out.println(ext); // .java
		String baseFileName = fileName.substring(0, pos);
		System.out.println(baseFileName); // Ex01
		// FileUtil.java
		
		System.out.println("=".repeat(60));
		
		System.out.println(fileName = FileUtil.getFileName(f));
		System.out.println(FileUtil.getBaseName(fileName));
		System.out.println(FileUtil.getExtension(fileName));
		
		System.out.println("=".repeat(60));
		
		// 파일의 경로를 반환하는 메서드
		System.out.println(f.getPath()); // 경로
		// .\src\days25\Ex01.java
		System.out.println(f.getAbsolutePath()); // 절대 경로
		// C:\Class\JavaClass\javaPro\.\src\days25\Ex01.java
		System.out.println(f.getCanonicalPath()); // 표준 경로
		// C:\Class\JavaClass\javaPro\src\days25\Ex01.java

		System.out.println("=".repeat(60));
		
		File pf = f.getParentFile(); // 경로 + 파일객체
		System.out.println(pf); // .\src\days25
		System.out.println(pf.isDirectory()); // true
		System.out.println(f.getParent()); // .\src\days25 (경로만)
		
		
		
		
	} // main
	
} // class
