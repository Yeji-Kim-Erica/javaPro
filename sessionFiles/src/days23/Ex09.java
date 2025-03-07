package days23;

/**
 * @author kenik
 * @date 2025. 3. 6. - 오후 5:25:55
 * @subject 
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		
		for (int i = '0'; i <= 'z'; i++) {
			if ( Character.isAlphabetic(i) || Character.isDigit(i) ) {
				System.out.printf("%c(%d)\n", (char)i, i);
			} // if
		} // for i


	} // main

} // class







  