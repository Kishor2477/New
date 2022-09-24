package practice2;

public class PrintingMissingElement {

	public static void main(String[] args) {
	int[] arr = {1,2,3,5,6};
	PrintingMissingElement.missingElement(arr);

	}
	public static void missingElement(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(i != arr[i-1]) {
				System.out.println(i);
			}
		}
	}
}
