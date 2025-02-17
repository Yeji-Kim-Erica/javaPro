package days06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오후 2:13:11
 * @subject
 * @content
 */
public class Ex04_06 {

	public static void main(String[] args) {
		
		// 여러 개의 정수 중 가장 큰 값, 가장 작은 값 출력
		
		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random()*99)+1;
		} // for i
		System.out.println(Arrays.toString(m));
		
		int min, max;
		min = max = m[0];
		
		for (int i = 1; i < m.length; i++) {
			min = Math.min(min, m[i]);
			max = Math.max(max, m[i]);
		}		
		System.out.printf("max=%d, min=%d", max, min);
		
		// 가비지 개념 : m = null (배열의 주소 정보가 없어지면 원래 배열에 들어있던 정보는 접근이 불가해지므로 가비지(garbage)가 됨)
		// 메모리 자동 관리 : 메모리 공간이 부족해지면 자동으로 관리됨
		
	} // main
	
}
