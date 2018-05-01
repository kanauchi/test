package kadai;

import java.util.Scanner;

public class Kadai09 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("整数値a:");
		int x = scn.nextInt();
		
		System.out.print("整数値b:");
		int y = scn.nextInt();
		
		scn.close();
		
		if(x < y) {
			System.out.println("小さいほうの値は" + x +"です。");
			System.out.println("大きいほうの値は" + y +"です。");
		}else if(x == y) {
			System.out.println("二つの値は同じです。");
		}else {
			System.out.println("小さいほうの値は" + y +"です。");
			System.out.println("小さいほうの値は" + x +"です。");
		}
	}

}
