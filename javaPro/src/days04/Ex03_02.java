package days04;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오후 12:06:50
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		// 학생의 이름을 여러 명 저장하기 위해서는?
		
		/*
		 * String [] names;
		 * names[0] = "홍길동";
		 * 
		 * 라고만 쓰면 오류가 난다.
		 * The local variable names may not have been initialized (초기값을 줘야 해서)
		 */
		 
//		String [] names = null;
//		names[0] = "홍길동";
//		names[1] = "이창익";
//		System.out.println(names[0]);
		// java.lang.NullPointerException 오류.
		// 참조주소 값이 null이라서 (아직 stack만 만들어지고 heap은 생성이 안됐음을 뜻함)
		
//		String [] names =  new String[10];
//		names[0] = "홍길동";
//		names[10] = "이창익";
//		System.out.println(names[0]);
//		System.out.println(names[10]);
//		// ArrayIndexOutOfBoundsException         0~9
//		// ㄴ 배열 첨자값이 범위를 벗어났다. 0~9까지만 첨자값 입력이 가능함.
		
		String [] names = new String[10];
		names[0] = "홍길동";
		names[1] = "이창익";
		System.out.println(names[9]); // 출력결과: null
		
		
		
		
		
		
		
	}
	
}
