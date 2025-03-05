package days22;

import java.util.ArrayList;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		ArrayList team1 = new ArrayList();
		team1.add("권태정");
		team1.add("김도훈");
		team1.add("김민선");
		ArrayList team2 = new ArrayList();
		team2.add("김승효");
		team2.add("김예지");
		team2.add("김유미");
		ArrayList team3 = new ArrayList();
		team3.add("서재웅");
		team3.add("박지웅");
		team3.add("안준호");
		
		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		
		ArrayList class5 = new ArrayList(team1);
		class5.addAll(team2);
		class5.addAll(team3);
		System.out.println(class5);
		
		// team1 a, b, c, d
		// team2 b, c, f, g
		// team1.retainAll(team2);
		// retainAll: team1과 team2에 공통으로 있는 요소만 남기고 나머지 삭제
		
		// ArrayList -> 배열로 변환하면? Object 유형으로 돌려준다
		Object[] arr = class5.toArray();
		
		class5.removeAll(team3);
		System.out.println(class5);
		
	} // main
	
} // class
