package days25;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject Ex06.java 코딩을 DataInputStream/DataOutputStream 사용 수정
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		
		String name = "김영준";
		int kor = 90, eng = 80, mat = 99;
		int tot = kor + eng + mat;
		double avg = (double) tot / 3;
		boolean gender = true;
		
		// 학생 정보를 파일로 저장
		String fileName = ".\\src\\days25\\student02.dat"; // data
		
		try (FileOutputStream out = new FileOutputStream(fileName, true);
			 DataOutputStream dos = new DataOutputStream(out)) {
			
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		System.out.println("end");
		
	} // main
	
} // class
