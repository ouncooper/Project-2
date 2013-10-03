import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;


public class SortTest {

	public void test() throws IOException {
		PaperCollection testCollection = new PaperCollection("filename");
		
		//Not sure what expected should be since sorting methods not implemented yet
		testCollection.sort("BI");
		Assert.assertEquals("expected", testCollection.toString());
		testCollection.sort("AN");
		Assert.assertEquals("expected", testCollection.toString());
		testCollection.sort("PT");
		Assert.assertEquals("expected", testCollection.toString());
		testCollection.sort("ST");
		Assert.assertEquals("expected", testCollection.toString());
		testCollection.sort("CH");
		Assert.assertEquals("expected", testCollection.toString());
		testCollection.sort("R");
		Assert.assertFalse("expected".equals(testCollection.toString()));
	}

}
