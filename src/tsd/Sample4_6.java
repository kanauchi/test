package tsd;

public class Sample4_6 {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		//実行時引数をすべて出力
		for(int i = 0;i < args.length;i++) {
			System.out.println(args[i]);
		}

	}

}
