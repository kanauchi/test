package tsd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CDe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("CryptEncode（暗号化）");
		System.out.println("--------------------------");
		
		System.out.print("ファイル名 :");
		String file = scn.nextLine();
		System.out.print("文字データ :");
		String data = scn.nextLine();
		
		for(int a = 0;a < data.length();a++){
		System.out.println(".");
		}
		System.out.println("暗号化が終わりました");
		
/*		String file = "crypt.txt";
		String data = "hello world";*/
		
		File outFile = new File("c:\\output", file);
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(outFile);
			
			for(int i = 0;i < data.length();i++) {
				int c = data.charAt(i) + 1;
				fos.write(c);
			}
			
			System.out.println("CryptEncode（暗号化）");
			System.out.println("--------------------------");
			
			
			System.out.println("暗号化が終わりました");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) {
				fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
		

