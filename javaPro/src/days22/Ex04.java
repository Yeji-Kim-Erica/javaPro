package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject String [] -> ArrayList 변환
 * 			ArrayList -> String[] 변환
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) {
		// 1. String [] -> ArrayList 변환
		String [] names = {"박예진", "양희동", "박정현", "김대원", "주정호", "이찬희"};
		
		/* [1]
		ArrayList list = new ArrayList();
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);
		} // for i
		System.out.println(list);
		*/
		
		// [2]
		// String[] -> List<String>
		List list = Arrays.asList(names);
		
		// List -> ArrayList 변환
		ArrayList list2 = new ArrayList(list);
		
		// ArrayList -> String[] 변환
		String[] sArr = new String[list2.size()];
		
		/* [1]
		for (int i = 0; i < list2.size(); i++) {
			sArr[i] = (String) list2.get(i);
		} // for i
		*/
		
		// [2]
		/*
		Object[] oArr = list2.toArray();
		for (Object obj : oArr) {
			String name = (String) obj;
			System.out.println(name);
		}
		*/
		
		// [3]
		sArr = (String[]) list2.toArray(sArr);
		
		// [3-1]
		sArr = (String[]) list2.toArray(String[]::new); // 암기하기. (위와 같은 코딩임)
		
		System.out.println(Arrays.toString(sArr));
		
		
		
	} // main
	
} // class
