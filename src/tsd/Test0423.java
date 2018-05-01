package tsd;

public class Test0423 {

	public static void main(String[] args) {
		Test0423 t = new Test0423();
		
		t.testMethod(new Int(){
			@Override
			public void method(String s) {
				System.out.println(s);
			}
		});
	}
	void testMethod(Int i) {
		System.out.println("testMethod");
		i.method("hello");
	}
}
interface Int{
	public void method (String s);
}
