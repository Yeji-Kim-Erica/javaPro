package days20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 3. 파일 읽기/쓰기 문제 
   		"days19.학생명단.txt" 파일을 읽어서
   		String [][] students = new String[3][6];
   		2차원 배열에 6명씩 채워넣고 
   		결과와 같이 파일로 저장하기.
   
   		참고) days19.Ex04_06.java 예제
         1차원 배열 -> 2차원 배열 변환   
		 */
		String [][] students = new String[3][6];
		String fileName = ".\\src\\days19\\학생명단.txt";
		String saveFileName = ".\\src\\days20\\SiSt25Class5.html";
		String name = null;
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);
			FileWriter writer = new FileWriter(saveFileName);) {
			
			// 배열에 채우기 작업
			int cols = students[0].length;
			int n = 0;
			while ((name=br.readLine()) != null) {
				students[n/cols][n%cols] = name;
				n++;
			} // while
			
			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<h3>(주)쌍용교육센터 5강의실 학생 명단</h3>");
			
			for (int i = 0; i < students.length; i++) {
				writer.write("<h3>"+(i+1)+"조</h3>");
				for (int j = 0; j < students[i].length; j++) {
					name = students[i][j];
					String li = String.format("<li>%s</li>\n", name);
					writer.write("</ol>");
				} // for j
			} // for i
			
			writer.write("</body>");
			writer.write("</html>");
			
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
	} // main
	
	// 한번 더 확인하기
	
} // class
