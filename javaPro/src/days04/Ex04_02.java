package days04;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오후 12:33:01
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		String input = "1 		fish 2fish red fish blue fish";
	     Scanner s = new Scanner(input);
	     s.useDelimiter("\\s*fish\\s*"); // 괄호 안의 식은 정규표현식/String regex(=regular expression)임.
	     // 			\s : 공백
	     //				* : 반복횟수 (0번 ~ 여러번) -> 안와도 좋고 여러번 와도 좋다.
	     //				\\ : \s의 \글자를 그대로 인식하게 하기 위함.
	     
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();
	     
	     // 출력결과
//	     1
//	     2
//	     red
//	     blue
		
	}
	
}
