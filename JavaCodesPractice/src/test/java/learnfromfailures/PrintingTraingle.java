package learnfromfailures;

import java.util.Scanner;

public class PrintingTraingle {

	public static void main(String[] args) {
		System.out.println("Enter the Size of the Traingle");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j = 0;j<i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
