package days08;

import java.util.Random;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오후 3:37:28
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// [람다식과 스트림]
		
		new Random().ints(1,46).distinct().limit(6)
		.sorted().mapToObj(i -> i+",").forEach(System.out::print);
		
		// -> : 화살표(람다)연산자
		// 람다식 : 화살표를 이용해 만든 식 (예: i -> i+",")
		
	} // main
	
}
