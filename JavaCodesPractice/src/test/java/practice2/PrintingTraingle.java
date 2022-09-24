package practice2;

import java.util.Scanner;

public class PrintingTraingle {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
