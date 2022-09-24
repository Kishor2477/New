package learnfromfailures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		 fileinput();
	}
	public static void fileWriter() throws IOException {
		File file = new File("./data/newfile.txt");
		FileWriter writer = new FileWriter(file);
		writer.write("Entring new values");
		
		writer.write("\r\n");
		writer.write("Second Line sentence");
		writer.close();
	}
public static void fileinput() throws IOException {
	FileOutputStream fs = new FileOutputStream(new File("./data/file.txt"));
	fs.write("Writing".getBytes());
	fs.close();
}
}
