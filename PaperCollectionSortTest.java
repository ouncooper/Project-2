import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;


public class PaperCollectionSortTest {

	@Test
	public void test() throws IOException {
		PaperCollection testCollection = new PaperCollection("papers.txt");
		
		testCollection.sort("BI");
		Assert.assertEquals("Journal Article // Eskridge, Brent E.; Hougen, Dean F. // Extending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Brobotics and Autonomous Systems // 59(2):106-108 // March 2010 // nullJournal Article // Joseph, Brent E.; Hougen, Dean F. // Prextending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Robotics and Autonomous Systems // 58(9):1076-1084 // September 2010 // nullConference Paper // Woehrer, Mark; Hougen, Dean; Schlupp, Ingo // Mexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // Subinternational Conference on the Synthesis and Simulation of Living Systems // 135-145 // July 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020Conference Paper // Zombarg, Mark; Hougen, Dean; Schlupp, Ingo // Sexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // International Conference on the Synthesis and Simulation of Living Systems // 137-144 // November 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020", testCollection.toString());
		testCollection.sort("AN");
		Assert.assertEquals("Journal Article // Eskridge, Brent E.; Hougen, Dean F. // Extending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Brobotics and Autonomous Systems // 59(2):106-108 // March 2010 // nullJournal Article // Joseph, Brent E.; Hougen, Dean F. // Prextending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Robotics and Autonomous Systems // 58(9):1076-1084 // September 2010 // nullConference Paper // Woehrer, Mark; Hougen, Dean; Schlupp, Ingo // Mexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // Subinternational Conference on the Synthesis and Simulation of Living Systems // 135-145 // July 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020Conference Paper // Zombarg, Mark; Hougen, Dean; Schlupp, Ingo // Sexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // International Conference on the Synthesis and Simulation of Living Systems // 137-144 // November 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020", testCollection.toString());
		testCollection.sort("PT");
		Assert.assertEquals("Journal Article // Eskridge, Brent E.; Hougen, Dean F. // Extending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Brobotics and Autonomous Systems // 59(2):106-108 // March 2010 // nullConference Paper // Woehrer, Mark; Hougen, Dean; Schlupp, Ingo // Mexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // Subinternational Conference on the Synthesis and Simulation of Living Systems // 135-145 // July 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020Journal Article // Joseph, Brent E.; Hougen, Dean F. // Prextending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Robotics and Autonomous Systems // 58(9):1076-1084 // September 2010 // nullConference Paper // Zombarg, Mark; Hougen, Dean; Schlupp, Ingo // Sexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // International Conference on the Synthesis and Simulation of Living Systems // 137-144 // November 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020", testCollection.toString());
		testCollection.sort("ST");
		Assert.assertEquals("Journal Article // Eskridge, Brent E.; Hougen, Dean F. // Extending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Brobotics and Autonomous Systems // 59(2):106-108 // March 2010 // nullConference Paper // Zombarg, Mark; Hougen, Dean; Schlupp, Ingo // Sexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // International Conference on the Synthesis and Simulation of Living Systems // 137-144 // November 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020Journal Article // Joseph, Brent E.; Hougen, Dean F. // Prextending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Robotics and Autonomous Systems // 58(9):1076-1084 // September 2010 // nullConference Paper // Woehrer, Mark; Hougen, Dean; Schlupp, Ingo // Mexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // Subinternational Conference on the Synthesis and Simulation of Living Systems // 135-145 // July 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020", testCollection.toString());
		testCollection.sort("CH");
		Assert.assertEquals("Journal Article // Eskridge, Brent E.; Hougen, Dean F. // Extending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Brobotics and Autonomous Systems // 59(2):106-108 // March 2010 // nullJournal Article // Joseph, Brent E.; Hougen, Dean F. // Prextending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Robotics and Autonomous Systems // 58(9):1076-1084 // September 2010 // nullConference Paper // Woehrer, Mark; Hougen, Dean; Schlupp, Ingo // Mexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // Subinternational Conference on the Synthesis and Simulation of Living Systems // 135-145 // July 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020Conference Paper // Zombarg, Mark; Hougen, Dean; Schlupp, Ingo // Sexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // International Conference on the Synthesis and Simulation of Living Systems // 137-144 // November 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020", testCollection.toString());
		testCollection.sort("R");
		Assert.assertFalse("Journal Article // Eskridge, Brent E.; Hougen, Dean F. // Extending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Brobotics and Autonomous Systems // 59(2):106-108 // March 2010 // nullJournal Article // Joseph, Brent E.; Hougen, Dean F. // Prextending Adaptive Fuzzy Behavior Hierarchies to Multiple Levels of Composite Behaviors // Robotics and Autonomous Systems // 58(9):1076-1084 // September 2010 // nullConference Paper // Woehrer, Mark; Hougen, Dean; Schlupp, Ingo // Mexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // Subinternational Conference on the Synthesis and Simulation of Living Systems // 135-145 // July 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020Conference Paper // Zombarg, Mark; Hougen, Dean; Schlupp, Ingo // Sexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation // International Conference on the Synthesis and Simulation of Living Systems // 137-144 // November 2012 // http://dx.doi.org/10.7551/978-0-262-31050-5-ch020".equals(testCollection.toString()));
	}

}
