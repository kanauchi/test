package tsd;

import java.util.function.Predicate;

public class Pre {

	public static void main(String[] args) {
		//implements
		PredicateImpl i1 = new PredicateImpl();
		System.out.println(i1.test("hogehoge"));
		
		//匿名クラス
		Predicate<String> i2 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}
		};
		System.out.println(i2.test("hogehoge"));
		
		//ラムダ式
		Predicate<String> i3 = (String t) -> {
			return t.length() >= 10;
		};
		System.out.println(i3.test("hogehoge"));
		
		//ラムダ式省略
		Predicate<String> i4 = t -> t.length() >= 10;
		System.out.println(i4.test("hogehoge"));
		}
	}

class PredicateImpl implements Predicate<String>{
	
	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}
} 

