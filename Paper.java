public abstract class Paper implements Comparable<Paper>
{	
	/* A variable to store the name of the paper. Index 0.*/
	private String name;
	/* A variable to store the authors of the paper. Index 1.*/
	private String authors;
	/* A variable to store the title of the paper. Index 2.*/
	private String title;
	/* A variable to store the serial title of the paper. Index 3.*/
	private String serialTitle;
	/* A variable to store the date of publication of the paper. Index 4.*/
	private String date;
	/* A variable to store the pages the paper is on. Index 6.*/
	private String pageRange;
	/* A variable to store the digital object identifier of the paper. */
	private String DOI;
	
	private static String sortSearchCriteria;
	
	public Paper() {}
	
	/**
	 * Compares one paper to another by the given criteria.
	 */
	public int compareTo(Paper otherPaper)
	{
		int offset = 0;
		
		switch (sortSearchCriteria)
		{
		case "BI":
			sortSearchCriteria = "AN";
			compareTo(otherPaper);
			break;
		case "AN":
			offset = compare(otherPaper, 1);
			break;
		case "PT":
			offset = compare(otherPaper, 2);
			break;
		case "ST":
			offset = compare(otherPaper, 3);
			break;
		case "CH":
			String thisDate = this.toString().split(" // ")[5];
			String otherDate = otherPaper.toString().split(" // ")[5];
			//This ugly (but code-lines efficient) replace line turns the date in "MMM YYYY" format to "YYYYMM".  Ex. "May 2011 Becomes 201105.  This becomes sortable by year then month.
			thisDate = thisDate.split(" ")[1] + " " + thisDate.split(" ")[0].replace("January", "01").replace("February", "02").replace("March", "03").replace("April", "04").replace("May", "05").replace("June","06").replace("July", "07").replace("August", "08").replace("September", "09").replace("October", "10").replace("November", "11").replace("December", "12");
			otherDate = otherDate.split(" ")[1] + " " + otherDate.split(" ")[0].replace("January", "01").replace("February", "02").replace("March", "03").replace("April", "04").replace("May", "05").replace("June","06").replace("July", "07").replace("August", "08").replace("September", "09").replace("October", "10").replace("November", "11").replace("December", "12");
			offset = thisDate.compareToIgnoreCase(otherDate);
			break;
		default:
			System.out.println("Please specify a searchable criteria.");
			break;
		}
		return offset;
	}
	
	public int compare(Paper otherPaper, int index)
	{
		String otherPaperString = otherPaper.toString();
		String thisPaperString = this.toString();
		return thisPaperString.split(" // ")[index].compareToIgnoreCase(otherPaperString.split(" // ")[index]);
	}
		
	public static void setSortSearchCriteria(String method)
	{
		sortSearchCriteria = method;
	}
	
	/**
	 * @return the name of the paper
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param the name of the paper
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the authors of the paper
	 */
	public String getAuthors() {
		return authors;
	}

	/**
	 * @param the authors of the paper
	 */
	public void setAuthors(String authors) {
		this.authors = authors;
	}

	/**
	 * @return the title of the paper
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param the title of the paper
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the Serial title of the paper
	 */
	public String getSerialTitle() {
		return serialTitle;
	}

	/**
	 * @param the serial title of the paper
	 */
	public void setSerialTitle(String serialTitle) {
		this.serialTitle = serialTitle;
	}

	/**
	 * @return the date of publication
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param the date of publication
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the pages the paper is found on in the format "start-end"
	 */
	public String getPageRange() {
		return pageRange;
	}

	/**
	 * @param the pages the paper is found on in the format "start-end"
	 */
	public void setPageRange(String pageRange) {
		this.pageRange = pageRange;
	}

	/**
	 * @return the digital object identifier of the paper
	 */
	public String getDOI() {
		return DOI;
	}

	/**
	 * @param the digital object identifier of the paper
	 */
	public void setDOI(String DOI) {
		this.DOI = DOI;
	}
}
