import java.io.IOException;

/**
 * Project #2
 * CS 2334, Section 012
 * September 25, 2013
 * <P>
 * This class implements a program that will store, read, and write an ADT of academic papers.
 * I'm not sure what more I have to add.
 * </P>
 * @author
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
			list = new PaperCollection("/Users/7thace/Desktop/papers.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
