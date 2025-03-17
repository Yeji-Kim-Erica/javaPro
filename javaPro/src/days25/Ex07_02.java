package days25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject 제목 가져오기 (강사님 자료에서)
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;
		
		// 학생 정보를 파일로 저장
		String fileName = ".\\src\\days25\\student02.dat"; // data
		
		try (FileInputStream in = new FileInputStream(fileName);
			 DataInputStream dis = new DataInputStream(in)) {
			
			// while (true) {
			while (dis.available() != 0) {
				name = dis.readUTF();
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				tot = dis.readInt();
				avg = dis.readDouble();
				gender = dis.readBoolean();
				System.out.printf("%s,%d,%d,%d,%d,%f,%b\n", name, kor, eng, mat, tot, avg, gender);
			} // while
			
		} // catch (EOFException e) {}
		 catch (Exception e) {
		} // try~catch
		
		System.out.println("end");
		
	} // main
	
} // class
