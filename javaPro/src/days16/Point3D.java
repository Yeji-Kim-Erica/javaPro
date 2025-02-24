package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */

// 기존에 존재하던 Point2D 클래스를 재사용해서 새로운 Point3D 클래스를 선언 (상속)
public class Point3D extends Point2D {

	// 필드
//	private int x; 상속받았으므로 필요 X
//	private int y; 상속받았으므로 필요 X
	private int z;

	// 생성자
	public Point3D() { // 생성자는 상속되지 않는다. (암기)
		System.out.println("> Point3D 디폴트 생성자 호출됨...");
	}

	public Point3D(int a) { // 생성자는 상속되지 않는다. (암기)
		// The field Point2D.x is not visible
		// 해결방법 [1]
//		this.setX(a);
//		this.setY(a);
		
		// 해결방법 [2]
		super(a); // super -> 부모 클래스 호출
		this.z = a;
		System.out.println("> Point3D 1 생성자 호출됨...");
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("> Point3D 3 생성자 호출됨...");
	}
	
	public Point3D(Point2D p, int z) {
		this.setX(p.getX());
		this.setY(p.getY());
		this.z = z;
	}

	// getter, setter
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	// 메소드
	public void dispPoint3D() {
		System.out.printf("x=%d, y=%d\n, z=%d", this.getX(), this.getY(), this.z);
	}

	public Point3D offsetPoint(int i) { // 기본형 매개변수
		this.setX(getX()+i);
		this.setY(getY()+i);
		z += i;
		return this; // this의 3번째 용도, 참조형 리턴자료형
	}

	public void offsetPoint(Point3D p) { // 참조형 매개변수
		this.setX(this.getX()+p.getX());
		this.setY(this.getY()+p.getY());
		z += p.z;
	}

	public Point3D plus(Point3D p) {
		int xValue = this.getX() + p.getX();
		int yValue = this.getY() + p.getY();
		int zValue = z + p.z;

		Point3D newp = new Point3D(xValue, yValue, zValue);

		return newp;
	}
}
