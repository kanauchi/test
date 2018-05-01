package kadai;

import java.util.Scanner;

public class Kadai17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int x;
		do {
			System.out.print("3桁の正の整数値：");
			x = scn.nextInt();
			
		}while(x < 100 || x > 999);
		
			System.out.println(x + "と入力しましたね。");	
		
			scn.close();
	}
}
	
