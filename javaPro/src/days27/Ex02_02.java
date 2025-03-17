package days27;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 김예지
 * @date 2025. 3. 12.
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		List list = Arrays.asList("kbs", "mbc", "sbs", "jtbc");
		System.out.println(list);
		// [kbs, mbc, sbs, jtbc]
		
		Collections.sort(list, (String o1,  String o2) ->  o2.compareTo(o1));
		
	} // main
	
} // class
