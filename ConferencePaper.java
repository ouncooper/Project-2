
public class ConferencePaper extends Paper
{
	
	public ConferencePaper() {}
	
	public ConferencePaper(String newName, String newAuthors, String newTitle, String newSerialTitle, String newDate, String newPageRange)
	{
		setName(newName);
		setAuthors(newAuthors);
		setTitle(newTitle);
		setSerialTitle(newSerialTitle);
		setDate(newDate);
		setPageRange(newPageRange);
		setDOI(null);
	}
	
	public ConferencePaper(String newName, String newAuthors, String newTitle, String newSerialTitle, String newDate, String newPageRange, String newDOI)
	{
		setName(newName);
		setAuthors(newAuthors);
		setTitle(newTitle);
		setSerialTitle(newSerialTitle);
		setDate(newDate);
		setPageRange(newPageRange);
		setDOI(newDOI);
	}
}
