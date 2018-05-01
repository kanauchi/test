package kadai;

import java.util.Scanner;

public class Kadai20 {

	public static void main(String[] args) {
		System.out.println("カウントダウンします。");
		
		int x;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("正の整数値:");
		x = scn.nextInt();
		scn.close();
		
		while(x >= 0) {
			System.out.println(x);
			x--;
		}
		
	}

}
