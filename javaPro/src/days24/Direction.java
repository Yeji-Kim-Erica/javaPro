package days24;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject
 * @content
 */
public enum Direction {
	// The constructor Direction(int, String) is undefined
	EAST(100, "→"), SOUTH(200, "↓"), WEST(300, "←"), NORTH(400, "↑");

	// 필드
	private int value;
	private String symbol;
	
	// 2 생성자 선언
	Direction(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}

	// getter (상수라서 setter는 필요없다)
	public int getValue() {
		return value;
	}

	public String getSymbol() {
		return symbol;
	}
	
	// 메서드, 추상 메서드 선언 가능
	
	// 추상메서드 선언
	@Override
	public String toString() {
		return name() + ":" + this.symbol;
	}
	
}













