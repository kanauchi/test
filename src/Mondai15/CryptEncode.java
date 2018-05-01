package Mondai15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CryptEncode {

	public static void main(String[] args) {

		/*Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		scn.close();
		*/

		String file = "crypt .txt";
		String data = "hello world!";

		File outputFile = new File("C:\\output");

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(outputFile);

			for (int i = 0; i < data.length(); i++) {
				int c = data.charAt(i) + 1;
				fos.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
