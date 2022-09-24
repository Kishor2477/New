package practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringDuplicates {

	public static void main(String[] args) {
		String str = "string duplicates";
		duplicates(str);
	}

	public static void duplicates(String str) {
		char[] words = str.toCharArray();
		//String[] words = str.split(" ");
		Map<Character,Integer> hashMap = new HashMap<Character,Integer>();
		for(Character ch : words) {
			if(hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch)+1);
			}else {
				hashMap.put(ch, 1);
			}
		}
		System.out.println(hashMap);
		Set<Entry<Character, Integer>> entrySet = hashMap.entrySet();
		for(Entry<Character,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}
	
}
