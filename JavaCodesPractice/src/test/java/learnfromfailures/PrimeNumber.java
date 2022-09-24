package learnfromfailures;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int j = sc.nextInt();
		//int n =10;
		int flag=0;
		if(n==0 || n==1) {
			System.out.println("Not Prime");
		}else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					System.out.println("Not Prime");
					flag = 1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("Prime Number");
			}
		}
	}

}
