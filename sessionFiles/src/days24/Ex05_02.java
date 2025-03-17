package days24;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
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
public class Ex05_02 {

	public static void main(String[] args) { 
		
		// Oracle DBMS
		// DB 연결 문자열( 설정값 )
		String className ;            
		String url ;                  
		String user;                                                                   
		String password ;
		
//		String fileName = "oarcle.properties";
		String fileName = "oarcle.xml";
		
		Properties p = new Properties();
		//System.out.println( p );
		// [2]
		try (FileInputStream in = new FileInputStream(fileName) ){			
			p.loadFromXML(in);
			//System.out.println( p );	
			// <entry key="password">tiger</entry>
			System.out.println( p.getProperty("className") );
			System.out.println( p.getProperty("url") );
			System.out.println( p.getProperty("user") );
			System.out.println( p.getProperty("password") );
			
			System.out.println(" end ");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		/* [1]
		try (FileReader reader = new FileReader(fileName); ){			
			p.load(reader);
			//System.out.println( p );	
			
			System.out.println( p.getProperty("className") );
			System.out.println( p.getProperty("url") );
			System.out.println( p.getProperty("user") );
			System.out.println( p.getProperty("password") );
			
			System.out.println(" end ");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		*/
		

	} // main

} // class









  