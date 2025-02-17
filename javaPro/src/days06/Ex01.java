package days06;

import java.util.Arrays;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오전 8:56:48
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
//		System.out.print("로또번호 : ");
//		for (int i = 1; i <= 6; i++) {
//			System.out.printf("%d ", (int) (Math.random()*45)+1);
//		} // for i
		
		// [풀이] 중복되는 숫자를 제거한 뒤 로또 번호 6개를 출력해보자.
		// 배열을 활용해서 중복 제거하기
		
//		int [] lotto = new int[6];
//		int index = 0, n;
//		lotto[index++] = (int)(Math.random()*45)+1; // 첫번째 값은 중복 여부 확인할 필요 없음
//		//		   index == 첨자값
//		// heap		 ↓					stack
//		// [0][0][0][0][0][0]			[0X100]
//		// lotto[0] ~ lotto[5]			lotto
//		// 주소: 0X100
//		while (index <= 5) {
//			n = (int)(Math.random()*45)+1; // 무작위의 n 값 생성
//			// 중복 확인
//			boolean flag = false;
//			for (int i = 0; i < index; i++) {
//				if (lotto[i] == n) {
//					System.out.println("*");
//					flag = true;
//					break;
//				  }
//			}
//			if (!flag) lotto[index++] = n;
//		} // while
		
		int [] lotto = new int [6];
		int index = 0, n;
		
		lotto[index++] = (int)(Math.random()*45)+1;
		
		while(index <= 5) {
			boolean flag = false;
			n = (int)(Math.random()*45)+1;
			for(int i = 0; i < index; i++) {
				if(lotto[i] == n) {
					System.out.println("*");
					flag = true;
					break;
				}
			}
			if (!flag) {
				lotto[index++] = n;
			}
		}
		
		System.out.println(Arrays.toString(lotto));
		
	} // main
	
}
