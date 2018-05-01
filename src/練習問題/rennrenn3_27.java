package 練習問題;

public class rennrenn3_27 {

	public static void main(String[] args) {
		int val = 20;
		if(val < 50) {
			System.out.print("Start");
			if(val != 0)
				System.out.print("1 ");
			else
				System.out.print("2 ");
			if(val > 15)
				System.out.print("3 ");
			else if(val < 14)
				System.out.print("4 ");
			else if(val <= 10)
				System.out.print("5 ");
			else
				System.out.print("6 ");
		}else {
				System.out.print("7 ");
		}
		System.out.println("End");
	}

}
