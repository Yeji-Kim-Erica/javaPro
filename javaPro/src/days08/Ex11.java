package days08;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오후 5:28:15
 * @subject 재귀[호출]함수란? 함수 안에서 자기자신을 다시 호출하는 함수
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		
		disp();
		
	} // main
	
	// 재귀함수는 비효율적이기 때문에, 꼭 필요한 상황에서만 쓰자! (하나의 계산을 위해 함수가 계속 호출되어야하기 때문)
	
	// 재귀함수
	private static void disp() {
		System.out.println("disp() 호출됨...");
		disp(); // 자기 자신을 함수로 호출하는 부분
	}
	
}
