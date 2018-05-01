package kadai;

public class Kadai03 {

	public static void main(String[] args) {
		int a = 30;
		
		if(a < 0) {
			System.out.println("正でない値が入力されました");
		}else if(a % 5 == 0){
			System.out.println("5で割り切れます。");
		}else if(a % 5 != 0) {
			System.out.println("5で割り切れません。");
		}	
	}

}
