package days25;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author kenik
 * @date 2025. 3. 10. - 오후 12:20:23
 * @subject Ex06.java 코딩을 DataInputStream/DataOutputStream 사용 수정. 
 * @content
 */
public class Ex07 {
	
	public static void main(String[] args) {
		String name = "홍길동";
		// 기본형 8가지 중에 3가지 ( int, double, boolean )
		int kor = 90, eng = 80, mat = 99;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		// 이 학생정보를 파일로 저장.
		String fileName = "student02.dat"; //  data
		
		// 12:05 수업 시작~ 
		try ( FileOutputStream out = new FileOutputStream(fileName, true);
			  DataOutputStream dos = new DataOutputStream(out); ){  
			dos.writeUTF(name); // String
			dos.writeInt(kor); // int
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg); // double
			dos.writeBoolean(gender); // boolean
			
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(" end ");
	} // main

}
  