package 色々;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("main start.");
		
		//メソッドの呼び出し元
		Hoge h1 = new Hoge();
		h1.method1();//メソッドの呼び出し
		h1.method2("hoge");//hogeがインプット
		String s =h1.method3();//helloがアウトプット
		// String s = "hello"
		System.out.println(s);
		
		
		int result = h1.method4(123, 456);
		System.out.println(result);
		
		System.out.println("main finish.");
	}

}

class Hoge{

	//引数・戻り値なし
	void method1(){
		System.out.println("method1 called.");
		}
	//引数あり・戻り値なし
	void method2(String s) {
		System.out.println("method2 called.");
		System.out.println(s);
	}

	//引数なし・戻り値あり
	String method3() {
	System.out.println("method3 called.");
	String h = "hello";
	return h;
	
	}
	
	//引数・戻り値あり
	int method4(int x,int y) {
		System.out.println("method4 called.");
		int z = x + y;
		return z;
	}
	
	}