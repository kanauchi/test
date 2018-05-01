package tsd;

public class GameMain {

	public static void main(String[] args) {
		
		Yusya y1 = new Yusya(500,100,"勇気");//インスタンス化
		Magician m1 = new Magician(200,800,"魔法攻撃力【大】");
		
		System.out.println("勇者　HP:" + y1.getHp() + " MP:" + y1.getMp() + " 特殊:" + y1.getTokusyu());
		y1.showKoudouy();
		
		System.out.println("魔法使い　HP:" + m1.getHp() + " MP:" + m1.getMp() + " 特殊:" + m1.getTokusyu());
		m1.showKoudoum();
	}
}

class Boukensya{
	private int hp;//メンバ変数
	private int mp;
	private String tokusyu;
	
	public Boukensya(int hp,int mp,String tokusyu) {//コンストラクタ
		this.hp = hp;
		this.mp = mp;
		this.tokusyu = tokusyu;
	}
	
	public void setHp(int hp) {//Hp
		this.hp = hp;
	}
	
	public int getHp() {
		return hp;
	}
	public void setMp(int mp) {//Mp
		this.mp = mp;
	}
	
	public int getMp() {
		return mp;
	}
	public void setTokusyu(String tokusyu) {//特殊
		this.tokusyu = tokusyu;
	}
	
	public String getTokusyu() {
		return tokusyu;
	}
}

class Yusya extends Boukensya{//勇者クラス
	public Yusya(int hp,int mp,String tokusyu) {//コンストラクタ
		super(hp,mp,tokusyu);
	}
	public void showKoudouy() {
		System.out.println("「武器で攻撃」");
		System.out.println("「魔法で攻撃」");
	}
}

class Magician extends Boukensya{//魔法使いクラス
	public Magician(int hp,int mp,String tokusyu) {//コンストラクタ
		super(hp,mp,tokusyu);
	}
	public void showKoudoum() {
		System.out.println("「魔法で攻撃」");
		System.out.println("「休む」");
	}
}