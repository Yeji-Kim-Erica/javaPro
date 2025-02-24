package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */
public class Point3DCopy {

	// 필드
	private int x;
	private int y;
	private int z;

	// 생성자
	public Point3DCopy() { // 생성자는 상속되지 않는다. (암기)
		System.out.println("> Point3D 디폴트 생성자 호출됨...");
	}

	public Point3DCopy(int a) { // 생성자는 상속되지 않는다. (암기)
		this.x = a;
		this.y = a;
		System.out.println("> Point3D 1 생성자 호출됨...");
	}

	public Point3DCopy(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("> Point3D 3 생성자 호출됨...");
	}

	// getter, setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	// 메소드
	public void dispPoint3D() {
		System.out.printf("x=%d, y=%d\n, z=%d", this.x, this.y, this.z);
	}

	public Point3DCopy offsetPoint(int i) { // 기본형 매개변수
		x += i;
		y += i;
		z += i;
		return this; // this의 3번째 용도, 참조형 리턴자료형
	}

	public void offsetPoint(Point3DCopy p) { // 참조형 매개변수
		x += p.x;
		y += p.y;
		z += p.z;
	}

	public Point3DCopy plus(Point3DCopy p) {
		int xValue = x + p.x;
		int yValue = y + p.y;
		int zValue = z + p.z;

		Point3DCopy newp = new Point3DCopy();
		newp.x = xValue;
		newp.y = yValue;
		newp.z = zValue;

		return newp;
	}
}
