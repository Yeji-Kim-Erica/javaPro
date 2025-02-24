package days16;

// 상속 개념.
// Point2D 기존 존재하는 클래스를 재사용해서 새로운 Point3D 클래스를 선언
public class Point3D extends Point2D{

	// 필드
	// private int x; 
	// private int y; 
	private int z;

	// 생성자 - 생성자는 상속되지 않는다. (암기)
	public Point3D() {
		System.out.println("> Point3D 디폴트 생성자 호출됨...");
	} 

	public Point3D(int a) {
		super(a);
		// super(a, a);
		// The field Point2D.x [is not visible] 접근지정자 X
		// this.x = a;
		// this.y = a;
		//this.setX(a);
		//this.setY(a);
		this.z = a;
		System.out.println("> Point3D 1 생성자 호출됨...");
	}

	public Point3D(int x, int y, int z) {
		super(x,y);
		//this.x = x;
		//this.y = y;
		this.z = z;
		System.out.println("> Point3D 3 생성자 호출됨...");
	}
	
	public Point3D(Point2D p, int z) {
		this.setX(p.getX());
		this.setY(p.getY());
		this.z  = z;
	}

	// getter, setter
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	// 메서드 
	public void dispPoint3D() {
		System.out.printf("x=%d, y=%d, z=%d\n"
				, this.getX(), this.getY(), this.z);
	}

	public Point3D offsetPoint(int i) {  // 기본형 매개변수
		this.setX(this.getX()+i);
		this.setY(this.getY()+i);
		z += i;
		return this;  // this의 3번째 용도  참조형 반환자료형
	}

	public void offsetPoint(Point3D p) {  // 참조형 매개변수
		// 부모 생성자를 인위적으로 호출 X
		// super(p.getX(), p.getY());
		this.setX( this.getX() + p.getX() );
		this.setY( this.getY() + p.getY() );
		//x += p.x;
		//y += p.y;
		z += p.z;
	}

	public Point3D plus(Point3D p) {
		int xValue =  this.getX() + p.getX();
		int yValue =  this.getY() + p.getY();
		int zValue =  z + p.z;

		Point3D newp = new Point3D(xValue, yValue, zValue);
		//newp.x = xValue;
		//newp.y = yValue;
		//newp.z = zValue;

		return newp;
	}

} // class
