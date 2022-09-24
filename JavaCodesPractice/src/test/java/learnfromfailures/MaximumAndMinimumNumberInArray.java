package learnfromfailures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumAndMinimumNumberInArray {
	
	public static void main(String[] args) {
		Integer[] arr = {12,23,12,24,11,133,134333};
		new MaximumAndMinimumNumberInArray().normalIteration();
		new MaximumAndMinimumNumberInArray().simpleForLoop(arr);
		usingVariables(arr);
		usingCollections(arr);
		collections(arr);
		usingSet(arr);
	
	}
	public void normalIteration() {
		Integer[] arr = new Integer[4];
		arr[0] = 23;
		arr[1] = 23;
		arr[2] = 24;
		arr[3] = 12;
		System.out.println(arr[3]);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public void simpleForLoop(Integer[] arr) {
		Arrays.sort(arr);
		System.out.println("Maximum number is "+arr[arr.length-1]);
		System.out.println("Minimum number is "+arr[0]);
	}
	public static void usingVariables(Integer[] arr) {
		int largenum = arr[0];
		int smallnum = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largenum) {
				largenum = arr[i];
			}
			else if(arr[i]<smallnum){
				smallnum =arr[i];
			}
			
		}
		System.out.println(largenum);
		System.out.println(smallnum);
	}
	public static void usingCollections(Integer[] arr) {
		Integer max = Collections.max(Arrays.asList(arr));
		Integer min = Collections.min(Arrays.asList(arr));
		System.out.println("The Maximum value is "+ max);
		System.out.println("The Minimum value is "+ min);

	}
	public static void collections(Integer[] arr) {
		Collections.sort(Arrays.asList(arr));
		System.out.println(arr[arr.length-2]);
	}
	public static void usingSet(Integer[] arr) {
		List<Integer> asList = Arrays.asList(arr);
		Integer integer = asList.get(asList.size()-2);
		System.out.println(integer);
		
	}
}
