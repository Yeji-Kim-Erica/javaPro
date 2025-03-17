package days25;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject
 * @content
 */
public class Ex09_02 {

	public static void main(String[] args) throws IOException {
		int[] score = { 1, 100, 90, 90,
			            2, 70 , 90,100,
			            3, 100,100,100,
			            4, 70 , 60, 80,
			            5, 70 , 90,100 };
		// 번호, 국영수
		
		String name = ".\\src\\days25\\score.dat";
		String mode = "rw";
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			for (int i = 0; i < score.length; i++) {
				if (i % 4 == 0) System.out.println("=".repeat(50));
				long fp = raf.getFilePointer();
				System.out.printf("현재 FP : %d - [%d]\n", fp, score[i]);
				raf.writeInt(score[i]);
			} // for i
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		일시정지();
		
		// [문제]
		// 모든 학생의 번호, 국어, 영어, 수학, 총점, 평균 정보를 출력
		
		int no, kor, eng, mat, tot;
		double avg;
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			for (int i = 0; i < score.length; i+=4) {
				no = raf.readInt();
				kor = raf.readInt();
				eng = raf.readInt();
				mat = raf.readInt();
				tot = kor + eng + mat;
				avg = (double) tot / 3;
				System.out.printf("번호: %d, 국어: %3d, 영어: %3d, 수학: %3d, 총점: %3d, 평균: %.2f\n", no, kor, eng, mat, tot, avg);
				System.out.println("=".repeat(60));
			} // for i
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		일시정지();
		
		// [문제2] 3번 학생의 수학점수를 100 -> 20 수정
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			raf.seek((4*4)*2+4*3);
			raf.writeInt(20);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		// [문제3] 3번 학생의 번/국/영/수/총/평 을 출력
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			raf.seek((4*4)*2);
			no = raf.readInt();
			kor = raf.readInt();
			eng = raf.readInt();
			mat = raf.readInt();
			tot = kor + eng + mat;
			avg = (double) tot / 3;
			System.out.printf("번호: %d, 국어: %3d, 영어: %3d, 수학: %3d, 총점: %3d, 평균: %.2f\n", no, kor, eng, mat, tot, avg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
	} // main
	
	public static void 일시정지() {
		System.out.println("> 엔터 치면 진행");
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
} // class
