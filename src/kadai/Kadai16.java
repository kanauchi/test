package kadai;

import java.util.Scanner;

public class Kadai16 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner scn = new Scanner(System.in);
		do {
		System.out.println("整数値:");
		x = scn.nextInt();
		
		if(0 < x) {
			System.out.println("その値は正です。");
			
		}else if(x == 0) {
			System.out.println("その値は0です。");
			
		}else {
			System.out.println("その値は負です。");
		}
		
			System.out.println("もう一度？ 1…Yes/0…No：");
			y = scn.nextInt();
			
		}while(y == 1);
		scn.close();
}
}
