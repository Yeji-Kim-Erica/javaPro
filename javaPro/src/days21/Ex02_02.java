package days21;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		String s = "이름:홍길동, 나이:20살, 성별:여자";
		
		String name;
		int age;
		boolean gender;
		
		/*
		// [1]
		name = s.substring(3, 6);
		age = Integer.parseInt(s.substring(11, 13));
		*/
		
		// [2]
		String[] sArr = s.split(", ");
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].split(":")[1]);
		} // for i
		
		/*
		// [3]
		String regex = ",?\\s*[ㄱ-힣]*:";
		String[] info = s.split(regex);
		
		name = info[1];
		age = Integer.parseInt(info[2].replace("살",""));
		gender = info[3].equals("남자")?true:false;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		*/
		

		
	} // main
	
}
