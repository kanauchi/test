package kadai;

import java.util.Scanner;

public class Kadai57a {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("整数x：");
	int x = scn.nextInt();
	
	Test57a t = new Test57a();
	
	
	int result = t.signOf(x);
	
	
	System.out.print("signOf(x)は" + result + "です。");
	
	scn.close();

	}

}
class Test57a{
	int signOf(int n) {
		if(n == 0) {
			return 0;
		}else if(n < 0) {
			return -1;
		}else {
			return 1;
			
		}	
	}
}
