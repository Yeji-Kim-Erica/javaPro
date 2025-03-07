package days24;

import java.io.FileWriter;
import java.util.Properties;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject
 * @content
 * 
 	[Map의 종류]
 	- Hashtable (구) 동기화 O
	- HashMap (신) 동기화 X
	- LinkedHashMap
	- TreeMap
	- Properties 컬렉션 클래스
 	
 	[Properties]
 		ㄴ entry(key, value)로 데이터를 저장하는 Map 계열의 컬렉션 클래스
 		ㄴ 주로 설정 파일(예: .properties)에서 읽고 쓰는 데에 사용됨
 			ㄴ 파일 읽기, 쓰기 메서드가 제공됨
 		ㄴ Hashtable을 상속받은 자식 클래스
 		ㄴ String key, String value 형식만 허용됨 (key, value 모두 String)
 */
public class Ex04 {

	public static void main(String[] args) {
		Properties p = new Properties();
		// Oracle DBMS
		// 연결 문자열 (설정값)
		
		//					패키지명				클래스명
		String className = "oracle.jdbc.driver.OracleDriver";  // JDBC 드라이버
		
	    // IP주소를 이용해서 PC를 찾는다
	    // 포트 번호를 이용해서 서버를 찾는다
		//										  「 1521: 오라클 포트 번호
	    String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
	    //								 ㄴ localhost: 내 PC
	    String user = "scott";                                                                   
	    String password = "tiger";
	    
	    String fileName = ".\\src\\days24\\oracle.config";
	    // 확장자가 .config -> 설정 정보와 연관된 파일이라는 뜻
	    
	    try (FileWriter writer = new FileWriter(fileName)) {
			// writer.append(CharSequence scq);
	    	// writer.write(String str);
	    	
	    	writer.write(String.format("%s=%s\r\n", "className", className));
	    	writer.write(String.format("%s=%s\r\n", "url", url));
	    	writer.write(String.format("%s=%s\r\n", "user", user));
	    	writer.write(String.format("%s=%s\r\n", "password", password));
	    	
	    	writer.close(); // 저장
	    	System.out.println("end");
	    	
		} catch (Exception e) {
			System.out.println(e.toString());
		} // try~catch
		
	} // main
	
} // class
