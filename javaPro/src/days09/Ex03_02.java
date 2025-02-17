package days09;

/**
 * @author yejikim
 * @date 2025. 2. 13. - 오전 11:52:59
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// 주민등록번호(Resident registration number)
		String rrn = "830412-1700001";
		// 1)	830412-*******
		
		String [] rrnArr = rrn.split("-");
		System.out.println(rrnArr[0] + "-*******");
		// String.concat() 문자열 연결 메서드 (잘 쓰이진 않는다. 보통 + 연산 기호를 씀)
		System.out.println(rrnArr[0].concat("-*******"));
		
		// 2)	830412-1******
		System.out.println(rrnArr[0] + "-" + rrnArr[1].charAt(0) + "******");
		System.out.println(rrnArr[0].concat("-").concat(rrnArr[1].charAt(0)+"").concat("******"));
		
	} // main
	
}
