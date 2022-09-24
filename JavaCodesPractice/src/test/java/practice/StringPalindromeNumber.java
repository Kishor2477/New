package practice;

import java.util.Scanner;

public class StringPalindromeNumber {

	public static void main(String[] args) {
	System.out.println("Enter the String or Number");
	Scanner sc = new Scanner(System.in);
	String text = sc.nextLine();
	String original,rev = "";
	original = text;
	for(int i=text.length()-1;i>=0;i--) {
		rev = rev + text.charAt(i);
	}
	System.out.println("Reverse"+rev);
	if(original.equals(rev)) {
		System.out.println("Reverse is Palindrome "+rev);
	}else {
		System.out.println("Not Palindrome");
	}
	}

}
