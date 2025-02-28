package days19;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		String path = "c:\\temp\\src\\days01\\Sample.java";
		String fileName; 	 // Sample.java	확장자를 포함한 파일명
		String ext;		 	 // .java	(확장자만)
		String baseFileName; // Sample	(확장자를 제거한 파일명)
		
		int find1 = path.lastIndexOf("\\")+1;
		int find2 = path.indexOf(".");
		
		fileName = path.substring(find1);
		ext = path.substring(find2);
		baseFileName = path.substring(find1, find2);
		
		// split(String regex)
		// 정규표현식에서 . : 임의의 모든문자
		baseFileName = fileName.split("\\.")[0];
		
		System.out.println(fileName);
		System.out.println(ext);
		System.out.println(baseFileName);
		
		
	} // main
	
} // class
