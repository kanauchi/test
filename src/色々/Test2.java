package 色々;

public class Test2 {
	final int a ;
	Test2(int b) {a = b;}
	void method(int c) {a = c;}
	public static void main(String[] args) {
		Test2 t = new Test2(5);
		t.method(50);
		System.out.println(t.a);
	}
}
