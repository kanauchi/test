package 練習問題;

import java.util.ArrayList;

class Game{
	String name;
	String type;
	int sale;
	
	public Game(String n,String t,int s) {
		name = n;
		type = t;
		sale = s;
	}
	
	void show(){
		System.out.println("ゲーム名は" + name + "、ジャンルは" + type + "、販売本数は" + sale + "万本。");
	}
	
}

public class MainGames {

	public static void main(String[] args) {
		
		/*Game[] games = new Game[3];
		games[0] = new Game("スプラトゥーン２","アクションシューティング",712);
		games[1] = new Game("モンハン","アクションRPG",936);
		games[2] = new Game("ドラクエ","RPG",317);
		*/		
					 
		ArrayList<Game> games = new ArrayList<>();
		
		games.add(new Game("スプラトゥーン２","アクションシューティング",712));
		games.add(new Game("モンハン","アクションRPG",936));
		games.add(new Game("ドラクエ","RPG",317));
		
		for(Game game :games) {
			game.show();
		}
	}

}
