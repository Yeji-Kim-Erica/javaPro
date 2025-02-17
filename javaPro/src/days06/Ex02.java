package days06;

import java.util.Random;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오전 11:05:18
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// [암기하면 좋은 코딩] 람다식과 스트림
		// Random 클래스로 임의의 값 가져오기
		/*
		new Random().ints(1, 46).distinct().limit(6).forEach(System.out::println);
		-> Ex01에서 사용한 공식과 동일한 내용. 람다와 스트림을 이용한 것.
		*/
		new Random().ints(1,46).distinct().limit(6).forEach(System.out::println);
	} // main
	
}
