package javacodes;

public class ArraysDuplicate {

	public void getDuplicate(int[] inputValue) {
		System.out.print("\nThe Duplicate value is" + " ");
		for(int i=0 ; i<inputValue.length ; i++) {
			for(int j=i+1 ; j<inputValue.length ; j++) {
				if(inputValue[i] == inputValue[j]) {
					System.out.print(inputValue[i] + " ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] inputValue = {10,12,10,22,12,23};
		ArraysDuplicate obj = new ArraysDuplicate();
		obj.getDuplicate(inputValue);
	}
}
