package tsd;

import java.util.ArrayList;

public class FruitsMain {

	public static void main(String[] args) {
		Fruit f[] = {new Fruit("オレンジ","orange",100),
				new Fruit("りんご","red",100),
				new Fruit("バナナ","yellow",100)};
	
	for(int i = 0;i < f.length;i++) {
		System.out.println("名前は" + f[i].getName() + "色は" + f[i].getColor() + "価格は" + f[i].getPrice());}
	}
}

class Fruit{

private String name;
private String color;
private int price;

public Fruit(String n,String c,int p) {
		name = n;
		color = c;
		price = p;
}

public String getName() {
	return name;
}
public String getColor() {
	return color;
}
public int getPrice() {
	return price;
	}
}

class FruitsBascket{
	private ArrayList<Fruit> fruitsList = new ArrayList<>()	;
	private int limit;
	
	public FruitsBascket(int limit) {
		this.limit = limit;
	}

	public void put(Fruit fruits) {
		if(fruitsList.size() == limit) {
			System.out.println(fruits.getName() + "はもう入りません。");
			return;
		}
		System.out.println(fruits.getName() + "が入りました。");
		fruitsList.add(fruits);
	}
	public Fruit take(int index) {
		return fruitsList.remove(index);
	}
}

