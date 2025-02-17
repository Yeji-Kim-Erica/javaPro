package days08;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오후 4:45:28
 * @subject 두 기억공간의 값을 바꾸기
 * @content
 * 
 * 			매개변수를 가지고 메서드를 호출하는 방법
 * 			1) Call by Name : 매개변수 없이 함수 이름만으로 호출하는 것
 * 			2) Call by Value : 값으로 호출하는 것
 * 			3) Call by Reference : 매개변수를 참조타입으로 넘기는 방식 (참조타입: 클래스, 배열, 인터페이스)
 * 
 */
public class Ex10 {

	public static void main(String[] args) {

		/*
		 * heap					stack
		 * 
		 * 						main(){
		 * 						[10] [20]
		 * 						  x	  y		지역변수
		 * 						}
		 */
		
		int x = 10, y = 20;
		System.out.printf("> x=%d, y=%d\n", x, y);

		/* swap 메서드 선언 + 호출
		{	int temp = x;
			x = y;
			y = temp;	}
		*/
		
		// Call by Value로는 불가
		swap(x, y);
		
		System.out.printf("> x=%d, y=%d\n", x, y);
		
	} // main

	private static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}

	

} // class
