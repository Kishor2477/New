package codepractice;

public class LearnPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,flag = 0;
		if(n==0 || n==1) {
			System.out.println("Not Pri");
		}else {
for(int i=2; i<n/2;i++) {
	if(i%2==0) {
		System.out.println("Not Prime");
		flag =1;
		break;
	}}
	if(flag==0) {
		System.out.println("Number is Prime");
	}
}
	}
	

}
