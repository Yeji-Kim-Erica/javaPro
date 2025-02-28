package days19;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content 2. StringBuffer 클래스
 			3. StringBuilder 클래스
 			=> 이 둘을 이용해 
 */
public class Ex05 {

	public static void main(String[] args) {
		// String은 불변! 암기할 것
		String s = "TODO Auto-generated method stub";
		
		StringBuffer sb = new StringBuffer(s); // 멀티스레드 O (== 동기화 처리가 되어있음)
		System.out.println(sb); // TODO Auto-generated method stub
		
		StringBuilder sb2 = new StringBuilder(s); // 멀티스레드 X
		System.out.println(sb2); // TODO Auto-generated method stub
		
//		// 1. 삽입: Auto 문자열을 찾아서 [hi] 삽입
//		// [1]
//		int index = s.indexOf("Auto");
//		int len = "Auto".length();
//		System.out.println(s.substring(0, index + len) + "[hi]" + s.substring(index + len));
//		// TODO Auto[hi]-generated method stub
//		
//		//[2]
//		sb.insert(index + len, "[hi]");
//		System.out.println(sb); // TODO Auto[hi]-generated method stub
//		
//		// 2. 삭제: String s 에서 "method" 문자열을 삭제
//		// [1]
//		index = s.indexOf("method");
//		len = "method".length();
//		System.out.println(s.substring(0, index) + s.substring(index + len)); // TODO Auto-generated  stub
//		
//		// [2]
//		sb.delete(index, index + len);
//		System.out.println(sb); // TODO [hi]-generated method stub
		
		// 3. 수정: method -> 메소드
		// [1]
		System.out.println(s.replace("method","메소드")); // TODO Auto-generated 메소드 stub
		
		// [2]
		int index = sb.indexOf("method");
		int len = "method".length();
		sb.replace(index, index + len, "메소드");
		System.out.println(sb); // TODO Auto-generated 메소드 stub
		
		// 4. 리버스
		sb.reverse();
		System.out.println(sb); // buts 드소메 detareneg-otuA ODOT

	}

}
