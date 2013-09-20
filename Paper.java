
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
	
	public int compareTo(Paper otherPaper)
	{
		return 0;
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSerialTitle() {
		return serialTitle;
	}

	public void setSerialTitle(String serialTitle) {
		this.serialTitle = serialTitle;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPageRange() {
		return pageRange;
	}

	public void setPageRange(String pageRange) {
		this.pageRange = pageRange;
	}

	public String getDOI() {
		return DOI;
	}

	public void setDOI(String DOI) {
		this.DOI = DOI;
	}
}
