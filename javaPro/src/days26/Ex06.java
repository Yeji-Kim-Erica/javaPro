package days26;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author 김예지
 * @date 2025. 3. 11.
 * @subject 직렬화(Serialization), 역직렬화(Deserialization)
 * @content
 			객체 ->	읽기	->	파일/메모리에 저장
 				   	쓰기
 			
 			네트워크 상에서 객체 전송(쓰기) / 수신(읽기) 할 때 직렬화가 필요하다.
 			
 			1) [직렬화] : 객체(Object)를 입출력하기 위해 스트림으로 만드는 것
 			
 			2) [역직렬화] : 스트림을 객체로 만드는 것
 			
 			3) 자바에서는 객체를 입/출력하는 바이트 스트림을 제공.
 				ObjectInputStream
 				ObjectOutputStream
 				
 				예) UserInfo 클래스 -> 객체 생성 -> 파일에 읽기/쓰기
 */
public class Ex06 {

	public static void main(String[] args) {
		UserInfo u1 = new UserInfo("홍길동", "1234", 25);
		UserInfo u2 = new UserInfo("권태정", "3412", 28);
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		list.add(u1);
		list.add(u2);
		
		// u1, u2 객체를 파일에 쓰기/읽기
		String name = ".\\src\\days26\\UserInfo.ser";		
		try (FileOutputStream fos = new FileOutputStream(name);
			 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush();
			System.out.println("u1, u2 객체를 직렬화해서 파일로 저장함");
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		
		
	} // main
	
} // class
