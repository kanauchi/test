package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample11_61 {

	public static void main(String[] args) {
		File inputfile = new File("c:\\ocjp\\aaaa_buf.txt");
		File outputfile = new File("c:\\ocjp\\aaaacopy_buf.txt");

		BufferedReader in = null;
		PrintWriter out = null;

		try {
			in = new BufferedReader(new FileReader(inputfile));
			out = new PrintWriter(new FileWriter(outputfile));

			String line;
			while ((line = in.readLine()) != null) {
				out.write(line);
				out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
