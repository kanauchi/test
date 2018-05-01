package tsd;

public class Mon11 {

	public static void main(String[] args) {
		String[] a = { "5", "23", "a", "89", "b", "c" };

		Mon11 obj = new Mon11();
		int[] b = obj.makeArray1(a);

		for (int i : b) {
			System.out.println(i);
		}
	}
	
	//戻り値：{0,0,0,0,0}
	int[] makeArray1(String[] a) {
		
		int[] b = new int[a.length];
		
		try {
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);//例外発生
			}
		}catch(NumberFormatException e) {
			}
		return b;
		//return new int[a.length];
	}
}
