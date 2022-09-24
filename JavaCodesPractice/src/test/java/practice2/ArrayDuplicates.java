package practice2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicates {

	public static void main(String[] args) {
		int[] arr = {10,12,12,23,13};
		//new ArrayDuplicates().duplicates(arr);
		new ArrayDuplicates().unique(arr);
	}
	public void duplicates(int[] arr) {
		for(int i = 0;i<=arr.length-1;i++) {
			for(int j = i+1;j<=arr.length-1;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	
	}
	public void unique(int[] arr) {
		Map<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
		for(int j=0;j<arr.length;j++) {
			hashMap.put(arr[j], j);
		}
		System.out.println(hashMap.keySet());
	}
}
