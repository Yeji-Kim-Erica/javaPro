package days19;

import java.util.StringJoiner;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content 4. StringTokenizer 클래스
 * 			5. StringJoiner 클래스
 */
public class Ex05_05 {

	public static void main(String[] args) {
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		String[] team1Arr = team1.split("\\s*,\\s*");
		
		/*
		<ol>
		<li>박정현<li>
		</li>김하은<li>
		</li>김민곤<li>
		</li>박예진<li>
		</li>양희동</li>
		</ol>
		*/
		
		// [1] String.join()
		String content = "<ol>\n  <li>";
		content += String.join("<li>\n  <li>", team1Arr);
		content += "</li>\n</ol>";
		System.out.println(content);
		
		// [2] StringJoiner 클래스
		StringJoiner sj = new StringJoiner(
				"<li>\n  <li>",
				"<ol>\n  <li>",
				"</li>\n</ol>");
		for (String string : team1Arr) {
			sj.add(string);
		}
		System.out.println(sj.toString());
		
	} // main
	
} // class
