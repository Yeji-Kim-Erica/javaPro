package days25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 1. 스트림
		 2. 2가지 종류: 문자, 바이트 스트림
		 3. 보조 스트림
		 
		 문자(텍스트)스트림 - 파일 복사하기 연습 예제
		 FileReader/FileWriter + File 클래스
		 +
		 File 클래스 : 파일, 디렉토리(폴더)를 다루는 클래스
		 								 ㄴ 다룬다의 의미: 생성, 삭제, 수정, 정보 얻어오기 등등
		 */
		
		/*
		// [1]
		String pathname = ".\\src\\days24\\Ex01.java";
		File f = new File(pathname);
		
		// 가져온 내용이 파일인지 폴더인지 물어보는 메서드
		System.out.println(f.isDirectory()); // false (days24까지만 쓰면 폴더라고 나옴)
		System.out.println(f.isFile()); // true
		
		System.out.println(f.length()); // 2191바이트 -> 파일의 크기를 나타냄. 리턴자료형은 long형
		*/
		
		// [2]
		String parent = ".\\src\\days24"; // 디렉토리명
		String child = "Ex01.java"; // 파일명
		File f = new File(parent, child);
		
		/*
		System.out.println(f.lastModified()); // 1741312257709 -> 마지막으로 수정된 날짜. 리턴자료형은 long형. 1970.01.01 ~ 날짜 + 시간
		
		Date d = new Date(f.lastModified());
		System.out.println(d.toLocaleString());
		
		// 날짜 -> 형식화 클래스 사용 (총 5개 방법)
		// 다시 한번 찾아보면서 복습해보기
		*/
		
		int code;
		try (FileReader reader = new FileReader(f)) {
			
			while ((code = reader.read()) != -1) {
				System.out.print((char) code);
			} // while
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	} // main
	
} // class
