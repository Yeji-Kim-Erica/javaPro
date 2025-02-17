package days02;

import java.util.Calendar;

public class Ex03_05 {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		String s = String.format("Duke's Birthday: %1$tY.%1$te.%1$tm", c);
		System.out.println(s);
		
		// %[argument_index$][flags][width][.precision]conversion
		// [] 안의 내용은 생략 가능하므로, %conversion 만으로도 사용 가능하다.
		
		String name = "홍길동";
		// "홍길동!!! 안녕하세요. 홍길동입니다. 홍길동입니다." 를 출력하고 싶을 때
		System.out.println(name+"!!! 안녕하세요. "+name+"입니다.");
		System.out.printf("%s!!! 안녕하세요. %s입니다. %s입니다.", name, name, name);
		System.out.printf("%1$s!!! 안녕하세요. %1$s입니다. %1$s입니다.", name);
		System.out
			.printf("%1$s!!! 안녕하세요. %1$s입니다. %1$s입니다.", name)
			.println("하하하");
		// println 은 리턴값이 
		// printf 는 리턴값이 스트림
		// out에 커서를 대고 F3을 눌러보자. 리턴값을 알 수 있다.
		
		System.out.printf("%1$s!!!\n안녕하세요.\n%1$s입니다.\n%1$s입니다.", name);
		// '\n' : 개행(줄바꿈) 제어문자
	}
}
