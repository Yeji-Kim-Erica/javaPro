package days15;

/**
 * @author kenik
 * @date 2025. 2. 21. - 오후 4:18:06
 * @subject 
 * @content
 * 3) 단독(홀로) 사용될 때의 this 용도 
		 *      - 리턴값    Ex06_03.java 
 */
public class Ex06_03 {

	public static void main(String[] args) {
		
		//  [MyPoint 클래스 이용해서 설명]\
	    MyPoint p1 = new MyPoint(1, 2);
	    MyPoint p2 = new MyPoint(100, 200);
	    
	    // 클래스 복사
	    //MyPoint p3 =  p1.plusMyPoint(p2);
	    //p3.dispMyPoint();
	    p1.plusMyPoint(p2).dispMyPoint();
	    p1.dispMyPoint();
	} // main

} // class






