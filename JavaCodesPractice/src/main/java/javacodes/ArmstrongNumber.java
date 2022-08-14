package javacodes;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153;
		
		int armstrong=0, original,remainder;
		
		original = n;
		
		while(n>0) {
			remainder = n%10;
			armstrong = armstrong + (remainder*remainder*remainder);
			n = n/10;
		}
		if (armstrong==original) {
			System.out.println("Number is armstrong");
		}else {
			System.out.println("Number is not armstrong");
		}
		  
}
}