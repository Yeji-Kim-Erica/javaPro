package days23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 김예지
 * @date 2025. 3. 6.
 * @subject
 * @content
 */
public class Ex01_01 {
	
	// 선생님 버전 (switch 활용) 참고해서 다시 공부해보기

	public static void main(String[] args) {
		ArrayList group = new ArrayList(); // 조별로 저장
		
		String fileName = ".\\src\\days23\\1차_조편성.txt";
		String saveFileName = ".\\src\\days23\\1차_조편성.html";
		
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);
			Writer writer = new FileWriter(saveFileName);) {
			writer.write("<html><head></head><body>");
			String line = null;
			String[] lineArr = null; // 조원들 이름
			while ((line = br.readLine()) != null) {
				lineArr = line.split("[/:]"); // (/|:)
				ArrayList members = new ArrayList();
				String jo = lineArr[0];
				writer.write("<h3>[");
				writer.write(jo);
				writer.write("]</h3><ol>");
				for (int i = 1; i < lineArr.length; i++) {
					members.add(lineArr[i]);
				} // for i
				group.add(members);
				
				char seq = 'A';
				Iterator ir = members.iterator();
				while (ir.hasNext()) {
					String s = String.format("<li>%c. %s\n</li>", seq++, (String) ir.next());
					writer.write(s);
				}
				writer.write("</ol>");
			} // while
			writer.write("</body></html>");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Iterator it = group.iterator();
		int no = 1;
		char seq = 'A';
		while (it.hasNext()) {
			System.out.printf("[%d조]\n", no++);
			ArrayList<String> members = (ArrayList<String>) it.next();
			for (int i = 0; i < members.size(); i++) {
				System.out.printf("\t%c. %s\n", seq+i, members.get(i));
			} // for i
		}
		
		System.out.println("end");
		
	} // main
	
} // class
