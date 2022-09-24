package learnfromfailures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntersectionArrays {

	public static void main(String[] args) {
	int[] arr1 = {1,2,22,3,5};
	int[] arr2 = {2,4,33,2,3};
	simpleMethod(arr1, arr2);
	collection(arr1, arr2);
	IntersectionArrays.intersection(arr1, arr2);

	}

	public static void simpleMethod(int[] arr1,int[] arr2) {
		for(int i=0;i<arr1.length;i++) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(arr1[i]==arr2[i]) {
				System.out.println(arr1[i]);
			}
		}
	}
	public static void collection(int[] arr1,int[] arr2) {
		List<Integer> list =new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==arr2[i]) {
				list.add(arr2[i]);
			}
		}
		Collections.sort(list);
		System.out.println(list);
	}
	public static void intersection(int[] arr1,int[] arr2) {
		List<Integer> list1 = new ArrayList<Integer>();
		for(Integer i : arr1) {
		list1.add(i);
		}
		List<Integer> list2 = new ArrayList<Integer>();
		for(Integer i :arr2) {
			list2.add(i);
		}
		list1.retainAll(list2);System.out.println(list1);
	}
}
