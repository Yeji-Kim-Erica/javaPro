package days25;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedReader;
import java.io.RandomAccessFile;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject PipedReader/PipedWriter
 * @content	ㄴ 스레드 간에 데이터를 주고받을 때 사용하는 스트림
 			RandomAccessFile
 			ㄴ 파일의 어느 위치에서나 읽기/쓰기가 가능한 장점이 있는 스트림
 			ㄴ 내부적으로 DataOutput, DataInput 인터페이스를 구현
 */
public class Ex09 {

	public static void main(String[] args) throws IOException {
		
		/* [1] 테스트
		String name = ".\\src\\days25\\test.txt";
		String mode = "rw";
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			// 파일포인터의 위치
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer()); // 0
			raf.writeInt(100);
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer()); // 4
			raf.writeDouble(200L);
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer()); // 12
			raf.seek(4);
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer()); // 4
		} catch (Exception e) {
			// TODO: handle exception
		} // try~catch
		*/
		
		// [2]
		String s = "I Love normal Java";
		String q = "javabook";
		
		String name = ".\\src\\days25\\random.txt";
		String mode = "rw";
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			long cp = raf.getFilePointer();
			raf.writeBytes(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		// 일시정지 + 엔터 계속
		System.out.println("> 엔터 치면 진행");
		System.in.read();
		System.in.skip(System.in.available());
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			raf.seek(2);
			String line = raf.readLine();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		// 일시정지 + 엔터 계속
		// 여기부터 놓쳤어. 다시 봐야해
		System.out.println("> 엔터 치면 진행");
		System.in.read();
		System.in.skip(System.in.available());
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			raf.seek(2);
			String line = raf.readLine();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		
	} // main
	
} // class
