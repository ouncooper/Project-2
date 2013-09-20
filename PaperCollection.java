import java.util.ArrayList;


public class PaperCollection {
	
	private ArrayList<Paper> paperCollection = new ArrayList<Paper>();
	
	public PaperCollection() {}
	
	public PaperCollection(String filepath)
	{
		//Read in file, I'm thinking nested while loops - one for the whole file and one for each individual paper
		//Add each line to a certain variable (maybe list? ehhh) then pass the constructor for the paper and add it to the collection
		/*ConferencePaper thing = new ConferencePaper("one", "two", "three", "four", "five", "six:othersix", "seven");
		JournalArticle otherThing = new JournalArticle("asdf", "tbrsrt", "eorib", "four", "five", "six:othersix", "seven"); //random names
		paperCollection.add(thing);
		paperCollection.add(otherThing);*/
	}
	
	public void Sort(String method)
	{
		//Switch to choose how to sort (which criteria)
		//Methods for individual sorts?
		//Maybe a .toString on the paper and then sort by a selected index in a split up array.
		
	}
	
	public void printToFile(String filepath)
	{
		//Loop through each element in the list, print back to a file
		//Should be able to read that new file in if done correctly
	}
	
	public void printToScreen()
	{
		//Same as file, but not file.
	}
	
	public void Search(String searchCriteria)
	{
		//Similar to sort in structure
		//Loop through all search possibilities (author name, titles, etc.), return best one.
		//Might use .toString and see what sticks?  WHO KNOWS :D Might do it to check if it exists at all
		//Wildcards cannot be used unless given a category?  Or just print all the things in a set (because sets).
	}
}
