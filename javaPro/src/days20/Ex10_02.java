package days20;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		String strMoney = "₩3,257,600.00";
		int money = 0;
		
		// [1]
//		money = Integer.parseInt(strMoney.replaceAll("\\W", ""));
		
		// [2] DecimalFormat 형식화 클래스
		String pattern = "\u00A4#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		try {
			Number n = df.parse(strMoney);
			money = n.intValue();
			System.out.println(money);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// 필기 빠진 거 추가
		
	} // main
	
} // class
