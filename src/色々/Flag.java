package 色々;

public class Flag {
	final static Flag fg = new Flag();
public static void main(String[] args) {
		Flag fgOne = fg;
		Flag fgTwo = fg.shortFlag(fg);
		Flag fgThree = fg;
		System.out.println((fgOne == fgTwo) + " ");
		System.out.println((fgOne == fgThree) + " ");
	}
	Flag shortFlag(Flag f) {
		f = new Flag();
		return f;
	}
}