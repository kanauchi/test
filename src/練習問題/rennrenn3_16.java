package 練習問題;

public class rennrenn3_16 {

	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		int i = 0;
		int j = 0;
		if((i++ == 0) && (y = true))i++;
		if((++j == 0) && (x = false))j++;
		if((x = false) || (++i == 2))i++;
		if((y =true) || (++j == 2))j++;
		System.out.print("i=" + i);
		System.out.print(" j=" + j);
		System.out.print(" x=" + x);
		System.out.print(" y=" + y);		
	}

}
