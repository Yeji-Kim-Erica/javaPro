package days19;

import java.util.Arrays;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content
 */
public class Ex04_05 {

	public static void main(String[] args) {
		String team1 = "권용범,   김대원   , 김민곤  ,   김하은,  박세훈";
		String regex = "\\s*,\\s*"; // split 구분자로 사용할 정규표현식
		String[] nameArr = team1.split(regex); // [권용범, 김대원, 김민곤, 김하은, 박세훈]
//		String[] nameArr = team1.split(regex, 3); // [권용범, 김대원, 김민곤  ,   김하은,  박세훈]
		System.out.println(Arrays.toString(nameArr)); 
		
		/* 출력결과를 아래와 같이 하려면?
	       <ol>
	           <li>권용범</li>   
	           <li>김대원</li>
	           <li>김민곤</li>
	           <li>김하은</li>
	           <li>라일락</li>
	        </ol>
	     */
		
		String content = "<ol>\n    <li>";
				content += String.join("</li>\n    <li>", nameArr);
				content += "</li>\n</ol>";
		System.out.println(content);
		
	} // main
	
} // class
