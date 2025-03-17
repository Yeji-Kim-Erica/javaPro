package days28;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author 김예지
 * @date 2025. 3. 13.
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		/* [1]
		// f: 16진수 형태의 문자열을 입력 받아서 int로 변환 후 반환하는 람다식
		Function<String, Integer> f = s -> Integer.parseInt(s, 16);

		// g: int 입력받아서 2진수 문자열로 반환
		Function<Integer, String> g = i -> Integer.toBinaryString(i);
		
		// 1) f 2) g -> Function을 결합해서 처리: 1 andThen(2) 메서드
		Function<String, String> h = f.andThen(g); // 순서: f -> g
		System.out.println(h.apply("FF")); // 11111111
		
		Function<String, String> h2 = f.compose(g); // 순서: g -> f
		System.out.println(h2.apply(2));
		
		*/
		
		/* [2] Predicate 조건 결합
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;
		Predicate<Integer> notP = p.negate(); // p의 부정, p의 반대
		
		//						 true && true ||...
		Predicate<Integer> all = notP.and(q.or(r)); // and() : &&, or() : ||, negate() : !
		System.out.println(all.test(150)); // true
		*/
		
		// [3]
		String s1 = "abc";
		String s2 = "abc";
		
		Predicate<String> p2 = Predicate.isEqual(s1);
		boolean result = p2.test(s2); // s1.equals(s2)
		System.out.println(result);
		
		
	} // main
	
} // class
