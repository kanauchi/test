package Mondai15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CryptDecode {

	public static void main(String[] args) {
		//読み込むファイル名
		String filename = "crypt.txt";
		
		//FileInputStreamをnew
		File file = new File("c:\\output", filename);
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			//読み込み処理
			int c;
			while((c = fis.read()) != -1) {
				//コードを戻す
				int code = c - 1;
				
				//コンソール出力
				System.out.println((char) code);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//FileInputStreamをclose
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}		
		
		
		//
		//
		//
		
		//Scanner scn = new Scanner(System.in);
		//String str = scn.nextLine();
		//scn.close();
		
		

