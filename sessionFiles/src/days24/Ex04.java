package days24;

import java.io.FileWriter;
import java.util.Properties;

/**
 * @author kenik
 * @date 2025. 3. 7. - 오전 11:29:39
 * @subject  Map - Hashtable(구) 동O
 * @content        HashMap  (신) 동X 권장          ***
 *                 LinkedHashMap
 *                 TreeMap
 *                 Properties 컬렉션 클래스  *** 
 *                   ㄴ entry( key+value )로 데이터 저장하는 Map 계열의 컬렉션 클래스
 *                   ㄴ 주로 설정 파일(???.properties)을 읽고 쓰기
 *                           파일 읽고 쓰기 -> 메서드 제공  
 *                   ㄴ Hashtable의 자식 클래스이다. 
 *                   ㄴ String key, String value 
 */
public class Ex04 {

	public static void main(String[] args) {
		
		Properties p = new Properties();
		
		// Oracle DBMS
		// DB 연결 문자열( 설정값 )
		String className = "oracle.jdbc.driver.OracleDriver";  // JDBC드라이버            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";
		
		String fileName = "oarcle.config";
		
		try (FileWriter writer = new FileWriter(fileName)){
			// writer.append(CharSequence csq);
			// writer.write(String str);
			writer.write(String.format("%s=%s\r\n", "className", className));
			writer.write(String.format("%s=%s\r\n", "url", url));
			writer.write(String.format("%s=%s\r\n", "user", user));
			writer.write(String.format("%s=%s\r\n", "password", password));
			
			writer.close(); // 저장
			System.out.println(" end ");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		

	} // main

} // class









  