import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Project #2
 * CS 2334, Section 012
 * September 25, 2013
 * <P>
 * This class implements a program that will store, read, and write an ADT of academic papers.	
 * </P>
 * @version 0.1
 */
public class Driver
{
	/**
	 * Main method for the program.
	 * Prompts the user for a filepath on the command line,
	 * then creates a PaperCollection that stores the papers read in.
	 * @param args Command line arguments.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		PaperCollection list;
		try {
			list = new PaperCollection("/Users/7thace/desktop/papers.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String command = null;
		
		do {
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Please input a command: ");
			command = inputReader.readLine();
			
			switch (command) //Because java 7 allows switches on strings
			{
			
			}
			//do the work
		} while (command.equalsIgnoreCase("e"));
		
		System.out.println("Thanks! Exiting...");
		System.exit(0);
	}
}
