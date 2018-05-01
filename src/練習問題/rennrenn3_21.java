package 練習問題;

public class rennrenn3_21 {

	public static void main(String[] args) {
		for (int i = 0; i< 3;i++) {
			for(byte j = 2;j>0;j--) {
				if(i ==j) continue;
				System.out.print("i="+i+"j="+j);
			}
		}

	}

}
