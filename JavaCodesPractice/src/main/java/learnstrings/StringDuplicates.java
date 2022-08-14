package learnstrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class StringDuplicates {

	public static void main(String[] args) {
		printduplivateString("String");
		printduplivateString("");
		printduplivateString("s");
		printduplivateString("java");
	}
		
	public static void printduplivateString(String str) {
		if (str.isEmpty()) {
			System.out.println("The String value is Emty");
		}
		if(str == null) {
			System.out.println("The String is null");
		}
		if(str.length()== 1) {
			System.out.println("The String has only one character");
		}
		
		char words[] = str.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character ch : words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
			
		}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +":"+ entry.getValue());
			}
		}
		
	

	}

}
