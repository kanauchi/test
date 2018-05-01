package Test;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test0427a {

	public static void main(String[] args) {

		LinkedHashSet<String> gamel = new LinkedHashSet<>();//挿入順で出力される

		gamel.add("PS4:モンハン");
		gamel.add("Switch:ゼルダ");
		gamel.add("PS4:ドラクエ１１");
		gamel.add("Switch:スプラトゥーン２");
		gamel.add("PS4:ファイナルファンタジー１５");

		for (String l : gamel) {
			System.out.println(l);
		}

		System.out.println();

		TreeSet<String> gamet = new TreeSet<>();//ソートされて出力される

		gamet.add("PS4:モンハン");
		gamet.add("Switch:ゼルダ");
		gamet.add("PS4:ドラクエ１１");
		gamet.add("Switch:スプラトゥーン２");
		gamet.add("PS4:ファイナルファンタジー１５");

		for (String t : gamet) {
			System.out.println(t);
			
			
/*			LinkedHashSet
			PS4:モンハン
			Switch:ゼルダ
			PS4:ドラクエ１１
			Switch:スプラトゥーン２
			PS4:ファイナルファンタジー１５

			TreeSet
			PS4:ドラクエ１１
			PS4:ファイナルファンタジー１５
			PS4:モンハン
			Switch:スプラトゥーン２
			Switch:ゼルダ*/
			
			
			
		}
	}
}