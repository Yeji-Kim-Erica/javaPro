package days24;

import java.io.FileOutputStream;
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
public class Ex05 {

	public static void main(String[] args) {
		
		
		// Oracle DBMS
		// DB 연결 문자열( 설정값 )
		//        key            value
		String className 	= "oracle.jdbc.driver.OracleDriver";  // JDBC드라이버            
		String url 			= "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user 		= "scott";                                                                   
		String password 	= "tiger";
		
		
		Properties p = new Properties();
		// X p.put(Object key, Object value);
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		// {password=tiger, className=oracle.jdbc.driver.OracleDriver, user=scott, url=jdbc:oracle:thin:@localhost:1521:xe}
		System.out.println( p );
		
		/*
		String fileName = "oarcle.properties";
		try (FileWriter writer = new FileWriter(fileName)){
			String comments = "Oracle ConnectionString";  // 주석 처리 
			p.store(writer, comments);
		} catch (Exception e) {
			System.out.println(e.toString());
		}	
		*/	 
		
		// "XML 파일"로 저장.
		String fileName = "oarcle.xml";
		try ( FileOutputStream outputStream = new FileOutputStream(fileName) ){
			String comments = "Oracle ConnectionString";  // 주석 처리 
			p.storeToXML(outputStream, comments); 
		} catch (Exception e) {
			System.out.println(e.toString());
		}	

		System.out.println( " end ");
	} // main

} // class









  