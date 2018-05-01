package kadai;

import java.util.Scanner;

public class Kadai10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("変数a:");
		int a = scn.nextInt();
		
		System.out.println("変数b:");
		int b = scn.nextInt();
		
		System.out.println("変数c:");
		int c = scn.nextInt();
		
		scn.close();
		
		System.out.println("a≦b≦cとなるようにソートしました");
		
		if(a <= b <= c) {
			System.out.println("変数aは" + a +"です");
			System.out.println("変数bは" + b +"です");
			System.out.println("変数cは" + c +"です");
		}else if(a <= b )
		
	}

}
