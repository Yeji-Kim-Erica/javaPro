package days27;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

/**
 * @author 김예지
 * @date 2025. 3. 12.
 * @subject 기본형을 사용하는 함수형 인터페이스
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		IntSupplier s = () -> (int)(Math.random()*100)+1;
		IntConsumer c = i -> System.out.print(i + ",");
		IntPredicate p = i -> i%2==0;
		IntUnaryOperator op = i -> i*2;
		
		int[] arr = new int[10];
		
		makeRandomList(s, arr);
		System.out.println(Arrays.toString(arr));
		
		printEvenNum(p, c, arr);
		
		// 배열의 모든 요소를 2배로 증가시키기
		int[] newArr = doSomething(op, arr);
		System.out.println(Arrays.toString(newArr));
		
	} // main

	private static int[] doSomething(IntUnaryOperator op, int[] arr) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = op.applyAsInt(arr[i]);
		} // for i
		return newArr;
	}

	private static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
		System.out.print("[");
		for (int i : arr) {
			if (p.test(i)) c.accept(i);
		}
		System.out.println("]");
	}

	private static void makeRandomList(IntSupplier s, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.getAsInt();
		} // for i
	}
	
} // class

