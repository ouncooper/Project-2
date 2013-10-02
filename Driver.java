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
		PaperCollection list = null;
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
			
			switch (command.toUpperCase()) //Because java 7 allows switches on strings
			{
			case "BI":
				System.out.println("Sorting Bibliographically.");
				list.Sort("BI");
				break;
			case "AN":
				System.out.println("Sorting by Author's name.");
				list.Sort("AN");
				break;
			case "PT":
				System.out.println("Sorting by Paper Title.");
				list.Sort("PT");
				break;
			case "ST":
				System.out.println("Sorting by Serial Title.");
				list.Sort("ST");
				break;
			case "CH":
				System.out.println("Sorting Chronologically.");
				list.Sort("CH");
				break;
			case "R":
				System.out.println("Sorting Randomly.");
				list.Sort("R");
				break;
			case "PS":
				list.printToScreen();
				break;
			case "PF":
				System.out.print("Please input an output filepath: ");
				list.printToFile(inputReader.readLine());
				break;
			case "S":
				System.out.println("Please input a search critera: ");
				list.search(inputReader.readLine());
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
