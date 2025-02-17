package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오후 2:11:31
 * @subject 형변환 (Type Convert) : 자동형변환, 강제형변환
 * @content
 */
public class Ex06_02 {
	
	public static void main(String[] args) throws IOException {
		
		/* <형변환 (Type Convert)>
		 * 1) 자동 형변환
		 * 2) 강제 형변환
		 * 
		 * int -> byte
		 * byte -> long
		 * 둘다 형변환임. 같은 숫자 계열이어도 형이 완전히 일치하지 않으므로 형변환임.
		 */
		
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
		
		/* 내가 쓴 코드
		System.out.print("이름을 입력하세요. : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		name = br.readLine();
		
		System.out.print("국어점수를 입력하세요. : ");
		br = new BufferedReader(new InputStreamReader(System.in));
		kor = Byte.parseByte(br.readLine());
		
		System.out.print("영어점수를 입력하세요. : ");
		br = new BufferedReader(new InputStreamReader(System.in));
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("수학점수를 입력하세요. : ");
		br = new BufferedReader(new InputStreamReader(System.in));
		mat = Byte.parseByte(br.readLine());
		
		tot = (short) (kor + eng + mat);
		avg = (double) tot / 3;
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%d", name, kor, eng, mat, tot, avg);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름을 입력하세요. : ");
		name = br.readLine();
		
		System.out.print("국어 점수를 입력하세요. : ");
		kor = Byte.parseByte(br.readLine());
		
		System.out.print("영어 점수를 입력하세요. : ");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("수학 점수를 입력하세요. : ");
		mat = Byte.parseByte(br.readLine());
		
		// tot = kor + eng + mat;
		// Type mismatch: cannot convert from int to short
		tot = (short) (kor + eng + mat);
		
		avg = (double) tot / 3;
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name, kor, eng, mat, tot, avg);

	}
	
}
