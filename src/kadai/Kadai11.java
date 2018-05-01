package kadai;

import java.util.Random;

public class Kadai11 {

	public static void main(String[] args) {
		int x = new Random().nextInt(3);
		switch (x) {
		case 0:
			System.out.println("コンピューターが生成した手：グー");
			break;
		case 1:
			System.out.println("コンピューターが生成した手：チョキ");
			break;
		case 2:
			System.out.println("コンピューターが生成した手：パー");
			break;
		}

	}

}
