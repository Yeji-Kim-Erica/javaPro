package days19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author kenik
 * @date 2025. 2. 27. - 오후 2:01:00
 * @subject 
 * @content
 */
public class Ex04_06 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days19\\학생명단.txt";
		String saveFileName = ".\\src\\days19\\SiSt22Class5.html";
		String name = null;
		
		try ( FileReader reader = new FileReader(fileName);
			  BufferedReader br = new BufferedReader(reader);
			  FileWriter writer = new FileWriter(saveFileName);	){
			writer.write("<html>");
			writer.write("<head>");			
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<ol>");
			while ( (name = br.readLine()) != null  ) {
				String li = String.format("<li>%s</li>\n", name);
				writer.write(li);
			} // while
			writer.write("</ol>");
			writer.write("</body>");
			writer.write("</html>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end");
	} // main

} // class










  