package learnfromfailures;

import java.util.Scanner;

public class PrintTraingle {

	public static void main(String[] args) {
		System.out.println("Enter the size of traingle");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
