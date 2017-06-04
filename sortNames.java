
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) throws IOException {
	
		File inFile = new File (args[0]);
		sorter(inFile);
		System.out.println("Finished: created names-sorted.txt");
	}
	
public static void sorter(File inFile) throws IOException {
		
		outputFile(SortNames.sortList(inFile));

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
