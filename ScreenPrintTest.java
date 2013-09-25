import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;


public class ScreenPrintTest {

	public void test() throws IOException {
		String fileToOpen = "filename";
		String savedFile = "filename";
		
		//Print to file
		PaperCollection testCollection = new PaperCollection(fileToOpen);
		testCollection.printToFile(savedFile);
		
		//Open the file
		//Make a file reader
		FileReader file = new FileReader(savedFile);
		//Make a buffered reader from the file reader
		BufferedReader buffer = new BufferedReader(file);
		
		//Check to see if the expected string matches what the file reads
		Assert.assertEquals("expected", buffer.readLine());
		Assert.assertEquals("expected", buffer.readLine());
		Assert.assertEquals("expected", buffer.readLine());
		Assert.assertEquals("expected", buffer.readLine());
		
		//Close buffer to avoid memory leak
		buffer.close();

	}

}
