package days21;

import java.text.MessageFormat;

/**
 * @author kenik
 * @date 2025. 3. 4. - 오전 10:23:34
 * @subject  형식화 클래스
 * @content  1) DecimalFormat 클래스
 *           2) SimpleDateFormat 클래스
 *           3) ChoiceFormat 클래스 
 *           4) MessageFormat 클래스 *** 
 *               ㄴ 어떤 값(데이터)를 정해진 형식에 맞게 출력...
 *               ㄴ String.format("출력형식", 값,값...)
 */
public class Ex02 {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		boolean gender = false;
		
		/* [1]
		// 출력형식  :      "이름:홍길동, 나이:20살, 성별:여자"
		String s = String.format("이름:%s, 나이:%d살, 성별:%s"
				, name, age, gender?"남자":"여자");
		System.out.println( s );
		*/
		
		/* [2]
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		String s = mf.format(new Object[] {name, age,  gender?"남자":"여자"});
		System.out.println( s );
		*/
		
		// [3]
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		String s = MessageFormat.format(pattern, name, age,  gender?"남자":"여자");
		System.out.println( s );
		
	} // main

} // class
  







