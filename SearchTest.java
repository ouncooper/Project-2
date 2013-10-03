import static org.junit.Assert.*;
import java.io.IOException;
import junit.framework.Assert;

import org.junit.Test;


public class PaperCollectionSearchTest {
	
	@Test
	public void test() throws IOException {
		//Make a collection from a file
		PaperCollection testCollection = new PaperCollection("papers.txt");
		
		//Test to see if you can find the right information
		
		//This paper should be in the 0th position in the arrayList if sorted by title (necessary for binary search)
		Assert.assertEquals(0,testCollection.search("Extending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors"));
		//This paper should be in the 1st position in the arrayList if sorted by title (necessary for binary search)
		Assert.assertEquals(1,testCollection.search("Mexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation"));
		//This paper should be in the 2nd position in the arrayList if sorted by title (necessary for binary search)
		Assert.assertEquals(2,testCollection.search("Prextending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors"));
		//This paper should be in the 3rd position in the arrayList if sorted by title (necessary for binary search)
		Assert.assertEquals(3,testCollection.search("Sexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation"));
				
	}

}
