package codepractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringLearn {

	public static void main(String[] args) {
	
		StringLearn learn = new StringLearn();
		learn.duplicates("sdsttef");
		learn.reverse("ssreffd");
		learn.stringBuffer("srtr");

	}
	
	public void reverse(String str) {
		String rev ="";
		int size = str.length();
		for(int i=size-1;i>=0;i--) {
			rev= rev + str.charAt(i);
			
		}
		System.out.println(rev);
	}
	
	public void stringBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	
	public void duplicates(String str) {
		if(str == "") {
			System.out.println("String is Empty");
		}
		if(str.length() == 1) {
			System.out.println("String has only one Char");
		}
		
		char[] words = str.toCharArray();
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(Character ch : words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
			//System.out.println(charMap);
		}
		
		System.out.println(charMap);
		
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Entry<Character,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +":"+ entry.getValue());
			}
		}
	}

}
