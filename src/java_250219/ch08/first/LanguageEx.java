package java_250219.ch08.first;

import java.util.ArrayList;

public class LanguageEx {

	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<>();
		ArrayList<String> test1 = new ArrayList<>();
		
		System.out.println("test.size(): " + test.size());
		
		test.add("MJ");
		test.add("1");
		test.add("2");
		test.add("3");
		test.add("4");
		test.add("5");
		
		test1.add("MJ");
		test1.add("1");
		test1.add("2");
		
		test.remove(0);
		
		System.out.println("===================");
		
		for(String i : test) {
			System.out.println(i);
		}
	}

}
