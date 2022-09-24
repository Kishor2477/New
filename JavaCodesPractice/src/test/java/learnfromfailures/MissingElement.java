package learnfromfailures;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7};
		MissingElement.missingElement(arr);
	}
	
	public static void missingElement(int[] arr) {
		//System.out.println(arr.length);
		for(int i=1;i<arr.length;i++) {
			if(i != arr[i-1]) {
				System.out.println("The Missing Element is "+i);
			}
		}
	}

}
