package tsd;
public class MangaMain {

	public static void main(String[] args) {
		
		Manga m1 = new Manga("銀魂",400);
		Novel n1 = new Novel("民王",600);
		
		System.out.println("漫画のタイトルは" + m1.getTitle() + "価格は" + m1.getPrice());
			m1.showRead();
			m1.showSee();
							
		System.out.println("漫画のタイトルは" + n1.getTitle() + "価格は" + n1.getPrice());
			n1.showRead();
			n1.showImage();					
	}

}

class Book {
	private String title;//メンバ変数
	private int price;
	
	public Book(String title,int price) {//コンストラクタ void書かない
		this.title = title;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
		
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void showRead() {
		System.out.println("読む");
	}
}

class Manga extends Book{
	public Manga(String title,int price) {
		super(title ,price);
	}
	public void showSee(){
		System.out.println("見る");
	}
}

class Novel extends Book{
	public Novel(String title,int price) {
		super(title ,price);
	}
	public void showImage(){
		System.out.println("想像する");
	}
}

	