package days25;

import java.io.File;
import java.io.FileReader;
import java.util.Date;

/**
 * @author kenik
 * @date 2025. 3. 10. - 오전 6:59:41
 * @subject 
 * @content
 */
public class Ex01 {
	
	public static void main(String[] args) {
		/*
		 * 1. 스트림
		 * 2. 2가지 종류 : 문자, 바이트 스트림
		 * 3. 보조스트림
		 * 
		 * 문자(텍스트)스트림    -> 파일 복사...
		 * FileReader/FileWrier 
		 * +
		 * File 클래스 : 파일, 디렉토리(폴더)를 
		 *               다루는( 생성,삭제,수정, 정보 얻어오기 등등)
		 *               클래스. 
		 * */
		
		// [1]
//		String pathname = ".\\src\\days24\\Ex01.java";
//		File f = new File(pathname);
		
//		System.out.println(  f.isDirectory() );  // false
//		System.out.println(  f.isFile() );  // true
		
//		System.out.println( f.length() ); // long  2431bytes 파일크기
		
		// [2]
		String parent = ".\\src\\days24"; // 디렉토리
		String child = "Ex01.java"; // 파일명
		File f = new File(parent, child);
		
		// 마지막 수정된 날짜. long   1970.1.1  00:00:00
//		System.out.println( f.lastModified() );  // 1741312317852
//		// 2025. 3. 7. 오전 10:51:57
//		Date d = new Date(f.lastModified());
//		System.out.println( d.toLocaleString() );
		// 날짜 -> 형식화 클래스 사용.   5개
		
		int code;
		try (FileReader reader  = new FileReader(f)){
			
			while ( (code = reader.read() ) != -1  ) {
				System.out.print( (char)code );
			} // while
			
		} catch (Exception e) {
			System.out.println( e.toString() );
		} // 
		
		
	} // main

} // class











  