package javacodes;

public class FibanocciSeries {
public static void main(String[] args) {
	//fibanocci series 0,1,1,2,3,5,8
	int firstNum = 0;
	int secondNum = 1;
	System.out.println(firstNum);
	System.out.println(secondNum);
	
	for(int i = 0;i<10;i++) {
		int sum = firstNum + secondNum ;
		System.out.println(sum);
		firstNum = secondNum;
		secondNum =sum;
		
	}
}
}
