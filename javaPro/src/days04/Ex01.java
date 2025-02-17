package days04;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오전 8:31:30
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// instanceof 연산자
		
		// 쉬프트(shift)연산자 : >>, >>>, << 등 (<<<는 없는 연산자임)
		// 복합대입연산자 : >>=, <<=
		
		// toBinaryString 메서드: 숫자 정수를 2진수로 변환 후, 문자열로 반환하는 메서드
		System.out.println(Integer.toBinaryString(15)); // 출력결과: 1111
		
		// 1바이트 (8비트)로 출력해보자 (예: 1111 -> 00001111)
		String s = Integer.toBinaryString(15);
		System.out.printf("%08d", Integer.parseInt(s));
		
		System.out.println( 15 >> 2 ); // '>>' : 0이 빈자리에 채워짐
		// 15의 2진수 00001111 에 >> 2 를 적용하면 모든 수가 오른쪽으로 2칸을 이동한다는 뜻
		// 00001111
		// __000011 (나머지 11은 값이 버려짐)
		System.out.println( 15 >>> 2 ); // '>>>' : 제일 앞의 진수 수가 빈자리에 채워짐
		System.out.println( 15 << 2 ); // '<<' : 0이 빈자리에 채워짐
		
		// 빠르게 2진수 바꾸는 법: 앞에서부터 계산해서 적어나가기
		
		System.out.println(Integer.toOctalString(15)); // 8진수 문자열 메서드: toOctalString
		System.out.println(Integer.toHexString(15)); // 16진수 문자열 메서드: toHexString
	}
	
}
