package practice;

public class PrimeNUmbers {

	public static void main(String[] args) {
		int n = 10,flag =0;
		if (n==0 || n==1) {
			System.out.println("No Not Prime");
		}
		else {
			for(int i=2;i<n/2;i++) {
				if(n%i ==0) {
					System.out.println("Not Prime");
					flag = 1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("The Number is Prime");
			}
		}
	}

}
