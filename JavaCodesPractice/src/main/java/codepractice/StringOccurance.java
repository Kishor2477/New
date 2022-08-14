package codepractice;

import java.util.HashMap;

public class StringOccurance {
	
public static void main(String[] args) {
	String str = "Welcome to Interview";
	char words[] = str.toCharArray();
	HashMap<Character,Integer> charWords = new HashMap<Character,Integer>();
	for(Character ch : words) {
		if(charWords.containsKey(ch)) {
			charWords.put(ch, charWords.get(ch)+1);
		}
		else {
			charWords.put(ch, 1);
		}
		
	}
	System.out.println(charWords);
}
	
}
