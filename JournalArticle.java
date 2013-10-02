public class JournalArticle extends Paper
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1394676353180907545L;
	/* A variable to store the volume and issue of the article. */
	private String volumeIssue;
	
	/**
	 * Default constructor for the class.
	 */
	public JournalArticle() {}
	
	/**
	 * Inherits from the Paper class.
	 * Constructs the object with no DOI given.
	 * --Possibly may be removed due to a lack of use since the current method passes a null DOI to the other constructor.
	 * @param newName Name of the paper ("Journal Article").
	 * @param newAuthors Authors of the paper in the format Last, First Middle; Last, First Middle; etc.
	 * @param newTitle Title of the paper.
	 * @param newSerialTitle Serial title of the paper.
	 * @param newDate Date the paper was published.
	 * @param newVolumeIssuePageRange Volume, issue, and page range specified in the file.  Split into two variables.
	 **/
	public JournalArticle(String newName, String newAuthors, String newTitle, String newSerialTitle, String newVolumeIssuePageRange,  String newDate)
	{
		setName(newName);
		setName(newAuthors);
		setTitle(newTitle);
		setSerialTitle(newSerialTitle);
		volumeIssue = newVolumeIssuePageRange.split(":")[0];
		setPageRange(newVolumeIssuePageRange.split(":")[1]);
		setDate(newDate);
		setDOI(null);
	}
	
	/**
	 * Inherits from the Paper class.
	 * Preferred constructor for the object with a DOI given in the parameters.  
	 * @param newName Name of the paper ("Journal Article").
	 * @param newAuthors Authors of the paper in the format Last, First Middle; Last, First Middle; etc.
	 * @param newTitle Title of the paper.
	 * @param newSerialTitle Serial title of the paper.
	 * @param newDate Date the paper was published.
	 * @param newVolumeIssuePageRange Volume, issue, and page range specified in the file.  Split into two variables.
	 * @param newDOI Digital Object Identifier for the paper.
	 **/
	public JournalArticle(String newName, String newAuthors, String newTitle, String newSerialTitle, String newVolumeIssuePageRange, String newDate, String newDOI)
	{
		setName(newName);
		setAuthors(newAuthors);
		setTitle(newTitle);
		setSerialTitle(newSerialTitle);
		volumeIssue = newVolumeIssuePageRange.split(":")[0];
		setPageRange(newVolumeIssuePageRange.split(":")[1]);
		setDate(newDate);
		setDOI(newDOI);
	}
	
	/**
	 * Gets the volume and issue of the Journal article
	 * @return a string containing the volume and issue in the format "volume(issue)"
	 */
	public String getVolumeIssue() {
		return volumeIssue;
	}
	
	/**
	 * Converts the object to a string separated by " \ "
	 */
	public String toString()
	{
		return getName() + " \" " + getAuthors() + " \" " + getTitle() + " \" " + getSerialTitle() + " \" " + getVolumeIssue() + ":" + getPageRange() + " \" " + getDate() + " \" " + getDOI();
	}
}
