package days12;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/**
 * @author 김예지
 * @date 2025. 2. 18.
 * @subject 배열 선언 * int 100;	0~9 임의의 정수를 채워넣고
 * @content 0 11개
 * 			1 3개
 * 			2 20개
 * 			:
 * 			9 15개
 */
public class Ex05 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		// 람다식으로 채우기
		int[] m = rnd.ints(0,10).limit(100).toArray(); 
		
		// generate 사용
		m = IntStream.generate(new IntSupplier() {
			@Override
			public int getAsInt() {
				return rnd.nextInt(10);
			}
		}).limit(100).toArray();
		
		// generate 짧은 버전
		m = IntStream.generate(()-> rnd.nextInt(10)).limit(100).toArray();
		
		System.out.println(Arrays.toString(m));
		
		// 내가 쓴 코딩
		int[] cnt = new int[10];
		for (int i = 0; i < m.length; i++) {
			cnt[m[i]]++;
		} // for i
		for (int i = 0; i < cnt.length; i++) {
			System.out.printf("[%d] : %d개\n", i, cnt[i]); // 결과 출력
		} // for i
		
		// [1]
		for (int i = 0, count; i <= 9; i++) {
			count = 0;
			for (int j = 0; j < m.length; j++) {
				if (i == m[j]) count++; // 다 못받아적음
			} // for j
		} // for i
		
	} // main
	
}
