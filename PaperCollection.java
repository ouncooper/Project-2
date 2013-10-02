import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class PaperCollection {
	
	private ArrayList<Paper> paperCollection = new ArrayList<Paper>();
	
	/**
	 * Default constructor for the class.
	 */
	public PaperCollection() {}
	
	/**
	 * Preferred constructor for the class.
	 * Reads in a text file and constructs the proper paper based on the information given.
	 * @param filepath File path of the text file that contains the list of papers and their details.
	 * @throws IOException Thrown if a readLine error occurs.
	 */
	public PaperCollection(String filepath) throws IOException
	{
		FileReader fr = null;
		String line = "";
		
		try {
			fr = new FileReader(filepath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		BufferedReader br = new BufferedReader(fr);

		line = br.readLine(); //Initial line grab
		String[] paperInfo = new String[7]; //Holds the info for the current paper. Will be used in the construction of a new paper object.
		int i = 0;

		while (line != null) { //Until the end of the file
			do { //Loops until a new magazine is found.
				paperInfo[i] = line;
				i++;
				line = br.readLine();
				if (line == null) //End of file, break from the while loop since it's difficult to conditional this.
					break;
			} while (!(line.equalsIgnoreCase("Journal Article") || line.equalsIgnoreCase("Conference Paper"))); //Detection of a new paper.
			if (paperInfo[0].equalsIgnoreCase("Journal Article")) //Create the appropriate constructor
				paperCollection.add(new JournalArticle(paperInfo[0], paperInfo[1], paperInfo[2], paperInfo[3], paperInfo[4], paperInfo[5], paperInfo[6]));
			else if (paperInfo[0].equalsIgnoreCase("Conference Paper"))
				paperCollection.add(new ConferencePaper(paperInfo[0], paperInfo[1], paperInfo[2], paperInfo[3], paperInfo[4], paperInfo[5], paperInfo[6]));
			else System.out.println("There's a major problem!"); //Should never be reached or we have a problem.
			paperInfo = new String[7]; //Reset the information arrays
			i = 0;
		}
	}
	
	/**
	 * Sorts the collection by a certain criteria.
	 * 
	 * May require a few smaller methods, but we'll see in implementation.
	 * @param method Which element to sort by (ex. BI for bibliographic, AU for author, etc.)
	 */
	public void Sort(String method)
	{
		
		//Switch to choose how to sort (which criteria)
		//Methods for individual sorts?
		//Maybe a .toString on the paper and then sort by a selected index in a split up array.
		
	}
	
	/**
	 * Prints the data in the collection to a file on the drive
	 * @param filepath Where you want to print the file to
	 */
	public void printToFile(String filepath)
	{
		//Loop through each element in the list, print back to a file
		//Should be able to read that new file in if done correctly
	}
	
	/**
	 * Prints the data in the collection to the screen for the user to view
	 */
	public void printToScreen()
	{
		//Same as file, but to screen, not a file.
	}
	
	/**
	 * Searches the collection for a keyword.
	 * @param searchCriteria The search query
	 * @return A string containing the results of the search
	 */
	public String search(String searchCriteria)
	{
		//Similar to sort in structure
		//Loop through all search possibilities (author name, titles, etc.), return best one.
		//Might use .toString and see what sticks?  WHO KNOWS :D Might do it to check if it exists at all
		//Wildcards cannot be used unless given a category?  Or just print all the things in a set (because sets).
		return "";
	}

	/**
	 * Gets the size of the list that contains the papers.
	 * @return The size of the arrayList that the papers are stored in.
	 */
	public int size() {
		return paperCollection.size();
	}
}
