package practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringDuplicatesNew {

	public static void main(String[] args) {
		String str = "ss";
		duplicatesMethod(str);
	}
	public static void duplicatesMethod(String str) {
		char word[] = str.toCharArray();
		java.util.Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	//	Map<Character,Integer> charMap = new HashMap<Character, Integer>();
		for(Character ch : word) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
			System.out.println(charMap);
		}
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Entry<Character,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		
	}

}
