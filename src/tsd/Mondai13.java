package tsd;

public class Mondai13 {

	public static void main(String[] args) {
		//Implements
		System.out.println(new SummaryImpl().exec(10, 5));
		
		//匿名
		Summary s2 = new Summary(){

			@Override
			public int exec(int a, int b) {
				return a + b;
			}
		};
		System.out.println(new SummaryImpl().exec(10, 5));
		
		//ラムダ式
		Summary s3 = (int a,int b) ->{
			return a + b;
		};
		System.out.println(new SummaryImpl().exec(10, 5));
	}
}

class SummaryImpl implements Summary{

	@Override
	public int exec(int a, int b) {
		return a + b;
	}
	
}
interface Summary{
public int exec(int a, int b);
}