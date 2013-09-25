import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;


public class SearchTest {
	
	public void test() throws IOException {
		//Make a collection from a file
		PaperCollection testCollection = new PaperCollection("papers.txt");
		
		//Test to see if you can find the right information
		Assert.assertEquals("Conference Paper\nAuthorLastName1, AuthorFirstName1; AuthorLastName2, AuthorFirstName2\nPaperName1\nSerialTitle1\n137-144\nJuly 2012\nhttp://dx.doi.org/10.7551/978-0-262-31050-5-ch020",testCollection.search("PaperName1"));
		Assert.assertEquals("Journal Article\nAuthorLastName7, AuthorFirstName7; AuthorLastName8, AuthorFirstName8\nPaperName4\nSerialTitle4\n30(2):115-634\nOctober 2010",testCollection.search("SerialTitle4"));
		
	}

}
