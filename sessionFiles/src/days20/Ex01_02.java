package days20;

import java.io.FileReader;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오전 6:59:16
 * @subject 
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {

		String fileName = ".\\src\\days18\\Ex10.java";
		char one = '\u0000';
		int code = -1;
		
		// 가변 배열
		int [][] counts = new int[3][];
		
		counts[0] = new int[26]; // 대문자  0행
		counts[1] = new int[26]; // 소문자  1행
		counts[2] = new int[10]; // 숫자    2행

		try (FileReader reader = new FileReader(fileName);){

			while ( (code = reader.read()) != -1 ) {
				
				if ( Character.isUpperCase(code) ) {
					int index = code -'A';
					counts[0][index]++;
				}else if (Character.isLowerCase(code)) {
					int index = code -'a';
					counts[1][index]++;
				}else if (Character.isDigit(code)) {
					int index = code -'0';
					counts[2][index]++;
				} // if // if
			} // while

			// 막대그래프 그리기
			int count = 0;
			for (int i = 0; i < counts.length; i++) {		
				// int[] -> IntStream
				//               Arrays.stream(counts[i]).sum()
				int totalCount = IntStream.of(counts[i]).sum();
				System.out.printf("==%s:%d==\n"
						,i==0?"대문자":(i==1?"소문자":"숫자")
						,  totalCount );
				
				for (int j = 0; j < counts[i].length; j++) {
					count  = counts[i][j];
					System.out.printf("%c(%d) %s\n", 
							j+(i==0?'A':(i==1?'a':'0')), count, "#".repeat(count));
				} // for j
				
			} // for i
			 

		} catch (Exception e) {
			System.out.println(e.toString());
		}


	} // main

} // class















