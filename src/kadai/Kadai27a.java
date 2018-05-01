package kadai;

public class Kadai27a {

	public static void main(String[] args) {
		System.out.println("1からnまでの和を求めます。");
		
		int x = 10;
		
		int sum = 0;
				for(int i = 1; i <= x;i++) {
					sum += i;
					
				if(i <x) {
					System.out.print(i + "+");
				}else {
					System.out.print(i +"=");
				}
			}
			System.out.print(sum);
	}

}
