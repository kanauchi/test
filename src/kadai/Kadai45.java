package kadai;

import java.util.Random;
import java.util.Scanner;

public class Kadai45 {

	public static void main(String[] args) {
		Scanner scn= new Scanner (System.in);
		
		System.out.println("要素数：");
		int count = scn.nextInt();
		scn.close();
		
		int[]arr = new int[count];
		for(int i = 0;i < arr.length;i++) {
			//1～10までのランダム値を代入
			arr[i] = new Random().nextInt(10) + 1;
			
		}
		
		for(int i:arr) {
			System.out.println(i + ", ");
		}
		
		for(int j = 0;j < arr.length;j++) {
			if(j <= arr[i]){
				System.out.println("* ");
			}else {
				System.out.println("  ");
				
			}
		}
			System.out.println();//改行
	}
		for(int i = 0;i < arr.length;i++)
}
