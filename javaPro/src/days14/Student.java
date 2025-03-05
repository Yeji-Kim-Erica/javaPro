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
	
	// 생성자
	public Student() {}
	
	public Student(String name, int no, int kor, int eng, int mat, int tot, int rank, double avg) {
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.rank = rank;
		this.avg = avg;
	}
	
	// 메소드
	public String getInfo() {
		return String.format("%2d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\t%d\n",
				no, name, kor, eng, mat, tot, avg, rank, grank, wrank);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot="
				+ tot + ", rank=" + rank + ", grank=" + grank + ", wrank=" + wrank + ", avg=" + avg + "]";
	}
	
}
