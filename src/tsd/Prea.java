package tsd;

import java.util.function.Predicate;

public class Prea {

	public static void main(String[] args) {
		//implements
		PredicateImple1 p1 = new PredicateImple1();
		System.out.println(p1.test("123456789"));
		
		//匿名クラス
		Predicate<String> p2 = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}	
		};
		System.out.println(p2.test("123456789"));
	}
		//ラムダ式
		Predicate<String> p3 = (String t) -> {
			return t.length() >= 10;
			
		};
		System.out.println(p3.test("123456789"))
		
		//ラムダ式省略
		Predicate<String> p4 = t -> t.length() >= 10;
		System.out.println(p4.test("123456789"));
	}
	}
class PredicateImple1 implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}
	
}