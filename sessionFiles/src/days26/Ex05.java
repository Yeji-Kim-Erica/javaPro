package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author kenik
 * @date 2025. 3. 11. - 오후 12:19:17
 * @subject 1차_조편성.txt 파일을 읽어서 폴더 생성..
 * @content  2025-03-11(화)
 *              ㄴ 1조(현도재)
 *                 ㄴ 김현수[팀장]
 *                 ㄴ 서재웅
 *                 ㄴ 김도훈
 *              ㄴ 2조(현도재)
 *              :
 *              ㄴ 5조(codeName(5조))
 *              
 */
public class Ex05 {

	public static void main(String[] args) {
		
		String parent = "C:\\temp\\";
		
		// 2025-03-11(화)
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd(E)");
		String strNow = now.format(dtf);		
		parent += strNow;
		
		String fileName = ".\\src\\days26\\1차_조편성.txt";
		
		String pathname = "";
		
		try (FileReader reader  = new FileReader(fileName ); 
			 BufferedReader br = new BufferedReader(reader);){
			String line = null;
			String regex = "\\s*[,:-]\\s*";
			while ( (line = br.readLine()) != null) {
				//  0                                            마지막요소
				// 1조: 김현수[팀장], 서재웅, 김도훈 			- 현도재
				// System.out.println( line );
				String [] arr = line.split(regex);
				// arr[0]
				// arr[arr.length-1]
				
				File f = null; 
				for (int i = 1; i < arr.length-1; i++) {
					pathname = String.format("%s\\%s(%s)\\%s"
							, parent, arr[0], arr[arr.length-1], arr[i]);
					System.out.print(pathname +" - ");
					f = new File(pathname);
					System.out.println( f.mkdirs() );
				} // for i
				
			} // while
			
		} catch (Exception e) {
			// TODO: handle exception
		} // try
		
	} // main

} // class










  