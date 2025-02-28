package days19;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 2. 27. - 오후 12:38:56
 * @subject 
 * @content
 */
public class Ex04_05 {

	public static void main(String[] args) {
		String team1 = "권용범,   김대원   , 김민곤  ,   김하은,  박세훈";	
		String regex = "\\s*,\\s*"; // split 구분자로 사용할 정규표현식
//		String [] nameArr = team1.split(regex, 3);
		String [] nameArr = team1.split(regex);
		System.out.println(Arrays.toString(nameArr) );

		/*
		 <ol>
		  	<li>권용범</li>   
		  	<li>김대원</li>
		  	<li>김민곤</li>
		  	<li>김하은</li>
		  	<li>라일락</li>
		  </ol>
		*/
		
		String content = "<ol>\n  <li>";
			   content += String.join("</li>\n  <li>", nameArr);
			   content += "</li>\n</ol>";
			   
		System.out.println(content);
		
	} // main

}

// [람다와 스트림]
//            T...a
//            T  String
// String []  -> List<String>  변환
/* [1]
List<String> list = Arrays.asList(nameArr);
list.forEach(new Consumer<String>() {

	@Override
	public void accept(String name) { 
		System.out.println(name);
	}
	
});
 

// [2]
// Arrays.asList(nameArr).forEach(name -> System.out.println(name));

// [3]
Arrays.asList(nameArr).forEach( System.out::println );
*/

  