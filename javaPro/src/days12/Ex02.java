package days12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 김예지
 * @date 2025. 2. 18.
 * @subject 배열의 단점: 배열의 크기가 자동으로 증가하지 않음
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 배열의 또 다른 단점..
		int[] m = {3,5,2,4,1};
		System.out.println(m.length);
		System.out.println(Arrays.toString(m));
		
		// 1. 6을 배열의 맨 뒤에 추가 (append)
		m = Arrays.copyOf(m, m.length + 1);
		m[5] = 6;
		// 2. 2가 있는 위치를 찾아서 100을 삽입
		System.out.println(Arrays.toString(m));
		
		// 내가 쓴 코딩
		for (int i = 0; i < m.length; i++) {
			if (m[i]==2) {
				m = Arrays.copyOf(m, m.length+1);
				System.arraycopy(m, i, m, i+1, m.length-i-1);
				m[i] = 100;
				break;
			} // if
		} // for i
		
		// [1] for문 사용
		
		// [2] [List 활용해서 2의 위치 찾기]
		// 컬랙션 클래스 사용 (List) + indexOf()
		List<Integer> list = List.of(3,5,2,4,1);
		int index = list.indexOf(2);
		System.out.println("> index = " + index);
		
		// [3] 배열 -> List 변환. indexOf() 메서드 (암기할 것.)
		Arrays.stream(m); // 배열 -> Stream 변환
		Arrays.stream(m).boxed(); // 기본형 int[] -> 래퍼클래스 Integer[] 변환
		Arrays.stream(m).boxed().collect(Collectors.toList()); // List로 변환
		Arrays.stream(m).boxed().collect(Collectors.toList()).indexOf(2); // List에서 2의 위치 찾기
		
		// [문제] 다시 100 삭제
		
		System.out.println(Arrays.toString(m));
		int[] temp= Arrays.copyOf(m, m.length-1);
		System.arraycopy(m, index+1, temp, index, temp.length-index);
		m = temp;
		System.out.println(Arrays.toString(m));
		
	} // main
	
}
