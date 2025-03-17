package days29;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

/**
 * @author 김예지
 * @date 2025. 3. 14.
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		Student[] stuArr = {
		         new Student("나자바", true,  1, 1, 300),   
		         new Student("김지미", false, 1, 1, 250),   
		         new Student("김자바", true,  1, 1, 200),   
		         new Student("이지미", false, 1, 2, 150),   
		         new Student("남자바", true,  1, 2, 100),   
		         new Student("안지미", false, 1, 2,  50),   
		         new Student("황지미", false, 1, 3, 100),   
		         new Student("강지미", false, 1, 3, 150),   
		         new Student("이자바", true,  1, 3, 200),   

		         new Student("나자바", true,  2, 1, 300),   
		         new Student("김지미", false, 2, 1, 250),   
		         new Student("김자바", true,  2, 1, 200),   
		         new Student("이지미", false, 2, 2, 150),   
		         new Student("남자바", true,  2, 2, 100),   
		         new Student("안지미", false, 2, 2,  50),   
		         new Student("황지미", false, 2, 3, 100),   
		         new Student("강지미", false, 2, 3, 150),   
		         new Student("이자바", true,  2, 3, 200)   
		      };
		
		// 1. 성별로 분할
		Map<Boolean, List<Student>> map = Stream.of(stuArr).collect(Collectors.partitioningBy(Student::isMale));
		// true 그룹 (남학생)
		List<Student> maleStudent = map.get(true);
		// false 그룹 (여학생)
		List<Student> femaleStudent = map.get(false);
		
		System.out.println(maleStudent);
		System.out.println(femaleStudent);
		
		// 2. 성별 인원 수
		// maleStudent.size();
		// femaleStudent.size();
		Map<Boolean, Long> map2 = Stream.of(stuArr).collect(Collectors.partitioningBy(Student::isMale, Collectors.counting()));
		System.out.println(map2.get(true));
		System.out.println(map2.get(false));
		
		// 3. 성별 분할(구분) 1등 학생의 정보 출력
		Map<Boolean, Optional<Student>> map3 = Stream.of(stuArr).collect(
				Collectors.partitioningBy(Student::isMale, Collectors.maxBy(Comparator.comparing(Student::getScore))));
		Optional<Student> m = map3.get(true);
		Optional<Student> f = map3.get(false);
		
		System.out.println("남 1등: " + m.get());
		System.out.println("여 1등: " + f.get());
		
		/*
			남 1등: [나자바, 남, 1학년 1반, 300점]
			여 1등: [김지미, 여, 1학년 1반, 250점]
		 */
		
		Map<Boolean, Student> topScoreBySex2 = Stream.of(stuArr)
		         .collect(partitioningBy(Student::isMale, 
		            collectingAndThen(
		               maxBy(comparingInt(Student::getScore)), Optional::get
		            )
		         ));
		      System.out.println("남학생 1등 :"+ topScoreBySex2.get(true));
		      System.out.println("여학생 1등 :"+ topScoreBySex2.get(false));

		      System.out.printf("%n4. 다중분할(성별 불합격자, 100점 이하)%n");

		      Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = 
		         Stream.of(stuArr).collect(partitioningBy(Student::isMale, 
		            partitioningBy(s -> s.getScore() <= 100))
		         ); 
		      List<Student> failedMaleStu   = failedStuBySex.get(true).get(true);
		      List<Student> failedFemaleStu = failedStuBySex.get(false).get(true);

		      for(Student s : failedMaleStu)   System.out.println(s);
		      for(Student s : failedFemaleStu) System.out.println(s);
		
	} // main
	
} // class

class Student {
	   String name;
	   boolean isMale; // 성별
	   int hak;        // 학년
	   int ban;        // 반
	   int score;

	   Student(String name, boolean isMale, int hak, int ban, int score) { 
	      this.name   = name;
	      this.isMale   = isMale;
	      this.hak   = hak;
	      this.ban   = ban;
	      this.score  = score;
	   }
	   String   getName()  { return name;}
	   boolean isMale()    { return isMale;}
	   int      getHak()   { return hak;}
	   int      getBan()   { return ban;}
	   int      getScore() { return score;}

	   public String toString() { 
	      return String.format("[%s, %s, %d학년 %d반, %3d점]",
	         name, isMale ? "남":"여", hak, ban, score); 
	   }
	   // groupingBy()에서 사용
	   enum Level { HIGH, MID, LOW }  // 성적을 상, 중, 하 세 단계로 분류
	}
