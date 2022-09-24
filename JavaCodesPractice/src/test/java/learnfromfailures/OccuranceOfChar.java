package learnfromfailures;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfChar {

	public static void main(String[] args) {
		String str = "This is Automation";
usingMapConcept(str);
	normalmethod(str);
	}
	public static void usingMapConcept(String str) {
		char[] charArray = str.toCharArray();
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(Character ch :charArray) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		System.out.println(charMap);
		
	}
	
	public static void normalmethod(String str) {
		//char[] words = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			int count = 0;
			char c = str.charAt(i);
			for(int j=0;j<str.length();j++) {
				if(c == str.charAt(j)) {
				count ++;
				}
			}
			System.out.println(c +" Occurs "+count+" times");

		}
			}

}
