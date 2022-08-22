package arrays;

import java.util.Arrays;
import java.util.Collections;

public class LearnArrays {
	public static void main(String[] args) {
		Integer[] words = {10,2,35,231,134,9};
		LearnArrays arr = new LearnArrays();
		arr.normalMethod(words);
		arr.simpleMethod(words);
		arr.usingCollections(words);
	}
	public void simpleMethod(Integer[] words) {
		Arrays.sort(words);
		int len = words.length;
		System.out.println("The Maximum number from Simple Method is "+words[len-1]);
		System.out.println("The Minimum number from Simple Method is "+words[0]);
	}
	public void usingCollections(Integer[] words) {
		Integer max = Collections.max(Arrays.asList(words));
		Integer min = Collections.min(Arrays.asList(words));
		System.out.println("The Maximum number from collections Method is "+max);
		System.out.println("The Minimum number from collections Method is "+min);
	}
	public void normalMethod(Integer[] words) {
		int smallestNum = words[0];
		int largestNum = words[0];
		for(int i=0;i<words.length;i++) {
			if(words[i]>largestNum) {
				largestNum = words[i];
			}else if(words[i]<smallestNum){
			smallestNum = words[i];
			}
		}
		System.out.println("The Largest Number from normal Method is "+largestNum);
		System.out.println("The Smallest number from normal Method is "+smallestNum);
	}
}
