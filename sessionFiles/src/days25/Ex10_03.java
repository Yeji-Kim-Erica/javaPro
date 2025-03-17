package days25;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.function.Consumer;

import com.util.FileUtil;

/**
 * @author kenik
 * @date 2025. 3. 10. - 오후 4:31:30
 * @subject  File 클래스 
 * @content
 */
public class Ex10_03 {

	public static void main(String[] args) {
		// 
		String currentDirectory = System.getProperty("user.dir");
		File parent = new File(currentDirectory);
		
		// [문제] \\javaPro 폴더 안에 있는 .dat 파일들만 조회.
		// [4]
		File [] list = parent.listFiles(( dir, name)  ->  name.endsWith(".dat") );
		Arrays.stream(list).forEach(System.out::println);
		
		// [2]
		/*
		File [] list = parent.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File f) {
				//      score.dat
				return f.getName().endsWith(".dat");
			}
		});
		for (File f : list) {
			System.out.println(f.getName());
		}
		*/
		// [3]
//		File [] list = parent.listFiles((f) -> f.getName().endsWith(".dat") );
//		// Arrays.stream(list).forEach(System.out::println);
//		Arrays.stream(list).forEach( f -> System.out.println(f.getName()));
		
		/* [1]
		File [] list =  parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			File f =  list[i];
			if ( f.isFile() ) {
				String fileName = f.getName();
				String ext = FileUtil.getExtension(fileName);
				if (ext.equals(".dat")) {
					System.out.println(fileName);
				} // if
			} // if
		} // for i
		*/
		
		

	} // main

} // class
  







