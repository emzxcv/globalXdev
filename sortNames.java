package globalX;

import java.io.*;

public class sortNames {

	public static void main(String[] args) throws IOException {
	
		File inFile = new File (args[0]);
		Sorter.sorter(inFile);
		System.out.println("Finished: created names-sorted.txt");
	}
}
