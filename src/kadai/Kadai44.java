package kadai;

import java.util.Scanner;

public class Kadai44 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("要素数:");
		int you = scn.nextInt();
		int[] a = new int[you];
		
		for(int i = 0;i < you;i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scn.nextInt();
		}
		
		System.out.print("{");
		
		for(int i = 0;i < you;i++) {
			if(i < you - 1) {
				System.out.print(a[i] + ",");
			}else {
				System.out.print(a[i]);
			}
		}
		System.out.print("}");
		scn.close();
	}

}
