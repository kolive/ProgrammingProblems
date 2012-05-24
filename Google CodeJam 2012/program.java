
import java.io.BufferedReader;
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class program {

	/**
	 * @param args
	 * 
	 * Reads the input file for test cases.
	 */
	//main method for Problem A.

	public static void SolveA(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("/home/kolive/Programming/GoogleCodeJam_2012/in");
		
		
		try {
			BufferedReader myReader = new BufferedReader(new FileReader(inFile));
			String tmp = "";
			int i = 1;
			tmp = myReader.readLine();
			while( (tmp = myReader.readLine()) != null)
			{
				
				System.out.print("\nCase #" + i + ": " + ProblemA.translateString(tmp));
				i++;
			}


		} catch (IOException e) {
			System.out.println("Exception Caught: " + e);
		}
	}

	
	public static void SolveB(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("/home/kolive/Programming/GoogleCodeJam_2012/in");
		
		
		try {
			BufferedReader myReader = new BufferedReader(new FileReader(inFile));
			String tmp = "";
			int i = 1;
			tmp = myReader.readLine();
			while( (tmp = myReader.readLine()) != null)
			{
				String arguments[] = tmp.split(" ");
				
				
				System.out.print("\nCase #" + i + ": " + ProblemB.GenerateMaxP(Integer.parseInt(arguments[2]), 
						Arrays.copyOfRange(arguments, 3, arguments.length), 
						Integer.parseInt(arguments[1])));
				i++;
			}


		} catch (IOException e) {
			System.out.println("Exception Caught: " + e);
		}
	}
	
	public static void main(String args[])
	{
File inFile = new File("/home/kolive/Programming/GoogleCodeJam_2012/in");
		
		
		try {
			Scanner scanner = new Scanner(inFile);
			int tmp = 0;
			int i = 1;
			tmp = scanner.nextInt();
			while(i <= tmp)
			{
				
				
				
				System.out.print("\nCase #" + i + ": " + ProblemC.solveC(scanner.nextInt(), scanner.nextInt()));
				i++;
			}


		} catch (IOException e) {
			System.out.println("Exception Caught: " + e);
		}
		
	}
	
	
	
}
