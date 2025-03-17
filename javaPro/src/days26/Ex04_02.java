package days26;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author 김예지
 * @date 2025. 3. 11.
 * @subject days25 Ex08.java, days25 Ex02_02.java
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) throws IOException {
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		for (int i = 1; i <= 10; i++) {
			v.add(new FileInputStream(".\\src\\days26\\시간표-"+i+".pdf"));
		} // for i
		Enumeration<FileInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		String name = ".\\src\\days26\\Copy시간표(2).pdf";
		FileOutputStream fos = new FileOutputStream(name);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while ((b = sis.read()) != -1) {
			bos.write(b);
		} // while
		
		bos.close();
		
		System.out.println("end");
		
		/*
		
		String parent = ".\\src\\days26";
		String child;
		String copyPathname = ".\\src\\days26\\Copy시간표.pdf";
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		
		for (int i = 1; i <= 10; i++) {
			child = String.format("시간표-%d.pdf", i);
			File file = new File(parent, child);
			FileInputStream reader;
			try {
				reader = new FileInputStream(file);
				v.add(reader);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} // for i
		Enumeration<FileInputStream> en = v.elements();
		
		try (FileOutputStream writer = new FileOutputStream(copyPathname);
			 SequenceInputStream sis = new SequenceInputStream(en);
			 BufferedOutputStream bos = new BufferedOutputStream(writer)) {
			
			int n = -1;
			while ((n = sis.read()) != -1) {
				bos.write(n);
			} // while
			
			bos.flush();
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		
		*/
		
	} // main
	
} // class
