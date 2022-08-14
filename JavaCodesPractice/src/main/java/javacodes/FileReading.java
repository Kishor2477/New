package javacodes;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReading {
	public static void main(String[] args) throws FileNotFoundException {
		 FileReader fileReader = new FileReader("./Test.txt");
		System.out.println(fileReader);
	}

}
