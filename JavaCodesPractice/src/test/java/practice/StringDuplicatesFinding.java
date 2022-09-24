package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringDuplicatesFinding {

	public static void main(String[] args) {
		String str = "seleniummei";
		StringDuplicatesFinding.duplicateFind(str);
	}
	public static void duplicateFind(String str) {
		if(str == "") {
			System.out.println("String is null");
		}else if (str.length() == 1) {
			System.out.println("String has only one Char");
		}
		char[] words = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character,Integer>();
		for(Character ch : words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Entry<Character,Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}

}
