package days03;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오전 11:22:16
 * @subject
 * @content
 */
public class Ex03 {
	public static void main(String[] args) {
		// [시험 문제] 두 기억공간의 값을 바꾸기
		
		int x = 10, y = 20;
		System.out.printf("> x=%d, y=%d\n", x, y);
		
		{
			int temp = x;
			x = y;
			y = temp;
		} // temp라는 임시 변수는 {} 안에서만 선언되고 사라지므로 이후에 temp 변수를 다시 사용할 수 있어서 {} 안에 임시변수를 가두면 용이하다.
		System.out.printf("> x=%d, y=%d\n", x, y);
		
	}
}
