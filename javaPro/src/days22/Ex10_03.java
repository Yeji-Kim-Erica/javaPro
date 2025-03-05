package days22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject
 * @content
 */
public class Ex10_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int round = scanner.nextInt();
		
		ArrayList list = new ArrayList(round);
		
		// fill
		for (int i = 0; i < round; i++) {
			HashSet lotto = new HashSet(6);
			fillLotto(lotto);
			list.add(lotto);
		} // for i
		
		// display
		for (int i = 0; i < round; i++) {
			System.out.printf("[%d게임] ", i+1);
			dispLotto((HashSet) list.get(i));
		} // for i
		
	} // main

	private static void dispLotto(HashSet lotto) {
		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.printf("[%02d]", n);
		}
		System.out.println();
	}

	private static void fillLotto(HashSet lotto) {
		Random rnd = new Random();
		int n = 0;
		while (lotto.size() < 6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		} // while
	}
} // class