package javacodes;

import java.util.Arrays;

public class SecondLargestNumber {
	public void getSecondLargestNumber(int[] inputArray) {
		Arrays.sort(inputArray);
	//	for(int i=0;i<inputArray.lenght;i++) {
			
	//	}
		int len = inputArray.length;
		System.out.println("Second Largest Number is "+ inputArray[len-2]);				
	}

	public static void main(String[] args) {
		int[] inputArray = {1,50,23,12,34,32,24};
	 SecondLargestNumber large = new SecondLargestNumber();
	 large.getSecondLargestNumber(inputArray);
	}
	
}
