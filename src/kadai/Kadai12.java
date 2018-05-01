package kadai;

import java.util.Scanner;

public class Kadai12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("何月ですか：");
		int a = scn.nextInt();
		
		
		if(11 < a < 3) {
			System.out.println("冬");
		}else if(3 < a < 7) {
			System.out.println("春");
		}else if(6 <= a <= 8) {
			System.out.println("夏");
		}else {
			System.out.println("秋");
		}
		scn.close();
		
	}

}
