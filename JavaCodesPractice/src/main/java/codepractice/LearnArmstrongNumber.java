package codepractice;

public class LearnArmstrongNumber {

	public static void main(String [] args) {
		int num = 153 , armstrong =0 , remainder, original;
		original = num;
		while(num>0) {
			remainder = num%10;
			armstrong = armstrong +(remainder*remainder*remainder);
			num = num/10;
		}
		if(armstrong==original) {
			System.out.println("The Number is Armstrong NUmber");
		}else {
			System.out.println("The Number is not Armstrong");
		}
	}
	
}
