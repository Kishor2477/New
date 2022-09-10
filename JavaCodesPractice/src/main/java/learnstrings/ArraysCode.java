package learnstrings;

import java.util.Arrays;
import java.util.Collections;

public class ArraysCode {
	
	public static void main(String[] args) {
		Integer[] num = {10,23,12,11,23,34};
		ArraysCode.arrayMaximum(num);
		ArraysCode.UsingCollections(num);
		simpleMethod(num);
	}
	public static void arrayMaximum(Integer[] num) {
		Arrays.sort(num);
		int len = num.length;
		System.out.println("The Maximum num is "+num[len-1]);
		System.out.println("The Minimum num is "+num[0]);
	}
	public static void UsingCollections(Integer[] num) {
		Integer max = Collections.max(Arrays.asList(num));
		Integer min = Collections.min(Arrays.asList(num));
		System.out.println("The Maximum number is "+max);
		System.out.println("The Minimum number is "+min);
	}
	
	public static void simpleMethod(Integer[] num) {
		int smallNum = num[0];
		int largeNum = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>largeNum) {
				largeNum = num[i];
			}else if(num[i]<smallNum){
				smallNum = num[i];
			}
		}
 	System.out.println("The Large num is "+largeNum);
 	System.out.println("The Small num is "+smallNum);
	}

}
