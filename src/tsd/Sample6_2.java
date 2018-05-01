package tsd;

public class Sample6_2 {

	public static void main(String[] args) {
		
	}
	}
		
class Human{
	private String name = "名無し";
	private int age = 0;
	
	void setData(){
	}
	void setData(String n){
		name = n;
	}
	void setData(String n,int a) {
		name = n;
		age = a;
	}
	void showData() {
		System.out.println("名前は" + name + "さんです。年齢は" + age + "歳です。");
	}
}
