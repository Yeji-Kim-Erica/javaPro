package days17;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject // 또 졸았다. 나중에 강의자료 확인해
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		/* [인터페이스(interface)]
		   1. 자바 자료형
		 	 - 기본형: 8가지
		 	 - 참조형: 배열, 클래스, 인터페이스
		   2. 일종의 추상 클래스
		   	 ㄴ 100% 추상메서드
		   	 ㄴ 일반 메서드 X
		   	 ㄴ 상수만 선언 가능. 그외 필드는 선언할 수 없다.
		   	 3. 인터페이스는 그 자체만으로 사용되지 않고,
		   	 	다른 클래스를 작성(선언)하는 데 도움을 줄 목적의 클래스
		   	 4. 인터페이스 선언 형식
		   	 	[접근지정자] interface 인터페이스명{
		   	 	}
		   	 	** 클래스의 일종이기에 인터페이스명은 대문자로 시작함
		   	 5. JDK 1.8부터~
		   	 	1) static 메소드
		   	 	2) default 메소드
		   	 	=> 추가할 수 있다
		   	 6. interface IA{}
		   	 		void disp();
		   	 	interface IB extends IA();
		   	 		void test();
		   	 7. 어떤 클래스에서 인터페이스를 구현한다고 할 때. 인터페이스는 나열 가능하다
		   	 	 		implements IA(), IB();
		   	 	void disp(){
		   	 	}
		   	 	void test(){
		   	 	}
		   	 	
		   	 Sample.java 참고
		 */
	} // main
	
} // class

// 클래스 설계 (인터페이스 사용)

// (군사)부대, 한 사람, 단일체
class Unit{
	   // [필드]
	   // 유닛의 위치
	   int x;
	   int y;
	   int currentHP;  // 현재 유닛의 체력
	}

class AirUnit extends Unit implements Repairable{
	
}

class GroundUnit extends Unit implements Repairable{
}

interface Movable{
	// 상수, 추상메소드 + idk1.8 default, static 메소드
	void move(int x, int y); // public abstract 키워드 생략
}
interface Attackable{
	void attack(Unit unit);
}

//인터페이스끼리 상속이 가능하고 키워드는 extends 사용한다. 
//인터페이스는 다중상속이 가능하다. 
interface Fightable extends Movable, Attackable{
	
}


//어떤 클래스가 인터페이스를 구현하면 추상메소드를 오버라이딩 해야 한다. 
class Fight implements Fightable{

	@Override
	public void move(int x, int y) {
		// 구현되었다고 가정
	}

	@Override
	public void attack(Unit unit) {
		// 구현되었다고 가정
	}
	
}

// 유닛 - 탱크(수리 가능), 해병대원, 수송선(수리 가능)
// 수리유닛 - SCV(수리 가능)
class Tank extends GroundUnit implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit unit) {
		// TODO Auto-generated method stub
		
	}
	
}

class Marine extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit unit) {
		// TODO Auto-generated method stub
		
	}
	
}

class DropShip extends AirUnit implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit unit) {
		// TODO Auto-generated method stub
		
	}
	
}

interface Repairable{
	// 상수, 추상메소드 아무것도 선언 X
}

class SCV extends GroundUnit implements Repairable{
	// 수리 기능이 구현된 메소드
	/*
	void repair(Tank tank) {
		// 탱크 수리 코딩
	}
	void repair(DropShip dropShip) {
		// 수송선 수리 코딩
	}
	void repair(SCV scv) {
		// SCV 수리 코딩
	}
	*/
	void repair(Repairable target) { // 매개변수 다형성
		// 수리 코딩
		if (target instanceof Unit) {
			Unit u = (Unit) target;  // 다운캐스팅...
		} // if
	}
}







