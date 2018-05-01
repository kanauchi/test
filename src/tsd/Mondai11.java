package tsd;

public class Mondai11 {

	public static void main(String[] args) {
		String[] a = { "5", "23", "a", "89", "b", "c" };
		Mondai11 obj = new Mondai11();
		int[] b = obj.makeArray1(a);

		for (int i : b) {
			System.out.print(i);
		}
	}

	int[] makeArray1(String[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			try {
				b[i] = Integer.parseInt(a[i]);
			} catch (NumberFormatException e) {
			}
		}
		return b;
	}

	int[] makeArray2(String[] a) {
		int[] b = new int[a.length];

		try {
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
		} catch (NumberFormatException e) {

		}
		return b;
	}

	int[] makeArray3(String[] a) {
		int[] b = new int[a.length];

		try {
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
		} catch (NumberFormatException e) {
			for (int i = 0; i < a.length; i++) {
				b[i] = 0;
			}
		}
		return b;
	}

	String[][] holidays = {
	//				{ "2018-01-01", "元日" },
	//				{ "2018-01-08", "成人の日" },
	//				{ "2018-02-11", "建国記念の日" },
	//				{ "2018-02-12", "振替休日" },
	//				{ "2018-03-21", "春分の日" },
	//				{ "2018-04-29", "昭和の日" },
	//				{ "2018-04-30", "振替休日" },
	//				{ "2018-05-03", "憲法記念日" },
	//				{ "2018-05-04", "みどりの日" },
	//				{ "2018-05-05", "こどもの日" },
	//				{ "2018-07-16", "海の日" },
	//				{ "2018-08-11", "山の日" },
	//				{ "2018-09-17", "敬老の日" },
	//				{ "2018-09-23", "秋分の日" },
	//				{ "2018-09-24", "振替休日" },
	//				{ "2018-10-08", "体育の日" },
	//				{ "2018-11-03", "文化の日" },
	//				{ "2018-11-23", "勤労感謝の日" },
	//				{ "2018-12-23", "天皇誕生日" },
	//				{ "2018-12-24", "振替休日" }
	//		};
}
