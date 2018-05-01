package kadai;

import java.util.Scanner;

public class Kadai15 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("整数:");
		String a = scn.nextLine();
		scn.close();
		
		try {
			int b = Integer.parseInt(a);
			if(b % 2 == 0) {
				System.out.println("入力された値は偶数です");
			}else{
				System.out.println("入力された値は奇数です");
			}
		}catch(NumberFormatException e) {
			System.out.println("数字を入力してください");
		}
	}
}



