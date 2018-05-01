package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test0425 {

	public static void main(String[] args) {
		//エスケープ文字「\」
		System.out.println("私の名前は\"叶内\"です。");
		System.out.println("このリンゴは\\100です。");
		
		File inputFile = new File("C\\ocjp\\ocjp.txt");
		File outputFile = new File("C\\ocjp\\ocjpcopy.txt");
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
		in = new FileInputStream(inputFile);
		out = new FileOutputStream(outputFile);
		
		int c;
		while((c = in.read()) != -1){
			out.write(c);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
		try {
			if(in != null) {
			in.close();
			}
			if(out != null) {
			out.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}

}
