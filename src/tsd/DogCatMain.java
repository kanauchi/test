package tsd;
class Animala{
	private int age;
	//コンストラクタを作ったからデフォルトコンストラクタが作られない
	public Animala(int a){
		age = a;
		
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	public void showWalk(){
		System.out.println("歩く");
	}
}

class Doga extends Animala{
	public Doga(int a) {
		super(a);
	}
	public void showBite() {
		System.out.println("噛みつく");
	}
}
class Cats extends Animala{
	public Cats(int a) {
		super(a);
	}
	public void showScrabble() {
		System.out.println("ひっかく");
	}
}

public class DogCatMain {

	public static void main(String[] args) {
		
		Doga d1 = new Doga(3);
		Cats c1 = new Cats(2);
		
		d1.showWalk();
		d1.showBite();
			
		c1.showWalk();
		c1.showScrabble();	
		
		
	}
}
