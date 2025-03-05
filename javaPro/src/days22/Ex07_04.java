package days22;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject
 * @content
 			스택(FILO): 수식계산, 수식괄호검사, 웹브라우저 뒤로/앞으로 등
 			큐(FIFO): 최근 사용문서, 인쇄작업 대기 목록 등
 			[메시지 큐]
 */
public class Ex07_04 {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		}
		
		Stack st = new Stack();
		String expression = args[0];
		
		System.out.println("expression:" + expression);
		
		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch=='(') {
					st.push(ch+"");
				} else if (ch==')') {
					st.pop();
				}
			} // for i
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		} // try~catch
		
	} // main
	
} // class
