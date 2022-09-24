package practice;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWords {

	public static void main(String[] args) {
		String str = "This is String Count Words program";
		countWords(str);
		countCharInWords(str);

	}
	public static void countWords(String str) {
		String[] words = str.split(" ");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String ch : words) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
	System.out.println(map);
	}

	public static void countCharInWords(String str) {
		char[] word = str.toCharArray();
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(Character ch : word) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		System.out.println(charMap);
		}
}
