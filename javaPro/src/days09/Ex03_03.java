package days09;

/**
 * @author yejikim
 * @date 2025. 2. 13. - 오전 11:52:59
 * @subject indexOf(), split(), substring(), repeat(), length(), concat(), join()
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		// 주민등록번호(Resident registration number)
		String rrn = "830412-1700001";
		
		// [문제] 주민등록번호 뒷자리 7개 출력
		
		// [1]
		System.out.println(rrn.split("-")[1]);
		
		// [2]
		int beginIndex = rrn.indexOf("-") + 1;
		int endIndex = rrn.length();
		String s = rrn.substring(beginIndex, endIndex);
		System.out.println(s);
		
		/*
		// 1)	830412-*******
		int beginIndex = 0; // <= 0
		int endIndex = 7;	// <  7 
		String s = rrn.substring(beginIndex, endIndex);
		int count = rrn.length()-s.length();
		System.out.println(s + "*".repeat(count));
		
		// 2)	830412-1******
		beginIndex = 0; // <= 0
		endIndex = 8;	// <  8 
		s = rrn.substring(beginIndex, endIndex);
		count = rrn.length()-s.length();
		System.out.println(s + "*".repeat(count));
		*/
		
	} // main
	
}
