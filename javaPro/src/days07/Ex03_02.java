package days07;

import java.util.Arrays;

/**
 * @author yejikim
 * @date 2025. 2. 11. - 오전 11:33:31
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {

		String data = "홍길동 ,	이창익,	서영학 , 정창기";
		String regex = "\\s*,\\s*";
		String[] names = data.split(regex);
		
		for (String name : names) {
			// System.out.printf("[%s]\n", name.trim());
			System.out.printf("[%s]\n", name);
		}
		// trim 메서드: 문자열의 앞뒤 공백을 제거

	} // main

}
