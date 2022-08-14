package codepractice;

public class LearnPalindrome {
	
	public static void main (String[] args) {
		int num = 457,palindrome=0,original,remainder;
		original = num;
		while(num>0)
		{
			remainder = num%10;
			palindrome = (palindrome*10)+remainder;
			num = num/10;
		}
	if(palindrome == original) {
		System.out.println("The number is Palindrome");
	}else {
		System.out.println("The number is not Palindrome");
	}
	}
	

}
