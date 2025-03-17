package days25;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject File 클래스 예제
 * @content 
 */
public class Ex10_02 {

	public static void main(String[] args) {
		
		String currectDirectory = System.getProperty("user.dir");
		System.out.println(currectDirectory); // C:\Class\JavaClass\javaPro
		
		File parent = new File(currectDirectory);
		
		/* 파일 목록 + 하위 디렉토리 String[]
		String[] list = parent.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		} // for i
		*/
		
		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// 파일 목록 + 하위 디렉토리
		File[] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			
			String name = f.getName();
			
			long l = f.lastModified();
			Date d = new Date(l);
			
			long fLength = f.length();
			
			System.out.printf("%-15s\t%s\t%s\n",
							   f.isDirectory() ? "["+ name +"]" : name,
							   sdf.format(d),
							   f.isDirectory() ? "" : (int) Math.ceil((double)fLength/1024) + "KB" );
		} // for i
		
		
	} // main
	
} // class
