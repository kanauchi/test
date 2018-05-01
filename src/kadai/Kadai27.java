package kadai;

public class Kadai27 {

	public static void main(String[] args) {
		System.out.println("1からnまでの和を求めます。");

		int n = 8;
		System.out.println("nの値：" + n);
		
		int sum = 0;
		for(int i = 1;i <= n - 1;i++) {
			sum = sum + i;
			System.out.print(i +"+");
		}
		
			System.out.print(n + "=");
			System.out.print(sum + n);
			
	}

}
