package days24;

/**
 * @author kenik
 * @date 2025. 3. 7. - 오후 4:44:40
 * @subject Card 열거형
 * @content  name(), ordinal() X
 *                     0,1,2,3
 *           상수에게  특정값 부여..=> 사용   
 *           방법  :  상수(값,값...)
 */
public class Ex09_03 {

	public static void main(String[] args) {
		
		Direction [] dirArr =  Direction.values();
		for (Direction d : dirArr) {
			System.out.printf("name:%s, value=%d, symbol=%s \n"
					, d.name(), d.getValue(), d.getSymbol());
		}

	} // main

} // class
  