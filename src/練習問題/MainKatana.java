package 練習問題;

import java.util.ArrayList;

class Katana{
	String name;
	String type;
	String kana;
	
	public Katana(String n,String t,String k) {
		name = n;
		type = t;
		kana = k;
	}
		
	void show(){
			System.out.println("名前は" + name + "、分類は" + type + "、読み仮名は" + kana);
		}
	}
	

public class MainKatana {

	public static void main(String[] args) {
		
		ArrayList<Katana> katanas = new ArrayList<>();
		
		katanas.add(new Katana("大包平","太刀","オオカネヒラ"));
		katanas.add(new Katana("鬼切丸","太刀","オニキリマル"));
		katanas.add(new Katana("和泉守兼定","打刀","イズミノカミカネサダ"));
		
		for(int i = 0;i < katanas.size();i++) {
			katanas.get(i).show();
		}
	}

}
