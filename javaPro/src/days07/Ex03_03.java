package days07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yejikim
 * @date 2025. 2. 11. - 오전 11:40:14
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) throws IOException {

		// [시험 문제]
		// 이름, 국어, 영어, 수학 점수를 입력받아서
		// 총점
		// 평균
		// [ 출력 ]
		// 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 이름,국어,영어,수학 입력 : "); // 홍길동,90,78,97
		String data = br.readLine();
		String [] dataArr = data.split("\\s*,\\s*");

		name = dataArr[0];
		kor = Byte.parseByte(dataArr[1]);
		eng = Byte.parseByte(dataArr[2]);
		mat = Byte.parseByte(dataArr[3]);
		
		tot = (short) (kor + eng + mat);
		avg = (double) tot / 3;
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name, kor, eng, mat, tot, avg);

	} // main

}
