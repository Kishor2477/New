package learnstrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringsLearning {

	public static void main(String[] args) {
		String str = "selenium";
		reverse(str);
		stringBuffer(str);
		stringOccurance(str);
	}
	public static void reverse(String str) {
		int len = str.length();
		String rev ="";
		for(int i=len-1;i>=0;i--) {
			rev =rev+str.charAt(i);
			}
		System.out.println(rev);
	}
	public static void stringBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	public static void stringOccurance(String str) {
		if(str=="") {
			System.out.println("String is numm");
		}
		if(str.length()==1) {
			System.out.println("String has only one Char");
		}
		char[] words = str.toCharArray();
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(Character ch : words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
	
		}
		System.out.println(charMap);
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
			
		}
		
	}
}
