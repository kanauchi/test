package 練習問題;

public class Mon71 {

	public static void main(String[] args) {
		x();
	}
	static void x() {
		y();
	}
	static void y() {
		throw Exception();
	}
}

