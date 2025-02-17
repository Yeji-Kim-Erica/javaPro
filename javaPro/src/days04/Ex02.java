package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오전 10:53:18
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		// [시험 문제] 두 문자열을 비교하는 예제
		
		// 숫자끼리는 ==을 사용함. 문자열끼리는?
		
		String n1 = "홍길동";
		String n2;
		
		// 키보드로부터 이름을 입력받아서 n2 변수에 저장
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("> 이름(n2)을 입력해주세요 : ");
		n2 = br.readLine();
		System.out.printf("> n2 = [%s]\n", n2);
		
		// n2에 홍길동을 입력하면 n1과 n2는 같을까?
		System.out.println(n1 == n2); // 출력결과: false -> 왜일까? 설명은 좀 더 뒤에서 할 예정
		
		// 두 문자열을 비교할 때는 == 비교연산자를 사용하지 않는다. (일단 무조건 암기!!)
		// 두 문자열을 비교할 때는 String 클래스의 equals() 메서드를 사용한다. (일단 무조건 암기!! 2)
		System.out.println(n1.equals(n2)); // 출력결과: true
		// 출력결과를 true false 말고 다른 걸로 하고 싶을때
		System.out.println(n1.equals(n2)?"같다":"다르다"); // 출력결과: 같다
		
	} // main
	
} // class
