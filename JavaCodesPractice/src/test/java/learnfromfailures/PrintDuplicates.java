package learnfromfailures;

import java.util.Arrays;
import java.util.HashSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,1,2,3,4};
		normalmethod(arr);
		alternateMethod(arr);
		usingSet(arr);

	}
	public static void normalmethod(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
		}
	}
	public static void alternateMethod(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("The duplicates are "+arr[i]);
				}
			}
		}
	}
	public static void usingSet(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!set.add(arr[i])) {
			System.out.println(arr[i]);
		}
		}
	}

}
