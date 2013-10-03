import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Project #2
 * CS 2334, Section 012
 * October 2, 2013
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
	 * @throws IOException Error in I/O.
	 */
	public static void main(String[] args) throws IOException
	{
		PaperCollection list = null;
		
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please input the papers.txt filepath: ");
		String filepath = inputReader.readLine();
		
		try {
			list = new PaperCollection(filepath + "papers.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String command = null;
		
		do {
			System.out.print("Please input a command: ");
			command = inputReader.readLine();
			
			switch (command.toUpperCase()) //Because java 7 allows switches on strings
			{
			case "BI":
				System.out.println("Sorting Bibliographically.");
				list.sort("BI");
				break;
			case "AN":
				System.out.println("Sorting by Author's name.");
				list.sort("AN");
				break;
			case "PT":
				System.out.println("Sorting by Paper Title.");
				list.sort("PT");
				break;
			case "ST":
				System.out.println("Sorting by Serial Title.");
				list.sort("ST");
				break;
			case "CH":
				System.out.println("Sorting Chronologically.");
				list.sort("CH");
				break;
			case "R":
				System.out.println("Sorting Randomly.");
				list.sort("R");
				break;
			case "PS":
				list.printToScreen();
				break;
			case "PF":
				System.out.print("Please input an output filepath: ");
				list.printToFile(inputReader.readLine());
				break;
			case "S":
				System.out.println("Please input a title to search for: ");
				String title = inputReader.readLine();
				Paper searchedPaper = list.search(title);
				if (searchedPaper == null)
					System.out.println("The title " + title + " was not found.");
				else
					System.out.println(searchedPaper.toString().replace(" // null", "").replace(" // ", "\n") + "\n");
				break;
			case "E":
				//This is the exit command, so nothing will be done
				System.out.println("Thanks! Exiting...");
				break;
			default:
				System.out.println("Please choose a valid operation.");
				break;
			}
			//do the work
		} while (!command.equalsIgnoreCase("E"));

		System.exit(0);
	}
}
