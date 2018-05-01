package tsd;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample6_18a {

	public static void main(String[] args) {
		//ArrayListを配列に変換
		ArrayList<String> list1=new ArrayList<>();
		list1.add("a");
		list1.add("b");
		
		String[] arrray1 = list1.toArray(new String[] {});
		//System.out.println(Arrays.toString(array1));
		
		
		//配列をArayListに変換
		String[] array2 = {"c","d"};
		ArrayList<String> list2 =new ArrayList<>(Arrays.asList(array2));
		
	}

}
