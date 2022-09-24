package practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		java.util.Map<Integer, String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1,"value");
		hashMap.put(2, "key");
		
		//iteration
		Iterator<Integer> it1 = hashMap.keySet().iterator();
		while(it1.hasNext()) {
			Integer next = it1.next();
			System.out.println(next);
			System.out.println(next+ " : " +hashMap.get(next));
		}
		
		Iterator<Entry<Integer, String>> it = hashMap.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> next = it.next();
			System.out.println(next.getKey() + " : " + next.getValue());
		}
		
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for(Entry<Integer,String> entry : entrySet) {
			/*
			 * if(entry.getValue() > 1) {
			 * 
			 * }
			 */
		System.out.println(entry.getKey() + " : " +entry.getValue());
		}
		List<String> list = new ArrayList<String>(hashMap.values());
		for(String st : list) {
			System.out.println(st);
		}
		List<Integer> list1 = new ArrayList<Integer>(hashMap.keySet());
		for(Integer in : list1) {
			System.out.println(in);
		}
	}

}
