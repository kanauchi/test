package kadai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class yyyy {

	public static void main(String[] args) {
		String file = "bbbb.txt";
		String data = "hello";

		File outFile = new File("C:\\output", file);

		
		try {
			FileOutputStream fos = new FileOutputStream(outFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
