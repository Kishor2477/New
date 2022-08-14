package programrevision;

public class Palindrome {

	public static void main(String[] args) {
		int num = 454;
		int palindrome = 0,remainder,original;
		original = num;
		while(num>0) {
			remainder = num%10;
			palindrome = (palindrome*10)+remainder;
			num = num/10;
		}
		if(palindrome == original) {
			System.out.println("The number is palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
