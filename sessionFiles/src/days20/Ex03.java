package days20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오전 11:04:16
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		String [][] students = new String[3][6];
		
		String fileName = ".\\src\\days19\\학생명단.txt";
		String saveFileName = ".\\src\\days20\\SiSt22Class5.html";
		String name = null;
		
		try ( FileReader reader = new FileReader(fileName);
			  BufferedReader br = new BufferedReader(reader);
			  FileWriter writer = new FileWriter(saveFileName);	){
			
			// 2차원 배열 채우기 
			int cols = students[0].length;  // 6
			int n = 0; // 1,2,3,4,5,6,7..
			while ( (name = br.readLine()) != null  ) {
				// students  2차원 배열 채우기
				students[n/cols][n%cols] = name;
				n++;
			} // while
			
			// SiSt22Class5.html 파일에 쓰기(저장)
			writer.write("<html>");
			writer.write("<head>");			
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<h3>(주)쌍용교육센터 5강의실 학생 명단</h3>");
			
			for (int i = 0; i < students.length; i++) {
				writer.write("<h3>"+(i+1)+"조</h3>");
				writer.write("<ol>");
				for (int j = 0; j < students[i].length; j++) {
					name = students[i][j];
					String li = String.format("<li>%s</li>\n", name);
					writer.write(li);
				} // for j
				writer.write("</ol>");
			} // for i
			
			writer.write("</body>");
			writer.write("</html>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end");
	} // main

} // class
  