package globalX;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorter {
	
	public static void sorter(File inFile) throws IOException {
		
		outputFile(sortList(inFile));

	}
	public static ArrayList<Name> sortList(File inFile) throws FileNotFoundException {
		ArrayList<Name> listName = new ArrayList<Name>();

		Scanner sc = new Scanner (inFile);

	    while (sc.hasNextLine())
	    {
	    	Name names = new Name(sc.nextLine());
			listName.add(names);
	    }	
	    sc.close();
		Collections.sort(listName);
		return listName;
	}
	
	public static void outputFile(ArrayList<Name> list) throws IOException {
		File outFile = new File ("names-sorted.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		for(Name str: list) {
		System.out.println(str.toString());	
		  pWriter.write(str.toString());
		  pWriter.write("\n");
		}
		pWriter.close();
	}
}
