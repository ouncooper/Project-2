import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;


public class SortTest {

	public void test() throws IOException {
		PaperCollection testCollection = new PaperCollection("filename");
		
		testCollection.Sort("BI");
		Assert.assertEquals("expected", testCollection.toString());
		testCollection.Sort("AN");
		Assert.assertEquals("expected", testCollection.toString());
		testCollection.Sort("PT");
		Assert.assertEquals("expected", testCollection.toString());
		testCollection.Sort("ST");
		Assert.assertEquals("expected", testCollection.toString());
		testCollection.Sort("CH");
		Assert.assertEquals("expected", testCollection.toString());
		testCollection.Sort("R");
		Assert.assertFalse("expected".equals(testCollection.toString()));
	}

}
