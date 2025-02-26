package days18;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// [try ~ catch 블럭 실행 과정 이해]
		System.out.println("1");
		try {
			System.out.println("2");
			System.out.println(100 / 0); // 예외발생
			System.out.println("3");
		} catch (ArithmeticException e) {
			System.out.println("4");
		} catch (Exception e) {
			System.out.println("5");
		} finally { // finally블럭: try{} 블럭에서 예외가 발생을 하든 안하든 상관없이 실행할 코드를 적는 블럭
			System.out.println("6");
		}
		System.out.println("7");
		System.out.println("end");

		/*
			[예외발생 시 출력결과]
			1
			2
			4
			6
			end
		 */
		// 3: 예외발생하는 순간 catch로 넘어가므로 실행 X
		// 5: 이미 4에서 하나의 예외처리를 마쳤으므로 실행 X

		/*
			[예외발생하지 않을시 출력결과]
		    1
			2
			10 <- (100/10) 결과임
			3
			6
			end
		 */
		// 4, 5: 예외가 발생하지 않았으므로 실행 X
		
		// finally 추가 후 출력결과
		/* [예외발생하지 않을시 출력결과]
		 	1
			2
			10
			3
			6
			7
			end
		 */
		

	} // main

} // class
