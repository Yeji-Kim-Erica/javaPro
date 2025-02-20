package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Ex08_03 {

	public static void main(String[] args) {
		// [배열 초기화]
		/*
		 int[] m = new int[3];
		 m[0] = 1;
		 m[1] = 2;
		 m[2] = 3;
		 
		 int[] m = {1,2,3};
		 
		 위 둘다 가능
		 */
		
		// [클래스 배열 초기화]
//		Person[] pArr = new Person[3];
//		pArr[0] = new Person();
//		pArr[1] = new Person();
//		pArr[2] = new Person();
		// 위와 아래 둘다 같은 배열 초기화임
		Person[] pArr = {new Person(), new Person(), new Person()};
		
	}

}
