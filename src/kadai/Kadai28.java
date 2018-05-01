package kadai;

import java.util.Scanner;

public class Kadai28 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("何cmから：");
		double s = scn.nextInt();
		
		System.out.print("何cmまで：");
		double f = scn.nextInt();
		
		System.out.print("何cmごと：");
		double e = scn.nextInt();
		
		scn.close();
		
		System.out.println("身長　　標準体重");
		System.out.println("--------------------");
		
		System.out.println(s + "　　" + (s - 100) * 0.9);
		//for(int i = 0;i < ;i++)
	}
}
