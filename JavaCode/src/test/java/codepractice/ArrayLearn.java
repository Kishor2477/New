package codepractice;

import java.util.Arrays;
import java.util.Collections;

public class ArrayLearn {

	public static void main(String[] args) {
		Integer[] arr = {2,34,23,112,2};
		secondLargest(arr);
		usingCollections(arr);
		largestSmallest(arr);
	}
	
	public static void secondLargest(Integer[] arr) {
		int l = arr.length;
		Arrays.sort(arr);
		System.out.println("The largest is "+arr[l-1]);
		System.out.println("The Smallest is "+arr[0]);
		
	}
	public static void usingCollections(Integer[] arr) {
		Integer max =  Collections.max(Arrays.asList(arr));
		Integer min = Collections.min(Arrays.asList(arr));
		System.out.println("The largest Number is "+max);
		System.out.println("The smallest Number is "+min);
	}
	
	public static void largestSmallest(Integer[] arr) {
		int largestNum = arr[0];
		int smallestNum = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>largestNum) {
				largestNum = arr[i];
			}else if(arr[i]<smallestNum){
				smallestNum = arr[i];
			}
		}
		System.out.println("Largest num "+largestNum);
		System.out.println("Smallest num "+smallestNum);
	}

}
