package days25;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

/**
 * @author kenik
 * @date 2025. 3. 10. - 오후 3:11:26
 * @subject 자바의 IO
 * @content 람다식과 스트림 (화) 오전
 *                          (화) 오후 - 팀 프로젝트
 *          (수) 오전 - 람다식과 스트림
 *          (수) 오후 - 팀 프로젝트
 *          (목) 오전 - 람다식과 스트림
 *          (목) 오후 - 팀 프로젝트 
 *          (금) 오전 - 발표~  
 *               오라클 수업              
 */
public class Ex10 {

	public static void main(String[] args) throws IOException {
		// [File 클래스]
		//                  상대경로
		String pathname = ".\\src\\days25\\Ex01.java";
		
		// 절대경로
		// String pathname = "C:\\E\\Class\\SS23Class\\JavaClass\\javaPro\\src\\days25\\Ex01.java";
		
		File f = new File(pathname);
		
		if (f.exists()) {  // 파일 존재 유무 체크 
			System.out.println( f.isDirectory() ); // false
			System.out.println( f.isFile() );      // true
			System.out.println( f.length() +"(bytes)" );      // 1681
		} // if
		
		System.out.println( File.separator ); //    역슬래쉬( \  )경로 구분자
		System.out.println( File.pathSeparator ); //    ;
		
		// 
		String fileName =  f.getName();
		System.out.println( fileName ); // Ex01.java
		
		// 확장자    .java
		// 순수 확장자를 제외한 파일명    Ex01
		int pos = fileName.indexOf(".");
		String ext = fileName.substring(pos);
		System.out.println( ext );
		String baseFielName = fileName.substring(0, pos);
		System.out.println( baseFielName);
		
		// FileUtil.java
		System.out.println( "=".repeat(60));		
		System.out.println( fileName = FileUtil.getFileName(f) );
		System.out.println( FileUtil.getBaseName(fileName) );
		System.out.println( FileUtil.getExtension(fileName) );

		System.out.println( "=".repeat(60));	
		// 파일의 경로를 반환하는 메서드...
		System.out.println( f.getPath() );          // 경로
		System.out.println( f.getAbsolutePath() );  // 절대 경로
		System.out.println( f.getCanonicalPath() ); // 표준 경로
		
		System.out.println( "=".repeat(60));	
		File pf = f.getParentFile();
		System.out.println(  pf ); // .\src\days25
		System.out.println( f.getParent() );  // ".\src\days25"
		
	} // main

} // class








  