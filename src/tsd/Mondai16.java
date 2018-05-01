package tsd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Mondai16 {

	public static void main(String[] args) throws FileNotFoundException {
		final int QUESTION_COUNT = 1;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("タイピングゲームを開始します。");
		System.out.print("何かキーを入力してください：");
		String key = scn.nextLine();

		File file = new File("c:\\typing\\data.txt");

		BufferedReader br = null;

		try {
			ArrayList<String> keyword = new ArrayList<>();
			br = new BufferedReader(new FileReader(file));

			String line;
			while ((line = br.readLine()) != null) {
				keyword.add(line);
			}

			for (int i = 1; i <= QUESTION_COUNT; i++) {
				//ランダムで数字を生成
				int r = new Random().nextInt(keyword.size());

				//ArrayListから要素を一つ取り出す
				String str = keyword.get(r);
				//sysout
				//System.out.println(str);
				//1行目に漢字、２行目に読み仮名を表示
				//strを二つの文字列に分割
				String line1 = str.split(",")[0];
				String line2 = str.split(",")[1];

				System.out.println("**************** 第" + i + "問 ****************");

				System.out.println(line1);
				System.out.println(line2);

				while (true) {
					System.out.println("【入力してください】");

					String type = scn.nextLine();

					if (type.equals(line2)) {
						System.out.println("正解です");
						break;
						//次の問題へ
					} else {
						System.out.println("Miss");
						continue;
						//同じ問題を出力するようにする
						//入力してくださいまで戻る
					}

				}
				keyword.remove(r);
				//5問連続で表示し、問題は重複しないようにする
				//ここまでの処理を5回ループする
			}
			System.out.println("**************************************");
			System.out.println("終了しました。おつかれさまでした。");
			scn.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new FileNotFoundException("ファイルがありません。");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
