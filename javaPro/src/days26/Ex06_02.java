package days26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author 김예지
 * @date 2025. 3. 11.
 * @subject 직렬화(Serialization), 역직렬화(Deserialization)
 * @content 읽기 작업
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		String name = ".\\src\\days26\\UserInfo.ser";	
		
		try (FileInputStream fis = new FileInputStream(name);
			 ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			UserInfo u1 = (UserInfo) ois.readObject();
			UserInfo u2 = (UserInfo) ois.readObject();
			ArrayList<UserInfo> list = (ArrayList<UserInfo>) ois.readObject();
			
			System.out.println("u1, u2 객체를 직렬화해서 파일로 저장함");
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		
		
	} // main
	
} // class
