public class ConferencePaper extends Paper
{
	/**
	 * Default constructor for the class.
	 */
	public ConferencePaper() {}
	
	/**
	 * Inherits from the Paper class.
	 * Creates a ConferencePaper Object
	 * @param newName Name of the paper ("Conference Paper").
	 * @param newAuthors Authors of the paper in the format Last, First Middle; Last, First Middle; etc.
	 * @param newTitle Title of the paper.
	 * @param newSerialTitle Serial title of the paper.
	 * @param newDate Date the paper was published.
	 * @param newPageRange Page range specified in the file.
	 * @param newDOI Digital Object Identifier for the paper.
	 */
	public ConferencePaper(String newName, String newAuthors, String newTitle, String newSerialTitle, String newPageRange, String newDate,  String newDOI)
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
	 * Converts the object to a string separated by " // "
	 */
	public String toString()
	{
		return getName() + " // " + getAuthors() + " // " + getTitle() + " // " + getSerialTitle() + " // " + getPageRange() + " // " + getDate() + " // " + getDOI();
	}
}
