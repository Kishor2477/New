package practice;

import java.util.Scanner;

public class SwapNumbersUsingThirdVairable {

	public static void main(String[] args) {
		System.out.println("Enter the Number 1 ");
		System.out.println("Enter the Number 2 ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Before Swapping "+x +" : "+y);
		int temp = 0;
		temp = x;
		x=y;
		y=temp;
		System.out.println("After Swapping "+x +" : "+y);

	}

}
