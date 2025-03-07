package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject [Properties]
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		String className;
	    String url;
	    String user;                                                                   
	    String password;
	    
	    String fileName = ".\\src\\days24\\oracle.config";
	    
	    try (FileReader reader = new FileReader(fileName);
	    	BufferedReader br = new BufferedReader(reader)) {
	    	
	    	className = br.readLine().split("=")[1];
	    	url = br.readLine().split("=")[1];
	    	user = br.readLine().split("=")[1];
	    	password = br.readLine().split("=")[1];
	    	
	    	System.out.println(className);
	    	System.out.println(url);
	    	System.out.println(user);
	    	System.out.println(password);
	    	
	    	System.out.println("end");
	    	
		} catch (Exception e) {
			System.out.println(e.toString());
		} // try~catch
		
	} // main
	
} // class
