package printingnumberinorder;

public class PrintingTriangle {

	public static void main(String[] args) {
		int n = 5;
		int i, j;
		// outer loop to handle number of rows
		//  n in this case
		for(i=0; i<n; i++){
			//  inner loop to handle number of columns
			//  values changing according to outer loop  
			for(j=0; j<=i; j++){
				// printing stars
				System.out.print("i ");
			}

			// ending line after each row
			System.out.println();
		}

	}

}
