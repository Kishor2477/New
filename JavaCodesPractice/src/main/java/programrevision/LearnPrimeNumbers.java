package programrevision;

public class LearnPrimeNumbers {

	public static void main(String[] args) {
		int n = 10,flag=0;
		if(n==0 || n==1) {
			System.out.println("The number is not prime");
		}else {
			for(int i=2;i<n/2;i++) {
				if(n%2==0) {
				System.out.println("Not prime");
				flag = 1;
				break;
				}
				if(flag==0) {
					System.out.println("Prime Number");
				}
			}
		}
	}
}
