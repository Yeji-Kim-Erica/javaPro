package days20;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오후 4:31:02
 * @subject 
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		String strMoney =  "₩3,257,600.00";
		// [1]
//		int money = Integer.parseInt(strMoney.replace(",", ""));
		
		// [2] DecimalForamt 형식화 클래스
		String pattern = "\u00A4#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		try {
			Number n =  df.parse(strMoney);
			int money = n.intValue();
			System.out.println( money );
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 
		
		// 숫자 -> 형식화된 문자열 변환 : df.format() 메서드
		// 형식화된 문자열 -> 숫자 변환 : df.parse() 메서드 
		
	} // main

} // class
  