package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Student {
	// 필드
	public String name;
	public int no, kor, eng, mat, tot, rank, grank, wrank;
	public double avg;
	
	// 메소드
	public String getInfo() {
		return String.format("%2d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\t%d\n",
				no, name, kor, eng, mat, tot, avg, rank, grank, wrank);
	}
}
