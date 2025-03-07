package days24;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject Card 열거형
 * @content name(), ordinal()
 					0, 1 , 2, 3...
 			하나하나의 상수에게 각각 특정값을 부여해서 사용하는 경우가 많음
 			값을 부여하는 방법: 상수(값, 값, 값...) -> 필요한 만큼 숨겨둘 수 있음
 */
public class Ex09_03 {

	public static void main(String[] args) {
		Direction[] dirArr = Direction.values();
		for (Direction d : dirArr) {
			System.out.printf("name:%5s, value:%d, symbol:%s\n", d.name(), d.getValue(), d.getSymbol());
		}
		
	} // main
	
} // class
