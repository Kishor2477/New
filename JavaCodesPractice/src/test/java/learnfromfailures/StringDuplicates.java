package learnfromfailures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringDuplicates {

	public static void main(String[] args) {
		String str= "reverse and duplicates";
		/**/
		char[] words = str.toCharArray();
		Map<Character,Integer> charMap = new HashMap<Character, Integer>();
		for(Character ch : words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
			
		}
		System.out.println(charMap);
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Entry<Character,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ " : " + entry.getValue());
			}
		}
	}
	

}
