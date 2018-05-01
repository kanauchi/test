package 練習問題;

public class Mon62 {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = new String(s1);
		if(s1 == s2) {
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
System.out.println(s1);
System.out.println(s2);
	}

}
