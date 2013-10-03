<<<<<<< HEAD
=======
import static org.junit.Assert.*;
>>>>>>> 3bccbd562f69d8aa8cd22e1467e73d9370c37cdb
import java.io.IOException;
import junit.framework.Assert;

import org.junit.Test;


public class PaperCollectionSearchTest {
	
	@Test
	public void test() throws IOException {
		//Make a collection from a file
		PaperCollection testCollection = new PaperCollection("papers.txt");
		
		//Test to see if you can find the right information
		
		Assert.assertEquals("Journal Article // Eskridge, Brent E.; Hougen, Dean F. // Extending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Brobotics and Autonomous Systems // 59(2):106-108 // March 2010 // null",testCollection.search("Extending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors").toString());
		Assert.assertEquals("Conference Paper // Woehrer, Mark; Hougen, Dean; Schlupp, Ingo // Mexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // Subinternational Conference on the Synthesis and Simulation of Living Systems // 135-145 // July 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020",testCollection.search("Mexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation").toString());
		Assert.assertEquals("Journal Article // Joseph, Brent E.; Hougen, Dean F. // Prextending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Robotics and Autonomous Systems // 58(9):1076-1084 // September 2010 // null",testCollection.search("Prextending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors").toString());
		Assert.assertEquals("Conference Paper // Zombarg, Mark; Hougen, Dean; Schlupp, Ingo // Sexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // International Conference on the Synthesis and Simulation of Living Systems // 137-144 // November 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020",testCollection.search("Sexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation").toString());
				
	}

}
