package kadai;

import java.util.Scanner;

public class Kadai01 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("xを入力");
		int x = scn.nextInt();
		
		//int x = 22;
		
		if(x > 0){
			System.out.println("その値は正です。");
		}else {		
			System.out.println("その値は負です。");
		}
		scn.close();
	}
}

