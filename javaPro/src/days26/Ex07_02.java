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
public class Ex07_02 {

	public static void main(String[] args) {
		
		String name = ".\\src\\days26\\Child.txt";
		
		try (FileInputStream fis = new FileInputStream(name);
			 ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Child c = (Child) ois.readObject();
			
			System.out.println(c.name);
			System.out.println(c.age);
			
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		// [1] 출력결과
//		홍길동
//		20
		
		// [2] 출력결과
//		null
//		20
		
	} // main
	
} // class
