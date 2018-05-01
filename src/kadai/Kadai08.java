package kadai;

import java.util.Scanner;

public class Kadai08 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("整数a:");
		int x = scn.nextInt();
		
		System.out.print("整数b:");
		int y = scn.nextInt();
		
		System.out.print("整数値c:");
		int z = scn.nextInt();
		
		System.out.println("最小値は");
		
		if(x <= y && x <= z) {
			System.out.print(x);
		}else if(y <= x && y <= z) {
			System.out.print(y);
		}else {
			System.out.print(z);
		}
		System.out.println("です。");
		scn.close();

	}

}
