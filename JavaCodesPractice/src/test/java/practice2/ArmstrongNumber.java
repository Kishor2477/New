package practice2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int armstrong = 0,original,remainder;
		original = n;
		while(n>0) {
			remainder = n%10;
			armstrong = armstrong +(remainder*remainder*remainder);
			n = n/10;
		}
		if(armstrong == original) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}

}
