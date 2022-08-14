package learnMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		
		HashMap<String, String> capitalMAP = new HashMap<String, String>();
		capitalMAP.put("USA", "Washington DC");
		capitalMAP.put("India", "New Delhi");
		capitalMAP.put("England", null);
		capitalMAP.put("Russia", null);
		
		System.out.println(capitalMAP.get("India"));
		
		System.out.println("-----------------------------");
//Iterator using key -- by using keyset()
		Iterator<String> it1 = capitalMAP.keySet().iterator();
		
		while(it1.hasNext()) {
			String key = it1.next();
			String value = capitalMAP.get(key);
			System.out.println("The Key is "+key+" the value is "+value);
		}
		System.out.println("=================");
		
		//iterate using entryset
		Iterator<Entry<String, String>> it2 = capitalMAP.entrySet().iterator();
		
		while(it2.hasNext()) {
			Entry<String, String> entry = it2.next();
			System.out.println("THE KEY is "+entry.getKey()+" the value is "+entry.getValue());
			
			
		}
		
		//iterator using java8
		//capitalMAP.forEach((k,v) -> System.out.println("The key is "+ k+ " the value " +v););
	}

	


}
