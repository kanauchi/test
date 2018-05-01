package 練習問題;

public class Practice {

	public static void main(String[] args) {
		/*Scanner scn = new Scanner(System.in);
		
		System.out.print("a:");
		int x = scn.nextInt();
		
		System.out.print("b:");
		int y = scn.nextInt();
		scn.close();*/
		
		int x = 100;
		int y = 101;
		
		Kuraberu k = new Kuraberu();
		k.a = x; //属性値に値を設定
		k.b = y;
		
		int bigger = k.getBigger();
		
		System.out.println("大きいほうの値は" + bigger + "です。");
		
	}

}
class Kuraberu{
	int a;//属性
	int b;
	
	int getBigger/*メソッド名*/(){
		if(a < b) {
			return b;
		}else {
			return a;
		}

	}
		
}
	