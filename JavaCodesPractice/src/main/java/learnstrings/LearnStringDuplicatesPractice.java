package learnstrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnStringDuplicatesPractice {

	public static void main(String[] args) {

		printDuplicates("");
		printDuplicates("d");
		printDuplicates("null");
		printDuplicates("java");

	}

	public static void printDuplicates(String str) {
		if (str == null) {
			System.out.println("String is null");
		}

		if (str.isEmpty()) {
			System.out.println("String is Empty");
		}

		if (str.length() == 1) {
			System.out.println("Length is one Character");
		}

		// string to char Array
		char words[] = str.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : words) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		// iteration
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}

}
