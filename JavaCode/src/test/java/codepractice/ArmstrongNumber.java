package codepractice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n = 154;
		int armstrong=0,rem,original = 0;
		original = n;
		while(n>0) {
			rem = n%10;
			armstrong = armstrong + (rem*rem*rem);
			n = n/10;
		}
		if(original == armstrong) {
			System.out.println("The number is Armstrong");
		} else {
			System.out.println("The number is Not Armstrong");
		}
	}

}
