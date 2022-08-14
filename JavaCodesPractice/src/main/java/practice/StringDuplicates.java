package practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringDuplicates {

	public static void main(String[] args) {
		duplicates("Stringsg");

	}

	public static void duplicates(String str) {
		if(str==null) {
			System.out.println("String Empty");
		}
		if(str.length()==1) {
			System.out.println("String has only 1 charater");
		}
		
		char words[] = str.toCharArray();
		
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character ch : words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}
}
