package learnfromfailures;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		int[] arr = {1,12,2,1,2,3,3};
		new Duplicates().duplicatesRemove(arr);
	}
	public void duplicatesRemove(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
				set.add(arr[i]);
			}
		}
		System.out.println(set);
	}
}
