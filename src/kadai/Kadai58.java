package kadai;

import java.util.Scanner;

public class Kadai58 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.print("整数値a:");
		int x = scn.nextInt();

		System.out.print("整数値b:");
		int y = scn.nextInt();
			
		System.out.print("整数値c:");
		int z = scn.nextInt();
			
		Test58 t = new Test58();
		
		int r = t.min(x,y,z);
		
		System.out.println("最小値は" + r + "です。");

		scn.close();
	}

}

class Test58{
	
	int min(int a, int b, int c) {
		if(a <= b && a <= c) {
			return a;
		}else if(b <= a && b <= c) {
			return b;
		}else {
			return c;
		}
	}
}
