package kadai;

public class Kadai02 {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		
		if(a % b == 0 ) {
			System.out.println("BはAの約数です。");
		}else if(a % b != 0) {
			System.out.println("BはAの約数ではありません。");
		}	
	}
}