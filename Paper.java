
public abstract class Paper implements Comparable<Paper>
{	
	private String name;
	private String authors;
	private String title;
	private String serialTitle;
	private String date;
	private String pageRange;
	private String DOI;
	
	public Paper() {}
	
	public void doThings()
	{
		System.out.println("Blah!");
	}
	
	public int compareTo(Paper otherPaper)
	{
		return 0;
	}
}
