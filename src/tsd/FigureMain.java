package tsd;

public class FigureMain {

	public static void main(String[] args) {
	
		Circle c1 = new Circle(2); //インスタンス化
		System.out.println(c1.getArea());
		
		Square s1 = new Square(2); //インスタンス化
		System.out.println(s1.getArea());
		
		Circle circle = new Circle(5);
		Cylinder c = new Cylinder(10,circle);
		System.out.println(c.getVolume());
	}

}

class Circle{
	
	private int radius;
	
	public Circle(int r) {//コンストラクタ
		radius = r;
	}
	public void setRadius(int r) {//セッター
		radius = r;
	
	}
	public int getRadius() {//ゲッター
		return radius;
	
	}
	public double getArea() {
		double area = radius * radius * 3.14;
		return area;
	}
		
}

class Square{
	private int side;
	
	public Square(int s) {
		side = s;
	}
	public void setSquare(int s) {
		side = s;
	}
	public int getSquare() {
		return side;
	}
	public int getArea() {
		int area = side * side;
		return area;
	}
}

class Cylinder{
	//円柱の体積
	//底面積
	private int height;
	private Circle circle;
	
	public  Cylinder(int h,Circle c) {
		height = h;
		circle= c;
	}
	public void setCircle(Circle c) {//セッター
		circle = c;
	
	}
	public Circle getCircle() {//ゲッター
		return circle;
	
	}
	public double getVolume() {
		return circle.getArea() * height;
		
	}
}