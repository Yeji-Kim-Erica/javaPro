package days25;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject File 클래스
 * @content
 */
public class Ex10_03 {

	public static void main(String[] args) {
		
		String currectDirectory = System.getProperty("user.dir");
		String fileRoot = ".\\src\\days25";
		File parent = new File(fileRoot);
		
		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// [문제] \\javaPro 폴더 안에 있는 dat 파일들만 조회하고 싶으면?
		
		// [4]
		File[] list2 = parent.listFiles((dir, name) -> name.endsWith(".dat"));
		Arrays.stream(list2).forEach(System.out::println);
		
		System.out.println();
		
		// [2, 3]
		File[] list = parent.listFiles((File f) -> f.getName().endsWith(".dat"));
		Arrays.stream(list).forEach(f -> System.out.println(f.getName()));
		
		/* [1]
		File[] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			if (f.isFile() && f.getName().matches(".*\\.dat")) {
				String name = f.getName();
				long l = f.lastModified();
				Date d = new Date(l);
				long fLength = f.length();
				System.out.printf("%-15s\t%s\t%s\n",
								   f.isDirectory() ? "["+ name +"]" : name,
								   sdf.format(d),
								   f.isDirectory() ? "" : (int) Math.ceil((double)fLength/1024) + "KB" );
			}
		} // for i
		*/
		
	} // main
	
} // class
