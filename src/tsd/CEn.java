package tsd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CEn {

	public static void main(String[] args) {
		//Scanner scn = new Scanner(System.in);
		//String str = scn.nextLine();
		//scn.close();
		System.out.println("CryptEncode(暗号化)");
		System.out.println("------------------------");
		System.out.print("ファイル名 : ");		
		System.out.print("データ : ");
		
		String file = "crypt.txt";
		String date = "hello world";
		
		File outFile = new File("C:\\output",file);
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(outFile);
			
			for(int i = 0;i < date.length();i++) {
				int c = date.charAt(i) + 1;
				fos.write(c);
				}
			
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(fos != null) {
				fos.close();
					}
			}catch(IOException e) {
				e.printStackTrace();
			}
			}
	}

}
