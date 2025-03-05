package days20;

import java.text.DecimalFormat;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		 	[형식화 클래스]
		 		ㄴ java.text 패키지에 있는 클래스
		 		ㄴ 숫자, 날짜, 문자열 같은 데이터를 일정한 형식에 맞게
		 		   표현할 수 있는 메서드를 제공하는 클래스
		 		1. DecimalFormat 클래스: 숫자를 형식화하는 클래스
		 		2. SimpleDateFormat 클래스
		 		3. ChoiceFormat 클래스
		 		4. MessageFormat 클래스
		 */
		
		int money = 3257600; // 3,257,600
		
		// [1]
//		String strMoney = String.format("%,d", money);
//		System.out.println(strMoney);
		
		// [2]
		String pattern = "\u00A4#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		String strMoney = df.format(money);
		System.out.println(strMoney);
		
	} // main
	
} // class
