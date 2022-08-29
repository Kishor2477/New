package codepractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringConcepts {

	public static void main(String[] args) {
	String str = "selenium";
	new StringConcepts().stringOccurance(str);
	stringDuplicates(str);
	new StringConcepts().stringReverse(str);
	

	}
	public void stringReverse(String str) {
		int length = str.length();
		String rev ="";
		for(int i = length-1;i>= 0 ;i--) {
			rev = rev + str.charAt(i);
					}
		System.out.println(rev);

	}
	
	public void stringreverseUsingStringBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	
	public void stringOccurance(String str) {
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
	}
	public static void stringDuplicates(String str) {
		char[] words = str.toCharArray();
		Map<Character,Integer> charArray = new HashMap<Character, Integer>();
		for(Character ch : words) {
			if(charArray.containsKey(ch)) {
				charArray.put(ch, charArray.get(ch)+1);
			}else {
				charArray.put(ch, 1);
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = charArray.entrySet();
		for(Entry<Character,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}

}
