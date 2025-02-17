package days08;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오후 4:45:28
 * @subject 두 기억공간의 값을 바꾸기
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {

		/*
		 * heap					stack
		 * 
		 * 						main(){
		 * 						[10] [20]
		 * 						  x	  y		지역변수
		 * m[0] m[1]
		 * [10] [20]				[0X100]
		 * 주소: 0X100번지			 	m 배열선언
		 * 						}
		 * 
		 * 						swap(int [] m){
		 * 							[0X100]
		 * 							m
		 * 						}
		 */
		
		int x = 10, y = 20;
		int [] m = {x, y};
		
		System.out.printf("> x=%d, y=%d\n", m[0], m[1]);
		swap(m); // Call by Reference
		System.out.printf("> x=%d, y=%d\n", m[0], m[1]);
		
	} // main

	private static void swap(int[] m) { // int[] m -> 배열 m의 주소값
		// swap에서 배열 m의 주소값을 받고나서 메서드 실행
		int temp = m[0]; // -> 배열 m에서 일어나는 일
		m[0] = m[1]; // -> 배열 m에서 일어나는 일
		m[1] = m[0]; // -> 배열 m에서 일어나는 일
		// 좌항: 기억공간의 이름
		// 우항: 해당 기억공간에 들어가있는 값
		// 요소 = 기억공간 (방)
		// 0번째 요소 -> 0번째 방
		// 좌항: 그 방의 이름
		// 우항: 그 방에 들어가있는 정보(값)
	}

} // class
