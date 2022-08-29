package printingnumberinorder;

public class Triangle {

	public static void main(String[] args) {
		int num;
		printTraingle(5);
		printNumbers(5);

	}
	public static void printTraingle(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("L");
			}
			System.out.println();
		}
	}
	
	public static void printNumbers(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
