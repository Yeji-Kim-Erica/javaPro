package days25;

import java.io.File;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject
 * @content
 */
public class Ex10_05 {

	public static void main(String[] args) {
		// [문제]
		// days25 폴더 안에 upload 폴더 유무를 확인하고 없으면 폴더 생성
		
		String pathname = ".\\src\\days25";
		File parent = new File(pathname);
		
		File upload = new File(parent, "upload");
		
		if (!upload.exists()) {
			// upload 폴더 생성
			// upload.mkdir();
			// upload.mkdirs(); // 부모 폴더도 자동으로 생성하고 싶을 때
			System.out.println(upload.mkdirs());
		} else {
			System.out.println(upload.delete());
		}
		
		
	} // main
	
} // class
