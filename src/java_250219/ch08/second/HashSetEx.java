package java_250219.ch08.second;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	
	public static void main(String[] args) {
		Set<String> computerLang = new HashSet<>();
		
		computerLang.add("HTML");
		computerLang.add("Bootstrap");
		computerLang.add("CSS");
		computerLang.add("Javascript");
		computerLang.add("JAVA");
		
		for (String lang : computerLang) {
			System.out.println("computerLang: " + lang);
		}
	}

}
