package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		
		System.out.printf("> x=%d, y=%d\n", p1.x, p1.y);
		swap(p1); // Call by Reference
		System.out.printf("> x=%d, y=%d\n", p1.x, p1.y);
		
	} // main

	private static void swap(Point p) { // 클래스 복사 Point p = p1;
		System.out.printf("> swap x=%d, y=%d\n", p.x, p.y);
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
		System.out.printf("> swap x=%d, y=%d\n", p.x, p.y);
	}

	private static void swap(int[] m) {
		System.out.printf("> swap x=%d, y=%d\n", m[0], m[1]);
		int temp = m[0];
		m[0] = m[1];
		m[1] = m[0];
		System.out.printf("> swap x=%d, y=%d\n", m[0], m[1]);
	}

} // class

class Point{
	// 필드
	int x;
	int y;
}
