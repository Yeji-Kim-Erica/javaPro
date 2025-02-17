package days05;

/**
 * @author kenik
 * @date 2025. 2. 7. - 오후 2:29:15
 * @subject 
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {		
		// [while]		1~10=55
		// 3:01 수업 시작~  [암기] 
		int i = 1, sum = 0;
		// Type mismatch: cannot convert from int to boolean
		while ( true ) {  // 무한루프
			if( i == 11 ) break; // break 문
			System.out.printf("%d+", i);
			sum += i;
			i++;
		} // while
		// Unreachable code
		System.out.printf("\b=%d\n", sum);

	} // main

} // class




