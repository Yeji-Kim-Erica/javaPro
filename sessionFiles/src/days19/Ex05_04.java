package days19;

import java.util.StringTokenizer;

/**
 * @author kenik
 * @date 2025. 2. 27. - 오후 3:22:25
 * @subject 
 * @content
 *           4. StringTokenizer 클래스  == String.split()  
 *           5. StringJoiner 클래스     == String.join()
 */
public class Ex05_04 {

	public static void main(String[] args) {
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		//             [Token]  [Token] [Token] [Token] [Token] 
		// [1] 권장.
		// String [] teamArr = team1.split("\\s*,\\s*");
		
		// [2]
		StringTokenizer st = new StringTokenizer(team1, ", ");		
		// System.out.println( st.countTokens() );  // 5
		// true/false st.hasMoreTokens()
		// st.nextToken();
		while ( st.hasMoreTokens() ) {  // false
			String name = st.nextToken();
			System.out.println( name );
		} // while
		
		

	} // main

} // class





  