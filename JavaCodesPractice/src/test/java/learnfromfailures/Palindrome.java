package learnfromfailures;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int original,remainder,palind = 0;
		original = n;
		while(n>0) {
			remainder = n%10;
			palind = (palind * 10) + remainder;
			n=n/10;
		}
		if(original==palind) {
		System.out.println("The Number is Palindrome");
		}else {
			System.out.println("The Number is Not palindrome");
		}
	}
}
