package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrac {

	public static void main(String[] args) {
		
		Map<Integer, String> s1 = new HashMap<Integer, String>();
		
		s1.put(1, "First");
		s1.put(2, "Second");
		s1.putIfAbsent(2, "Third");
		s1.putIfAbsent(3, "Third");
		System.out.println(s1);
		System.out.println(s1.keySet());
		

	}

}
