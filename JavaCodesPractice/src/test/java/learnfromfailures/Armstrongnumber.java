package learnfromfailures;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Armstrongnumber {
	//153 = 1*1*1 + 5*5*5 + 3*3*3
	
	@Test
	public static void ams() {
		System.out.print("Enter the Number ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arms=0,remainder,original;
	original = n;
	while(n>0) {
		remainder = n%10;
		arms = arms + (remainder*remainder*remainder);
		n = n/10;
	}
	if(original == arms) {
		System.out.println("The Number is Armstrong");
	}else {
		System.out.println("The number is not Armstrong");
	}

	}

}
