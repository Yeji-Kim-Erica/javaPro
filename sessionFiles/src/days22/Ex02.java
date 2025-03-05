package days22;

import java.util.ArrayList;

/**
 * @author kenik
 * @date 2025. 3. 5. - 오전 10:36:04
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
		
		System.out.println( team1 );
		System.out.println( team2 );
		System.out.println( team3 );
		
		ArrayList  class5 = new ArrayList(team1);
		class5.addAll(team2);
		class5.addAll(team3);
		System.out.println( class5 );
		
		// 기능: team1에 있는 요소와 team2에 있는 요소 중에 공통요소만 남기는 메서드
		// team1  a,b,c,d
		// team2  b, c, f, g
		// team1.retainAll(team2);
		
		// ArrayList -> 배열로 변환
		Object [] arr =  class5.toArray();
		
		//    addAll(Collection c)
		//    removeAll(Collection c)
		class5.removeAll(team3);
		System.out.println( class5 );
		
	} // main

} // class
  





