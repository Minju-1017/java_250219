package java_250219.ch08.third;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> friends = new HashMap<>();
		
		friends.put("a", 111);
		friends.put("b", 222);
		friends.put("c", 333);
		friends.put("d", 444);
		friends.put("e", 555);
		friends.put("f", 666);
		
		for (String key : friends.keySet()) {
			System.out.println(key + ": " + friends.get(key));
		}
		
		for (Entry<String, Integer> entry : friends.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		
		Iterator<String> keys = friends.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
		    System.out.println("[Key]:" + key + " [Value]:" +  friends.get(key));
		}
	}

}
