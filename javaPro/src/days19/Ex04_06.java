package days19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content
 */
public class Ex04_06 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days19\\학생명단.txt";
		String saveFileName = ".\\src\\days19\\SiSt25Class5.html";
		String name = null;
		
		try (FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);
				FileWriter writer = new FileWriter(saveFileName);) {
			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<ol>");
			while ((name = br.readLine()) != null) {
				String li = String.format("<li>%s</li>\n", name);
				writer.write(li);
//				System.out.printf("<li>%s</li>\n", name);
			} // while
			writer.write("<ol>");
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
	} // main
	
} // class
