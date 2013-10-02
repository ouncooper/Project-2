public class ConferencePaper extends Paper
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9206279416365032383L;

	/**
	 * Default constructor for the class.
	 */
	public ConferencePaper() {}
	
	/**
	 * Inherits from the Paper class.
	 * Constructs the object with no DOI given.
	 * --Possibly may be removed due to a lack of use since the current method passes a null DOI to the other constructor.
	 * @param newName Name of the paper ("Conference Paper").
	 * @param newAuthors Authors of the paper in the format Last, First Middle; Last, First Middle; etc.
	 * @param newTitle Title of the paper.
	 * @param newSerialTitle Serial title of the paper.
	 * @param newDate Date the paper was published.
	 * @param newPageRange Page range specified in the file.
	 */
	public ConferencePaper(String newName, String newAuthors, String newTitle, String newSerialTitle, String newDate, String newPageRange)
	{
		setName(newName);
		setAuthors(newAuthors);
		setTitle(newTitle);
		setSerialTitle(newSerialTitle);
		setPageRange(newPageRange);
		setDate(newDate);
		setDOI(null);
	}
	
	
	/**
	 * Inherits from the Paper class.
	 * Preferred constructor for the object with a DOI given in the parameters.  
	 * @param newName Name of the paper ("Conference Paper").
	 * @param newAuthors Authors of the paper in the format Last, First Middle; Last, First Middle; etc.
	 * @param newTitle Title of the paper.
	 * @param newSerialTitle Serial title of the paper.
	 * @param newDate Date the paper was published.
	 * @param newPageRange Page range specified in the file.
	 * @param newDOI Digital Object Identifier for the paper.
	 */
	public ConferencePaper(String newName, String newAuthors, String newTitle, String newSerialTitle, String newDate, String newPageRange, String newDOI)
	{
		setName(newName);
		setAuthors(newAuthors);
		setTitle(newTitle);
		setSerialTitle(newSerialTitle);
		setPageRange(newPageRange);
		setDate(newDate);
		setDOI(newDOI);
	}
	
	/**
	 * Converts the object to a string separated by " \ "
	 */
	public String toString()
	{
		return getName() + " \" " + getAuthors() + " \" " + getTitle() + " \" " + getSerialTitle() + " \" " + getPageRange() + " \" " + getDate() + " \" " + getDOI();
	}
	/*
	public String[] toArray()
	{
		return new String[7];
	}*/
}
