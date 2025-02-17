package days04;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오전 11:56:48
 * @subject Scanner 클래스
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {

		// BufferedReader br 키보드로부터 입력
		// [ Scanner 클래스 ]

//		Scanner sc = new Scanner(System.in);
//		System.out.print("> 정수(n)을 입력하세요. : ");
//		int n = sc.nextInt(); // nextInt의 기능과 매개변수, 리턴값을 확인해보기
//		
//		System.out.println(n);

		// 예시
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;

		Scanner sc = new Scanner(System.in); //

		System.out.print("> 이름 국어 영어 수학 을 순서대로 입력하세요. : "); // 홍길동 90 87 65 (tocken들. tocken의 기본 구분자(Delimiter)는 공백이다.)
		name = sc.next(); // next 기능: 첫번째 토큰을 문자열로 읽을게요.
		kor = sc.nextByte();
		eng = sc.nextByte();
		mat = sc.nextByte();

		tot = (short) (kor + eng + mat);
		avg = (double) tot / 3;

		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name, kor, eng, mat, tot, avg);

	}

}
