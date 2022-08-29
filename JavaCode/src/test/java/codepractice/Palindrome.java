package codepractice;

public class Palindrome {
	public static void main(String[] args) {
		int num = 454;
		int palindrm = 0,original,rem;
		original = num;
		while(num>0) {
			rem = num%10;
			palindrm = (palindrm*10)+rem;
			num = num/10;
	
		}
		if(original == palindrm) {
			System.out.println("The Number is Palindrome");
		}
		else {
			System.out.println("The Number is not Palindrome");
		}
	}

}
