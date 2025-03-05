package days20;

import java.text.ChoiceFormat;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject 3. ChoiceFormat 클래스
 * @content		ㄴ 특정 범위에 속하는 값을 문자열로 반환해주는 형식화 클래스
   				예) 국어 점수 -> 수/우/미/양/가 출력
   				
 */
public class Ex12 {

	public static void main(String[] args) {
		int [] kors = { 100, 57,  95, 88, 77, 80, 0 };
		
		// [2]
		String newPattern = "0#가|60#양|70#미|80#우|90#수";
		ChoiceFormat cf = new ChoiceFormat(newPattern);
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d 점수 - %s 등급\n", kors[i], cf.format(kors[i]));
		} // for i
		
		
		/* [1]
		// 낮은 값부터
		double[] limits = {0, 60, 70, 80, 90};
		String[] formats = {"가","양","미","우","수"};
		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d 점수 - %s 등급\n", kors[i], cf.format(kors[i]));
		} // for i
		*/
		
		
	} // main
	
} // class
