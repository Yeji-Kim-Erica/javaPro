package days26;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author kenik
 * @date 2025. 3. 11. - 오후 2:16:50
 * @subject  
 * @content 
 */
public class Ex07_02 {

	public static void main(String[] args) {
		
		String name = ".\\src\\days26\\Child.ser";
		
		try (FileInputStream fis = new FileInputStream(name);
			 ObjectInputStream ois = new ObjectInputStream(fis)){
			// 
	        Child c= (Child) ois.readObject();
			
			System.out.println( c.name ); 
			System.out.println( c.age );  
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

} // class








  