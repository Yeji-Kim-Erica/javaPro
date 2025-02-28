package programmers;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String result = null;
        switch (n%2) {
		case 0:
			result = "even";
			break;

		case 1:
			result = "odd";
			break;
		} // switch
        
        System.out.printf("%d is %s", n, result);
        
    }
}