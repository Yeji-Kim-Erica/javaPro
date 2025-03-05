package days22;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 3. 5. - 오후 2:54:35
 * @subject 유닉스의 history 명령어를 Queue를 이용해서 구현한 예제
 *                                    FIFO 구조
 * @content history 명령어 : 사용자가 입력한 명령어의 이력을 
 *                           순서대로 보여주는 명령어.
 */
public class Ex07_05 {
	// 객체 생성 X  
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // 명령어 최대 5개만 저장.

	public static void main(String[] args) {
		// 3:05 수업 시작~
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while (true) {  // 무한 루프
			System.out.print(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				if("".equals(input)) continue;
				if(input.equalsIgnoreCase("q")) {
					// 0 다른 프로세스에게 0 정수값을 전달..
					System.out.println("\t\t 프로그램 종료됨!!!");
					System.exit(-1);
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 "+ MAX_SIZE+"개 보여줍니다.");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0 ;
					LinkedList tmp = (LinkedList)q;
					ListIterator ir =tmp.listIterator();
					while (ir.hasNext()) {
						System.out.println(++i +"." + ir.next());
					} // while
					save(input);
				} else {
					save(input);
					System.out.println(input);
				}
				
			} catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
		} // while

	} // main

	private static void save(String input) {
		if (!"".equals(input)) {
			q.offer(input);
		} // if
		
		if (q.size()> MAX_SIZE) {
			q.remove();
		} // if
		
	}

} // class
