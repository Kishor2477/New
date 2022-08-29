package codepractice;

public class printingNUm {

	public static void main(String[] args) {
		int num = 5;
		new printingNUm().printNUm(num);
		new printingNUm().printSeries(num);

	}
	public void printNUm(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//System.out.println();
	}
	
	public void printSeries(int num) {
		for(int i=0;i<=num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
		
			}
			System.out.println();
		}
		
	}

}
