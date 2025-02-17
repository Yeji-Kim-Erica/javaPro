package days10;

import java.util.Arrays;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오후 4:32:50
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// 배열 -> 더 큰 배열 복사하는 방법
		int[] m = { 1, 2, 3 };
		int[] temp = new int[m.length + 3];

		// [1] for문 이용
//		for (int i = 0; i < m.length; i++) {
//			temp[i] = m[i];
//		} // for i
		
		// [2] System.arraycopy() 메서드 이용
//		System.arraycopy(m, 0, temp, 2, m.length); // [0, 0, 1, 2, 3, 0]
		System.arraycopy(m, 0, temp, 0, m.length); // [1, 2, 3, 0, 0, 0]
		
		// [3] Arrays.copyOf() 메서드 이용
		int[] temp2 = Arrays.copyOf(m, m.length + 3);
		
		// [추가(복제)] clone()
		int[] mClone = m.clone();
		
		// Arrays.copyof()
		// System.arraycopy() : 좀 더 세밀한 복사가 가능한 메서드
		// clone() : 완전히 복제할 때
		
		// 복제: 똑같은 내용으로 다시 기억공간 새로 만드는 것
		// 복사: 생성이 아니고 같은 기억공간을 참조해서 값을 가져오는 것
		
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(temp2));
		System.out.println(Arrays.toString(mClone));

	} // main

}
