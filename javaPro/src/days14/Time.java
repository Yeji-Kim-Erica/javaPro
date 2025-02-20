package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Time {

	// 멤버(필드, 메소드) 앞에 붙는 접근지정자들,,
	public int hour;
	protected int minute;
	int second; // -> default
	private int milisecond; // 1000ms = 1s
	
	int nano; // 10의 9승분의 1초.. 1000000000ns = 1s
	
}
