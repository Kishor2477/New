package arrays;

public class SecondlargestNumber {
	
	public static void main(String[] args) {
	int[] num = {12,32,112,34,12};	
	SecondlargestNumber sl = new SecondlargestNumber();
	sl.largestSecondNumber(num);
	arrayDuplicates(num);
	
	}
	public void largestSecondNumber(int[] num) {
		/*
		 * for(int i=0;i<=num.length;i++) { System.out.println("Largest NUmber is"); }
		 */
		int len = num.length;
		System.out.println("Secound largest Number is "+num[len-1]);
	}
	public static void arrayDuplicates(int[] num) {
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println("Duplicates is "+num[i]);
				}
			}
		}
	}
}

