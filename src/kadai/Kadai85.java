package kadai;

public class Kadai85 {

	public static void main(String[] args) {
		HumanV2 suzuki = new HumanV2("鈴木一郎", 180, 75, new Day(1972, 4, 26));
		HumanV2 yamada = new HumanV2("山田太郎", 165, 50, new Day(1988, 10, 3));

		System.out.println("suzuki = " + suzuki.toString());
		System.out.println();
		System.out.println("yamada = " + yamada.toString());
		System.out.println();
	}
}
class HumanV2 extends Human{
	private Day birthday;
	
	public HumanV2(String name,int height,int weight,Day birthday) {
		super(name,height,weight);
		this.birthday = birthday; 
	}
	
	public String toString() {
		return "{" + getName() + ":" + getHeight() + "cm" + getWeight() + "kg"
				 + birthday.getYear() + "年" + birthday.getMonth() + "月" 
				 + birthday.getDay() + "日("
				 + dayOfWeek[birthday.dayOfWeek()] + ")}";
	}
}

class Day{
	private int year;
	private int month;
	private int day;
	private int dayOfWeek;
	
	public Day(int year) {
		this.year = year;
	}
	public Day(int year, int month) {
		this.year = year;
		this.month = month;
	}
	public Day(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
		
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	} 
	public void setDay(int day) {
		this.day = day;
	}
	public int dayOfWeek() {
		
		return(year + year / 4 - year / 100 + year / 400 +
				(13 * month + 8) / 5 + day) % 7;
	}
}