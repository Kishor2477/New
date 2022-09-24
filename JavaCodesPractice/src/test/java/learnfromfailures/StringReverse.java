package learnfromfailures;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {
		String s = "derfl";
		usingForLoop(s);
		usingStringBuffer(s);
		usingCollections(s);

	}
	public static void usingForLoop(String s) {
		String rev= "";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
			//System.out.println(s.charAt(i));
		}
		System.out.println(rev);
	}
	public static void usingStringBuffer(String s) {
		StringBuffer sb = new StringBuffer(s);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
	}
	
	public static void usingCollections(String s) {
		char[] ar = s.toCharArray();
		List<char[]> asList = Arrays.asList(ar);
		/*
		 * String[] st= Collections.reverse(asList); //asList.re
		 */ /* System.out.println(ar); */
	}
	

}
