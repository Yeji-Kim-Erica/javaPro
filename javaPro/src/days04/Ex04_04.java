package days04;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오후 12:45:38
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {

		// 문제 풀어보기
		// 이름(String), 나이(byte), 키(double), 성별(boolean) 입력받아서 출력.
		// (출력형식)
		// > 이름:홍길동, 나이:20살, 키:178.89, 성별:남자/여자
		
//		System.out.print("이름, 나이, 키, 성별을 입력하세요. : ");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		byte age = sc.nextByte();
//		double height = sc.nextDouble();
//		boolean gender = sc.nextBoolean();
//		
//		System.out.printf("> 이름:%s, 나이:%d, 키:%.2f, 성별:%s", name, age, height, gender?"남자":"여자");
		
		String name;
		byte age;
		double height;
		boolean gender;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름, 나이, 키, 성별을 입력하세요. : ");
		
		// scanner의 구분자를 콤마(,)로 설정하는 방법
		scanner.useDelimiter("\\s*,\\s*|\\s*\\n\\s*");
		
		name = scanner.next();
		age = scanner.nextByte();
		height = scanner.nextDouble();
		gender = scanner.nextBoolean();
		
		scanner.close();
		
		System.out.printf("> 이름:%s, 나이:%d, 키:%.2f, 성별:%s", name, age, height, gender?"남자":"여자");
		
		
		
		// 놓친 부분 있는지 확인

	}

}
