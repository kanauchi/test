package tsd;

public class Sample12_13 {
	static Integer wi1; //nullが入っている
	public static void main(String[] args) {
		
		//wi1++; nullインクリメントはエラー
		Integer wi2  = 0;
		wi2++;//演算可能
		Integer wi3 = 1;
		if(wi2 == wi3) {
			System.out.println("Area: " + areaOfSquare(4.0));
		}
	}

	public static Double areaOfSquare(double side) {
		return side * side;//演算可能
	}

}
