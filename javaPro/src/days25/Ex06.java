package days25;

import java.io.FileWriter;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject 쓰기 작업
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
		// 기본형 8가지 중 3가지 (int, double, boolean)
		String name = "김길동";
		int kor = 90, eng = 80, mat = 99;
		int tot = kor + eng + mat;
		double avg = (double) tot / 3;
		boolean gender = true;
		
		// 학생 정보를 파일로 저장
		String fileName = ".\\src\\days25\\student.txt"; // javaPro 폴더에 저장
		
		try (FileWriter writer = new FileWriter(fileName, true);) {
			String data = String.format("%s, %d, %d, %d, %d, %2f, %b\n", name, kor, eng, mat, tot, avg, gender);
			writer.append(data);
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		System.out.println("end");
		
	} // main
	
} // class
