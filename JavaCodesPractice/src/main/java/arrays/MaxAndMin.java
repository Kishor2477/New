package arrays;

import java.util.Arrays;
import java.util.Collections;

public class MaxAndMin {
	
	public static void main(String[] args) {
		Integer[] words = {12,11,34,223,33};
		simpleMaxMin(words);
		usingCollections(words);
	}
	
	public static void simpleMaxMin(Integer[] words) {
		Arrays.sort(words);
		int size = words.length;
		System.out.println("The maximum number is "+words[size-1]);
		System.out.println("The Min number is "+words[0]);
		smallLargest(words);
	}
	
	public static void usingCollections(Integer[] words){
		//
		//int[] min2 = Collections.min(Arrays.asList(words));
		Integer max = Collections.max(Arrays.asList(words));	
		Integer min = Collections.min(Arrays.asList(words));
		System.out.println("The Maximum number is "+max);
		System.out.println("The Minimum number is "+min);
	}
	public static void smallLargest(Integer[] words) {
		int smallestNum = words[0];
		int largestNum = words[0];
		for(int i=0;i<words.length;i++) {
			if(words[i]>largestNum) {
				largestNum = words[i];
			}else if(words[i]<smallestNum){
				smallestNum = words[i];
			}
			
		}
		System.out.println("Largest NUmber "+largestNum);
		System.out.println("Smallest NUmber "+smallestNum);
		
	}

}
