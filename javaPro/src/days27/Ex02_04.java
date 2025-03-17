package days27;

/**
 * @author 김예지
 * @date 2025. 3. 12.
 * @subject 람다식의 타입을 함수형 인터페이스 타입으로 형변환하는 에제
 * @content
 */
public class Ex02_04 {

	public static void main(String[] args) {
		MyFunction f = (MyFunction) (() -> {}); // 1차적으로 함수형 인터페이스로 받은 후에
		Object obj = (Object) f; // Object로 형변환은 가능하다
		String str = obj.toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
		/*	람다식도 익명 개체다.
			days27.Ex02_04$$Lambda$23/0x0000000478487040@5594a1b5
			days27.Ex02_04$$Lambda$23/0x0000000478487040@5594a1b5
			days27.Ex02_04$$Lambda$23/0x0000000478487040@5594a1b5
		 */
		
		MyFunction f1 = (MyFunction) (() -> {});
		Object obj1 = (Object)((MyFunction) (() -> {}));
		String str1 = ((Object)((MyFunction) (() -> {}))).toString();
		
		System.out.println(f1);
		System.out.println(obj1);
		System.out.println(str1);
		
		/*
			days27.Ex02_04$$Lambda$24/0x0000000800087440@7a79be86
			days27.Ex02_04$$Lambda$25/0x0000000800086840@34ce8af7
			days27.Ex02_04$$Lambda$26/0x0000000800086c40@6e8dacdf
		 */
		
		
	} // main
	
} // class

/*
@FunctionalInterface
interface MyFunction {
	void run();
}
 */