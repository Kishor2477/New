package javacodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./file.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String nextLine = sc.nextLine();
			System.out.println(nextLine);
		}

	}

}
