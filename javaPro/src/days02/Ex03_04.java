package days02;

public class Ex03_04 {
	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 25;
		double height = 180.78;
		
		// System.out.println("이름은 \""+name+"\"이고, 나이는 "+age+"살이고, 키는 "+height+"cm이다.");
		
		// printf() 메서드
		// 메서드의 3가지 파악: 기능, 매개변수, 리턴값
		// 내가 원하는 형식으로 출력할 수 있게 해주는 메서드
		// System.out.printf(String format, Object... args);
		
		// %conversion 모음
		// String : s
		// int : d
		// double : f
		System.out.printf("이름은 \"%s\"이고, 나이는 \'%d\'(만 %d)살이고, 키는 %fcm이다.", name, 27, age, height);
		// 출력결과: 이름은 "홍길동"이고, 나이는 '27'(만 25)살이고, 키는 180.780000cm이다.
		// 키의 소수점을 두자리만 나오게 하려면, %.2f라고 써준다.
		System.out.printf("키는 %.2fcm이다.", height); // 출력결과: 키는 180.78cm이다.
		
	}
	
}
