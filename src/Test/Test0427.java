package Test;

class T1{
	String str1;
	String str2;
	String str3;
	String str4;
	
	T1(String str1,String str2,String str3,String str4){
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
		this.str4 = str4;
		
	}
}
class T2{
	String str1;
	String str2;
	String str3;
	String str4;
	
	T2(String str1,String str2,String str3,String str4){
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
		this.str4 = str4;
	}
	public boolean equals(Object o) {
		Object ot;
		if(o)}
	}

public class Test0427 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = str1;
		String str4 = new String("hello");
		
		System.out.println(str4);
	
		//str4 はnewされているから参照先は別物 
		if(str1 == str4) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

}
