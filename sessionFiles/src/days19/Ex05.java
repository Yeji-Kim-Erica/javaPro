package days19;

/**
 * @author kenik
 * @date 2025. 2. 27. - 오후 2:16:11
 * @subject 
 * @content
 *              문자열 (수정/삭제/삽입) 변경
 *           2. StringBuffer 클래스 - 동기화 O . 
 *           3. StringBuilder 클래스
 */
public class Ex05 {

	public static void main(String[] args) {
		// (암기) 불변
		String s = "TODO Auto-generated method stub";
		
		// 1. 삽입
		int index = s.indexOf("Auto");
		int len = "Auto".length();		
		System.out.println( s.substring(0, index + len) + "[hi]" + s.substring(index + len) );
		// 2. String s 에서 "method" 문자열을 찾아서 삭제..
		index =  s.indexOf("method");
		len = "method".length();
		System.out.println( s.substring(0, index) +  s.substring(index + len) );
		// 3. 수정 method -> 메소드
				System.out.println( s.replace("method", "메소드") );
		
//		StringBuffer sb = new StringBuffer(s);   // 멀티스레드 O ( == 동기화 처리 O )
		StringBuilder sb = new StringBuilder(s); // 멀티스레드 X
		
		// 1. 삽입
		sb.insert( index + len , "[hi]");
		// 2. 삭제
		// sb.delete(index, index + len);
		// 3. 수정
		int start = sb.indexOf("method");
		int end = start + "method".length();
		sb.replace(start, end, "메소드");
		
		sb.reverse();
		
		System.out.println( sb ); // "TODO Auto-generated method stub"
		
		// Auto 문자열을 찾아서 [hi] 삽입
		

	}

}
  