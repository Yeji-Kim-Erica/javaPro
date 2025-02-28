package days19;

import static java.lang.System.*;
import static java.lang.Math.*;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
		// [2]
		// 문제) 소수점 3번째 자리에서 반올림한 결과를 출력
		double d = 3.141592;
		// out.printf("%.2f", d);
		
		// [2-1]
		d = round(d*100)/100D;
		System.out.println(d);
		
		// [2-2]
		d = Double.parseDouble(String.format("%.2f", d));
		System.out.println(d);
		
		/*
		// Math 클래스
		out.println(PI); // 3.141592653589793
		out.println(E); // 2.718281828459045
		
		out.println(random()); // 0.9117436022554828
		out.println(max(1,2)); // 2
		out.println(min(1,2)); // 1
		
		out.println(pow(2,3)); // 8.0
		out.println(abs(-2)); // 2
		out.println(sqrt(4)); // 2.0
		
		// [암기]
		// 절상 메소드
		out.println(ceil(45.179)); // 46.0 double -> 소수점 1번째 자리에서 올림 (절상)
		out.println(ceil(45.979)); // 46.0 double -> 소수점 1번째 자리에서 올림 (절상)
		
		// 절삭 메소드
		out.println(floor(45.179)); // 45.0 double -> 소수점 1번째 자리에서 내림 (절삭)
		out.println(floor(45.979)); // 45.0 double -> 소수점 1번째 자리에서 내림 (절삭)
		
		// 반올림 메소드
		out.println(round(45.179)); // 45
		out.println(round(45.979)); // 46
		*/
		
	} // main
	
} // class
