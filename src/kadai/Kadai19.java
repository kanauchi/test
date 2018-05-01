package kadai;

import java.util.Scanner;

public class Kadai19 {

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("整数値A:");
		a = scn.nextInt();
		
		System.out.print("整数値B:");
		b = scn.nextInt();
		scn.close();
		
		if(a >= b) {
			while(a >= b){
				System.out.print(b + " ");
				b++;
			}
		}else {
			while(a <= b){
				System.out.print(a + " ");
				a++;
				}
			}
		}
		
	}

