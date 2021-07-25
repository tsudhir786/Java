package JavaMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LearnHashMap {
	static String text;

	public void setText(String text) {

		this.text = text;
	}

	public static void main(String[] args) {

//		LearnHashMap.mapMethod();
		LearnHashMap.mapMethod1();

	}

	public static void mapMethod() {
		Map<String, List<String>> map1 = new HashMap<>();
		List<String> list1 = new ArrayList<String>();
		list1.add("hello");
		list1.add("World");
		list1.add("I");
		list1.add("Am");
		list1.add("Ready");
//		Iterate through the List
		for (Iterator<String> iterator = list1.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
//			System.out.println(string);

		}
//Print the List from a map- Key
		map1.put("abc", list1);
		System.out.println(map1.get("abc"));
	}

	public static void mapMethod1() {
		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "Parent Company");
		hashmap.put(2, "US Subsidiary");
		hashmap.put(3, "UK Subsidiary");

		Iterator hmIterator = hashmap.entrySet().iterator();

		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			System.out.println(mapElement);
//			System.out.println(mapElement.getValue());

		}

	}

	public static void mapMethod2() {
		HashMap<String, String> hashmap = new HashMap<>();
		Iterator hmIterator = hashmap.entrySet().iterator();
		hashmap.put("1", "Parent Subsidiary");
		hashmap.put("2", "US Subsidiary");
		hashmap.put("3", "UK Subsidiary");
		
		while (hmIterator.hasNext()) {
			 Map.Entry mapElement = (Map.Entry) hmIterator.next();
			 
			 
			
		}
	}

}
