
public class JournalArticle extends Paper
{
	private String volumeIssue;
	
	public JournalArticle() {}
	
	public JournalArticle(String newName, String newAuthors, String newTitle, String newSerialTitle, String newDate, String newVolumeIssuePageRange)
	{
		setName(newName);
		setName(newAuthors);
		title = newTitle;
		serialTitle = newSerialTitle;
		date = newDate;
		volumeIssue = newVolumeIssuePageRange.split(":")[0];
		pageRange = newVolumeIssuePageRange.split(":")[1];
		DOI = null;
	}
	
	public JournalArticle(String newName, String newAuthors, String newTitle, String newSerialTitle, String newDate, String newVolumeIssuePageRange, String newDOI)
	{
		setName(newName);
		setAuthors(newAuthors);
		title = newTitle;
		serialTitle = newSerialTitle;
		date = newDate;
		volumeIssue = newVolumeIssuePageRange.split(":")[0];
		pageRange = newVolumeIssuePageRange.split(":")[1];
		DOI = newDOI;
	}
}
