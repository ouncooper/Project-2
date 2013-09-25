import java.io.IOException;

/**
 * Project #2
 * CS 2334, Section 012
 * September 25, 2013
 * <P>
 * This class implements a program that will store, read, and write an ADT of academic papers.	
 * </P>
 * @author Nicholas Cooper and Connor Taylor
 * @version 0.1
 */
public class Driver
{
	/**
	 * Main method for the program.
	 * Prompts the user for a filepath on the command line,
	 * then creates a PaperCollection that stores the papers read in.
	 * @param args Command line arguments.
	 */
	public static void main(String[] args)
	{
		PaperCollection list;
		try {
			list = new PaperCollection("papers.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
