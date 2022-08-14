package javacodes;

public class PrimeNumberNew {

	public static void main(String[] args) {
		int num = 7;
		int flag =0;
		if(num == 0 || num == 1)
			System.out.println("The Number is not a Prime Number");
		for (int i=2;i<num/2;i++) {
			if(num%i==0) {
				System.out.println("The Number is not a Prime Number");
				flag = 1;
				break;
			}
			else {
				System.out.println("The Number is Prime ");
			}
		}
	}

}
