package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapp {

	public static void main(String[] args) {
		//hashMap is unOrderd
		//map are key value pair 
		//we cannot add same key again 
		//keys are sensible
		//if we try to add key then it override 
		//that means it update our value 
		
		Map<String, String> country = new HashMap<>();
		
		//for add the value we can use put 
		
		country.put("India","Delhi");
		country.put("USA", "WashigntonDC");
		country.put("Brazil", "Brazilia");
		country.put("Russia" , "masco");
		country.put("Sril lanka", "Colombo");
		
		System.out.println(country);
		
		//how to iterate in map
		for(Map.Entry<String, String> e: country.entrySet() ) {
			System.out.println("Value of Entry " + e);
			System.out.println("Value of key " + e.getKey());
			System.out.println("Value of value " + e.getValue());
		}
		
		//if we want only key set 
		
		for(String key: country.keySet()) {
			System.out.println("All entry of key " + key);
		}
		
		//same as if we want only value set
		
		for(String value:country.values()) {
			System.out.println("All entry of value " + value);
		}
		
		//also contains present that particular value is present 
		//isEmpty show that our map is empty or not 
		//clear are used for clear the map 
		
		

	}

}
