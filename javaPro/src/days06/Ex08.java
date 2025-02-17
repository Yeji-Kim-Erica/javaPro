package days06;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오후 4:09:31
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		
		String name = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 이름을 입력하세요. : ");
		name = scanner.nextLine();
		
		System.out.println(name);
		
		// next와 nextline의 차이점
		// next: 공백, 탭, 또는 새 줄을 만나기 전까지 문자열을 읽어옴. 공백 기준으로 단어 단위로 읽음.
		// nextline: 사용자가 입력한 한 줄 전체를 읽어옴. 공백이나 탭도 포함되어 있으며, 사용자가 Enter를 치면 그 전까지의 내용을 모두 읽음.
		
	} // main
	
}
