package bmi4;

public class Main11 {

	public static void main(String[] args) {
		Human h = new Human("kato", 1.77, 69.5,25,18.5);
		System.out.println("----- BMI -----");
		System.out.println(h.getName() + "さんのBMIは" + BMI.calc(h));
		System.out.println(BMI.judge(h));
		System.out.println("---------------");

		System.out.println();

		Child c = new Child("taro", 1.77, 69.5,18,15);
		System.out.println("----- BMI -----");
		System.out.println(c.getName() + "ちゃんのBMIは" + BMI.calc(c));
		System.out.println(BMI.judge(c));
		System.out.println("---------------");

	}
}

class Ningen {
	private double max;
	private double min;
	private String name;
	private double height;
	private double weight;
	
	public Ningen(String name,double height,double weight,double max,double min) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.max = max;
		this.min = min;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public double getMax() {
		return max;
	}
	public double getMin() {
		return min;
	}
}
class Human extends Ningen {
	Human(String name,double height,double weight,double max,double min){
		super(name,height,weight,max,min);
	}
}
class Child extends Ningen{
	Child(String name,double height,double weight,double max,double min){
		super(name,height,weight,max,min);
	}
}

class BMI{
	public static double calc(Ningen n) {
		return n.getWeight() / n.getHeight() / n.getHeight();
	}
	public static String judge(Ningen n) {
		double bmi = calc(n);
		if(n.getMax() < bmi) {
			return "太りすぎです";
		}else if(n.getMin() > bmi) {
			return "痩せすぎです";
		}else {
			return "標準です";
		}
	}
}