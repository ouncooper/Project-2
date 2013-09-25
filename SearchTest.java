import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;


public class SearchTest {
	
	public void test() throws IOException {
		//Make a collection from a file
		PaperCollection testCollection = new PaperCollection("filename");
		
		//Test to see if you can find the right information
		Assert.assertEquals("expected",testCollection.search("author1"));
		Assert.assertEquals("expected",testCollection.search("title2"));
		Assert.assertEquals("expected",testCollection.search("DOI"));
		
	}

}
