package days24;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject [Properties]
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		Properties p = new Properties();
		
		//		  key		value
		String className = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";                                                                   
		String password = "tiger";
	    
	    // p.put(Object key, Object value); -> 사용 X
	    p.setProperty("className", className);
	    p.setProperty("url", url);
	    p.setProperty("user", user);
	    p.setProperty("password", password);
	    
	    System.out.println(p);
	    //{password=tiger, className=oracle.jdbc.driver.OracleDriver, user=scott, url=jdbc:oracle:thin:@localhost:1521:xe}
	    
	    /*
	    String fileName = ".\\src\\days24\\oracle.properties";
	    // 확장자명 .properties -> Properties 클래스 사용할 때
	    
	    try (FileWriter writer = new FileWriter(fileName)) {
	    	String comments = "Oracle ConnectionString"; // 주석 처리할 때
	    	p.store(writer, comments);
		} catch (Exception e) {
			System.out.println(e.toString());
		} // try~catch
	    */
	    
	    // XML 파일로 저장
	    // XML: 파일을 전달하고 데이터를 주고받을 때 용이함
	    // (eXtensible Markup Language)
	    // XML란? 데이터를 구조화하고 저장하는 데 사용되는 텍스트 기반의 마크업 언어
	    // 데이터를 계층적으로 표현할 수 있어서 다른 시스템 간 데이터 교환이 쉽다
	    // XML: 데이터 표현에 집중
	    // HTML: 웹페이지의 표시에 집중
	    
	    // XML은 태그를 이용해서 데이터의 구조를 표현함
	    // 예: <name>John</name>
	    
	    String fileName = ".\\src\\days24\\oracle.xml";
	    // 보통은 확장자는 그대로 .properties를 사용한다. 굳이 xml 아니어도 됨
	    
	    try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
	    	String comments = "Oracle ConnectionString";
	    	p.storeToXML(outputStream, comments);
		} catch (Exception e) {
			System.out.println(e.toString());
		} // try~catch
	    
	    System.out.println("end");
		
	} // main
	
} // class
