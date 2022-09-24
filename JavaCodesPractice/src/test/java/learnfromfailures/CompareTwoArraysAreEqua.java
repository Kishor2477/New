package learnfromfailures;

import java.util.Arrays;

public class CompareTwoArraysAreEqua {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,4};
		//CompareTwoArraysAreEqua.simple(arr1, arr2);
		if(simple(arr1, arr2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}

	}
	public static boolean simple(int[] arr1,int[] arr2) {
		int length1 = arr1.length;
		int length2 = arr2.length;
		if(length1 != length2) {
			//System.out.println("Both arrays are not Equal");
			return false;
		}
		
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0;i<length1;i++) {
				if(arr1[i]!=arr2[i]) {
					return false;
				}
			}
			//System.out.println("Equal");
		return true;
	}

}
