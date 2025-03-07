package days23;

import java.util.TreeSet;

/**
 * @author 김예지
 * @date 2025. 3. 6.
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("abc");      	ts.add("alien");   	ts.add("bat");
	    ts.add("car");      	ts.add("Car");      ts.add("disc");
	    ts.add("dance");   		ts.add("dzzz");     ts.add("dzzzz");
	    ts.add("elephant");   	ts.add("elevator"); ts.add("fan");
	    ts.add("flower");
		
	    System.out.println(ts); // [Car, abc, alien, bat, car, dance, disc, dzzz, dzzzz, elephant, elevator, fan, flower]
	    System.out.println(ts.subSet("a", "d")); // [abc, alien, bat, car]
	    System.out.println(ts.subSet("c", "dzzz")); // ar, dance, disc]
		
	} // main
	
} // class
