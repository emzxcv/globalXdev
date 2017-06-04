
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SortNamesTest {
	

	@Test
	public void test() throws FileNotFoundException {
		//change path of file here 
		File inFile = new File ("/Users/MigiHome/Documents/workspace/globalX/src/globalX/names.txt");
		assertEquals("[BAKER,  THEODORE, KENT,  MADISON, SMITH,  ANDREW, SMITH,  FREDRICK]", SortNames.sortList(inFile).toString());
	}
	
	
	  Result result = JUnitCore.runClasses(SortNamesTest.class);{
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());

	  }
}