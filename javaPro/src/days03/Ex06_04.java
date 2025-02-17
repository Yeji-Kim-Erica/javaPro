package days03;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오후 3:19:16
 * @subject
 * @content
 */
public class Ex06_04 {

	public static void main(String[] args) {
		
		int i = Integer.MAX_VALUE;
		int j = 200;
		int k = i + j;
		System.out.printf("%d + %d = %d\n", i, j, k); // 출력결과: -2147483449
		// 이런 경우를 '산술 오버플로우'가 발생했다고 함. (예시: int가 표현할 수 있는 최대값을 넘어섰을 때 양수가 음수가 되는 것)
		// 이를 해결하기 위해서는 더 큰 자료형으로 캐스팅(형변환)해야 함.
		// 산술 언더플로우 : 오버플로우와는 반대의 경우. (자료형이 표현할 수 있는 최소값보다 더 작은 값을 표현하려고 할 때 음수가 양수가 되는 것)
		
	}
	
}
