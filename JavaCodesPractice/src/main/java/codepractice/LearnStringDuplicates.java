package codepractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LearnStringDuplicates {

	public static void main(String[]args) {
		stringduplicates("sstttefef");
	}
	public static void stringduplicates(String str) {
		if(str=="null") {
			System.out.println("The String is Null");
		}
		if(str.length()==1) {
			System.out.println("The value is one");
		}
		char words[] = str.toCharArray();
		
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(Character ch : words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		
		Set<Entry<Character,Integer>> entrySet = charMap.entrySet();
		for(Entry<Character,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ ":" +entry.getValue() );
			}
		}
		
	}
}
