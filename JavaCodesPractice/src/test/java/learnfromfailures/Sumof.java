package learnfromfailures;

public class Sumof {

	public static void main(String[] args) {
		int input = 201,original,remainder,sumOfDigits=0;
		//original = input;
		while(input>0)
		{
			remainder = input%10;
			sumOfDigits=sumOfDigits+remainder;
			input=input/10;
		}
		System.out.println("Sum of digits is " +sumOfDigits);

	}

}
