package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayLearning {
	public static void main(String[] args) {
		Integer[] num = {10,2,5,1,35,1,2};
		ArrayLearning al = new ArrayLearning();
		al.largest(num);
		usingCollection(num);
		al.simpleMthod(num);
		duplicates(num);
		uniqueval(num);
	}
	
//print largest and smallest number
	public void largest(Integer[] num) {
		Arrays.sort(num);
		int len =  num.length;
		/*
		 * for(int i=0;i<=len;i++) { System.out.println("Largest Number is "num); }
		 */
		System.out.println("Largest Number is "+num[len-1]); 
		System.out.println("Smallest Number is "+num[0]);
	}
//Largest and smallest number using collection
	public static void usingCollection(Integer[] num) {
		Integer max = Collections.max(Arrays.asList(num));
		Integer min = Collections.min(Arrays.asList(num));
		System.out.println("The Maximum number using Collections is "+max);
		System.out.println("The Minimum number using Collections is "+min);
	}
	
	//3. Another mothod
	public static void simpleMthod(Integer[] num) {
		int smallestNum = num[0];
		int largestNum = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>largestNum) {
				largestNum = num[i];
			}else if(num[i]<smallestNum) {
				smallestNum = num[i];
			}
		}
		System.out.println("The LargestNumber is "+largestNum);
		System.out.println("The SmallestNumber is "+smallestNum);
	}
	//to print duplicates numbers in array
	public static void duplicates(Integer[] num) {
		int leng = num.length;
		for(int i=0;i<leng;i++) {
			for(int j=i+1;j<leng;j++) {
				if(num[i]==num[j]) {
					System.out.println("The Duplicates number is "+num[i]);
				}
			}
		}
	}
	//to print unique values
	public static void uniqueval(Integer[] num) {
		int len = num.length;
		//Arrays.sort(num);
		for(int i=0;i<len-1;i++) {
			if(num[i] == num[i+1]) {
				System.out.println("The Duplicate is "+num[i]);
			}
		}
	}
}
