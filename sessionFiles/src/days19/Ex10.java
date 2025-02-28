package days19;

import java.io.FileReader;

/**
 * @author kenik
 * @date 2025. 2. 27. - 오후 5:17:17
 * @subject 
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// Git Fork 화(오전)
		String fileName = ".\\src\\days18\\Ex10.java";
		// 알파벳 대소문자를 구분하지 않고 A(20), B(11)~ Z(3)
		// 갯수를 파악해서 #으로 막대그래프를 그리기.
		// A(20) : ####################
		// B(11) : ###########
		// :
		// Z(3)  : ###		
		char one = '\u0000';
		int code = -1;
		int [] counts = new int[26];
		// counts[0] = 'A' 65-'A' 의 갯수
		// counst[1] = 'B' 66의 갯수
		
		try (FileReader reader = new FileReader(fileName);){
			
			while ( (code = reader.read()) != -1 ) {
				code = Character.toUpperCase(code);
				if ( Character.isUpperCase(code) ) {
					int index = code -'A';
					counts[index]++;
				} // if
			} // while
			
			// 막대그래프 그리기
			for (int i = 0, count; i < counts.length; i++) {
				count  = counts[i];
				System.out.printf("%c(%d) %s\n", 
						i+'A', count, "#".repeat(count));
			} // for i
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	} // main

} // class






  