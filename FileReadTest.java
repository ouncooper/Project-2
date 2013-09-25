import static org.junit.Assert.*;

import org.junit.Test;


public class FileReadTest {

	@Test
	public void test() {
		//Filename containing 4 test papers
		String filepath = "filepath";
		PaperCollection testCollection = new PaperCollection(filepath);
		
		Assert.assertEquals(testCollection.size(), 4);
	}

}
