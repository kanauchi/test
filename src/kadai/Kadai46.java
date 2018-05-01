package kadai;

import java.util.Scanner;

public class Kadai46 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		
		System.out.println("人数;");
		int nin = scn.nextInt();
		
		int[] a = new int[nin];
		
		System.out.println("点数を入力せよ");
		for(int i = 0;i < nin;i++) {
			System.out.println((i + 1) + "番目の点数");
			
			a[i] = scn.nextInt();
		}
		
		int sum = 0;
		int max = 0;
		int min = 0;
		
		for(int x : a) {
			sum += x;
			
			if(max < x) {
				max = x;
			}
			if (min > x)
				min = x;
			
			
		}
		
		System.out.println("合計点は" + sum + "点です");
		System.out.println("平均点は" + ((double)sum / a.length) + "点です");
		System.out.println("最高点は" + max + "点です");
		System.out.println("最低点は" + min + "点です");
		scn.close();
	}

}
