package days19;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {

		/* [1]
		//long start = System.currentTimeMillis(); // 천분의 1초
		long start = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < 10000000; i++) {
			sum += i;
		} // for i
		//long end = System.currentTimeMillis();
		long end = System.nanoTime();
		//System.out.println(">> 처리 시간 :  " + (end-start)+"ms");
		System.out.println(">> 처리 시간 :  " + (end-start)+"ns");
		*/

		// [2]
		// testString();
		// System.out.println( 566/60 +"분"+ 566%60+"초");

		long start = System.nanoTime();
		// String s = "a";
		StringBuffer s = new StringBuffer("a");
		for (int i = 0; i < 2000000; i++) {
			// s += "a";
			s.append("a");
		} //
		long end = System.nanoTime();
		System.out.println(">> 처리 시간 :  " + (end - start) + "ns");

		// 배차일보 때문에 수업 내용 못들음
		// 끝나고 다시 받아적고 공부

	} // main
	
	//>> 처리 시간 :  10892500ns    0.01s
	private static void testStringBuffer() {
		long start = System.nanoTime();
		// String s = "a";
		StringBuffer s = new StringBuffer("a");
		for (int i = 0; i < 2000000; i++) {
			// s += "a";
			s.append("a");
		} //
		long end = System.nanoTime();
		System.out.println(">> 처리 시간 :  " + (end - start) + "ns");
	}

	// >> 처리 시간 :  566302977900ns   
	// >> 처리 시간 :  566s   
	private static void testString() {
	   long start = System.nanoTime();
	   String s = "a";
	   for (int i = 0; i < 2000000; i++) {
	      s += "a";
	   } // 
	   long end = System.nanoTime();
	   System.out.println(">> 처리 시간 :  " + (end-start)+"ns");
	   
	}


} // class

