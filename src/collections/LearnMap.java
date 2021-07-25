package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
//		Map<String, Integer> channelmap = new HashMap<>();
		Map<String, Integer> channelmap = new TreeMap<>();
		
		channelmap.put("Etv", 1);
		channelmap.put("GeminiTv", 2);
		channelmap.put("StarSport", 3);
		channelmap.put("SonyTv", 4);
		channelmap.remove("SonyTv");
		channelmap.putIfAbsent("SonyTv", 5);

		if (!channelmap.containsKey("SonyTv")) {
			channelmap.put("SonyTv", 100);
		}
		System.out.println(channelmap);
		System.out.println(channelmap.containsKey("GeminiTv"));
		System.out.println(channelmap.containsValue(3));
		System.out.println(channelmap.entrySet());
		System.out.println(channelmap.keySet());

//		This is something like Map.Entry<String, Integer> e : channelmap.entrySet()
//								Map.Entry<String, Integer>	like String , Integer type,
//								e is the variable and keyset() or entrySet() is the method that return
//								set view of Keys - Values and Set view of Keys 
		for (Map.Entry<String, Integer> e : channelmap.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());

		}
		System.out.println(channelmap.keySet());
		for (String key : channelmap.keySet()) {
			System.out.println(key);

		}
		System.out.println(channelmap.values());
		for (Integer value : channelmap.values()) {
			System.out.println(value);

		}

	}

}
