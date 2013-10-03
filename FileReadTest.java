import java.io.IOException;
import static org.junit.Assert.*;
import junit.framework.Assert;


public class FileReadTest {

	public void test() {
		//Filename containing exactly 4 test papers
		String filepath = "papers.txt";

		PaperCollection testCollection = null;
		try {
			testCollection = new PaperCollection(filepath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//See if there are exactly 4 papers in the collection
		Assert.assertEquals(testCollection.size(), 4);
		
	}	
}
