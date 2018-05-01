package kadai;

import java.util.Scanner;

public class Kadai57 {

	public static void main(String[] args) {
		//入力を受け取る
		//signOfメソッドを実行
		//実行結果の出力
		Scanner scn = new Scanner(System.in);
		
		System.out.print("整数x:");
		int x = scn.nextInt();
		
		
		Test57 t = new Test57();
		int y = t.signOf(x);
		
		System.out.println("signOf(x)は" + y + "です。");
		
		scn.close();
		
	
	}

}

class Test57{
	//signOfメソッドを作る
	//sysout入れない
	int signOf(int n) {
		if(n == 0) {
			return 0;//メソッド終了
		}else if(n > 0) {
			return 1;
		}else {
			return -1;
		}
		
	}
}