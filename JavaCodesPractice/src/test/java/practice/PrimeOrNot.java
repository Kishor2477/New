package practice;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter the num ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag = 0;
		if(num == 0 || num == 1) {
			System.out.println("Not Prime");
		}else {
			for(int i =2;i<=num/2;i++) {
				if(num%i==0) {
					System.out.println("Not Prime");
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0) {
			System.out.println("Prime");
		}
		

	}

}
