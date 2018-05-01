package 練習問題;

public class ren5 {

	public static void main(String[] args) {
		
		for(int i = 1;i <= 100;i++) {
			System.out.print(i);
			
			if(i % 3 == 0 && i % 5 ==0) {
				System.out.print(" Fizz Buzz");
				
			}else if(i % 3 == 0) {
				System.out.print( " Fizz");
			}else if(i % 5 == 0) {
				System.out.print(" Buzz");
			}
			
			System.out.println();
		}
		
	}
}
