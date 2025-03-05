package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		HashSet lotto = new HashSet(6);
		
		fillLotto(lotto);
		dispLotto(lotto);
		dispLotto2(lotto);
		
	} // main

	private static void dispLotto2(HashSet lotto) {
		/*
		Object[] arr = lotto.toArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		*/
		
		// Set -> List 변환
		ArrayList list = new ArrayList(lotto);
		Collections.sort(list);
		
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.printf("[%02d]", n);
		}
		System.out.println();
	}

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
