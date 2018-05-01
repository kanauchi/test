package 練習問題;

public class Practicea {

	public static void main(String[] args) {
		int x = 100;
		int y = 101;
		
		Kuraberua k = new Kuraberua();
		
		k.a = x;
		k.b = y;
		
		
		int bigger = k.getBigger();
		
		
		System.out.println("大きいほうの値は" + bigger + "です。");
		
		
	}

}
class Kuraberua{
	int a;
	int b;
	int getBigger() {
	if(a <= b) {
		return b;
	}else {
		return a;
	}
	
}
}