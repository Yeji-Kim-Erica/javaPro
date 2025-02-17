package days08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오후 2:15:35
 * @subject 메서드 선언 + 호출
 * @content
 */
public class Ex06 {

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
		
		Scanner scanner = new Scanner(System.in);
		
		name = getName(scanner);
		kor = getScore(scanner, "국어");
		eng = getScore(scanner, "영어");
		mat = getScore(scanner, "수학");
		
		// Ctrl 누르고 마우스를 메서드 위로 올린 뒤 클릭: 찾고자 하는 메서드 선언식으로 이동할 수 있음
		
		tot = getTotal(kor, eng, mat);
		avg = getAvg(tot);
		
		printScore(name, kor, eng, mat, tot, avg);
		
	} // main
	
	private static byte getScore(Scanner scanner, String subject) {
		String strScore;
		String regex = "^(100|[1-9]?[0-9])$"; // 또는 "^(100|[1-9]?\\d)$"
		// ? : 0번 또는 1번 쓸 수 있다는 의미
		// \d: [0-9]와 같은 의미
		// \D: 숫자면 안된다는 의미 == [^0-9]
		// ^ : 무조건 와야한다 / 오면 안된다 두가지의 의미로 쓰임
		boolean isFirst = false;
		do {
			if (isFirst) {
				System.out.println("[알림] 점수를 다시 입력해주세요.");
			} // if
			
			System.out.printf("> %s 점수 입력 ? ", subject);
			strScore = scanner.next();
			isFirst = true;
		} while (!strScore.matches(regex)); // {n, m} n~m자리 정수 ("[0-9]{1,3}" -> 예: 000, 999, 9, 11 등 가능)
		
		return Byte.parseByte(strScore);
	}

	private static void printScore(String name, byte kor, byte eng, byte mat, short tot, double avg) {
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name, kor, eng, mat, tot, avg);
	}

	private static double getAvg(short tot) {
		return (double) tot / 3;
	}

	private static short getTotal(byte kor, byte eng, byte mat) {
		return (short) (kor + eng + mat);
	}

	private static byte getScore(Scanner scanner) {
		System.out.print("> 점수 입력 ? ");
		byte score = scanner.nextByte();
		return score;
	}

	private static String getName(Scanner scanner) {
		System.out.print("> 이름 입력 ? ");
		String name = scanner.next();
		return name;
	}
}
