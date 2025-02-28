package days19;

import java.util.StringTokenizer;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content 4. StringTokenizer 클래스
 * 			
 */
public class Ex05_04 {

	public static void main(String[] args) {
		
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		//             [Token]  [Token] [Token] [Token] [Token] 
		
		// [1] 권장하는 방법
//		String[] team1Arr = team1.split("\\s*,\\s*");
		
		// [2] StringTokenizer 클래스 활용
		StringTokenizer st = new StringTokenizer(team1, ", ");
		System.out.println(st.countTokens()); // 5
		// st.hasMoreTokens(); // true/false 값 반환
		// st.nextToken();
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name);
		} // while
		
		
		
	} // main
	
} // class
