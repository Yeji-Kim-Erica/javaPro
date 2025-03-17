package days25;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kenik
 * @date 2025. 3. 10. - 오후 3:48:22
 * @subject   File 클래스 예제
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		// C:\E\Class\SS23Class\JavaClass\javaPro
		String currentDirectory = System.getProperty("user.dir");
		// System.out.println( currentDirectory );
		File parent = new File(currentDirectory);
		// parent.isDirectory()   true
		
		
		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// 파일 목록 + 하위 디렉토리 포함   String []
		// String [] list =  parent.list();
		File[] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			// System.out.println(list[i]);
			File f = list[i];
			String name =  f.getName();
			long l = f.lastModified();
			Date d = new Date(l);
			long fLength = f.length();
			System.out.printf("%s\t%s\t%s\n"
					, f.isDirectory() ? "["+name+"]" : name 
					, sdf.format(d)
					, f.isDirectory() ? "" :  ( (int)( Math.ceil((double)fLength/1024)))+"KB" );
		} // for i
		
		 
		

	} // main

} // class




  