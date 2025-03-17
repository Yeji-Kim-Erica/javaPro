package days25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author kenik
 * @date 2025. 3. 10. - 오후 12:27:45
 * @subject  DataOutputStream 보조 스트림 -> 파일 쓰기
 * @content   ㄴ 바이트 스트림.
 *           DataInputStream 보조 스트림
 */
public class Ex07_02 {

	public static void main(String[] args) {
		String name;
		int kor , eng , mat ;
		int tot ;
		double avg ;
		boolean gender;

		// 이 학생정보를 파일로 저장.
		String fileName = "student02.dat"; //  data

		// 12:05 수업 시작~ 
		try ( FileInputStream in = new FileInputStream(fileName);
			  DataInputStream dis = new DataInputStream(in); ){
			// System.in.skip(2); // 13/10
			// System.in.skip( System.in.available() )
			//while(true) {
			while( dis.available() > 0  ) {
				name = dis.readUTF(); // String
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				tot = dis.readInt();
 				avg = dis.readDouble();
				gender = dis.readBoolean();
				
				System.out.printf("%s,%d,%d,%d,%d,%f,%b\n"
						, name, kor, eng, mat, tot, avg, gender);
			}
			
		}  
		// catch (EOFException e) {		}  
		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(" end ");

	}

}
