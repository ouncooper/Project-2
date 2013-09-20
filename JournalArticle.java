
public class JournalArticle extends Paper
{
	private String volumeIssue;
	
	public JournalArticle() {}
	
	public JournalArticle(String newName, String newAuthors, String newTitle, String newSerialTitle, String newDate, String newVolumeIssuePageRange)
	{
		setName(newName);
		setName(newAuthors);
		setTitle(newTitle);
		setSerialTitle(newSerialTitle);
		setDate(newDate);
		volumeIssue = newVolumeIssuePageRange.split(":")[0];
		setPageRange(newVolumeIssuePageRange.split(":")[1]);
		setDOI(null);
	}
	
	public JournalArticle(String newName, String newAuthors, String newTitle, String newSerialTitle, String newDate, String newVolumeIssuePageRange, String newDOI)
	{
		setName(newName);
		setAuthors(newAuthors);
		setTitle(newTitle);
		setSerialTitle(newSerialTitle);
		setDate(newDate);
		System.out.println(newVolumeIssuePageRange);
		volumeIssue = newVolumeIssuePageRange.split(":")[0];
		setPageRange(newVolumeIssuePageRange.split(":")[1]);
		setDOI(newDOI);
	}
}
