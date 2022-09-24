package practice;

import java.util.Scanner;

public class SwappingWithout {

	public static void main(String[] args) {
		System.out.println("Enter the first number");
		System.out.println("Enter the second number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Swapping "+x+ " : "+y);

	}

}
