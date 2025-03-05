package days21;

import java.text.MessageFormat;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject 형식화 클래스
 * @content 지난 시간에 다룬 형식화 클래스: DecimalFormat 클래스, SimpleDataFormat 클래스, ChoiceFormat 클래스
   			이번에 다룰 형식화 클래스: 4) MessageFormat 클래스
   										ㄴ 어떤 값(데이터)을 정해진 형식에 맞게 출력하는 클래스
   										ㄴ String.format("출력형식", 값, 값,...)
 */
public class Ex02 {

	public static void main(String[] args) {
		// 어떤 값(데이터)...
		String name = "홍길동";
		int age = 20;
		boolean gender = false;
		
		// 원하는 출력형식: "이름:홍길동, 나이:20살, 성별:여자"
		
		/* [1]
		String s = String.format("이름:%s, 나이:%d, 성별:%s", name, age, gender?"남자":"여자");
		System.out.println(s);
		*/
		
		/* [2]
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}"; // %알파벳 사용할 필요없이 인덱스 값만 넣어주면 됨
		MessageFormat mf = new MessageFormat(pattern);
		String s = mf.format(new Object[] {name, age, gender?"남자":"여자"});
		System.out.println(s);
		*/
		
		// [3]
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		String s = MessageFormat.format(pattern, name, age, gender?"남자":"여자"); // MessageFormat는 new 연산자 없이 사용 가능
		System.out.println(s);
		
	} // main
	
}
