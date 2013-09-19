
public class ConferencePaper extends Paper
{
	
	public ConferencePaper() {}
	
	public ConferencePaper(String newName, String newAuthors, String newTitle, String newSerialTitle, String newDate, String newPageRange)
	{
		setName(newName);
		authors = newAuthors;
		title = newTitle;
		serialTitle = newSerialTitle;
		date = newDate;
		pageRange = newPageRange;
		DOI = null;
	}
	
	public ConferencePaper(String newName, String newAuthors, String newTitle, String newSerialTitle, String newDate, String newPageRange, String newDOI)
	{
		setName(newName);
		authors = newAuthors;
		title = newTitle;
		serialTitle = newSerialTitle;
		date = newDate;
		pageRange = newPageRange;
		DOI = newDOI;
	}
}
