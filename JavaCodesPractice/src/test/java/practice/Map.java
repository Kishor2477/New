package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Vinitha");
		map.put(2,"Raji");
		
		
		//using while loop
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> next = it.next();
			System.out.println(next.getKey()+ " : " + next.getValue());
		}
		
		//using Advance for loop
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer,String> ch : map.entrySet()) {
			System.out.println(ch.getKey()+ " " +ch.getValue());
		}

	}

}
