package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintSecondLargestNumbersIn {

	public static void main(String[] args) {
		int[] array = { 12, 10, 16, 13, 25 };
		PrintSecondLargestNumbersIn obj = new PrintSecondLargestNumbersIn();
		obj.arrayLength(array);
	//	obj.nonSort(array);
		obj.nonSort(array);
		
		int smallNumber = array[0];
		int largeNumber = array[0];
		for(int i=0;i<array.length; i++) {
			if(array[i]>largeNumber) {
				largeNumber = array[i];
			}else if(array[i]<smallNumber) {
				smallNumber = array[i];
			}
		}
		System.out.println("Largest Number is"+largeNumber);
		System.out.println("Smallest Number is"+smallNumber);
		
	}

	public void arrayLength(int[] inputArray) {

		Arrays.sort(inputArray);
		System.out.println(inputArray[inputArray.length - 2]);
	}

	public void nonSort(int[] array) {
		
			int smallNumber =array[0];
			int largestNumber =array[0];
			for (int i = 0; i < array.length; i++) {
				if (array[i]> largestNumber ) {
					largestNumber = array[i-1];
				} else if (array[i]<smallNumber) {
					smallNumber = array[i];
				}
			}
			System.out.println("Maximum array of number is "+largestNumber);
			System.out.println("Minimum array of number is "+smallNumber);
		

	}
}
