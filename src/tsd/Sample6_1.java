package tsd;

class Animal{
	private String voice;
	private String name;
	
	public Animal() {
		System.out.println("動物を登録しました。");
	}
	public void setAnimal(String n,String v) {
		name = n;
		voice = v;
	}
	public void showAnimal() {
		System.out.println("名前は" + name + "で" + voice + "と鳴きます。");
	}
}

class Dogs extends Animal{
	public Dogs(){
		System.out.println("犬が登録されました。");
	}
}

class pug extends Dogs{
	public pug(){
		System.out.println("パグが登録されました。");
	}
}

public class Sample6_1 {

	public static void main(String[] args) {
		pug p1 = new pug();
		p1.setAnimal("クッキー","わんわん" );
		p1.showAnimal();
	}

}
