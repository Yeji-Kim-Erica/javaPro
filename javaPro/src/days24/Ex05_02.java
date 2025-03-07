package days24;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject [Properties]
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		Properties p = new Properties();
		System.out.println(p); // {}
		
		String className;
	    String url;
	    String user;                                                                   
	    String password;
	    
	    String fileName = ".\\src\\days24\\oracle.xml";
	    
	    try (FileInputStream in = new FileInputStream(fileName)) {
	    	p.loadFromXML(in);
	    	System.out.println(p);
		    // {password=tiger, className=oracle.jdbc.driver.OracleDriver, user=scott, url=jdbc:oracle:thin:@localhost:1521:xe}
	    	
	    	System.out.println(p.getProperty("className"));
	    	System.out.println(p.getProperty("url"));
	    	System.out.println(p.getProperty("user"));
	    	System.out.println(p.getProperty("password"));
	    	
	    	System.out.println("end");
		} catch (Exception e) {
			System.out.println(e.toString());
		} // try~catch
	    
	    /*
	    String fileName = ".\\src\\days24\\oracle.properties"; 
	    
	    try (FileReader reader = new FileReader(fileName)) {
	    	p.load(reader);
	    	System.out.println(p);
		    // {password=tiger, className=oracle.jdbc.driver.OracleDriver, user=scott, url=jdbc:oracle:thin:@localhost:1521:xe}
	    	
	    	System.out.println(p.getProperty("className"));
	    	System.out.println(p.getProperty("url"));
	    	System.out.println(p.getProperty("user"));
	    	System.out.println(p.getProperty("password"));
	    	
	    	System.out.println("end");
		} catch (Exception e) {
			System.out.println(e.toString());
		} // try~catch
	    */
		
	} // main
	
} // class
