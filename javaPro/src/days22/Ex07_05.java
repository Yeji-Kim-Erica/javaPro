package days22;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject 유닉스에서 history 명령어를 
 * @content history 명령어 : 사용자가 입력한 명령어의 이력을 순서대로 보여주는 명령어.
 */
public class Ex07_05 {
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 한다.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">> ");
			try {
				// 화면으로부터 라인 단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.out.println("\t\t프로그램 종료됨");
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다. ");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다. ");
					System.out.println(" history - 최근에 입력한 명령어를 "
										+ MAX_SIZE + "개 보여줍니다. ");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					// LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();
					
					// 입력받은 명령어를 저장
					save(input);
					
					while (it.hasNext()) {
						System.out.println(++i + "." + it.next());
					}
				} else {
					save(input);
					System.out.println(input);
				} // if(input.equalsIgnoreCase("q")) {
			} catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
		} // while(true)
		
	} // main

	private static void save(String input) {
		// queue에 저장한다.
		if(!"".equals(input))
			q.offer(input);
		
		// queue의 최대 크기를 넣으면 제일 처음 입력된 것을 삭제한다.
		if(q.size() > MAX_SIZE) // size()는 Collection인터페이스에 정의
			q.remove();
	}
	
} // class
