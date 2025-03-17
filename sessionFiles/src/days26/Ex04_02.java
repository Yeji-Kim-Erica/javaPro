package days26;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author kenik
 * @date 2025. 3. 11. - 오전 11:39:18
 * @subject  days25.Ex08.java 참고
 * @content  days25.Ex02_02.java 
 */
public class Ex04_02 {

	public static void main(String[] args) throws IOException  {
		Vector<FileInputStream> v = new Vector<>();
		for (int i = 1; i <= 10; i++) {
			v.add(new FileInputStream(".\\src\\days26\\시간표-"+i+".pdf"));
		} // for i
		Enumeration<FileInputStream>  en =  v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		String name = ".\\src\\days26\\시간표.pdf";
		FileOutputStream fos = new FileOutputStream(name);
		
		int b;
		while( (b = sis.read()) != -1 ) {
			fos.write(b);
		} // 
		
		fos.close();
		
		System.out.println(" end ");
		
	} // main

} // class












  